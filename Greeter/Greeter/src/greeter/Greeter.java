/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

/**
 *
 * @author beland
 */

public class Greeter {
    
    public Greeter(String aName)
    // instantiate name
    { name = aName;
    }
    
    public String sayHello()
    // returns a greeting string
    { return "Hello " + name + "!";
    }
    
    public void setName(String bName) 
    { name = bName;     
    }
    
    public String getName()
    {  return name; 
    }
    
    public void swapNames(Greeter other) 
    { String otherName = other.getName();
      other.setName(this.name);
      this.setName(otherName);
    }
    // variable declaration
    private String name;
    
}

//Write a program with two Greeter variables that refer to the same Greeter 
// object. Invoke setName on one of the references and sayHello on the other.