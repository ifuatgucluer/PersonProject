import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class GunYazdir {
    public static void main(String[] args) {
        // Bugünün tarihini al
        LocalDate bugun = LocalDate.now();

        // Haftanın gününü al ve Türkçe olarak yazdır
        String gunAdi = bugun.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("tr"));
        System.out.println("Bugün " + gunAdi);
    }
}
