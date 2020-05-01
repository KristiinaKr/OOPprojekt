package OOPprojekt;

import javafx.stage.Stage;

public class ValeSisendiErind extends Exception {

    public ValeSisendiErind(String message) throws Exception {
        super(message);

        testKlass testKlass = new testKlass();
        Stage pealava = new Stage();
        testKlass.start(pealava);
    }
}
