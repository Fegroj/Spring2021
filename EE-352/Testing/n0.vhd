entity n0 is
end n0;

architecture a of n0 is 

	signal x : bit;
	signal y : bit;
	
	begin
		y <= not x;
		
		process 
			begin	
				x <= '0';
				wait for 50 ns;
				x <= '1';
				wait for 50 ns;
			end process;
			
	end; 