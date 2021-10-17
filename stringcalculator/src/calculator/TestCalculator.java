package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculator {
	
	    @Test
	    void empty_string_should_return_0() throws Exception {
	        Calculator stringCalculator = new Calculator();
	        assertEquals(0, stringCalculator.add(""));
	    }
	    
	   
	    @Test
	    void string_with_single_number_should_return_number_as_int() throws Exception {
	        Calculator stringCalculator = new Calculator();
	        assertEquals(1, stringCalculator.add("1"));
	    }
	    @Test
	    void string_with_single_number_should_return_number_as_int1() throws Exception {
	        Calculator stringCalculator = new Calculator();
	        assertEquals(3, stringCalculator.add("1, 2"));
	    }
	    @Test
	    void string_with_single_number_should_return_number_as_int2() throws Exception {
	        Calculator stringCalculator = new Calculator();
	        assertEquals(0, stringCalculator.add("1,2,3,4,5,6,7,8,9,10"));
	    }
	    @Test
	    void string_with_single_number_should_return_number_as_int3() throws Exception {
	      Calculator stringCalculator = new Calculator();
	        assertEquals(3, stringCalculator.add("1-2"));
	    }
	    @Test
	    void string_with_single_number_should_return_number_as_int4() throws Exception {
	        Calculator stringCalculator = new Calculator();
	        assertEquals(-1, stringCalculator.add("-1"));
	    }
	}