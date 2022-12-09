public class FireAir{
    public void DisplaySongs(String[] songs) {
        for (String string : songs) {
            System.out.println(string);
        }
    }
    public String [] AddSong(String[] songs,String aew){
        String [] ew = new String[songs.length];
        ew[0] = aew;
        System.arraycopy(ew, 1, songs, 0, 0);
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
        for (String string : songs) {
            if(i.equals(search)){
                System.out.print("Found song :"+search+" at "+x);
                break;
            }
            x++;
        }
    }
    public void UpdateSong(String [] songs, int index,String value){
        songs[index] = value;
    }
}