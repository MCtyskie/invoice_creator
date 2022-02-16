module pl.invoice_creator.invoicecreator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens pl.invoice_creator.invoicecreator to javafx.fxml;
    exports pl.invoice_creator.invoicecreator;
}