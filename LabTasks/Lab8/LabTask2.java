public class LabTask2<L> {

    Node<L> photoAlbum;
    int size=0;
    Node<L> picShow=photoAlbum;
    public static void main(String[] args) {
        LabTask2<String> lt2 = new LabTask2<>();
        lt2.Add("MUET");
        lt2.Add("CUTE");
        lt2.AddatFirst("Mehran aka ");
        lt2.Search("MUET");
        lt2.SlideShow();
    }
    LabTask2(){
        photoAlbum = null;

    }
    public void SlideShow(){

        Node<L> tempPhoto = photoAlbum;    
        while(tempPhoto!=null){
         System.out.println(tempPhoto.data);
            tempPhoto=tempPhoto.next;
        }
    
    }
    public void Previous(){
        
        if(size!=0)
        System.out.println(picShow.prev.data);
        else
        System.out.println("No photo");
    
    }
    
    public void Next(){
    
        if(size!=0)
        System.out.println(picShow.next.data);
        else
        System.out.println("No photo");
    
    }

    public void Next(L search){

        Node<L> searchNode = photoAlbum;
        boolean bool = true;
        while(searchNode!=null){
        if(searchNode.data==search){
        System.out.println("Picture Found");
        searchNode = searchNode.next;
        bool = false;
        }
        searchNode = searchNode.next;
    
    }
    if(bool){
        System.out.println("Picture not found");
    }

    }
    public void AddatFirst(L picture){
        
        Node<L> newPic = new Node<>(picture);
        if(size==0)
        photoAlbum = newPic;
        else{
            photoAlbum.prev= newPic;
            newPic.next = photoAlbum;
            photoAlbum=newPic;
        }
        size++;
    
    }
    public void Add(L picture){
    
        Node<L> newPic = new Node<>(picture);
        if(size==0)
        photoAlbum=newPic;
        else{
            Node<L> q = photoAlbum;
            q.next = newPic;
            q=q.next;
        }
    size++;
    }

    public void Update(L replace, L picture){
        
        Node<L> replaceNode = photoAlbum;
        while (replaceNode!=null) {
            if(replaceNode.data==replace)
            replaceNode.data = picture;
            replaceNode = replaceNode.next;
        }

    }

    public void Delete(){
        
        Node<L>deleteNode = photoAlbum;
        
        if(size==0)
        deleteNode = null;
        
        else{
            deleteNode = deleteNode.next;
            deleteNode.prev = null;
            size--;
        }
 
    }

    public void Search(L search){

        Node<L> tempNode = photoAlbum;
        boolean t = true;
        while(tempNode!=null){
            if(tempNode.data == search){
                    System.out.println("Photo Found named as: "+tempNode.data);
                    t=false;
                    break;
            }
            tempNode = tempNode.next;
        }
            if(t){
                    System.out.println("Photo not Found");
            
        }
    }
 
    public void Counter(){
    
        int counter=0;
        Node<L> tempPhoto = photoAlbum;
        while(tempPhoto!=null){
            counter++;
            tempPhoto=tempPhoto.next;
        }
        System.out.println("Total number of pictures are: "+counter);
    
    }

}
class Node<T>{
    T data;
    Node<T> next;
    Node<T> prev;
    Node(T data){
        this.data = data;
        next = null;
        prev = null;
    }
    
}