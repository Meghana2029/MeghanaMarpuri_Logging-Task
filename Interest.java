import java.util.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.*;
import java.lang.Math.*;
class Interest
{
	static
	{
		Scanner sca=new Scanner(System.in);
		Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
		LOGGER.log(Level.INFO,"Principal Amount: ");
		int p=sca.nextInt();
		LOGGER.log(Level.INFO,"Interest Rate: ");
		double r=sca.nextInt();
		LOGGER.log(Level.INFO,"Time Period(in years): ");
		double t=sca.nextInt();
		Main obj=new Main();
		LOGGER.log(Level.INFO,"Simple interest: "+(p*t*r)/100);
		double ci=p*Math.pow((1.0+r/100),t)-p;
		LOGGER.log(Level.INFO,"Compound interest: "+ci);	
	}
	
}