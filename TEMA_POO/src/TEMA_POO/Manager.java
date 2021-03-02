package TEMA_POO;

import java.util.ArrayList;

public class Manager extends Employee {
    // TO DO;;
    private ArrayList<Request> requests;

    public Manager() {
        super();
        this.requests = new ArrayList<Request>();
    }

    public void process(Job job) {};

    // getteri + setteri
    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }
}
