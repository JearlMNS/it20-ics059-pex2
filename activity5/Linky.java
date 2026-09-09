
package activity5;
public class Linky {
    public static void main (String args []){
        linkyList list = new linkyList();
        
        list.insert(101);
        list.insert(102);
        list.insert(103);
        list.insert(104);
        list.insert(105);
        
        System.out.println("Initial");
        list.display();
        System.out.println();
        
        list.insertAtBeginning(100);
        System.out.println("insert 100");
        list.display();
        System.out.println();

         //list.search(103);
        //System.out.println("Search 103: " + list.search(103));
        //list.display();

        list.delete(103);
        System.out.println("Delete 103:");
        list.display();
        
    }
    
}
