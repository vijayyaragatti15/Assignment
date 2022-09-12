
public class FileHandling {
    public static void main(String[] args) throws IOException {

        // File file = new File("Alphabets.txt");
        // FileInputStream fin = new FileInputStream("Alphabet.txt");
        FileReader fin = new FileReader("Alphabet.txt");
        // FileOutputStream fout = new FileOutputStream("Alphabet.txt");

        // File file2 = new File("consonants.txt");
        // FileInputStream fin2 = new FileInputStream("consonants.txt");
        FileOutputStream fout = new FileOutputStream("consonants.txt");

        int c;
        do{
            c =  fin.read();
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                try{
                    throw new VowelNotAllowedException();
                }catch(VowelNotAllowedException e3){
                    System.out.println(e3.toString());
                }
            }
            else{
                fout.write(c);     
            }
        }while(c!=-1);
    }
}
class VowelNotAllowedException extends Exception{
    public String toString(){
        return "Vowels not allowed .. ";
    }
}
