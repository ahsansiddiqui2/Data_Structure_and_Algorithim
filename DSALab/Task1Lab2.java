public class ContactApp {
    public void DisplayContact(String [] contact){
        for(String i : contact){
            System.out.println(i);
        }
    }
    public String SearchContact(String[] contact,String name){
        String x ="";
        for (String i : contact) {
            if(i.equals(name))
            i=x;
        }
        return x;
    }
    public String [] AddContact(String [] contact, String contactName){
        String [] contat = new String[contact.length+1];
        return contat;
    }
    public String [] UpdateContact(String[] contact,String ChangeName,String ToChange){
        String [] updated = new String[contact.length];
        
        return updated;
    }
    public String [] DeleteContact(String[] contact, String DeleteName){
        for(String i: contact){
            if(i.equals(DeleteName)){
                i=null;
            }
        }
        String [] contat = new String[contact.length];
        System.arraycopy(contat, 0, contact, 0, 0);
        return contat;
    }

}