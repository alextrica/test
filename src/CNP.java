//19. se da un numar care reprezeinta CNP-ul unei persoane si are urmatorul format => SAALLZZJJNNNC. sa se scrie un program
// care afiseaza sexul, luna si anul nasterii unei, stiind ca :
//        S => sexul : masculin / feminin
//        1 / 2 - nascuti intre 1 ianuarie 1900 si 31 decembrie 1999
//        3 / 4 - nascuti intre 1 ianuarie 1800 si 31 decembrie 1899
//        5 / 6 - nascuti intre 1 ianuarie 2000 si 31 decembrie 2099
//        7 / 8 - pentru persoanele straine rezidente in Romania.

//        AA => numar format din 2 cifre si reprezinta ultimele 2 cifre din anul nasterii
//        LL => luna (exemplu 05 => mai)
//        ZZ => ziua (exemplu 09 = 9)
//        exemplu : cnp = 1900510...... se va afisa mesajul "baiat nascut pe 10 mai 1990"
//        cnp = 2890205...... se va afisa mesajul "fata nascuta pe 5 februarie 1989"


// pana in punctul asta am lucrat la ea

public class CNP{
    //String cnpString='SAALLZZJJNNNC';
    public static void main(String args[] ) {
        int s = 50;
        switch (s) {

            case 1:
            case 2:
                System.out.println("   nascuti intre 1 ianuarie 1900 si 31 decembrie 1999");
                break;
            case 3:
            case 4:
                System.out.println("nascuti intre 1 ianuarie 1800 si 31 decembrie 1899");
                break;
            case 5:
            case 6:
                System.out.println(" nascuti intre 1 ianuarie 2000 si 31 decembrie 2099 ");
                break;
            case 7:
            case 8:
                System.out.println("  pentru persoanele straine rezidente in Romania");
                break;
                default:
                System.out.println("  S-a introdus o cifra eronata");



        }
    }
    }