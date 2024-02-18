public class NormMediator implements IMediator{
    Alarm alarm;
    CoffeePot coffeePot;
    Sprinkler sprinkler;

    @Override
    public void doAlarm() {
        System.out.println("Alarm is sending event to all...");
        sprinkler.doSprinkler(alarm);
        coffeePot.doCoffeePot(alarm);
    }

    @Override
    public void endAlarm(String from) {
        System.out.println("Alarm event ended from " + from);
    }

    public void setAlarm(Alarm alarm){
        this.alarm = alarm;
    }

    public Alarm getAlarm(){
        return alarm;
    }

    public void setCoffeePot(CoffeePot coffeePot){
        this.coffeePot = coffeePot;
    }

    public CoffeePot getCoffeePot(){
        return coffeePot;
    }

    public void setSprinkler(Sprinkler sprinkler){
        this.sprinkler = sprinkler;
    }

    public Sprinkler getSprinkler(){
        return sprinkler;
    }
}