package ar.edu.unlam.banco;

public class CuentaBancaria {
	
  
	private Double saldo;
	private String nombre;
	private Integer numerodecuenta;
	
	public CuentaBancaria(Double saldo,Double deposito,Double extraccion)
	{
		this.saldo=saldo+deposito-extraccion;
	}

	public void setSaldo(Double saldo)
	{
		this.saldo =saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSaldo() {
		return saldo;
	}
	public void depositar(Double importe)
	
	{
		saldo=+importe;
	}
	
	public void extraer(Double importe)
	
	{
		saldo=-importe;
	}
}
