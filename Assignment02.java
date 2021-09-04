// CSE 110     : 74845 / ONLINE
// Assignment  : 2
// Author      : MORRIS, CHRIS 1223564576
// Description : Rosie's Road Company

import java.util.Scanner;

public class Assignment02 {
    
    public static void main(String[] args) {
        // declare and instantiate a Scanner
    	Scanner input = new Scanner(System.in);

        // declare and initialize variables
    	double roadLength = 0;
    	int numOfLanes, asphaltDepth, daysToComplete = 0 ;
    	final int HAULING_CAPACITY = 10000; //pounds, 5 tons
    	final int LANE_WIDTH = 12; //width in feet
    	final int ASPHALT_COST = 200; //per ton
    	final int ASPHALT_WEIGHT = 150; //lbs per cubic foot
    	final int STOPLIGHT_COST = 25000;
    	final int WORKDAY_LENGTH = 8; //hrs
    	final int WORKER_RATE = 25; //dollars per hour
    	final int PIPE_COST = 500; 
    	final int PIPE_LENGTH = 24; //feet, only sold in this length
    	
       
        
        // collect inputs
    	System.out.println("Length of road project (miles) : ");
    	roadLength = input.nextDouble();
    	System.out.println("Number of lanes : ");
    	numOfLanes = input.nextInt();
    	System.out.println("Depth of asphalt (inches) : ");
    	asphaltDepth = input.nextInt();
    	System.out.println("Days to complete project : ");
    	daysToComplete = input.nextInt();
        // compute required values
    	//amounts
    	double cubicFeetNeeded = ((roadLength * 5280) * LANE_WIDTH * numOfLanes * (asphaltDepth / 12.00)); 
    	double truckLoads = (int)Math.ceil(((cubicFeetNeeded * ASPHALT_WEIGHT) / HAULING_CAPACITY));
    	double intersections = (int)Math.floor((roadLength));
    	double stoplights = ((2 * intersections) + (intersections * numOfLanes));
    	double conduits = (int)Math.ceil(((roadLength * 5280) / PIPE_LENGTH));
    	double crewMembersNeeded = (int)Math.ceil(((50 * roadLength * numOfLanes) / daysToComplete));
    	//costs
    	double asphaltExpense = ((truckLoads * 5) * ASPHALT_COST);
    	double stoplightExpense = (stoplights * STOPLIGHT_COST);
    	double conduitExpense = (conduits * PIPE_COST);
    	double laborExpense = (crewMembersNeeded * daysToComplete * WORKDAY_LENGTH * WORKER_RATE);
    	double totalProjectCost = (asphaltExpense + stoplightExpense + conduitExpense + laborExpense);
    	
        
        // display results
    	System.out.println("=== Amount of materials needed ===");
        System.out.println("Truckloads of asphalt : " + truckLoads); 
        System.out.println("Stoplights            : " + stoplights);
        System.out.println("Conduit pipes         : " + conduits);
        System.out.println("Crew members needed   : " + crewMembersNeeded);
        System.out.println("=== Cost of Materials ============");
        System.out.println("Cost of Asphalt       : $" + asphaltExpense);
        System.out.println("Cost of Stoplights    : $" + stoplightExpense);
        System.out.println("Cost of Conduit Pipes : $" + conduitExpense);
        System.out.println("Cost of Labor         : $" + laborExpense);
        System.out.println("=== Total Cost of Project ========");
        System.out.println("Total cost of project : $" + totalProjectCost);
        
        
        
        

    }

}
