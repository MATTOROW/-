package org.example;

public class Construction implements Building {
    private ListOfStages stages = new ListOfStages();
    private Plan plan = new Plan();
    private Base base = new Base();
    private Roof roof = new Roof();
    private Trimming trimming = new Trimming();

    public Construction() {
        stages.add(new Node(plan));
        stages.add(new Node(base));
        stages.add(new Node(roof));
        stages.add(new Node(trimming));
    }

    public void start(){
        int errorCode = 0;
        while (stages.curr() != null) {
            System.out.println(stages.curr());
            stages.curr().setStatusBar(Status.INPROGRESS);
            try {
                stages.curr().workingProcess();
                System.out.println();
                stages.toNext();
            } catch (StageRejectedException e) {
                if (stages.curr() instanceof Plan) {
                    errorCode = 1;
                    break;
                } else {
                    stages.toPrev();
                    System.out.println("Этап забракован! Возвращаемся к предыдущему!");
                    System.out.println();
                }
            }
        }
        stop(errorCode);
    }

    public void stop(int errorCode) {
        if (errorCode == 0) {
            System.out.println("Стройка завершена! Все задачи выполнены.");
        }
        if (errorCode == 1) {
            System.out.println("План забракован! Стройка отменяется");
        }
    }
}
