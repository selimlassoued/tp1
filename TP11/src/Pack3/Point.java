package Pack3;


public class Point {
	private String ch;
	private int abs;
	private int ord;
	public Point(String ch,int abs,int ord)
	{
		this.ch=ch;
		this.abs=abs;
		this.ord=ord;
	}
	public Point(int i, int j) {
		this.abs=i;
		this.ord=j;
	}
	public Point(String a) {
		this.ch=a;
	}
	public void Affiche()
	{
		System.out.println(ch+"("+abs+","+ord+")");
	}
	public void TranslHoriz(int a)
	{
		abs+=a;
	}
	public void TranslVert(int a)
	{
		this.ord+=this.ord;
	}
	public void Translation(int a,int b)
	{
		TranslHoriz(ord);
		TranslVert(ord);
	}
	boolean Coincide(Point p)
	{
		return (this.abs==p.abs)&&(this.ord==p.ord);
	}
	String getNom()
	{
		return this.ch;
	}
	int getAbscisse()
	{
		return this.abs;
	}
	int getOrdonnee()
	{
		return this.ord;
	}
	void setNom(String ch)
	{
		this.ch=ch;
	}
	void setAbscisse(int a)
	{
		this.abs=a;
	}
	void setOrdonnee(int a)
	{
		this.ord=a;
	}
}