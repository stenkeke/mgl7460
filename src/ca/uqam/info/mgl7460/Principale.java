package ca.uqam.info.mgl7460;

import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class Principale {
    public static void main(String[] args)
    {
        try{
        Class<?> classeEtudiante = Class.forName("ca.uqam.info.mgl7460.Etudiante");

        Object etudiante = classeEtudiante.newInstance();

        Method setNom = classeEtudiante.getMethod("setNom", String.class);
        Method setPrenom = classeEtudiante.getMethod("setPrenom", String.class);

        setNom.invoke(etudiante, "marie");
        setPrenom.invoke(etudiante, "doe");

        Field programmeField = classeEtudiante.getField("programme");
        programmeField.set(etudiante, "MGL à l'uqam");
        System.out.println(etudiante);

        }catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
