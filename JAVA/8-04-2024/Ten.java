public class Ten {
    void kiltomile(double kilo)
    {
        double mil=kilo/1.5;
        System.out.println(kilo+" kilometers = "+mil+" miles");
    }
    void miletokil(double mile)
    {
        double kil=1.5*mile;
        System.out.println(mile+" miles = "+kil+" kilometers");
    }
    public static void main(String[] args) {
        Ten obj = new Ten();
        obj.kiltomile(6.9);
        obj.miletokil(7.8);
    }
}
