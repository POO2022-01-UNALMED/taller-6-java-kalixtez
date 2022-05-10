package vehiculos;

public class Camioneta extends Vehiculo 
{
	boolean volco;
	static int totalCamionetas;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco)
	{
		//super(fabricante);
		this.velocidadMaxima = 90;
		this.traccion = "4X4";
		
		this.puertas = puertas;
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.volco = volco;
		
		totalCamionetas++;
	}
	
	public String getPlaca()
	{
		return this.placa;
	}
	
	public void setPlaca(String placa)
	{
		this.placa = placa;
	}
	
	public int getPuertas()
	{
		return puertas;
	}
	
	public void setPuertas(int puertas)
	{
		this.puertas = puertas;
	}
	
	public int getVelocidadMaxima()
	{
		return this.velocidadMaxima;
	}
	
	public void setVelocidadMaxima(int vm)
	{
		this.velocidadMaxima = vm;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String n)
	{
		this.nombre = n;
	}
	
	public int getPrecio()
	{
		return this.precio;
	}
	
	public void setPrecio(int p)
	{
		this.precio = p;
	}
	
	public int getPeso()
	{
		return this.peso;
	}
	
	public void setPeso(int p)
	{
		this.peso = p;
	}
	
	public Fabricante getFabricante()
	{
		return this.fabricante;
	}
	
	public void setFabricante(Fabricante f)
	{
		this.fabricante = f;
	}
	
	boolean isVolco()
	{
		return this.volco;
	}
	
	void setVolco(boolean v)
	{
		this.volco = v;
	}
}
