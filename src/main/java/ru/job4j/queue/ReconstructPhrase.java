package ru.job4j.queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder line = new StringBuilder();
        Iterator<Character> iterator = evenElements.iterator();
        int count = 0;

        while (iterator.hasNext()) {
            if (count % 2 == 0) {
                line.append(iterator.next());
            } else {
                iterator.next();
            }
            count++;
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

    public static void main(String[] args) {
        Deque<Character> evenElements = new LinkedList<>(
                Arrays.asList(
                        'S', '1', 'l', '3', 'o', 'h', 'g', 'h', 'a', 'm', 'n', 't',
                        ' ', 't', 'o', ' ', 'f', 'q', ' ', '6', 'l', '.', 'a', ',',
                        'n', 'w', 'g', 'd', 'u', 'a', 'a', 'u', 'g', 'd', 'e', 'q',
                        ' ', 'y', 'J', 'd', 'a', 'k', 'v', 'p', 'a', 'e', ':', 'b'
                )
        );
        for (int i = 0; i < evenElements.size(); i++) {
            System.out.println(evenElements.pollFirst());
        }
    }
}
