package service;

import dao.CalculadoraDAO;
import dao.CalculadoraDAOImpl;
import dto.CalculadoraDTO;
import entities.CalculadoraEntity;

public class Service {

	CalculadoraDAO dao = new CalculadoraDAOImpl();
	CalculadoraEntity entity;
	CalculadoraDTO dto;
	
	public void insertOperation(CalculadoraDTO dto) {
		
		entity = convertDtoToEntity(dto);
		dao.insertData(entity);
	}
	
	private CalculadoraEntity convertDtoToEntity(CalculadoraDTO dto) {
		
		entity = new CalculadoraEntity(
				dto.getNum1(),
				dto.getNum2(),
				dto.getResult(),
				dto.getOperation(),
				dto.getDate()
				);
				
		
		return entity;
	}
	
	private CalculadoraDTO convertEntityToDto(CalculadoraEntity entity) {
		
		dto = new CalculadoraDTO(
				entity.getId(),
				entity.getNumber1(),
				entity.getNumber2(),
				entity.getResult(),
				entity.getOperation(),
				entity.getDate());
		
		return dto;
	}
}
