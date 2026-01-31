import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("TASK 1: MERGE UNIQUE ELEMENTS");
        ArrayList<String> books1 = new ArrayList<>();
        books1.add("Pride & Prejudice");
        books1.add("Romeo & Juliette");
        books1.add("War & Piece");
        books1.add("Harry Potter");
        ArrayList<String> books2 = new ArrayList<>();
        books2.add("Pride & Prejudice");
        books2.add("Jane Air");
        books2.add("Little Women");
        books2.add("Harry Potter");
        ArrayList<String> mergedList = new ArrayList<>(books1);
        for (String book : books2) {
            if (!mergedList.contains(book)) {
                mergedList.add(book);
            }
        }
        System.out.println("Merged list of books: " + mergedList);



        System.out.println("TASK 2: FIND MAXIMUM ELEMENT");
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Avatar");
        movies.add("Lord of the Ring");
        movies.add("White chicks");
        movies.add("Avengers");
        String longestTitle = "";
        for (String movie : movies) {
            if (movie.length() > longestTitle.length()) {
                longestTitle = movie;
            }
        }
        System.out.println("The longest movie's title of the list is: " + longestTitle);



        System.out.println("TASK 3: COUNT OCCURRENCES");
        ArrayList<String> foods = new ArrayList<>();
        foods.add("Sushi");
        foods.add("Pizza");
        foods.add("French fries");
        foods.add("Pizza");
        foods.add("Burger");
        foods.add("Pasta");
        foods.add("Pizza");
        int pizzaCount = 0;
        for(String food : foods) {
            if (food.equals("Pizza")) {
                pizzaCount++;
            }
        }
        System.out.println("Pizza occurred " + pizzaCount + " times");



        System.out.println("TASK 4: REMOVE ALL MATCHING ELEMENTS");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Melon");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");
        while (fruits.contains("Banana")) {
            fruits.remove("Banana");
        }
        System.out.println("Fruits list without Banana: " + fruits);



        System.out.println("TASK 5: REPLACE ALL ELEMENTS");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Brown");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("White");
        for (int i=0; i<colors.size(); i++) {
            colors.set(i, "Black");
        }
        System.out.println("Colors replaced with Black: " + colors);



        System.out.println("TASK 6: CHECK SUBLIST PRESENCE");
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Basketball");
        sports.add("Socker");
        sports.add("Football");
        sports.add("Tennis");
        ArrayList<String> sublist = new ArrayList<>();
        sublist.add("Football");
        sublist.add("Tennis");
        boolean containsAll = sports.containsAll(sublist);
        System.out.println("Is the list contains Football & Tennis? : " + containsAll);



        System.out.println("TASK 7: FIND INDEX OF ELEMENT");
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Rose");
        flowers.add("Tulip");
        int firstIndex = flowers.indexOf("Rose");
        int lastIndex = flowers.lastIndexOf("Rose");
        System.out.println("First index of Rose: " + firstIndex);
        System.out.println("Last index of Rose: " + lastIndex);



        System.out.println("TASK 8: REMOVE DUPLICATES");
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Giraffe");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Cat");
        animals.add("Wolf");
        ArrayList<String> uniqueAnimals = new ArrayList<>();
        for (String animal : animals) {
            if (!uniqueAnimals.contains(animal)){
                uniqueAnimals.add(animal);
            }
        }
        System.out.println("Animals without duplicates: " + uniqueAnimals);



        System.out.println("TASK 9: CONVERT ARRAYLIST TO ARRAY");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("London");
        cities.add("Rim");
        cities.add("Seattle");
        String[] citiesArray = cities.toArray(new String[0]);
        for (String city : citiesArray) {
            System.out.println(city);
        }



        System.out.println("TASK 10: CONVERT ARRAY TO ARRAYLIST");
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        System.out.println("Array to ArrayList: " + arrayList);



        System.out.println("TASK 11: FIND COMMON ELEMENTS");
        ArrayList<String> countries1 = new ArrayList<>();
        countries1.add("France");
        countries1.add("England");
        countries1.add("Italy");
        countries1.add("America");
        ArrayList<String> countries2 = new ArrayList<>();
        countries2.add("France");
        countries2.add("Australia");
        countries2.add("Italy");
        countries2.add("Russia");
        ArrayList<String> common = new ArrayList<>();
        for (String country : countries1) {
            if (countries2.contains(country)) {
                common.add(country);
            }
        }
        System.out.println("Common countries: " + common);



        System.out.println("TASK 12: REMOVE EVEN-LENGTH STRINGS");
        ArrayList<String> names = new ArrayList<>();
        names.add("Francisco");
        names.add("Enne");
        names.add("Itan");
        names.add("Amely");
        for (int i = names.size() - 1; i >= 0; i--) {
            if (names.get(i).length() % 2==0) {
                names.remove(i);
            }
        }
        System.out.println("List of names after removal: " + names);



        System.out.println("TASK 13: FIND SMALLEST ELEMENT");
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Goo Goo Muck");
        songs.add("Real man");
        songs.add("Someone like you");
        songs.add("Feel the light");
        String shortest = songs.get(0);
        for ( int i=1; i<songs.size(); i++) {
            if (songs.get(i).length() < shortest.length()) {
                shortest = songs.get(i);
            }
        }
        System.out.println("Shortest song: " + shortest);



        System.out.println("TASK 14: REPLACE ALL VOWELS");
        ArrayList<String> words = new ArrayList<>();
        words.add("Sunflower");
        words.add("Reality");
        words.add("Solely");
        words.add("Feedback");
        for (int i=0; i<words.size(); i++) {
            String word = words.get(i);
            String replaced = word.replaceAll("[aeiouAEIOU]","*");
            words.set(i, replaced);
        }
        System.out.println("Words without vowels: " + words);



        System.out.println("TASK 15: PARTITION ARRAYLIST");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2==0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);



        System.out.println("TASK 16: ROTATE ELEMENTS");
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        for (int i = 0; i < 2; i++) {
            String last = days.remove(days.size() - 1);
            days.add(0,last);
        }
        System.out.println("Rotated: " + days);



        System.out.println("TASK 17: REMOVE NUL VALUES");
        ArrayList<String> students = new ArrayList<>();
        students.add("Diana");
        students.add(null);
        students.add("Adelina");
        students.add(null);
        students.add("Aizhyldyz");
         while (students.contains(null)) {
             students.remove(null);
         }
        System.out.println("Students: " + students);



        System.out.println("TASK 18: FIND SECOND LARGEST ELEMENT");
        ArrayList<String> movie = new ArrayList<>();
        movie.add("Avatar");
        movie.add("Lord of the Ring");
        movie.add("White chicks");
        movie.add("Avengers");
        String secondLongest = "";
        for (String mov : movie) {
            if (mov.length() > secondLongest.length()) {
                secondLongest = mov;
            }
        }
        System.out.println("The second longest movie's title: " + secondLongest);



        System.out.println("TASK 19: REPLACE ELEMENTS WITH LENGTHS");
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Grape");
        fruit.add("Watermelon");
        ArrayList<Integer> lengths = new ArrayList<>();
        for (String fru : fruit) {
            lengths.add(fru.length());
        }
        System.out.println("Lengths of fruits: " + lengths);



        System.out.println("TASK 20: CREATE NESTED ARRAYLIST");
        ArrayList<ArrayList<String>> departments = new ArrayList<>();
        ArrayList<String> comfci = new ArrayList<>();
        comfci.add("Adel");
        comfci.add("April");
        comfci.add("Bill");
        ArrayList<String> comse = new ArrayList<>();
        comse.add("Ben");
        comse.add("Azamat");
        comse.add("Jeremy");
        ArrayList<String> comseh = new ArrayList<>();
        comseh.add("lily");
        comseh.add("Ron");
        comseh.add("Harry");
        departments.add(comfci);
        departments.add(comse);
        departments.add(comseh);
        System.out.println("Departments: " + departments);
        }
    }



