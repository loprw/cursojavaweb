package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.CalculadoraDAO;
import dao.CalculadoraDAOImpl;
import dto.CalculadoraDTO;
import entities.CalculadoraEntity;

public class Service {

	CalculadoraDAO dao = new CalculadoraDAOImpl();
	CalculadoraEntity calc;
	CalculadoraDTO dto;

	public void insertOperation(CalculadoraDTO dto) {

		calc = convertDtoToEntity(dto);
		dao.insertData(calc);
	}

	public List<CalculadoraDTO> recoverAllData() {

		List<CalculadoraEntity> listado = dao.getData();
		List<CalculadoraDTO> listDTO = new ArrayList<CalculadoraDTO>();

		for (CalculadoraEntity calculadoraEntity : listado) {
			listDTO.add(convertEntityToDto(calculadoraEntity));
		}

		return listDTO;
	}

	private CalculadoraEntity convertDtoToEntity(CalculadoraDTO dto) {

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;

		try {
			date = df.parse(dto.getDate());
		} catch (ParseException pe) {
			pe.printStackTrace();
		}

		calc = new CalculadoraEntity(dto.getNum1(), dto.getNum2(), dto.getResult(), dto.getOperation(), date);

		return calc;
	}

	private CalculadoraDTO convertEntityToDto(CalculadoraEntity calc) {

		dto = new CalculadoraDTO(calc.getId(), calc.getNumber1(), calc.getNumber2(), calc.getResult(),
				calc.getOperator(), calc.getDateOper());

		return dto;
	}
}
