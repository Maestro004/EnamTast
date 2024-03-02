//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (TransportType value : TransportType.values() ){
            System.out.println(value+" "+value.calkulaateTravelCost(50));
        }

    }
}