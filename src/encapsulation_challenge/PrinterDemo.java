package encapsulation_challenge;

public class PrinterDemo {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
       // printer.addToner(50);
        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());
    }
}
