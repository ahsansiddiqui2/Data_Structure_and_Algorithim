//primitive variables

import java.util.ArrayList;
class Task1{
   public static void main(String[] args) {
      System.out.println("Menu Builder");
      MenuBuilder.main();
      System.out.println("Employee");
      Employee.main();
   }
}
 class MenuBuilder {
    public static void main() {

        // Create a variable called menuTitle of type String and assign it the value "My
        // Dream Menu:".
        String menuTitle = "My Dream Menu: ";


        // Print the menuTitle variable to the console.
        System.out.println(menuTitle);
        // Create a variable called menu of type ArrayList.
        ArrayList <String> menu = new ArrayList <String>();
        // Create a variable called starter of type string and pass in the name of
        // your favourite starter.
        String starter = "Salad";
        // Add the starter variable to the ArrayList called menu.
        menu.add(starter);
        // Create a variable called mainCourse of type string and pass in the name of
        // your favourite main course.
        String mainCourse = "Biryani";
        // Add the mainCourse variable to the ArrayList called menu.
        menu.add(mainCourse);
        // Create a variable called dessert of type string and pass in the name of
        // your favourite dessert.
        String dessert = "Vanilla Ice Cream";
        // Add the dessert variable to the ArrayList called menu.
        menu.add(dessert);
        // Print the menu variable to the console.
        System.out.println(menu);
    }

}


 class Employee {

    public static void main() {

        // Create a variable called age of type int and assign it the value 29.
        int age = 29;
        // Print the age variable to the console.
        System.out.println(age);
        // Create a variable called isAManager of type boolean and assign it the value
        // true.
        boolean isAManager = true;
        // Print the isAManager variable to the console.
        System.out.println(isAManager);
        // Create a variable called yearsOfService of type double and assign it the
        // value 2.5.
        double yearsOfService = 2.5;
        // Print the yearsOfService variable to the console.
        System.out.println(yearsOfService);
        // Create a variable called baseSalary of type int and assign it the value 3000.
        int baseSalary = 3000;
        // Create a variable called overtimePayment of type int and assign it the value
        // 40.
        int overtimePayment = 40;
        // Create a variable called totalPayment of type int and assign it to the value
        // of baseSalary added to overtimePayment.
        int totalPayment = baseSalary + overtimePayment; 
        // Print the totalPayment variable to the console.
        System.out.println(totalPayment);
        // Create three variables all of type double on a single line.
        // They should be called firstBonus, secondBonus and thirdBonus and they should
        // be assigned the values 10.00, 22.00 and 35.00.
        double firstBonus= 10.00,secondBonus = 22.00,thirdBonus = 35.00;
        // Print out the sum of the variables called firstBonus, secondBonus and
        // thirdBonus.
        System.out.println(firstBonus+secondBonus+thirdBonus);

    }

}