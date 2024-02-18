public class App {
    public static void main(String[] args) {
        Sprinkler sprinkler = new Sprinkler();
        CoffeePot coffeePot = new CoffeePot();
        Alarm alarm = new Alarm();
        
        NormMediator mediator = new NormMediator();
        mediator.setAlarm(alarm);
        mediator.setCoffeePot(coffeePot);
        mediator.setSprinkler(sprinkler);

        alarm.setMediator(mediator);
        alarm.doAlarm();
    }    
}
