package BusinessLogic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import model.CurrencySet;
import model.InputValues;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class Controller implements Initializable {

    @FXML
    private ChoiceBox<currencies> currencies1;
    @FXML
    private ChoiceBox<currencies> currencies2;
    @FXML
    private Label courseLabel;
    @FXML
    private RadioButton buyButton;
    @FXML
    private TextField myTextField;
    @FXML
    private Label resultLabel;

    private enum currencies {
        PLN, EUR, USD, GBP, CHF;
    }

    private InputValues inputValues = new InputValues();
    private CurrencySet currencySet =  new CurrencySet();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        currencies1.getItems().addAll(currencies.values());
        currencies2.getItems().addAll(currencies.values());
        currencies1.setValue(currencies.PLN);
        currencies2.setValue(currencies.PLN);
        currencies1.setOnAction(this::setYourCurrency);
        currencies2.setOnAction(this::setTargetCurrency);
        buyButton.setSelected(true);
        courseLabel.setText(String.valueOf(currencySet.getBuyCourseList().get(inputValues.getKey())));
    }

    public void setYourCurrency(ActionEvent event){
        inputValues.setYourCurrency(String.valueOf(currencies1.getValue()));
        setCourse(event);
    }

    public void setTargetCurrency(ActionEvent event){
        inputValues.setTargetCurrency(String.valueOf(currencies2.getValue()));
        setCourse(event);
    }

    public void setBuyCourse(ActionEvent event){
        inputValues.setBuyOrSell(true);
        setCourse(event);
    }

    public void setSellCourse(ActionEvent event){
        inputValues.setBuyOrSell(false);
        setCourse(event);
    }

    public void setCourse(ActionEvent event){
        inputValues.setKey(inputValues.getYourCurrency()+"to"+inputValues.getTargetCurrency());
        if(inputValues.isBuyOrSell()){
            courseLabel.setText(String.valueOf(currencySet.getBuyCourseList().get(inputValues.getKey())));
        }
        else courseLabel.setText(String.valueOf(currencySet.getSellCourseList().get(inputValues.getKey())));
    }

    public void calculate(ActionEvent event){
        BigDecimal result;
        Pattern costPattern = Pattern.compile("[0-9]{0,9}\\.?[0-9]{0,2}");
        if(costPattern.matcher(myTextField.getText()).matches()){
            inputValues.setAmount(new BigDecimal(myTextField.getText()));
            if(inputValues.isBuyOrSell()){
                result = inputValues.getAmount().multiply(currencySet.getBuyCourseList().get(inputValues.getKey())).setScale(2, RoundingMode.HALF_UP);
            }
            else{
                result = inputValues.getAmount().multiply(currencySet.getSellCourseList().get(inputValues.getKey())).setScale(2, RoundingMode.HALF_UP);
            }
            resultLabel.setText(String.valueOf(result));
        }
        else{
            resultLabel.setText("Type a number!");
        }
    }
}
