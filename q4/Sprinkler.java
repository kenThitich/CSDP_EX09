public class Sprinkler {
    NormMediator mediator;

    public void doSprinkler(Alarm alarm) {
        System.out.println("I am sprinkler,... doing my task");
        alarm.endAlarm("Sprinkler");
    }

    public void setMediator(NormMediator mediator){
        this.mediator = mediator;
    }
}
