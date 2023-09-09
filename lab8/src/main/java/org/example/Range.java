package org.example;

public class Range {

    private final Long start;
    private final Long end;

    Range(long start, long end) {
        this.start = start;
        this.end = end;
    }

    Long getStart() {
        return start;
    }

    Long getEnd() {
        return end;
    }
}
