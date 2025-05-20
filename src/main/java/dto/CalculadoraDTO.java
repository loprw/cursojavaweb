package dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import enums.OperationsEnum;

public class CalculadoraDTO {

	private Long id;
	private double num1;
	private double num2;
	private double result;
	private OperationsEnum operation;
	private String date;
	
	private static final Logger logger = LoggerFactory.getLogger(CalculadoraDTO.class);
	
	public CalculadoraDTO(Long id, double num1, double num2, double result, OperationsEnum operation, Date date) {
		this.id = id;
		this.num1 = num1;
		this.num2 = num2;
		this.result = result;
		this.operation = operation;
		this.date = convertDateToString(date);
	}
	public CalculadoraDTO(double num1, double num2, double result, OperationsEnum operation, Date date) {
		this.num1 = num1;
		this.num2 = num2;
		this.result = result;
		this.operation = operation;
		this.date = convertDateToString(date);
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public OperationsEnum getOperation() {
		return operation;
	}

	public void setOperation(OperationsEnum operation) {
		this.operation = operation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = convertDateToString(date);
	}
	
	private String convertDateToString(Date date) {
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String dateStr = df.format(date);
		
		return dateStr;
	}
}
