package com.ut.paxos;

public class Command {
    ProcessId client;
    int req_id;
    Object op;

    public Command(ProcessId client, int req_id, Object op) {
        this.client = client;
        this.req_id = req_id;
        this.op = op;
    }

    public boolean equals(Object o) {
        Command other = (Command) o;
        return client.equals(other.client) && req_id == other.req_id && op.equals(other.op);
    }

    @Override
    public int hashCode() {
        int result = client.hashCode();
        result = 31 * result + req_id;
        result = 31 * result + op.hashCode();
        return result;
    }

    public String toString() {
        return "Command(" + client + ", " + req_id + ", " + op + ")";
    }
}
