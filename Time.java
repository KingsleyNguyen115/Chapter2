public class Time {
    public static void main(String [] args){
        double second = 30.0;
        double minute = 15.0;
        double hour = 17.0;
        double SECOND_SINCE_MIDNIGHT = (hour * 3600) + second;
        double secondRemained = (24*60*60) - SECOND_SINCE_MIDNIGHT;
        double percentage = 0.00116;
        double percentageOfDay = SECOND_SINCE_MIDNIGHT * percentage ;
        System.out.println("The number of seconds since midnight: " +SECOND_SINCE_MIDNIGHT );
        System.out.println("The number of seconds remaining in the day: " + secondRemained);
        System.out.println("The percentage of the day that has passed: " + percentageOfDay +"%");

    }
}