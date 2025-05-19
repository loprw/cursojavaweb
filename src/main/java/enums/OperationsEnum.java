package enums;

public enum OperationsEnum {

	SUM("+", "suma", "sum"),
	SUBTRACT("-", "resta", "subtract"),
	MULTPIPLY("*", "multiplicacion", "multiply"),
	DIVIDE("/", "division", "divide"),
	NULL("", "", "");
	
	String symbol;
	String nombre;
	String name;
	
	OperationsEnum(String symbol, String nombre, String name) {
		this.symbol = symbol;
		this.nombre = nombre;
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
