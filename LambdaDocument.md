# Lambda Function
What is a Lambda Function: No Access Modifier, No Return Type, No Method Name
* if a method contains single line then curly braces can be removed()->Sopn("Hello");
* Return statement can be removed and if only one import parameter then brackets can be removed from importing e.g. s->s.length(); 
* Return type of import parameters can be removed (Type Inference)	(a, b) -> Sopln(a + b);	

# Functional Interface
Functional Interface: If the interface contains only one abstract method. It can have any number of default and static method
@FunctionalInterface annotation is used to inform compiler to treat interface as Functional Interface
In case of Inheritance in Functional Interface, if the child method does not contain any method but parent contains. It is possible
In case child contains exactly the same method as parent with same name. It is possible
Child Interface cannot define its own abstract method	
