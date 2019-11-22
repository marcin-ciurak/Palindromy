public class Palindromy {
    public static void main(String[] args) {
        String tekst = "albo nałowi ci Wałęsa masę ławic i woła Nobla";

        boolean jestPalindomem = true;
        char[] znaki = tekst.trim().toUpperCase().replace(" ", "").toCharArray();
        for (int i = 0; i <= znaki.length/2; i++) {
            // znak z drugiego konca tablicy
            char znakOdpowiadajacy = znaki[znaki.length - i - 1];
            System.out.println("Znak to: " + znaki[i] + " a odpowiada mu " + znakOdpowiadajacy);
            if (znaki[i] != znakOdpowiadajacy) {
                jestPalindomem = false;
                break;
            }
        }

        if (jestPalindomem) {
            System.out.println("Sukces! Mamy palindom!");
        } else {
            System.out.println("To nie jest palindrom!");
        }
    }
}


