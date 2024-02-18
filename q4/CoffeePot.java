public class CoffeePot {
    NormMediator mediator;

    public void doCoffeePot(Alarm alarm) {
        System.out.println("I am coffe pot,... doing my task");
        alarm.endAlarm("Coffee Pot");
    }

    public void setMediator(NormMediator mediator){
        this.mediator = mediator;
    }

}
