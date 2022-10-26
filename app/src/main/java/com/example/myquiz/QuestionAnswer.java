package com.example.myquiz;
public class QuestionAnswer {

    public static String[] question ={
            "Choisissez la bonne réponse concernant Android",
            "Sous quelle licence Android se trouve-t-il ?",
            "Pour qui Android est-il principalement développé ?",
            "Lequel des produits suivants est le premier téléphone mobile fonctionnant avec le système d’exploitation Android ?",
            "Android est basé sur quel langage?",
            "APK signifie _____ ______ ______"
    };

    public static String[][] choices = {
            {"Android est un navigateur web","Android est une application web","Android est un serveur web","Android est un système d’exploitation"},
            {"Sourceforge","Apache/MIT","OSS","Aucune des catégories ci-dessus"},
            {"Serveurs","Ordinateurs de bureau","Ordinateurs portables","Appareils mobiles"},
            {"HTC Hero","Nokia","T-Mobile G1","Google gPhone"},
            {"C","C++","C#","Java"},
            {"Android Package Kit","Android Page Kit","Android Phone Kit","Aucune de ces réponses"}
    };

    public static String[] correctAnswers = {
            "Android est un système d’exploitation",
            "Apache/MIT",
            "Appareils mobiles",
            "T-Mobile G1",
            "Java",
            "Android Package Kit"
    };

}