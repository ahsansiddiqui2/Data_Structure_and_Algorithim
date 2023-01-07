/**
 * Lab2_1
 */
import java.util.Scanner;

public class Lab2_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] songs = {"Kaafi", "Kab Tak","Kahani Suno","Irrady","Kaise"};
        FireAir fa = new FireAir();
        while(true){
        System.out.println("\nOperations in App: ");
        System.out.println("1. Display Songs");
        System.out.println("2. Search Song");
        System.out.println("3. Add new Song");
        System.out.println("4. Update Song");
        System.out.println("5. Delete Song");
        System.out.println("6. Exit");
        int input = scan.nextInt();
        switch (input) {
    case 1: fa.DisplaySongs(songs);break;
    
    case 2: {System.out.println("Which song you want to search :");
        String song = scan.next();
        fa.SearchSong(songs,song);
        };break;
    case 3: {
        System.out.println("Enter the name you want to add: ");
        String name = scan.next();
       songs =  fa.AddSong(songs,name);
    };break;
    case 4: {
        System.out.println("Enter the song you want to update: ");
        String name = scan.next();
        System.out.println("To whom you want to update: ");
        String name1 = scan.next();
        songs =fa.UpdateSong(songs, name,name1);
    };break;
    case 5:{System.out.println("What song you want to delete: ");
        String name = scan.next();
       songs = fa.DeleteSong(songs, name);};break;
    case 6:System.exit(0);break;
    default: System.out.println("Wrong number entered. Try Again");break;
    }
}
        
//         String [][] contact = {{"Ahsan","0322"},{"ASDFG","321"}};
//         ContactApp c = new ContactApp();
//         while(true){
    
//         System.out.println("Operations in Array: ");
//         System.out.println("1. Display Contact ");
//         System.out.println("2. Search Contact");
//         System.out.println("3. Add new Contact ");
//         System.out.println("4. Update Contact ");
//         System.out.println("5. Delete Contact ");
//         System.out.println("6. Exit ");
    
//         int input = scan.nextInt();
    
//         switch (input) {
    
//     case 1:
//         c.DisplayContact(contact);break;
    
//     case 2:
// {        System.out.println("What is the name of the number you want to search : ");
//         String name = scan.next();
//         System.out.println(c.SearchContact(contact, name));
//         };break;
    
//     case 3:{
//         System.out.println("Enter the name you want to add: ");
//         String name = scan.next();
//         System.out.println("Enter the number");
//         String number = scan.next();
//        contact =  c.AddContact(contact, name,number);
//     };break;
    
//     case 4:
//         {
//         System.out.println("Enter the name you want to update: ");
//         String name = scan.next();
//         System.out.println("To whom you want to update: ");
//         String name1 = scan.next();
//         System.out.println("Update number: ");
//         String number = scan.next();
//         contact =c.UpdateContact(contact, name,name1,number);
//     };break;
    
//     case 5:{System.out.println("What contact you want to delete: ");
//         String name = scan.next();
//         contact = c.DeleteContact(contact, name);};break;
     
//      case 6:System.exit(0);break;
     
//      default:
//             System.exit(0);break;
//             }   
//         }
    }
}
    class ContactApp {

        public void DisplayContact(String [][] contact){
            for (String [] row : contact) {
                for(String col: row){
                        System.out.print(col+" ");
                }
            System.out.println();
            }
           
        }
        public String SearchContact(String [][] contact, String name){
            for (int i=0;i<contact.length;i++) {
                
                if(contact[i][0].equals(name)){
                return contact[i][1];
            }
        }
            return "Not found";
        }
        public String [][] AddContact(String [][] contact, String contactName,String contactNo){
            String [][] contat = new String[contact.length+1][2];
            System.arraycopy(contact,0,contat,0,contact.length);
            contat[contact.length][1] = contactNo;
            contat[contact.length][0] = contactName;
    
            return contat;
        }
        public String [][] UpdateContact(String[][] contact,String ChangeName,String ToChange,String ToChangeNo){
            for (int i=0;i<contact.length;i++) {
                if(contact[i][0].equals(ChangeName)){
                    contact[i][0]=ToChange;
                    contact[i][1]=ToChangeNo;
                }
            }
            return contact;
        }
        public String [][] DeleteContact(String[][] contact, String DeleteName){
            for(int i=0;i<contact.length;i++){
                if(contact[i][0].equals(DeleteName)){
                    contact[i][1]=" ";
                    contact[i][0]=" ";
                }
            }
            
            return contact;
        }
    
    }
    class FireAir{

        public void DisplaySongs(String[] songs) {
            for (String song : songs) {
                System.out.println(song);
            }
        }
        public String [] AddSong(String[] songs,String NewSong){
            String [] ew = new String[songs.length+1];
            System.arraycopy(songs, 0, ew, 0, songs.length);
            ew[songs.length] = NewSong;
            return ew;
        }
        public String [] DeleteSong(String [] songs, String name){
            for(int i=0;i<songs.length;i++){
                if(songs[i].equals(name))
                songs[i] = " ";

            }
            return songs;
        }
        public void SearchSong(String [] songs, String search){
            int x =0;
            for (String song : songs) {
                x++;
                if(song.equals(search)){
                    System.out.print("Found song :"+search+" at position "+x);
                    break;
                }
                
            }
        }
        public String [] UpdateSong(String [] songs, String search,String value){
            for(String song:songs){
                if(song.equals(search))
                song = value;
            }
            return songs;
        }

    }