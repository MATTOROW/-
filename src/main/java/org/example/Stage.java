package org.example;

abstract public class Stage {
    protected Status statusBar = Status.PLANNED;
    protected String name;
    protected int rejectedChance = 0;

    public Stage() {
    }

    public Stage(String name) {
        this.name = name;
    }

    public void workingProcess() throws StageRejectedException {
        // Симуляция работы. Отправляет программу в сон на 6 секунд.
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        if (Math.random() * 100 < rejectedChance) {
            setStatusBar(Status.REJECTED);
            throw new StageRejectedException();
        } else {
            setStatusBar(Status.DONE);
        }
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Текущий этап: " + name + ", статус: " + statusBar;
    }

    public Status getStatusBar() {
        return statusBar;
    }

    public void setStatusBar(Status statusBar) {
        System.out.println("Обновление статуса. Текущий: " + statusBar);
        this.statusBar = statusBar;
    }

    public int getRejectedChance() {
        return rejectedChance;
    }
}
