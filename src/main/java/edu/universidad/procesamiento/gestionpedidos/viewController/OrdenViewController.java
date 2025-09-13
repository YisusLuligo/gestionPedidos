package edu.universidad.procesamiento.gestionpedidos.viewController;
import java.net.URL;
import java.util.ResourceBundle;

import edu.universidad.procesamiento.gestionpedidos.Controller.OrdenController;
import edu.universidad.procesamiento.gestionpedidos.Controller.ProductoController;
import edu.universidad.procesamiento.gestionpedidos.model.ItemOrden;
import edu.universidad.procesamiento.gestionpedidos.model.Orden;
import edu.universidad.procesamiento.gestionpedidos.model.Producto;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class OrdenViewController {
    OrdenController ordenController;
    ObservableList<Producto> productos = FXCollections.observableArrayList();
    ObservableList<ItemOrden> carrito = FXCollections.observableArrayList();
    Producto productoSelecionado;
    Orden ordenSeleccionado;





        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button btnAgregarProductoOrden;

        @FXML
        private Button btnCompletarOrden;

        @FXML
        private Button btnEliminarProdoOrden;

        @FXML
        private TableView<ItemOrden> tableOrdenProducto;

        @FXML
        private TableView<Producto> tableProductoDisponible;

        @FXML
        private TableColumn<Producto, String> tcNombreProducto;


        @FXML
        private TableColumn<Producto, Double> tcPrecioProducto;


        @FXML
        private TableColumn<Producto, String> tcSkuProducto;

        @FXML
        private TableColumn<ItemOrden, Double> tcTotalOrden;

        @FXML
        private TableColumn<ItemOrden, String> tcNombreOrden;

        @FXML
        private TableColumn<ItemOrden, Integer> tcCantidadOrden;

        @FXML
        private TextArea txtConfirmacionOrden;

        @FXML
        private Text txtInformacionProducto;

        @FXML
        void onAgregarProductoOrden(ActionEvent event) {
            agregarOrden();
        }


    @FXML
        void onCompletarOrden(ActionEvent event) {

        }

        @FXML
        void onEliminarProductoOrden(ActionEvent event) {

        }

        @FXML
        void initialize() {
            ordenController = new OrdenController();
            initView();
        }

    private void initView() {
            initdataBindingProductos();
            tableProductoDisponible.setItems(productos);
            obtenerProductos();
            initdataBindingOrdenes();
            obtenerOrdenes();
            tableOrdenProducto.setItems(carrito);
            listenerSelection();

    }

    private void obtenerOrdenes() {
            carrito.setAll(ordenController.obtenerOrdenesProductosCarrito().values());
    }

    private void obtenerProductos() {
            productos.addAll(ordenController.obtenerProductos().values());
    }

    private void initdataBindingOrdenes() {
        tcNombreOrden.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getProducto().getNombre()));
        tcCantidadOrden.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getCantidad()));

// Total (precio * cantidad)
        tcTotalOrden.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getSubtotal()));

    }

    private void initdataBindingProductos() {
            tcNombreProducto.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getNombre()));
            tcSkuProducto.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getSku()));
            tcPrecioProducto.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getPrecio()));
    }



    private void agregarOrden() {
        if (productoSelecionado != null) {
            if ("No Disponible".equalsIgnoreCase(productoSelecionado.getEstado())) {

            if (ordenController.agregarCarrito(productoSelecionado)) {
                // refrescar la lista observable del carrito
                carrito.setAll(ordenController.obtenerOrdenesProductosCarrito().values());
                productos.remove(productoSelecionado);
                tableProductoDisponible.getSelectionModel().clearSelection();
                productoSelecionado = null;
                //limpiarCampos();

            }
            }
        }
    }











    private void listenerSelection() {
        //Sirve la dar la seleccion de la tabla cada que se seleccione se va guardar en una variable cliente seleccionado
        tableProductoDisponible.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            productoSelecionado = newSelection;
            //Cada que se seleccione de hace una nueva seleccion y se va mostrar el seleccionado
            mostrarInformacionProducto(productoSelecionado);
        });
    }


    private void mostrarInformacionProducto(Producto productoSeleccionado) {
            //Verificar que el cliente exista
        if(productoSeleccionado !=null && productoSeleccionado.getEstado().equals("Disponible")) {
        }
            String precio = String.valueOf(productoSeleccionado.getPrecio());
            //Mostrar en los texFiel los datos que se selecciono
            txtInformacionProducto.setText("Informacion: "+productoSeleccionado.getSku()+" "+productoSeleccionado.getNombre()+" "+precio);


        }
}

