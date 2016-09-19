package ar.edu.unlam.banco;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuentaBancaria {

	@Test
	public void TestSaldo() {
		
	
		CuentaBancaria miCuenta= new CuentaBancaria(100.0,100.0,500.0);
		Double SaldoEsperado=-300.0;
		assertEquals(SaldoEsperado,miCuenta.getSaldo(),0.01);
		
	}
	
	@Test
	public void TestDeposito()
	{
		
	}

}
