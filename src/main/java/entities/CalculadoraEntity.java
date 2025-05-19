package entities;

import java.util.Date;

import enums.OperationsEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CalculadoraEntity {

	@Id
	private Long id;
	private double number1;
	private double number2;
	private double result;
	private OperationsEnum operation;
	private Date date;
	
	public CalculadoraEntity() {
		
	}
	
	public CalculadoraEntity(double number1, double number2, double result, OperationsEnum operation, Date date) {
		this.number1 = number1;
		this.number2 = number2;
		this.result = result;
		this.operation = operation;
		this.date = date;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
