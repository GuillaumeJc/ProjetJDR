package dao;

import java.util.List;

import model.Compte;

public class DAOCompte implements IDAO<Compte,Integer> {

	@Override
	public Compte findById(Integer id) {
		return null;
	}

	@Override
	public List<Compte> findAll() {
		return null;
	}

	@Override
	public void insert(Compte o) {
		
	}

	@Override
	public void update(Compte o) {
		
	}

	@Override
	public void delete(Integer id) {
		
	}

	public Compte seConnecter(String login,String password) 
	{return null;}
}
