import java.io.*;
import java.util.*;

public class bank {

    public interface pnb {
        public void rateofinterest();
    }

    public interface sbi {
        public void rateofinterest();
    }

    public static class pnb1 implements pnb {
        public void rateofinterest() {
            System.out.println("PNB");
        }
    }

    public static class sbi1 implements sbi {
        public void rateofinterest() {
            System.out.println("SBI");
        }
    }

    public static void main(String[] args) {
        pnb1 pnbObj = new pnb1();
        pnbObj.rateofinterest();

        sbi1 sbiObj = new sbi1();
        sbiObj.rateofinterest();
    }
}
