package model;

public class Compte {
	protected Integer id;
	protected String login;
	protected String password;
 
	
	public Compte (String login, String password){
		this.login = login;
		this.password = password;
	}
	
	
	public Compte(Integer id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
}
