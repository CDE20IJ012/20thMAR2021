abstract class Processor  
{  
    private Processor processor; 
  
    public Processor(Processor processor){ 
    	System.out.println("I am the parent class parameterized constructor");
        this.processor = processor; 
    }; 
      
    public void process(Number request){ 
        if(processor != null) 
        {
            System.out.println("I am called again"); // STEP6
        	processor.process(request);  // STEP7 is repeated till the condition is satisfied
        }
    }
}  