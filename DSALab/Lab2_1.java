/**
 * Lab2_1
 */
public class Lab2_1 {

    class ContactApp {
        public  void main() {
           ContactApp ca = new ContactApp(); 
           String [][] contact = {{"Ahsa","032"},{"SDF","321"}};
           ca.DisplayContact(contact);
        }
        public void DisplayContact(String [][] contact){
            for (String [] row : contact) {
                for(String col: row){
                        System.out.print(col+" ");
                }
            System.out.println();
            }
           
        }
        public String SearchContact(String[][] contact,String name){
            for (int i=0;i<contact.length;i++) {
                
                if(contact[i][1].equals(name)){
                return contact[i][0];
            }
        }
            return "Not found";
        }
        public String [][] AddContact(String [][] contact, String contactName,String contactNo){
            String [][] contat = new String[contact.length+1][2];
            System.arraycopy(contact,0,contat,0,0);
            contat[contact.length][0] = contactNo;
            contat[contact.length][1] = contactName;
    
            return contat;
        }
        public String [][] UpdateContact(String[][] contact,String ChangeName,String ToChange,String ToChangeNo){
            for (int i=0;i<contact.length;i++) {
                if(contact[i][1].equals(ChangeName)){
                    contact[i][1]=ToChange;
                    contact[i][0]=ToChangeNo;
                }
            }
            return contact;
        }
        public String [][] DeleteContact(String[][] contact, String DeleteName){
            for(int i=0;i<contact.length;i++){
                if(contact[i][1].equals(DeleteName)){
                    contact[i][1]=null;
                    contact[i][0]=null;
                }
            }
            
            return contact;
        }
    
    }
    class FireAir{
        String[] songs;
        FireAir(String[] songs){
            this.songs = songs;
        }
        public void DisplaySongs(String[] songs) {
            for (String string : songs) {
                System.out.println(string);
            }
        }
        public String [] AddSong(String[] songs,String NewSong){
            String [] ew = new String[songs.length+1];
            System.arraycopy(ew, 0, songs, 0, 0);
            ew[songs.length] = NewSong;
            return ew;
        }
        public void DeleteSong(String [] songs, String name){
            for(String i: songs){
                if(i.equals(name))
                i = null;
            }
        }
        public void SearchSong(String [] songs, String search){
            int x =0;
            for (String song : songs) {
                if(song.equals(search)){
                    System.out.print("Found song :"+search+" at position "+x);
                    break;
                }
                x++;
            }
        }
        public void UpdateSong(String [] songs, int index,String value){
            songs[index] = value;
        }
    }
}