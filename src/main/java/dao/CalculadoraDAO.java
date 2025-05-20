package dao;

import java.util.List;

import entities.CalculadoraEntity;

public interface CalculadoraDAO {

	public void insertData(CalculadoraEntity entity);
	public List<CalculadoraEntity> getData();
}
