package two;

//2 dimensional individual
public class Individual2D {
	//genes to help determine fitness value
	private double gene1;
	private double gene2;
	//fitness value to determine how well individual is "built", there are better words to define but..
	private double fitness_value;
	
	//constructor methods
	public Individual2D(double value1, double value2){
		this.gene1 = value1;
		this.gene2 = value2;
	}
	
	//setting fitness value
	public void Set_Fitness(double fitness)
	{
		this.fitness_value = fitness;
	}
	
	//getting genes which are encapsulated
	public double get_gene1()
	{
		return gene1;
	}
	
	public double get_gene2()
	{
		return gene2;
	}
	
	//getting fitness as well which is encapsulated.
	public double get_fitness()
	{
		return fitness_value;
	}
}

