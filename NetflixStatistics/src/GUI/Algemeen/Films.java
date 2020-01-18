package GUI.Algemeen;

import Functionaliteit.Printen.Films.Printen_AlleFilms;
import Functionaliteit.Printen.Films.Printen_FilmLangsteTijdsduur;
import Functionaliteit.Printen.Films.Printen_FilmsOnder16;
import Functionaliteit.Printen.Films.Printen_LangsteTijdsduurOnder16;
import GUI.Basis.HomeAlgemeen;
import GUI.Programma.ProgrammaWijzigen;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Films {
    //Hier worden de booleans aangemaakt.
    public boolean IsLangsteTijdsduurSelected;
    public boolean IsFilmsMetLeeftijdsindicatieOnder16Selected;

    public Scene HomeAlgemeenFilms(Stage stage){
        // Hier worden de grids aangemaakt.
        BorderPane Borderpane_Films=new BorderPane();
        VBox Vbox_LabelEnButtons=new VBox();
        HBox Hbox_Label=new HBox();
        HBox Hbox_Buttons=new HBox();

        //Hier wordt het label aangemaakt.
        Label Label_Films=new Label("Films");

        //Hier worden de buttons aangemaakt.
        Button Button_AlleFilms=new Button("Alle films");
        Button Button_LangsteTijdsduur=new Button("Langste tijdsduur");
        Button Button_FilmsMetLeeftijdsindicatieOnder16=new Button("Films met leeftijdsindicatie onder 16");
        Button Button_Terug=new Button("< Terug");





        //Hier wordt alles aan Borderpane_Films toegevoegt.
        Borderpane_Films.setTop(Vbox_LabelEnButtons);
        Borderpane_Films.setCenter(Printen_AlleFilms.AlleFilms());

        //Hier wordt alles aan Vbox_LabelEnButtons toegevoegd.
        Vbox_LabelEnButtons.getChildren().add(Hbox_Label);
        Vbox_LabelEnButtons.getChildren().add(Hbox_Buttons);

        //Hier wordt alles aan Hbox_Label toegevoegt.
        Hbox_Label.getChildren().add(Label_Films);

        //Hier wordt alles aan Hbox_Buttons toegevoegt.
        Hbox_Buttons.getChildren().add(Button_AlleFilms);
        Hbox_Buttons.getChildren().add(Button_LangsteTijdsduur);
        Hbox_Buttons.getChildren().add(Button_FilmsMetLeeftijdsindicatieOnder16);
        Hbox_Buttons.getChildren().add(Button_Terug);





        //Hier wordt Borderpane_Films netjes gemaakt.
        Borderpane_Films.setStyle("-fx-background-color: #0A0A0A");

        //Hier wordt Vbox_LabelEnButtons netjes gemaakt.

        //Hier wordt Hbox_Label netjes gemaakt.
        Hbox_Label.setAlignment(Pos.CENTER);
        Label_Films.setStyle("-fx-background-color: Black; -fx-text-fill: Red; -fx-font-size: 40");

        //Hier wordt Hbox_Buttons netjes gemaakt.
        Hbox_Buttons.setAlignment(Pos.TOP_CENTER);
        Button_AlleFilms.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_LangsteTijdsduur.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_FilmsMetLeeftijdsindicatieOnder16.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Button_Terug.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        Hbox_Buttons.setSpacing(240);





        //Hier krijgt Button_AlleFilms zijn functionaliteit.
        Button_AlleFilms.setOnAction(actionEvent -> {
            Borderpane_Films.setCenter(Printen_AlleFilms.AlleFilms());
            //Hier worden de booleans naar false gezet.
            SetIsLangsteTijdsduurSelectedFalse();
            SetIsFilmsMetLeeftijdsindicatieOnder16SelectedFalse();
            //Dan krijgen beide buttons hun standaard uiterlijk terug.
            Button_LangsteTijdsduur.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
            Button_FilmsMetLeeftijdsindicatieOnder16.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
        });

        //Hier krijgt Button_LangsteTijdsduur zijn functionaliteit.
        Button_LangsteTijdsduur.setOnAction(actionEvent -> {
            //als het volgende het geval is wordt boolean IsLangsteTijdsduurSelected false, worden de films onder 16 geprint en krijgt de button zijn normale kleur weer.
            if(IsLangsteTijdsduurSelected==true&&IsFilmsMetLeeftijdsindicatieOnder16Selected==true){
                IsLangsteTijdsduurSelected();
                Borderpane_Films.setCenter(Printen_FilmsOnder16.FilmsOnder16());
                Button_LangsteTijdsduur.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
                //als het volgende het geval is wordt boolean IsLangsteTijdsduurSelected true, wordt de film met de langste tijdsduur geprint en krijgt de knop de selectie kleur.
            }else if(IsLangsteTijdsduurSelected==false&&IsFilmsMetLeeftijdsindicatieOnder16Selected==false){
                IsLangsteTijdsduurSelected();
                Borderpane_Films.setCenter(Printen_FilmLangsteTijdsduur.Langstetijdsduur());
                Button_LangsteTijdsduur.setStyle("-fx-background-color: Gray; -fx-font-size:20; -fx-text-fill: Black; -fx-font-weight: bold");
                //als het volgende het geval is wordt boolean IsLangsteTijdsduurSelected false, worden alle films geprint en krijgt de button zijn normale kleur weer
            }else if(IsLangsteTijdsduurSelected==true&&IsFilmsMetLeeftijdsindicatieOnder16Selected==false){
                IsLangsteTijdsduurSelected();
                Borderpane_Films.setCenter(Printen_AlleFilms.AlleFilms());
                Button_LangsteTijdsduur.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
                //als het volgende het geval is wordt boolean IsLangsteTijdsduurSelected true, wordt de film met de langste tijdsduur met leeftijdsindicatie onder 16 geprint en krijgt de knop de selectie kleur.
            }else if(IsLangsteTijdsduurSelected==false&&IsFilmsMetLeeftijdsindicatieOnder16Selected==true){
                IsLangsteTijdsduurSelected();
                Borderpane_Films.setCenter(Printen_LangsteTijdsduurOnder16.LangsteTijdsduurOnder16());
                Button_LangsteTijdsduur.setStyle("-fx-background-color: Gray; -fx-font-size:20; -fx-text-fill: Black; -fx-font-weight: bold");
            }
        });

        //Hier krijgt Button_FilmsMetLeeftijdsindicatieOnder16.
        Button_FilmsMetLeeftijdsindicatieOnder16.setOnAction(actionEvent -> {
            //als het volgende het geval is wordt boolean IsFilmsMetLeeftijdsindicatieOnder16Selected false, wordt de film met de langste tijdsduur geprint en krijgt de knop de normale kleur weer.
            if(IsFilmsMetLeeftijdsindicatieOnder16Selected==true&&IsLangsteTijdsduurSelected==true){
                IsFilmsMetLeeftijdsindicatieOnder16Selected();
                Borderpane_Films.setCenter(Printen_FilmLangsteTijdsduur.Langstetijdsduur());
                Button_FilmsMetLeeftijdsindicatieOnder16.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
                //als het volgende het geval is wordt boolean IsFilmsMetLeeftijdsindicatieOnder16Selected true, worden de films met de leeftijdsindicatie onder 16 geprint en krijgt de knop de selectie kleur.
            }else if(IsFilmsMetLeeftijdsindicatieOnder16Selected==false&&IsLangsteTijdsduurSelected==false){
                IsFilmsMetLeeftijdsindicatieOnder16Selected();
                Borderpane_Films.setCenter(Printen_FilmsOnder16.FilmsOnder16());
                Button_FilmsMetLeeftijdsindicatieOnder16.setStyle("-fx-background-color: Gray; -fx-font-size:20; -fx-text-fill: Black; -fx-font-weight: bold");
                //als het volgende het geval is wordt boolean IsFilmsMetLeeftijdsindicatieOnder16Selected false, worden alle films  geprint en krijgt de knop de normale kleur weer.
            }else if(IsFilmsMetLeeftijdsindicatieOnder16Selected==true&&IsLangsteTijdsduurSelected==false){
                IsFilmsMetLeeftijdsindicatieOnder16Selected();
                Borderpane_Films.setCenter(Printen_AlleFilms.AlleFilms());
                Button_FilmsMetLeeftijdsindicatieOnder16.setStyle("-fx-background-color: Black; -fx-border-color: Red; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
                //als het volgende het geval is wordt boolean IsFilmsMetLeeftijdsindicatieOnder16Selected true, wordt de film met de langste tijdsduur leeftijdsindicatie onder 16 geprint en krijgt de knop de selectie kleur.
            }else if(IsFilmsMetLeeftijdsindicatieOnder16Selected==false&&IsLangsteTijdsduurSelected==true){
                IsFilmsMetLeeftijdsindicatieOnder16Selected();
                Borderpane_Films.setCenter(Printen_LangsteTijdsduurOnder16.LangsteTijdsduurOnder16());
                Button_FilmsMetLeeftijdsindicatieOnder16.setStyle("-fx-background-color: Gray; -fx-font-size:20; -fx-text-fill: Black; -fx-font-weight: bold");
            }
        });

        //Hier krijgt Button_Terug zijn functionaliteit.
        Button_Terug.setOnAction(actionEvent -> {
            HomeAlgemeen HomeAlgemeen=new HomeAlgemeen();
            stage.setScene(HomeAlgemeen.HomeAlgemeen(stage));
            stage.setFullScreen(true);
        });





        //Hier wordt Scene films gemaakt.
        Scene Films=new Scene(Borderpane_Films,1300,650);
        stage.setTitle("Mike Jansen 2157030, Kevin Nguyen 2150956 en Yassin Diriye 2159506");

        //Hier wordt scene Films gereturned.
        return Films;
    }

    //Deze methode kijkt of IsLangsteTijdsduurSelected true or false is en maakt he vervolgens het tegenovergestelde.
    public boolean IsLangsteTijdsduurSelected(){
        if(IsLangsteTijdsduurSelected==true){
            IsLangsteTijdsduurSelected=false;
        }else{
            IsLangsteTijdsduurSelected=true;
        }
        return IsLangsteTijdsduurSelected;
    }

    //Deze methode kijkt of IsFilmsMetLeeftijdsindicatieOnder16Selected true or false is en maakt he vervolgens het tegenovergestelde.
    public boolean IsFilmsMetLeeftijdsindicatieOnder16Selected(){
        if(IsFilmsMetLeeftijdsindicatieOnder16Selected==true){
            IsFilmsMetLeeftijdsindicatieOnder16Selected=false;
        }else{
            IsFilmsMetLeeftijdsindicatieOnder16Selected=true;
        }
        return IsFilmsMetLeeftijdsindicatieOnder16Selected;
    }

    //Deze method zet IsLangsteTijdsduurSelected naar false.
    public boolean SetIsLangsteTijdsduurSelectedFalse(){
        IsLangsteTijdsduurSelected=false;
        return IsLangsteTijdsduurSelected;
    }

    //Deze method zet IsFilmsMetLeeftijdsindicatieOnder16Selected naar false.
    public boolean SetIsFilmsMetLeeftijdsindicatieOnder16SelectedFalse(){
        IsFilmsMetLeeftijdsindicatieOnder16Selected=false;
        return IsFilmsMetLeeftijdsindicatieOnder16Selected;
    }
}


//code die nu niet meer gebruikt wordt en verwijderd word.
//HBox Hbox_CRUD=new HBox();
//Button Button_NieuweFilm=new Button("Nieuwe film aanmaken");
//Button Button_FilmWijzigen=new Button("Film wijzigen");
//Button Button_FilmVerwijderen=new Button("Film verwijderen");
//Hier wordt alles aan Hbox_CRUD toegevoegd.
//Hbox_CRUD.getChildren().add(Button_NieuweFilm);
//Hbox_CRUD.getChildren().add(Button_FilmWijzigen);
//Hbox_CRUD.getChildren().add(Button_FilmVerwijderen);
//Vbox_LabelEnButtons.getChildren().add(Hbox_CRUD);
//Hier wordt Hbox_CRUD netjes gemaakt.
//Hbox_CRUD.setAlignment(Pos.TOP_CENTER);
//Button_NieuweFilm.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
//Button_FilmWijzigen.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
//Button_FilmVerwijderen.setStyle("-fx-background-color: Black; -fx-font-size:20; -fx-text-fill: Red; -fx-font-weight: bold");
//Hbox_CRUD.setSpacing(50);
//De onderstaande code tussen comments was een misverstand. Deze code heeft geen functie meer.
        /*
        //Hier krijgt Button_NieuweFilm zijn functionaliteit.
        Button_NieuweFilm.setOnAction(actionEvent -> {
            NieuweFilmAanmaken NieuweFilmAanmaken=new NieuweFilmAanmaken();
            stage.setScene(NieuweFilmAanmaken.NieuweFilmAanmaken(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_FilmWijzigen zijn functionaliteit
        Button_FilmWijzigen.setOnAction(actionEvent -> {
            NieuweFilmWijzigen FilmWijzigen=new NieuweFilmWijzigen();
            stage.setScene(FilmWijzigen.NieuweFilmWijzigen(stage));
            stage.setFullScreen(true);
        });

        //Hier krijgt Button_FilmVerwijderen zijn functionaliteit.
        Button_FilmVerwijderen.setOnAction(actionEvent -> {
            FilmVerwijderen FilmVerwijderen=new FilmVerwijderen();
            stage.setScene(FilmVerwijderen.FilmVerwijderen(stage));
            stage.setFullScreen(true);
        });
        */