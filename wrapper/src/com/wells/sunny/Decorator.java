package com.wells.sunny;

public class Decorator implements  Document{

    private Document document;

    public Decorator(Document document) {
        this.document = document;
    }

    @Override
    public void display() {
        document.display();
    }
}
