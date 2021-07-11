public class skojarzeniaKolorów {
    public static void main(String[] args) {
        char colour1 = 'c';
        char colour2 = 'z';
        char colour3 = 'n';
        char skojarzenie = 'z';

        switch (skojarzenie){
            case 'c':
                System.out.println("Kojarzy mi się z pomidorem");
                break;
            case 'z':
                System.out.println("Kojarzy mi się z trawą");
                break;
            case 'n':
                System.out.println("Kojarzy mi się z morzem");
                break;
            default:
                System.out.println("Brak skojarzeń");
        }
    }
}
