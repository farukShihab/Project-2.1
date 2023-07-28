package project2.pkg1;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ali Faruk Shihab
 */
public class EasyController implements Initializable {

    @FXML
    public Button b1=new Button();
    @FXML
    public Button b2=new Button();
    @FXML
    public Button b3=new Button();
    @FXML
    public Button b4=new Button();
    @FXML
    public Button b5=new Button();
    @FXML
    public Button b6=new Button();
    @FXML
    public Button b7=new Button();
    @FXML
    public Button b8=new Button();
    @FXML
    public Button b9=new Button();
    @FXML
    public Button b10=new Button();
    @FXML
    public Button b11=new Button();
    @FXML
    public Button b12=new Button();
    @FXML
    public Button b13=new Button();
    @FXML
    public Button b14=new Button();
    @FXML
    public Button b15=new Button();
    @FXML
    public Button b16=new Button();
    @FXML
    public Button b17=new Button();
    @FXML
    public Button b18=new Button();
    @FXML
    public Button b19=new Button();
    @FXML
    public Button b20=new Button();
    
    
    
    
    @FXML
    public Polygon p1=new Polygon();
    @FXML
    public Polygon p2=new Polygon();
    @FXML
    public Polygon p3=new Polygon();
    @FXML
    public Polygon p4=new Polygon();
    @FXML
    public Polygon p5=new Polygon();
    @FXML
    public Polygon p6=new Polygon();
    @FXML
    public Polygon p7=new Polygon();
    @FXML
    public Polygon p8=new Polygon();
    @FXML
    public Polygon p9=new Polygon();
    @FXML
    public Polygon p10=new Polygon();
    @FXML
    public Polygon p11=new Polygon();
    @FXML
    public Polygon p12=new Polygon();
    @FXML
    public Polygon p13=new Polygon();
    @FXML
    public Polygon p14=new Polygon();
    @FXML
    public Polygon p15=new Polygon();
    @FXML
    public Polygon p16=new Polygon();
    @FXML
    public Polygon p17=new Polygon();
    @FXML
    public Polygon p18=new Polygon();
    @FXML
    public Polygon p19=new Polygon();
    @FXML
    public Polygon p20=new Polygon();
    
    
    
    @FXML
    public Label totalScore=new Label();
    @FXML
    public Label bombsExploded=new Label();
    @FXML
    public Label bombsDetected=new Label();
    
    
    
    
    
    public Random rand=new Random();
    public ArrayList<Integer> randomInts=new ArrayList<Integer>();
    public Integer score=0;
    public Integer buttonsClicked=20;
    public Integer numberOfBombs=0;
    
    
    
    
    
    public void isGameEnded(){
        if(buttonsClicked==0){
            totalScore.setText(score.toString());
            Integer numberOfBombsDetected=score/10;
            this.bombsDetected.setText(numberOfBombsDetected.toString()+"/"+this.numberOfBombs.toString());
            numberOfBombsDetected=this.numberOfBombs-numberOfBombsDetected;
            this.bombsExploded.setText(numberOfBombsDetected.toString()+"/"+this.numberOfBombs.toString());
        }
        System.out.println("buttons clicked: "+buttonsClicked);
        System.out.println("score: "+score);
    }
    
    
    
