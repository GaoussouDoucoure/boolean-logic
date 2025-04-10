public class Main {

    public static void ageCheck(int age) {
        int LIMIT = 18;
        boolean isAdult = age >= LIMIT; //comparison operator that generates a boolean value
//        System.out.println("Is ADULT: " + isAdult);
        if(isAdult) {   //same as if(isAdult == true)
            System.out.println("IS ADULT.");
        }else{
            System.out.println("IS *NOT* ADULT.");
        }
    }

    public static void main(String[] args) {
        ageCheck(21);
        ageCheck(12);
        //COMPARISON OPERATORS
        System.out.println(25 == 21); //exactly equal
        System.out.println(25 != 21); // not equal
        System.out.println(25 > 21); // greater than
        System.out.println(25 < 21); // less than
        System.out.println(25 >= 21);// greater than or equal to
        System.out.println(25 <= 21);// less than or equal to

        boolean isDiabetic = true;
        boolean likesCake = true;
        if(likesCake && !isDiabetic){ // if likes cake *and* is *not* diabetic
            System.out.println("eats cake");
        }

        boolean isCat = false;
        boolean isDog = true;
        boolean isFriendly = true;
        //LOGICAL OPERATORS && || !  the symbols respectively mean AND, OR, NOT
        if((isCat || isDog) && isFriendly){// if is a cat *or* is a dog, *and* is friendly then pet it.
            System.out.println("pet it");
        }else{
            System.out.println("DON'T! pet it.");
        }

    }
}