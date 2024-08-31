package com.wt;

public class Operators2 {

			public static void main(String[] args) {
				
				//logical value
				boolean x = true;
				boolean y = false;
				
				//comparison value
				int v = 10;
				int w = 5;
				int q = 3;
				
				
				//ternary value
				boolean condition = true;
		        String result = (condition) ? "True" : "False";
				
		        
				//Arithmetic Operator
				
				int a = 20;
				int b = 20;
				System.out.println(a+b);
				
				int c = 50;
				int d = 30;
				System.out.println(c-d);
				
				int e = 10;
				int f = 5;
				System.out.println(e*f);
				
				int g = 10;
				int h = 10;
				System.out.println(g/h);
				
				int i = 20;
				int j = 30;
				System.out.println(i%j);
				
				
				//relational operator
				
				//int x = 40;
				//int z = 30;
				//System.out.println(x==z);
				
				int k = 20;
				int l = 30;
				System.out.println(k!=l);
				
				int m = 20;
				int n = 30;
				System.out.println(m>n);
				
				int o = 20;
				int p = 30;
				System.out.println(o<p);
				
				int s = 20;
				int t = 30;
				System.out.println(s<=t);
				
				//logical operator
				
				System.out.println("x && y:" + (x && y));
				System.out.println("x || y:" + (x || y));
				System.out.println("!x:" + (!x));
				
				
				//coparison operator
				
				System.out.println(v>w);
				System.out.println(v<w);
				System.out.println(v>=w);
				System.out.println(v<=w);
				System.out.println(v!=q);
				System.out.println(v==q);
				
				
				//ternaryoperator
				System.out.println("Condition true hona :" + (result));
				 {

						int addresponse = addition(10, 10);
						System.out.println("Addition of two number " + addresponse);

						// created object
						ArithmeticOperator obj = new ArithmeticOperator();
						int subresponse = obj.substraction(20, 10);
						System.out.println("substraction of two number " + subresponse);
						
						int multiplicationresponse = multiplication(10, 10);
						System.out.println("Multiplication of two number " + multiplicationresponse);

						
						int divisionresponse = division(10, 10);
						System.out.println("Division of two number " + divisionresponse);

						
						int moduloresponse = modulo(10, 10);
						System.out.println("Modulo of two number " + moduloresponse);


					}

					// Static addition method
					public static int addition(int a, int b) {
						int c = a + b;
						return c;
					}

					// Non static method
					public int substraction(int a, int b) {
						int c = a - b;
						return c;
					}

					// Static multiplication method
					public static int multiplication(int a, int b) {
						int c = a * b;
						return c;
					}

					// Static division method
					public static int division(int a, int b) {
						int c = a / b;
						return c;
					}

					// Static modulo method
					public static int modulo(int a, int b) {
						int c = a % b;
						return c;


			}

		
	}

