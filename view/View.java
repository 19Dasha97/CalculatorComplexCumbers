package view;

import service.Complex;

public interface View {

    void displayResult(Complex result);

    String getUserInput(String message);

}
