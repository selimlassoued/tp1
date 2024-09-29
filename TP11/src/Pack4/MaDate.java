package Pack4;

public class MaDate {

	private int jours;
	private int mois;
	private int annee;
	public MaDate(int jour,int mois,int annee)
	{
		this.jours=jour;
		this.mois=mois;
		this.annee=annee;
	}
	public MaDate(int annee)
	{
		this.annee=annee;
	}
	public int getjours(){
		return this.jours;
	}
	public int getmois(){
		return this.mois;
	}
	public int getannee() {
		return this.annee;
	}
	public String toString() {
		return "la date est "+getannee()+":"+getmois()+":"+getjours();
	}
	public void ajour() {
		if(((this.mois==2)&&(((this.annee%4==0)&&(this.jours==29))||((this.annee%4!=0)&&(this.jours==28))))
				
			||((this.jours==31)&&((((this.mois%2==1)&&(this.mois<7)))||(((this.mois%2==0)&&(this.mois>6)))))
			||((this.jours==30)&&((((this.mois%2==0)&&(this.mois<7)))||(((this.mois%2==1)&&(this.mois>6)))))){
				this.jours=0;
				this.mois+=1;
		}
		if(this.mois==13)
			{this.mois=1;}
		this.jours+=1;
		if((this.jours==1)&&(this.mois==1))
		{
			this.annee+=1;
		}
	}
	public void ajouterPlusieursJours(int n) {
		while(n>0)
		{
			ajour();
			n-=1;
		}
	}
	public void ajouterUnMoi()
	{
		if(this.mois==12)
		{
			this.mois=1;
		}
		else
		{
			this.mois+=1;
		}
		if((this.jours==31)&&(this.mois%2==0))
		{
			this.jours=1;
			this.mois+=1;
		}
		else if(this.mois==2)
		{
			if((this.annee%4==0)&&(this.jours>29))
			{
				this.jours=this.jours-29;
				this.mois+=1;
			}
			else if ((this.annee%4!=0)&&(this.jours>28)){
				this.jours=this.jours-28;
				this.mois+=1;
			}
		}
	}
	public void ajouterUnAn()
	{
		this.annee+=1;
	}
}
