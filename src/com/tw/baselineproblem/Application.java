package com.tw.baselineproblem;


public class Application {
    private Console console;
    private ReceiptGenerator receiptGenerator;

    public Application(Console console, ReceiptGenerator receiptGenerator) {
        this.console = console;
        this.receiptGenerator = receiptGenerator;
    }

    public void startApplication() {
        String Items = console.getInput();
        receiptGenerator.printReceipt(Items);
    }

}
