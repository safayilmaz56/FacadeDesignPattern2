public class Facade {
    private IskeletOlusturucu iskelet;
    private MotorOlusturucu motor;
    private ArabaOlusturucu olustur;

    public Facade(){
        iskelet = new IskeletOlusturucu();
        motor = new MotorOlusturucu();
        olustur = new ArabaOlusturucu(iskelet,motor);
    }
    public void arabaUret(){
        Araba uretilenAraba = olustur.olustur(Renkler.Kirmizi);
    }
}
