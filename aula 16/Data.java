import java.time.LocalDate;
import java.time.Period;



public class Data {
    private static LocalDate data1,data2;


    public static void main(String[] args) {



        data1 = LocalDate.parse("2024-04-10");
        data2 = LocalDate.parse("2005-05-15");
        Period tempo = Period.between(data1,data2);
        System.out.println(tempo.getYears());
        System.out.println(tempo.getMonths());
        System.out.println(tempo.getDays());

   
    }
    

}
