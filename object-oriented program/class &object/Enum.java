enum day{
    
    SUNDAY,
     MONDAY,
      TUESDAY,
       WEDNESDAY,
        THURSDAY,
         FRIDAY,
          SATURDAY
}




public class Enum  {

    public static void main(String[] args) {
      
        int day = 8;

        switch (day) {
            case 1:
                System.out.println("weeeks 1st day");
                break;

            case 2:
                System.out.println("weeeks 2nd day");
                break;

            case 3:
                System.out.println("weeeks 3rd day");
                break;

             case 4:
                System.out.println("weeeks 4th day");
                break;

            case 5:
                System.out.println("weeeks 5th day");
                break;

            case 6:
                System.out.println("weeeks 6th day");
                break;

            case 7:
                System.out.println("weeeks last day");
                break;

            default:
                System.out.println("Invalid Day");
    }
}
}

    
