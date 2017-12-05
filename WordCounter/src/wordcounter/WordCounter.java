package wordcounter;



import java.io.*;

public class WordCounter {

    public static void main(String[] args) throws IOException {

        BufferedReader vlez = null;
        String imeDatoteka = "E://tekst.txt";
        String baranZbor = "datoteka";

        try {
            vlez = new BufferedReader(new FileReader(imeDatoteka));

            String line;

            int brojac = 0;

            while ((line = vlez.readLine()) != null) {

                String[] zborovi = line.split("\\W");

                for (String zbor : zborovi) {

                    String malZbor = zbor.toLowerCase();
                    String malBaranZbor = baranZbor.toLowerCase();

                    if (malZbor.equals(malBaranZbor))
                        brojac++;
                }

            }
            System.out.println(brojac);

        } finally {
            if (vlez != null)
                vlez.close();

        }

    }

}
