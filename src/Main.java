public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat +4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var BoxerOne = 78.2;
        System.out.println(BoxerOne);
        var BoxerTwo = 82.7;
        System.out.println(BoxerTwo);
        var TotalWeight = BoxerOne + BoxerTwo;
        System.out.println(TotalWeight);

        var WeightDifference = BoxerTwo - BoxerOne;
        System.out.println("Разница в весе боксеров " + WeightDifference + " кг!");

        var WeightDifference2 = BoxerTwo % BoxerOne;
        System.out.println("Второй боксер тяжелее первого на " + WeightDifference2 + " кг!");

        var WorkingHours = 640;
        var OneEmpHours = 8;
        var NumberOfEmp = WorkingHours / OneEmpHours;
        System.out.println("Всего работников в компании - " + NumberOfEmp + " человек!");

        var NewStaff = NumberOfEmp + 94;
        System.out.println(NewStaff);
        var NewWorkingHours = NewStaff * OneEmpHours;
        System.out.println("Если в компании работает " + NewStaff + " человек,то всего " + NewWorkingHours + " часов работы может быть поделено между сотрудниками");
    }
}