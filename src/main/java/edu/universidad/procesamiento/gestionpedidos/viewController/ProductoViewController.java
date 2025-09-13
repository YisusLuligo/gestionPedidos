package edu.universidad.procesamiento.gestionpedidos.viewController;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import edu.universidad.procesamiento.gestionpedidos.Controller.ProductoController;
import edu.universidad.procesamiento.gestionpedidos.model.Producto;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class ProductoViewController {

    ProductoController productoController;
    ObservableList<Producto> productos = FXCollections.observableArrayList();
    Producto productoSelecionado;


        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button btnAgregarProducto;

        @FXML
        private Button btnEliminarProducto;

        @FXML
        private Button btnModificarProducto;

        @FXML
        private TableView<Producto> tableProducto;

        @FXML
        private TableColumn<Producto, String> tcEstadoProducto;

        @FXML
        private TableColumn<Producto, String> tcNombreProducto;

        @FXML
        private TableColumn<Producto, Double> tcPrecioProducto;

        @FXML
        private TableColumn<Producto, String> tcSkuProducto;

        @FXML
        private TextField txtNombreProducto;

        @FXML
        private TextField txtPrecioProducto;

        @FXML
        private TextField txtSkuProducto;

        @FXML
        void onAgregarProducto(ActionEvent event) {

        }

        @FXML
        void onEliminarProducto(ActionEvent event) {

        }

        @FXML
        void onModificarProducto(ActionEvent event) {

        }

        @FXML
        void initialize() {
            productoController = new ProductoController();
            initView();
        }

    private void initView() {
        initDataBinding();
        obtenerProductos();
        tableProducto.getItems().clear();
        tableProducto.setItems(productos);

        //limpiarCampos();
        //listenerSelection();
    }

    private void obtenerProductos() {
            productos.addAll(productoController.obtenerProductos());

    }

    private void initDataBinding() {
            tcNombreProducto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
            tcPrecioProducto.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getPrecio()));
            tcEstadoProducto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEstado()));
    }

}

