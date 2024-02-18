public class Alarm implements Colleague {
    NormMediator mediator;

    public void doAlarm() {
        mediator.doAlarm();
    }
    public void endAlarm(String from) {
        mediator.endAlarm(from);
    }

    @Override
    public void setMediator(NormMediator mediator){
        this.mediator = mediator;
    }
}