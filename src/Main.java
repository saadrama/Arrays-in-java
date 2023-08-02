public class Main {
    public static void main(String[] args) {
        System.out.println("ARRAYS");
        /*Arrays are used to store values in a single variable, instead of declaring separate variables for each value
        * To declare an array define the variable type with a square brackets ( String[] cars;)
        * To insert values in it, you can place the values in a comma-separated list,inside curly braces
        * */
        String[] cars= {"Volvo", "BMW", "Ford"};
        int[] myNum={10, 29, 20, 15}; // Array of integers

        //Access The elements of an Array
        //You can access an array element by referring to the index no
         String[] animals={"Cow", "Dog", "Goat", "Sheep"};
        System.out.println(animals[1]); //outputs Dog, this is because array elements starts with 0 in the first element....

        //CHANGING AN ARRAY ELEMENT
        //To change the value of a specific element refer to te index number
        animals[1]="camel";
        System.out.println(animals[1]);

        //Array Length
        //To find out how many elements an array has, use the length property
        System.out.println(animals.length); //outputs 4

        //JAVA ARRAYS LOOP
        //Loop Through an Array
        /*you can loop through the array elements with the for loop, and use length property to specify how many
        * times the loop should run.*/
        var color= new String[]{"blue", "black", "pink", "yellow", "Red", "Green"};
        for (int i=0; i<color.length;i++)
            System.out.println(color[i]); //outputs all elements in the color array
        //Loop Through an array with For-Each
        var phones= new String[]{"Tecno", "Infinix", "Nokia", "Redme", "Realme"};
        for (String i : phones)
            System.out.println(i);



    }
}