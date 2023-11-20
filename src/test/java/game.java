import java.util.Random;

public class game {

    public static void main(String[] args) {

        Random r = new Random();

        int x = r.nextInt(14);


        System.out.println(x);

        switch (x) {
            case (1):
                System.out.println("A -> Kelime ekleye ekleye cümle kurmak. Kağıdı çeken, bir kelime söyleyerek cümleyi başlatır. Daha sonra sırasıyla herkes bu kelimeye yeni bir kelime ekleyerek cümleye devam eder, tabi herkes kendinden önceki kelimelerin hepsinin aynen ve doğru sırayla söylemek zorundadır. İlk şaşıran shot yapar.");
                break;
            case (2):
                System.out.println("K -> Pas. Arada sırada dinlenmek lazım, bu kağıt çekildiğinde kimse içmez ve bir sonraki kağıt çeker.");
                break;
            case (3):
                System.out.println("Q -> Soruna cevap veriyorum. Bu kart seçildikten sonra oyun aynen devam eder ama bir oyuncu diğerine soru sorduğunda, cevap verecek oyuncunun “soruna cevap veriyorum” dedikten sonra soruyu cevaplaması gerekmektedir. Bunu yapmayan oyuncu shot yapar.");
                break;
            case (4):
                System.out.println("J -> Grup. Bu kart çekildiğinde herhangi bir şey söylenir, bu gruplanabilir birşey olmalıdır. Bu sayede diğer oyuncular bu gruptan başka şeyler söylemeli sırasıyla, söyleyemeyen shot yapar. Örnek vermek gerekirse, spor bir grup olabilir ve futbol ile başlatıldığında diğer oyuncular da başka spor dallarını söylemeliler. Daha önce söyleneni söylemek de shot ile sonuçlanır.");
                break;
            case (5):
                System.out.println("10 -> Kural. Bu kartı çeken oyuncu istediği bir kural uydurur. Bundan sonra oyun devam eder ama bu kural ile beraber, ne zaman kli bir oyuncu bu kuralı bozarsa o oyuncu shot yapar ve kural geçerliliğini kaybeder. Eğer bir kural bozulmadan ikinci 10 çekilirse, oyun iki kuralı birden içererek devam eder.");
                break;
            case (6):
                System.out.println("9 -> Doğru / Yanlış. Bu kartı çeken oyuncu bir şey söyler, diğer oyuncularda bu söylenenin doğru mu yanlış mı olduğunu tahmin ederler. Yanlış tahminde bulunanlar shot yapar. Örnek vermek gerekirse, “Ben GALATASARAYLIYIM” dediğimde buna yanlış diyenler shot yapar. “Ben MIT’de okudum” dediğimde ise buna doğru diyenler shot yapar. Çünkü ben GALATASARAYLIYIM ve MIT kim ben kim ");
                break;
            case (7):
                System.out.println("8 -> Parmak masaya. Bu kart seçildiğinde herkes parmağını masaya koyar, en son koyan shot yapar.");
                break;
            case (8):
                System.out.println("7 -> Ben hiç. Bunu tek başına oynamak da mümkündür ama sevgililerin arasını açtığı görülmüştür. Kartı çeken oyuncu “Ben hiç …. yapmadım” cinsinden bir cümle söyler ve bunu yapanlar shot yapar. Örnek vermek gerekirse, “Ben hiç maça gitmedim” dendiği zaman maça gidenler shot yapar.");
                break;
            case (9):
                System.out.println("6 -> Kızlar. Masada bulunan kızlar shot yapar.");
                break;
            case (10):
                System.out.println("5 -> Erkekler. Masada bulunan erkekler shot yapar.");
                break;
            case (11):
                System.out.println("4-> Herkes. Masada bulunan herkes shot yapar.");
                break;
            case (12):
                System.out.println("3-> İstediğine içir. Bu kartı seçen oyuncu istediği herhangi bir oyuncuya shot yaptırır.");
                break;
            case (13):
                System.out.println("2-> Kendin iç. Bu kartı çeken oyuncu kendisi shot yapar.");
                break;
            case (0):
                break;

        }

    }




}
