package ca.uqam.info.mgl7460;

public class Etudiante {
	private String nom;
	private String prenom;
	public String programme;

	public String getNom()
	{
		return nom;
	}
	public String getPrenom()
	{
		return prenom;
	}
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}
	public String toString()
	{
		return "L'étudiant(e) s'appelle "+ nom + " " + prenom + " et fais le programme " + programme;
	}
    
}
