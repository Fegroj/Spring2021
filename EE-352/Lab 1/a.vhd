entity and1 is 
	port(
			a : in bit;
			b : in bit;
			c : out bit 
		);
end and1; 

architecture behavior of and1 is 
	begin 
		c <= a and b;
	end; 
	
	