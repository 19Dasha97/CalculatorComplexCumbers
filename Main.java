import java.util.Scanner;

import service.CalculatorLogger;
import service.CheckingCalculatorPresenter;
import service.Presenter;
import view.CheckingCalculatorView;
import view.View;
import model.CheckingCalculatorModel;
import model.Model;

public class Main {
    public static void main(String[] args) {
        Model model = new CheckingCalculatorModel();
        View view = new CheckingCalculatorView(new Scanner(System.in));
        Presenter presenter = new CheckingCalculatorPresenter(model, view);
        presenter.onButtonClicked();
        CalculatorLogger.getInstance().close();
    }
}