/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotek.moklet;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author crowl
 */
public class DataBaruController implements Initializable {

    @FXML
    private ImageView addphoto;

    @FXML
    private Button submit;

    @FXML
    private TextField kodeobat;

    @FXML
    private TextField jenisobat;

    @FXML
    private TextField namaobat;

    @FXML
    private TextField produksi;

    @FXML
    private TextField harga;

    @FXML
    private TextField kodesuplai;

    @FXML
    private TextField penyuplai;

    @FXML
    private TextField alamat;

    @FXML
    private TextField kota;

    @FXML
    private TextField telepon;
    
    @FXML
    private Button kembali;

    @FXML
    private Button edit;
    
    @FXML
    void alamat(ActionEvent event) {

    }

    @FXML
    void harga(ActionEvent event) {

    }

    @FXML
    void jenisobat(ActionEvent event) {

    }

    @FXML
    void kodeobat(ActionEvent event) {

    }

    @FXML
    void kodesuplai(ActionEvent event) {

    }

    @FXML
    void kota(ActionEvent event) {

    }

    @FXML
    void namaobat(ActionEvent event) {

    }

    @FXML
    void penyuplai(ActionEvent event) {

    }

    @FXML
    void produksi(ActionEvent event) {

    }
    

    @FXML
    void submit(ActionEvent event) {
        String KodeObat = kodeobat.getText();
        String JenisObat = jenisobat.getText();
        String NamaObat = namaobat.getText();
        String Produksi = produksi.getText();
        String Harga = harga.getText();
        String KodeSuplai = kodesuplai.getText();
        String Penyuplai = penyuplai.getText();
        String Alamat = alamat.getText();
        String Kota = kota.getText();
        String Telepon = telepon.getText();
        
        if(kodeobat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan Kode Obat");
        }else if(jenisobat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Termasuk obat apakah ini?");
        }else if(namaobat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Obatnya ialah?");
        }else if(produksi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Siapa yang memproduksi obat?");
        }else if (harga.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harga obat berapa?");
        }else if(kodesuplai.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan kode suplai");
        }else if (penyuplai.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Siapa yang menyuplai?");
        }else if(alamat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "dimana penyuplai ini berada?");
        }else if(kota.getText().equals("")){
            JOptionPane.showMessageDialog(null, "dari kota mana penyuplai ini?");
        }else if(telepon.getText().equals("")){
            JOptionPane.showMessageDialog(null, "apa nomor telepon yang bisa dihubungi?");
        }
    
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();

            // Load the new fxml
            FXMLLoader ArsipDankatalogObat = new FXMLLoader();
            ArsipDankatalogObat.setLocation(getClass().getResource("ArsipDanKatalogObat.fxml"));
            Scene scene = new Scene(ArsipDankatalogObat.load(), 494, 545);

            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
    }
        
        
        

    @FXML
    void telepon(ActionEvent event) {

    }
    
    @FXML
    void edit(ActionEvent event) {
        kodeobat.setText("");
        namaobat.setText("");
        jenisobat.setText("");
        produksi.setText("");
        harga.setText("");
        kodesuplai.setText("");
        penyuplai.setText("");
        alamat.setText("");
        kota.setText("");
        telepon.setText("");
    }
    
    @FXML
    void kembali(ActionEvent event) {
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();

            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 494, 545);

            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
