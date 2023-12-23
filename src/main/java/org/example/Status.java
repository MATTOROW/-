package org.example;

public enum Status {
    DONE("Done"), INPROGRESS("In progress"), PLANNED("Planned"), REJECTED("Rejected");

    private String status;

    Status(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}
