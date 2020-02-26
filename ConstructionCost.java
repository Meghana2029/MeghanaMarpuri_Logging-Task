import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.*;

public class ConstructionCost
{
    static
    {
	float area,nsf,cost=0;
	int option;
	Scanner scan = new Scanner(System.in);
	 Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
	area = scan.nextFloat();
	
	nsf=(float)(area/10.76);
try{
	
      	LOGGER.log(Level.INFO,"1.Standard materials\n 2. above standard materials 3.high standard material\n4.high standard and fully automatedhome");
	option=scan.nextInt();
	if(option==1)
	cost=1200*nsf;
	else if(option==2)
	cost=1500*nsf;
	else if(option==3)
	cost=1800*nsf;
	else if(option==4)
	cost=2500*nsf;

	LOGGER.log(Level.INFO,"Cost to constuct house is "+cost);
	
}
catch(Exception ex)
{
	LOGGER.log(Level.SEVERE, "Exception occur", ex);
}
}
}
	
