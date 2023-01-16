package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder line = new StringBuilder();
        int count = evenElements.size();
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                line.append(evenElements.pollFirst());
            } else {
                evenElements.pollFirst();
            }
        }
        return line.toString();
    }

    private String getDescendingElements() {
        StringBuilder line = new StringBuilder();
        Iterator<Character> iterator = descendingElements.descendingIterator();
        while (iterator.hasNext()) {
            line.append(iterator.next());
        }
        return line.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
