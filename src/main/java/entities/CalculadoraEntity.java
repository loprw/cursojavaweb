package entities;

import java.util.Date;

import enums.OperationsEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CALCULADORA")
public class CalculadoraEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private double number1;
	@Column(nullable = false)
	private double number2;
	@Column(nullable = false)
	private double result;
	@Column(name = "operator")
	private OperationsEnum operator;
	@Column(name = "op_date")
	private Date dateOper;
	
	public CalculadoraEntity() {
		
	}
	
	public CalculadoraEntity(double number1, double number2, double result, OperationsEnum operation, Date date) {
		this.number1 = number1;
		this.number2 = number2;
		this.result = result;
		this.operator = operation;
		this.dateOper = date;
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

	public OperationsEnum getOperator() {
		return operator;
	}

	public void setOperator(OperationsEnum operation) {
		this.operator = operation;
	}

	public Date getDateOper() {
		return dateOper;
	}

	public void setDateOper(Date date) {
		this.dateOper = date;
	}
}
