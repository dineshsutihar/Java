import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {
//       ArrayList is used to store data dynamically which can be automatically resized
        ArrayList<String> students = new ArrayList<>();
        students.add("Dinesh");
        students.add("Umesh");
        students.add("Mahesh");
        students.add("Ramesh");
        System.out.println(students);

        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(1,50); //Here 1st parameter is position and second is the element to be added.

//        If we want to another list to on one list then we can do
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(30);
        newList.add(40);

        list.addAll(newList); //new list is added to List using addAll
        System.out.println(list);


//        To get the list item
        System.out.println(list.get(1));// get is used to retrive the data from list and it accept the parameter which is index;

//        To remove the items from the list
        list.remove(1); // remove is used to delete the item from the list and it accepts index as a parameter
        System.out.println(list);

//        on the above we have accepted the position but if we want to delete the element but we dont know positon then we do the following
        list.remove(Integer.valueOf(30)); // it will delete the index of 30 what ever it is
        System.out.println(list);


//        if we want to clear whole list then we will use clear
        newList.clear();
        System.out.println(newList);


//        Everything happening here in O(n) time complexity


//        set function to update the value without deleting it just replace the value
        list.set(2,10000); // here we are replace the value of 2nd index to 10000
        //Set works on O(n) Complexity


//        contains to check whether the value is present or not
        System.out.println(list.contains(30));// here iam check weather the list contain the value 30 or not if it contains then it will return true or else it will return false


        list.add(40);
        list.add(500);
        list.add(20);


//        Iterating over the ArrayList
        for(int i =0; i<list.size(); i++){
            System.out.printf("%d ",list.get(i));
        }

        for (Integer element: list){
            System.out.println(element);
        }

        //iterator

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){ // .hasNext() return true it next element is present in list else it will return false
            System.out.println("iterator "+it.next()); //it.next() helps to get the value form list
        }



    }
}