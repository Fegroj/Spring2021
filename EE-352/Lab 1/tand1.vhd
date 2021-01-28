entity tand1 is 
end tand1;

architecture a of tand1 is 
	
	signal a,b : bit;
	signal c : bit;
	
	component and1
		port(
				a : in bit;
				b : in bit;
				c : out bit
			);
	end component;
		
	begin 
	
		and10: and1 port map (a, b, c);
			 
		process	
			begin
				a <= '0';	b <= '0';	wait for 25 ns;
				a <= '0'; 	b <= '1';	wait for 25 ns;
				a <= '1';	b <= '0';	wait for 25 ns;
				a <= '1';	b <= '1'; 	wait for 25 ns; 
			end process;
			
	end a; 