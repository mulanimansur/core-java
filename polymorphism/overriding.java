

public class overriding {
    

public static void main(String[] args) {

    employee e1;

    e1 =  new FullTimeemployee();
    e1.calculateSalary();
    e1.ShowDeatils();

    e1 =  new partTimeemployee();
    e1.calculateSalary();
    e1.ShowDeatils();

    e1 =  new temperoryemployee();
    e1.calculateSalary();
    e1.ShowDeatils();





      
    FullTimeemployee obj = new  FullTimeemployee();
    obj.baseSalary = 1000;
    obj.name ="Mansur";
    obj.bonus=300.00;
    obj.calculateSalary(); 
    obj.ShowDeatils();
    

    
}
}

class employee{
    String name;
    double baseSalary;


    //method to calculate salary (can be overriding)
    public double calculateSalary() {
        return baseSalary;//defult logic
    }

    public void ShowDeatils(){
        System.out.println("Employee: "+name + ",Salary: " + calculateSalary());
    }
}

class FullTimeemployee extends employee{
    double bonus;



    //method to calculate salary (can be overriding)
    @Override 
    public double calculateSalary() {
        return baseSalary + bonus;//defult logic
    }

    @Override 
    public void ShowDeatils(){
        System.out.println("FullTimeEmployee: "+name + ",Salary: " + calculateSalary());
    }
}

class partTimeemployee extends employee{
    int hoursworked;
    double hourlyRate;



    //method to calculate salary (can be overriding)
    @Override 
    public double calculateSalary() {
        return hoursworked * hourlyRate;//defult logic
    }

    @Override 
    public void ShowDeatils(){
        System.out.println("part-time Employee: "+name + ",Salary: " + calculateSalary());
    }
}


class temperoryemployee extends employee{
    int dayssworked;
    double dailyyRate;



    //method to calculate salary (can be overriding)
    @Override 
    public double calculateSalary() {
        return dayssworked * dailyyRate;//defult logic
    }

    @Override 
    public void ShowDeatils(){
        System.out.println("temperory Employee: "+name + ",Salary: " + calculateSalary());
    }
}
    
    

// chatgpt code

// public class Overriding {


// public static void main(String[] args) {

//     employee e1;

//     FullTimeemployee fullTime = new FullTimeemployee();
//     fullTime.name = "Mansur";
//     fullTime.baseSalary = 1000;
//     fullTime.bonus = 300;

//     partTimeemployee partTime = new partTimeemployee();
//     partTime.name = "Rahul";
//     partTime.hoursworked = 10;
//     partTime.hourlyRate = 100;

//     temperoryemployee temporary = new temperoryemployee();
//     temporary.name = "Aman";
//     temporary.dayssworked = 5;
//     temporary.dailyyRate = 500;

//     e1 = fullTime;
//     e1.showDetails();

//     e1 = partTime;
//     e1.showDetails();

//     e1 = temporary;
//     e1.showDetails();
// }


// }

// class employee {


// String name;
// double baseSalary;

// public double calculateSalary() {
//     return baseSalary;
// }

// public void showDetails() {
//     System.out.println(
//         "Employee: " + name + ", Salary: " + calculateSalary()
//     );
// }


// }

// class FullTimeemployee extends employee {


// double bonus;

// @Override
// public double calculateSalary() {
//     return baseSalary + bonus;
// }

// @Override
// public void showDetails() {
//     System.out.println(
//         "Full-time Employee: " + name + ", Salary: " + calculateSalary()
//     );
// }


// }

// class partTimeemployee extends employee {


// int hoursworked;
// double hourlyRate;

// @Override
// public double calculateSalary() {
//     return hoursworked * hourlyRate;
// }

// @Override
// public void showDetails() {
//     System.out.println(
//         "Part-time Employee: " + name + ", Salary: " + calculateSalary()
//     );
// }


// }

// class temperoryemployee extends employee {
// int dayssworked;
// double dailyyRate;

// @Override
// public double calculateSalary() {
//     return dayssworked * dailyyRate;
// }

// @Override
// public void showDetails() {
//     System.out.println(
//         "Temporary Employee: " + name + ", Salary: " + calculateSalary()
//     );
// }


// }

