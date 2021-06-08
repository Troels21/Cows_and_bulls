package bullscows;

public class Main {
    static String generede_tal;
    static String dit_tal;
    static int bullnumber = 0;
    static int cownumber = 0;
    static int guessnumber = 0;
    static String highscore = "Troels";
    static int highscoretal = 4;

    static Generator generatorobj = new Generator();
    static Dit dittalobj = new Dit();

    public static void main(String[] args) {
        // set generede tal
        generede_tal = Integer.toString(generatorobj.generedeTal());
        // set dit_tal
        dit_tal = dittalobj.dittal();
        System.out.println("dit tal: " + dit_tal);

        //første tal
        char ch1_0 = generede_tal.charAt(0);
        char ch2_0 = generede_tal.charAt(1);
        char ch3_0 = generede_tal.charAt(2);
        char ch4_0 = generede_tal.charAt(3);
        //andet tal
        char ch1_1 = dit_tal.charAt(0);
        char ch2_1 = dit_tal.charAt(1);
        char ch3_1 = dit_tal.charAt(2);
        char ch4_1 = dit_tal.charAt(3);


        while (bullnumber < 4) {
            if (ch1_0 == ch1_1)
                bullnumber++;
            else if (ch1_0 == ch2_1 || ch1_0 == ch3_1 || ch1_0 == ch4_1)
                cownumber++;
            if (ch2_0 == ch2_1)
                bullnumber++;
            else if (ch2_0 == ch1_1 || ch2_0 == ch3_1 || ch2_0 == ch4_1)
                cownumber++;
            if (ch3_0 == ch3_1)
                bullnumber++;
            else if (ch3_0 == ch1_1 || ch3_0 == ch2_1 || ch3_0 == ch4_1)
                cownumber++;
            if (ch4_0 == ch4_1)
                bullnumber++;
            else if (ch4_0 == ch1_1 || ch4_0 == ch2_1 || ch4_0 == ch3_1)
                cownumber++;
            System.out.println("du har " + bullnumber + " bulls og " + cownumber + " cows");

            if (ch1_0 == ch1_1 && ch2_0 == ch2_1 && ch3_0 == ch3_1 && ch4_0 == ch4_1) {
                System.out.println("du har nu gættet mit tal det var " + generede_tal);
                System.out.println("du brugte " + guessnumber + " forsøg.");
                if (guessnumber < highscoretal) {
                    System.out.println("du slå " + highscore + " den brugte " + highscoretal + " forsøg");
                } else
                    System.out.println("du slog ikke highscoren, den er " + highscoretal + " forsøg og " + highscore + " har den.");
            } else {
                dit_tal = dittalobj.dittal();
                ch1_1 = dit_tal.charAt(0);
                ch2_1 = dit_tal.charAt(1);
                ch3_1 = dit_tal.charAt(2);
                ch4_1 = dit_tal.charAt(3);
                cownumber = 0;
                bullnumber = 0;
                System.out.println("dit tal: " + dit_tal);
                guessnumber++;
            }
        }
    }
}