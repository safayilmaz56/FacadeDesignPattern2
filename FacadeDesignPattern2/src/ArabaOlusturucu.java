public class ArabaOlusturucu {
    public IskeletOlusturucu iskelet;
    public MotorOlusturucu motor;

    public ArabaOlusturucu(IskeletOlusturucu iskelet, MotorOlusturucu motor) {
        this.iskelet = iskelet;
        this.motor = motor;
    }

    public IskeletOlusturucu getIskelet() {
        return iskelet;
    }

    public void setIskelet(IskeletOlusturucu iskelet) {
        this.iskelet = iskelet;
    }

    public MotorOlusturucu getMotor() {
        return motor;
    }

    public void setMotor(MotorOlusturucu motor) {
        this.motor = motor;
    }

    public Araba olustur(Renkler renk){
        return new Araba(iskelet,motor,renk);
    }
}
