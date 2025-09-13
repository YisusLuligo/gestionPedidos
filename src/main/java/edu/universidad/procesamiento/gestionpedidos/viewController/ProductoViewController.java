package edu.universidad.procesamiento.gestionpedidos.viewController;
import java.net.URL;
import java.util.ResourceBundle;

import edu.universidad.procesamiento.gestionpedidos.Controller.ProductoController;
import edu.universidad.procesamiento.gestionpedidos.model.Producto;
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
            agregarProducto();
        }


    @FXML
        void onEliminarProducto(ActionEvent event) {
            eliminarProducto();
        }


    @FXML
        void onModificarProducto(ActionEvent event) {
//Pendientee
        }

        @FXML
        void initialize() {
            productoController = new ProductoController();
            initView();
        }

    private void initView() {
        initDataBinding();
        tableProducto.setItems(productos);
        obtenerProductos();
        limpiarCampos();
        listenerSelection();
    }


    private void obtenerProductos() {
            productos.setAll(productoController.obtenerProductos().values());

    }

    private void initDataBinding() {
        tcNombreProducto.setCellValueFactory(cd -> new SimpleStringProperty(cd.getValue().getNombre()));

        tcPrecioProducto.setCellValueFactory(cd -> new javafx.beans.property.SimpleDoubleProperty(cd.getValue().getPrecio()).asObject());

        tcEstadoProducto.setCellValueFactory(cd -> new SimpleStringProperty(cd.getValue().getEstado()));

        tcSkuProducto.setCellValueFactory(cd -> new SimpleStringProperty(cd.getValue().getSku()));
    }

    private void agregarProducto() {
            Producto producto = crearProducto();
            if (datosValidos(producto)) {
                if(productoController.agregarProducto(producto)){
                    productos.add(producto);
                }else {
 //AGREGAR NOTIFICACION
                }
            }
    }


    private void eliminarProducto() {
        Producto sel = tableProducto.getSelectionModel().getSelectedItem();
        if (sel == null) return;

        if (productoController.eliminarProducto(sel.getSku())) {
            productos.remove(sel);                       // solo ese objeto
            tableProducto.getSelectionModel().clearSelection();
            limpiarCampos();
            // mensaje OK
        } else {
            // mensaje error
        }
    }

    private boolean datosValidos(Producto producto) {
            if (producto.getNombre().isEmpty()
                    || producto.getSku().isEmpty()
                    || producto.getEstado().isEmpty()
                    || producto.getPrecio() <= 0.0 ) {
                return false;
            }
            return true;
    }

    private Producto crearProducto() {
            return new Producto(txtSkuProducto.getText(),txtNombreProducto.getText(),Double.parseDouble(txtPrecioProducto.getText()),"Disponible");
    }


    private void listenerSelection() {
        //Sirve la dar la seleccion de la tabla cada que se seleccione se va guardar en una variable cliente seleccionado
        tableProducto.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            productoSelecionado = newSelection;
            //Cada que se seleccione de hace una nueva seleccion y se va mostrar el seleccionado
            mostrarInformacionProducto(productoSelecionado);
        });
    }


    private void mostrarInformacionProducto(Producto productoSeleccionado) {
        //Verificar que el cliente exista
        if(productoSeleccionado !=null){
            //Mostrar en los texFiel los datos que se selecciono
            txtNombreProducto.setText(productoSeleccionado.getNombre());
            txtSkuProducto.setText(productoSeleccionado.getSku());
            txtPrecioProducto.setText(String.valueOf(productoSeleccionado.getPrecio()));


        }
    }
    private void limpiarCampos() {
            txtNombreProducto.setText("");
            txtSkuProducto.setText("");
            txtPrecioProducto.setText("");

    }

}

