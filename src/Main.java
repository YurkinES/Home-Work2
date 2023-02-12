public class Main {
    public static void main(String[] args) {
       // Task #1
       var dog = 8.0;
       var cat = 3.6;
       var paper = 763789;
       System.out.println(dog);
       System.out.println(cat);
       System.out.println(paper);
       // Task #2
       dog = dog + 4.0;
       cat = cat + 4.0;
       paper = paper + 4;
       System.out.println(dog);
       System.out.println(cat);
       System.out.println(paper);
       //// Task #3
       dog = dog - 3.5;
       cat = cat - 1.6;
       paper = paper - 7639;
       System.out.println(dog);
       System.out.println(cat);
       System.out.println(paper);
       // Task #4
       var friend = 19;
       System.out.println(friend);
       friend = friend + 2;
       System.out.println(friend);
       friend = friend / 7;
       System.out.println(friend);
       // Task 5
       var frog = 3.5;
       System.out.println(frog);
       frog = frog * 10;
       System.out.println(frog);
       frog = frog / 3.5;
       System.out.println(frog);
       frog = frog + 4;
       System.out.println(frog);
       // Task #6-7
       var FirstBoxerWeight = 78.2;
       var SecondBoxerWeight = 82.7;
       var TotalBoxersWeight = FirstBoxerWeight + SecondBoxerWeight;
       System.out.println(TotalBoxersWeight);
       var WeightDifference = SecondBoxerWeight - FirstBoxerWeight;
       System.out.println(WeightDifference);
       WeightDifference = SecondBoxerWeight % FirstBoxerWeight;
       System.out.println(WeightDifference);
       // Task #8
       var AllWorksHours = 640;
       var OneWorkerHours = 8;
       var Workers = AllWorksHours / OneWorkerHours;
       System.out.println("Всего работников в компании " + Workers + " человек.");
       Workers = Workers + 94;
       AllWorksHours = Workers * OneWorkerHours;
       System.out.println("Если в компании работает " + Workers + " человек, то всего " + AllWorksHours +
       " часов работы может быть поделено между сотрудниками");


    }
}