    @FXML
    public void exitButton(ActionEvent event) throws Exception{
        Parent root=FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    
    @FXML
    public void b1press(){
        if(p1.getOpacity()==0)b1.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b1release(){
        if(p1.getOpacity()==0){
        Integer kount=new Integer(0);
        if(randomInts.contains(1)){
            b1.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(2) || randomInts.contains(6) || randomInts.contains(7)){
            if(randomInts.contains(2))kount++;
            if(randomInts.contains(6))kount++;
            if(randomInts.contains(7))kount++;
            b1.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b1.setText(kount.toString());
        }
        else{
            b1.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b2press(){
        if(p2.getOpacity()==0)b2.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b2release(){
        if(p2.getOpacity()==0){
        Integer kount=new Integer(0);
        if(randomInts.contains(2)){
            b2.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(1) || randomInts.contains(3) || randomInts.contains(6) || randomInts.contains(7) || randomInts.contains(8)){
            if(randomInts.contains(1))kount++;
            if(randomInts.contains(3))kount++;
            if(randomInts.contains(6))kount++;
            if(randomInts.contains(7))kount++;
            if(randomInts.contains(8))kount++;
            b2.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b2.setText(kount.toString());
        }
        else{
            b2.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b3press(){
        if(p3.getOpacity()==0)b3.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b3release(){
        if(p3.getOpacity()==0){
        Integer kount=new Integer(0);
        if(randomInts.contains(3)){
            b3.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(2) || randomInts.contains(4) || randomInts.contains(7) || randomInts.contains(8) || randomInts.contains(9)){
            if(randomInts.contains(2))kount++;
            if(randomInts.contains(4))kount++;
            if(randomInts.contains(7))kount++;
            if(randomInts.contains(8))kount++;
            if(randomInts.contains(9))kount++;
            b3.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b3.setText(kount.toString());
        }
        else{
            b3.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b4press(){
        if(p4.getOpacity()==0)b4.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b4release(){
        if(p4.getOpacity()==0){
        Integer kount=new Integer(0);
        if(randomInts.contains(4)){
            b4.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(3) || randomInts.contains(5) || randomInts.contains(8) || randomInts.contains(9) || randomInts.contains(10)){
            if(randomInts.contains(3))kount++;
            if(randomInts.contains(5))kount++;
            if(randomInts.contains(8))kount++;
            if(randomInts.contains(9))kount++;
            if(randomInts.contains(10))kount++;
            b4.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b4.setText(kount.toString());
        }
        else{
            b4.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b5press(){
        if(p5.getOpacity()==0)b5.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b5release(){
        if(p5.getOpacity()==0){
        Integer kount=new Integer(0);
        if(randomInts.contains(5)){
            b5.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(4) || randomInts.contains(9) || randomInts.contains(10)){
            if(randomInts.contains(4))kount++;
            if(randomInts.contains(9))kount++;
            if(randomInts.contains(10))kount++;
            b5.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b5.setText(kount.toString());
        }
        else{
            b5.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b6press(){
        if(p6.getOpacity()==0)b6.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b6release(){
        if(p6.getOpacity()==0){
        Integer kount=new Integer(0);
        if(randomInts.contains(6)){
            b6.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(1) || randomInts.contains(2) || randomInts.contains(7) || randomInts.contains(11) || randomInts.contains(12)){
            if(randomInts.contains(1))kount++;
            if(randomInts.contains(2))kount++;
            if(randomInts.contains(7))kount++;
            if(randomInts.contains(11))kount++;
            if(randomInts.contains(12))kount++;
            b6.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b6.setText(kount.toString());
        }
        else{
            b6.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b7press(){
        if(p7.getOpacity()==0)b7.setStyle("-fx-background-color: #ffffff");
    }
    //1 2 3 6 8 11 12 13
    @FXML
    public void b7release(){
        if(p7.getOpacity()==0){
        Integer kount=new Integer(0);
        if(randomInts.contains(7)){
            b7.setStyle("-fx-background-color: red");
            System.out.println("set");
        }
        else if(randomInts.contains(1) || randomInts.contains(2) || randomInts.contains(3) || randomInts.contains(6) || randomInts.contains(8) || randomInts.contains(11) || randomInts.contains(12) || randomInts.contains(13)){
            if(randomInts.contains(1))kount++;
            if(randomInts.contains(2))kount++;
            if(randomInts.contains(3))kount++;
            if(randomInts.contains(6))kount++;
            if(randomInts.contains(8))kount++;
            if(randomInts.contains(11))kount++;
            if(randomInts.contains(12))kount++;
            if(randomInts.contains(13))kount++;
            b7.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b7.setText(kount.toString());
        }
        else{
            b7.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b8press(){
        if(p8.getOpacity()==0)b8.setStyle("-fx-background-color: #ffffff");
    }
    //2 3 4 7 9 12 13 14
    @FXML
    public void b8release(){
        if(p8.getOpacity()==0){
        Integer kount=new Integer(0);
        if(randomInts.contains(8)){
            b8.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(2) || randomInts.contains(3) || randomInts.contains(4) || randomInts.contains(7) || randomInts.contains(8) || randomInts.contains(12) || randomInts.contains(13) || randomInts.contains(14)){
            if(randomInts.contains(2))kount++;
            if(randomInts.contains(3))kount++;
            if(randomInts.contains(4))kount++;
            if(randomInts.contains(7))kount++;
            if(randomInts.contains(9))kount++;
            if(randomInts.contains(12))kount++;
            if(randomInts.contains(13))kount++;
            if(randomInts.contains(14))kount++;
            b8.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b8.setText(kount.toString());
        }
        else{
            b8.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b9press(){
        if(p9.getOpacity()==0)b9.setStyle("-fx-background-color: #ffffff");
    }
    //3 4 5 8 10 13 14 15
    @FXML
    public void b9release(){
        if(p9.getOpacity()==0){
        Integer kount=new Integer(0);
        if(randomInts.contains(9)){
            b9.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(3) || randomInts.contains(4) || randomInts.contains(5) || randomInts.contains(8) || randomInts.contains(10) || randomInts.contains(13) || randomInts.contains(14) || randomInts.contains(15)){
            if(randomInts.contains(3))kount++;
            if(randomInts.contains(4))kount++;
            if(randomInts.contains(5))kount++;
            if(randomInts.contains(8))kount++;
            if(randomInts.contains(10))kount++;
            if(randomInts.contains(13))kount++;
            if(randomInts.contains(14))kount++;
            if(randomInts.contains(15))kount++;
            b9.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b9.setText(kount.toString());
        }
        else{
            b9.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b10press(){
        if(p10.getOpacity()==0)b10.setStyle("-fx-background-color: #ffffff");
    }
    //4 5 9 14 15
    @FXML
    public void b10release(){
        if(p10.getOpacity()==0){
        Integer kount=new Integer(0);
        if(randomInts.contains(10)){
            b10.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(4) || randomInts.contains(5) || randomInts.contains(9) || randomInts.contains(14) || randomInts.contains(15)){
            if(randomInts.contains(4))kount++;
            if(randomInts.contains(5))kount++;
            if(randomInts.contains(9))kount++;
            if(randomInts.contains(14))kount++;
            if(randomInts.contains(15))kount++;
            b10.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b10.setText(kount.toString());
        }
        else{
            b10.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b11press(){
        if(p11.getOpacity()==0)b11.setStyle("-fx-background-color: #ffffff");
    }
    //6 7 12 16 17
    @FXML
    public void b11release(){
        if(p11.getOpacity()==0){
        Integer kount=new Integer(0);
        if(randomInts.contains(11)){
            b11.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(6) || randomInts.contains(7) || randomInts.contains(12) || randomInts.contains(16) || randomInts.contains(17)){
            if(randomInts.contains(6))kount++;
            if(randomInts.contains(7))kount++;
            if(randomInts.contains(12))kount++;
            if(randomInts.contains(16))kount++;
            if(randomInts.contains(17))kount++;
            b11.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b11.setText(kount.toString());
        }
        else{
            b11.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b12press(){
        if(p12.getOpacity()==0)b12.setStyle("-fx-background-color: #ffffff");
    }
    //6 7 8 11 13 16 17 18
    @FXML
    public void b12release(){
        if(p12.getOpacity()==0){
        Integer kount=new Integer(0);
        if(randomInts.contains(12)){
            b12.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(6) || randomInts.contains(7) || randomInts.contains(8)|| randomInts.contains(11) || randomInts.contains(13) || randomInts.contains(16) || randomInts.contains(17) || randomInts.contains(18)){
            if(randomInts.contains(6))kount++;
            if(randomInts.contains(7))kount++;
            if(randomInts.contains(8))kount++;
            if(randomInts.contains(11))kount++;
            if(randomInts.contains(13))kount++;
            if(randomInts.contains(16))kount++;
            if(randomInts.contains(17))kount++;
            if(randomInts.contains(18))kount++;
            b12.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b12.setText(kount.toString());
        }
        else{
            b12.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b13press(){
        if(p13.getOpacity()==0)b13.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b13release(){
        Integer kount=new Integer(0);
        if(p13.getOpacity()==0){
        if(randomInts.contains(13)){
            b13.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(7) || randomInts.contains(8) || randomInts.contains(9)|| randomInts.contains(12) || randomInts.contains(14) || randomInts.contains(17) || randomInts.contains(18) || randomInts.contains(19)){
            if(randomInts.contains(7))kount++;
            if(randomInts.contains(8))kount++;
            if(randomInts.contains(9))kount++;
            if(randomInts.contains(12))kount++;
            if(randomInts.contains(14))kount++;
            if(randomInts.contains(17))kount++;
            if(randomInts.contains(18))kount++;
            if(randomInts.contains(19))kount++;
            b13.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b13.setText(kount.toString());
        }
        else{
            b13.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b14press(){
        if(p14.getOpacity()==0)b14.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b14release(){
        Integer kount=new Integer(0);
        if(p14.getOpacity()==0){
        if(randomInts.contains(14)){
            b14.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(8) || randomInts.contains(9) || randomInts.contains(10)|| randomInts.contains(13) || randomInts.contains(15) || randomInts.contains(18) || randomInts.contains(19) || randomInts.contains(20)){
            if(randomInts.contains(8))kount++;
            if(randomInts.contains(9))kount++;
            if(randomInts.contains(10))kount++;
            if(randomInts.contains(13))kount++;
            if(randomInts.contains(15))kount++;
            if(randomInts.contains(18))kount++;
            if(randomInts.contains(19))kount++;
            if(randomInts.contains(20))kount++;
            b14.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b14.setText(kount.toString());
        }
        else{
            b14.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b15press(){
        if(p15.getOpacity()==0)b15.setStyle("-fx-background-color: #ffffff");
    }
    //9 10 14 19 20
    @FXML
    public void b15release(){
        Integer kount=new Integer(0);
        if(p15.getOpacity()==0){
        if(randomInts.contains(15)){
            b15.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(9) || randomInts.contains(10) || randomInts.contains(14) || randomInts.contains(19) || randomInts.contains(20)){
            if(randomInts.contains(9))kount++;
            if(randomInts.contains(10))kount++;
            if(randomInts.contains(14))kount++;
            if(randomInts.contains(19))kount++;
            if(randomInts.contains(20))kount++;
            b15.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b15.setText(kount.toString());
        }
        else{
            b15.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b16press(){
        if(p16.getOpacity()==0)b16.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b16release(){
        Integer kount=0;
        if(p16.getOpacity()==0){
        if(randomInts.contains(16)){
            b16.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(11) || randomInts.contains(12) || randomInts.contains(17)){
            if(randomInts.contains(11))kount++;
            if(randomInts.contains(12))kount++;
            if(randomInts.contains(17))kount++;
            b16.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b16.setText(kount.toString());
        }
        else{
            b16.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b17release(){
        Integer kount=new Integer(0);
        if(p17.getOpacity()==0){
        if(randomInts.contains(17)){
            b17.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(11) || randomInts.contains(12) || randomInts.contains(13) || randomInts.contains(16) || randomInts.contains(18)){
            if(randomInts.contains(11))kount++;
            if(randomInts.contains(12))kount++;
            if(randomInts.contains(13))kount++;
            if(randomInts.contains(16))kount++;
            if(randomInts.contains(18))kount++;
            b17.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b17.setText(kount.toString());
        }
        else{
            b17.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b17press(){
        if(p17.getOpacity()==0)b17.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b18release(){
        Integer kount=new Integer(0);
        if(p18.getOpacity()==0){
        if(randomInts.contains(18)){
            b18.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(12) || randomInts.contains(13) || randomInts.contains(14) || randomInts.contains(17) || randomInts.contains(19)){
            if(randomInts.contains(12))kount++;
            if(randomInts.contains(13))kount++;
            if(randomInts.contains(14))kount++;
            if(randomInts.contains(17))kount++;
            if(randomInts.contains(19))kount++;
            b18.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b18.setText(kount.toString());
        }
        else{
            b18.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b18press(){
        if(p18.getOpacity()==0)b18.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b19release(){
        Integer kount=new Integer(0);
        if(p19.getOpacity()==0){
        if(randomInts.contains(19)){
            b19.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(13) || randomInts.contains(14) || randomInts.contains(15) || randomInts.contains(18) || randomInts.contains(20)){
            if(randomInts.contains(13))kount++;
            if(randomInts.contains(14))kount++;
            if(randomInts.contains(15))kount++;
            if(randomInts.contains(18))kount++;
            if(randomInts.contains(20))kount++;
            b19.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b19.setText(kount.toString());
        }
        else{
            b19.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b19press(){
        if(p19.getOpacity()==0)b19.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b20release(){
        Integer kount=new Integer(0);
        if(p20.getOpacity()==0){
        if(randomInts.contains(20)){
            b20.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(14) || randomInts.contains(15) || randomInts.contains(19)){
            if(randomInts.contains(14))kount++;
            if(randomInts.contains(15))kount++;
            if(randomInts.contains(19))kount++;
            b20.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b20.setText(kount.toString());
        }
        else{
            b20.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b20press(){
        if(p20.getOpacity()==0)b20.setStyle("-fx-background-color: #ffffff");
    }
    
    
    
    
    
    @FXML
    public void flag1(){
        if(p1.getOpacity()==1){
            p1.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p1.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(1)){
            if(p1.getOpacity()==1)score+=10;
            else score-=10;
            
        }
        
    }
    @FXML
    public void flag2(){
        if(p2.getOpacity()==1){
            p2.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p2.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(2)){
            if(p2.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag3(){
        if(p3.getOpacity()==1){
            p3.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p3.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(3)){
            if(p3.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag4(){
        if(p4.getOpacity()==1){
            p4.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p4.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(4)){
            if(p4.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag5(){
        if(p5.getOpacity()==1){
            p5.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p5.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(5)){
            if(p5.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag6(){
        if(p6.getOpacity()==1){
            p6.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p6.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(6)){
            if(p6.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag7(){
        if(p7.getOpacity()==1){
            p7.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p7.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(7)){
            if(p7.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag8(){
        if(p8.getOpacity()==1){
            p8.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p8.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(8)){
            if(p8.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag9(){
        if(p9.getOpacity()==1){
            p9.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p9.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(9)){
            if(p9.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag10(){
        if(p10.getOpacity()==1){
            p10.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p10.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(10)){
            if(p10.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag11(){
        if(p11.getOpacity()==1){
            p11.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p11.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(11)){
            if(p11.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag12(){
        if(p12.getOpacity()==1){
            p12.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p12.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(12)){
            if(p12.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag13(){
        if(p13.getOpacity()==1){
            p13.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p13.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(13)){
            if(p13.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag14(){
        if(p14.getOpacity()==1){
            p14.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p14.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(14)){
            if(p14.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag15(){
        if(p15.getOpacity()==1){
            p15.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p15.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(15)){
            if(p15.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag16(){
       if(p16.getOpacity()==1){
            p16.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p16.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(16)){
            if(p16.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag17(){
        if(p17.getOpacity()==1){
            p17.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p17.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(17)){
            if(p17.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag18(){
        if(p18.getOpacity()==1){
            p18.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p18.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(18)){
            if(p18.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag19(){
        if(p19.getOpacity()==1){
            p19.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p19.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(19)){
            if(p19.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag20(){
        if(p20.getOpacity()==1){
            p20.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p20.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(20)){
            if(p20.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for(int i=0;i<10;i++){
            this.randomInts.add(rand.nextInt(21));
            System.out.println(this.randomInts.get(i));
        }
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<this.randomInts.size();i++){
            if(this.randomInts.get(i)==0)continue;
            set.add(this.randomInts.get(i));
        }
        this.numberOfBombs=set.size();
        System.out.println(this.numberOfBombs);
    }    
    
}
