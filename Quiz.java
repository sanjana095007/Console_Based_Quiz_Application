package Demo2;
		
import java.util.Scanner;
public class Quiz {
	public static void main(String[] args) {
		int points=100;
		int point = 0;
		int fiffty=1;
		int pole=1;
		int lifeline=3;
		int choice = 0;
		int flip=1;
		try {
			Scanner sc=new Scanner (System.in);
			System.out.println("enter the name of the person");
			String name=sc.nextLine();
			System.out.println("enter the age of the person");
			int p=sc.nextInt();
			System.out.println("enter the qualification of the person");
			String q=sc.next();
			System.out.println("enter the occupation of the person");
			String o=sc.next();
			System.out.println("==================");
			System.out.println("are you ready for the quiz game");
			System.out.println("1.yes                2.no");
			int ans=sc.nextInt();
			if(ans == 1)
			{
				System.out.println("welcome to the quiz");
				
			}
			else if(ans==2)
			{
				System.out.println("terminate the game");
				System.exit(0);	
			}
			else {
				System.out.println("invalid input");
				System.exit(0);
			}
			System.out.println("===================================");
			System.out.println("the rules are");
			System.out.println("1.the quiz consist of 10 multiple choice question ");
			System.out.println("2.Each question will have a 10 point");
			System.out.println("3.the player need to quit the quiz before the start of the next question");
			System.out.println("4.the player has the 2 lifelines and the life line can be used only ones for one question ");
			System.out.println("5.the 2 lifelines are 50-50 and other is aducines pole");
				Thread.sleep(2000);
			System.out.println("===================================");
			System.out.println("Lets starts the quiz game ");
			System.out.println("1.who is the founder of the java?");
			System.out.println("A.james gosling");
			System.out.println("B.jhon");
			System.out.println("C.steven");
			System.out.println("D.none of the above");
			System.out.println("E.lifeline are");
			System.out.println("F.quit");
			String a1=sc.next();
			if(a1.equals("F"))
			{
				System.exit(0);
			}
			
			else if (a1.equals("A")) { 
			      System.out.println("Correct");
			      points=point+100;
			      System.out.println("the point is"+points); 
			    }
			
			else if(a1.equals("E"))
			{
				if (lifeline == 3 && pole == 1 && fiffty == 1 && flip==1) {
		            System.out.println("You have 3 Lifelines left");
					System.out.println("choose 1.50-50                   2.pole          3.flip");
			        choice=sc.nextInt();
			                if(choice==1)
			                {
			                	System.out.println("1.who is the founder of the java?");
			                	System.out.println("A.james gosling");
			                	System.out.println("B.jhon");
			                	fiffty--;
							    lifeline--;
							    System.out.println("You are used your 50:50 lifeline ");
			                	a1=sc.next();
			                	 if(a1.equals("A")) {
			                		 System.out.println("Correct");
			                		 points=point+100;
			                		 System.out.println("the point is"+points);
			                	 }
			                	 else {
			                		 System.out.println("Sorry, the correct answer is option A.");
			                		 System.out.println("the game is terminated");
			                		 System.out.println("the point is"+points);
			                		 System.exit(0);
			                	 }
			                }
			                
			                else if(choice==2)
			        		{
			                	System.out.println("According to auidence poll the ratio of answer will be :");
			        			System.out.println("1.who is the founder of the java?");
			        			System.out.println("A.james gosling         50%");
			        			System.out.println("B.jhon                  10%");
			        			System.out.println("C.steven                22%");
			        			System.out.println("D.none of the above     18%");
			        			pole--;
							    lifeline--;
			        			a1=sc.next();
			        			if(a1.equals("A")) {
			        				System.out.println("Correct");
			        			    points=point+100;
			        			    System.out.println("the point is"+points);
			        			}
			        			else{
			        				System.out.println("Sorry, the correct answer is option A.");
			        			    System.out.println("the game is terminated");
			        			    System.out.println("the point is"+points);
			        			    System.exit(0);
			        			}
			        		}
			                
			                else if(choice==3) {
			                	System.out.println(" you can flip the question ");
			                	System.out.println("What is the return type of a constructor in Java?");
			                	System.out.println("A. void");
			                	System.out.println("B. int");
			               		System.out.println("C. String");
			               		System.out.println("D. No return type");		                		
				               	flip--;
				             	lifeline--;
				                a1=sc.next();
				                if (a1.equals("D")) { 
				                	System.out.println("Correct");
				                	points=point+100;
				                	System.out.println("the point is"+points);		          	      
				                }
				                else{
				                	System.out.println("Sorry, the correct answer is option D.");
			        			    System.out.println("the game is terminated");
			        			    System.out.println("the point is"+points);
			        			    System.exit(0);
				                	}
			                	}
							}
						}
			
			else {
			      System.out.println("Sorry, the correct answer is option A.");
			      System.out.println("the game is terminated");
			      System.out.println("the point is 0");
			      System.exit(0);
			    }
			System.out.println("===================================================");
			System.out.println("2.What is the default value of a local variable in Java?");
			System.out.println("A.0");
			System.out.println("B.Null");
			System.out.println("C.Undefined");
			System.out.println("D.Depends on the data type");
			System.out.println("E.lifeline are: ");
			System.out.println("F.quit");
			String a2=sc.next();
			if(a2.equals("F"))
			{
				System.exit(0);
			}
			
			else if (a2.equals("C")) { 
			      System.out.println("Correct");
			      points+=100;
		 		  System.out.println("the point is"+points);
			    }
			
			else if(a2.equals("E"))
			{
				if (lifeline == 3 && pole == 1 && fiffty == 1 && flip==1) {
		             System.out.println("You have 3 Lifelines left");
					 System.out.println("choose 1.50-50                   2.pole          3.flip");
			         choice=sc.nextInt();
			                if(choice==1)
			                {
			                	System.out.println("2.What is the default value of a local variable in Java?");
			            		System.out.println("A.0");
			            		System.out.println("C.Undefined");
			                	fiffty--;
			                    lifeline--;
							    System.out.println("You are used your 50:50 lifeline ");
			                    a2=sc.next();
			                	 if(a2.equals("C")) {
			                		 System.out.println("Correct");
			                		 points+=100;
			                		 System.out.println("the point is"+points);
						     
			                	 	}
			                	 	else {
				                		 System.out.println("Sorry, the correct answer is option C.");
				                		 System.out.println("the game is terminated");
				                		 System.out.println("the point is"+points);
				                		 System.exit(0);
			                	 }
			                }
			                
			                else if(choice==2)
			        		{
			                	System.out.println("According to auidence poll the ratio of answer will be :");
			                	System.out.println("2.What is the default value of a local variable in Java?");
			            		System.out.println("A.0                          15%");
			            		System.out.println("B.Null                        6%");
			            		System.out.println("C.Undefined                  65%");
			            		System.out.println("D.Depends on the data type   14%");
			        			pole--;
							    lifeline--;
			        			a2=sc.next();
			        			if(a2.equals("C")) {
			        				System.out.println("Correct");
			        				points+=100;
			                		System.out.println("the point is"+points);
			        			}
			        				else{
				        				System.out.println("Sorry, the correct answer is option C.");
				        			    System.out.println("the game is terminated");
					                    System.out.println("the point is"+points);
				        			    System.exit(0);
			        			}
			        		}
			                
			                 if(choice==3) {
			                	System.out.println(" you can flip the question ");
			                	System.out.println("What is the return type of a constructor in Java?");
			                		System.out.println("A.void");
			                		System.out.println("B.int");
			                		System.out.println("C.String");
			                		System.out.println("D.No return type");		                		
			                		flip--;
			                		lifeline--;
			                		a2=sc.next();
			                		if (a2.equals("D")) {
			                			System.out.println("Correct");
							          	points+=100;
							            System.out.println("the point is"+points);		          	      
			                		}
			                		else{
			        				  System.out.println("Sorry, the correct answer is option D.");
			        			      System.out.println("the game is terminated");
			        			      System.out.println("the point is"+points);
			        			      System.exit(0);
			                		}
			                 	}
						} 
				
				else if(lifeline ==2 && pole == 1 && fiffty == 1 && flip ==0) {
					 System.out.println("You have only two lifeline fiffty and pole");
					 System.out.println("choose 1.50-50                   2.pole");
			         choice=sc.nextInt();
			                 if(choice==1) {
							System.out.println("2.What is the default value of a local variable in Java?");
				    		System.out.println("A.0");
				    		System.out.println("C.Undefined");
				    		fiffty--;
				    		lifeline--;
				    		System.out.println("You are used your 50:50 lifeline ");
				    		a2=sc.next();
				    		if(a2.equals("C")) {
						      		System.out.println("Correct");
						      		points+=100;
						      		System.out.println("the point is"+points);
				    		}
		      	 else {
		      		 System.out.println("Sorry, the correct answer is option C.");
		      		 System.out.println("the game is terminated");
		      		 System.out.println("the point is"+points);
		      		 System.exit(0);
		      	 	}
				  
			      }
			                 
		      		if(choice==2) {
					      	System.out.println("According to auidence poll the ratio of answer will be :");
					     	System.out.println("2.What is the default value of a local variable in Java?");
					     	System.out.println("A.0                          15%");
							System.out.println("B.Null                        6%");
							System.out.println("C.Undefined                  65%");
							System.out.println("D.Depends on the data type   14%");
							pole--;
							lifeline--;
							a2=sc.next();
							if(a2.equals("C")) {
								System.out.println("Correct");
								points+=100;
								System.out.println("the point is"+points);
							}
							else{
								System.out.println("Sorry, the correct answer is option C.");
							    System.out.println("the game is terminated");
							    System.out.println("the point is"+points);
							    System.exit(0);
							}
		      		}
				}
				
				else if(lifeline ==2 && pole == 0 && fiffty == 1 && flip ==1) {
				 System.out.println("You have 2 Lifelines left fiffty and flip");
				 System.out.println("choose 1.50-50                      3.flip");
		         choice=sc.nextInt();
		         if(choice==1) {
					 System.out.println("2.What is the default value of a local variable in Java?");
					 System.out.println("A.0");
					 System.out.println("C.Undefined");
					 fiffty--;
					 lifeline--;
				     System.out.println("You are used your 50:50 lifeline ");
				     a2=sc.next();
				     if(a2.equals("C")) {
				    	 System.out.println("Correct");
				    	 points+=100;
				    	 System.out.println("the point is"+points);
				     }
				     else {
				    	 System.out.println("Sorry, the correct answer is option C.");
				    	 System.out.println("the game is terminated");
				    	 System.out.println("the point is"+points);
				    	 System.exit(0);
				     }
				}
		         
		        if(choice==3) {
		        	System.out.println(" you can flip the question ");
		        	System.out.println("What is the return type of a constructor in Java?");
		    		System.out.println("A.void");
		    		System.out.println("B.int");
		    		System.out.println("C.String");
		    		System.out.println("D.No return type");		    		
		    		flip--;
		    		lifeline--;
		    		a2=sc.next();
		    		if (a2.equals("D")) { 
		    			System.out.println("Correct");
		    			points+=100;
		    			System.out.println("the point is"+points);			      
		    		}
		    		else{
		    			System.out.println("Sorry, the correct answer is option D.");
		    			System.out.println("the game is terminated");
		    			System.out.println("the point is"+points);
		    			System.exit(0);
		    			} 
		     	 	}
				}
					else if(lifeline ==2 && pole == 1 && fiffty == 0 && flip ==1) {
						System.out.println("You have 2 Lifelines left pole and flip");
						System.out.println("choose 2.pole                      3.flip");
			            choice=sc.nextInt();
			            if(choice==2) {
			            	System.out.println("According to auidence poll the ratio of answer will be :");
			            	System.out.println("2.What is the default value of a local variable in Java?");
					     	System.out.println("A.0                          15%");
							System.out.println("B.Null                        6%");
							System.out.println("C.Undefined                  65%");
							System.out.println("D.Depends on the data type   14%");
							pole--;
						    lifeline--;
						    a2=sc.next();
						    if(a2.equals("C")) {
						    	System.out.println("Correct");
						    	points+=100;
						    	System.out.println("the point is"+points);
						    }
						    else{
						    	System.out.println("Sorry, the correct answer is option C.");
						    	System.out.println("the game is terminated");
						    	System.out.println("the point is"+points);
						    	System.exit(0);
						    	}
			            	}
			            
			            if(choice==3) {
			            	System.out.println(" you can flip the question ");
			            	System.out.println("What is the return type of a constructor in Java?");
				    		System.out.println("A.void");
				    		System.out.println("B.int");
				    		System.out.println("C.String");
				    		System.out.println("D.No return type");				    		
				    		flip--;
				    		lifeline--;
				    		a2=sc.next();
				    		if (a2.equals("D")) { 
				    			System.out.println("Correct");
				    			points+=100;
				    			System.out.println("the point is"+points);				      
				    			}
				    		else{
				    			System.out.println("Sorry, the correct answer is option D.");
				    			System.out.println("the game is terminated");
				    			System.out.println("the point is"+points);
				    			System.exit(0);
				    			} 
			            	}
						}
				
					else if (lifeline == 1 && pole == 0 && fiffty == 1 && flip == 0) {
						System.out.println("You have only one lifeline(50:50)");
						System.out.println("2.What is the default value of a local variable in Java?");
						System.out.println("A.0");
						System.out.println("C.Undefined");
						fiffty--;
						lifeline--;
						System.out.println("You are used your 50:50 lifeline ");
						a2=sc.next();
						if(a2.equals("C")) {
							System.out.println("Correct");
							points+=100;
							System.out.println("the point is"+points);			     
							}
						else {
							System.out.println("Sorry, the correct answer is option C.");
							System.out.println("the game is terminated");
							System.out.println("the point is"+points);
							System.exit(0);
							}		     		
					}
				
					else if(lifeline == 1 && pole == 1 && fiffty == 0 && flip==0) {
						System.out.println("According to auidence poll the ratio of answer will be :");
						System.out.println("2.What is the default value of a local variable in Java?");
						System.out.println("A.0                          15%");
						System.out.println("B.Null                        6%");
						System.out.println("C.Undefined                  65%");
						System.out.println("D.Depends on the data type   14%");
						pole--;
					    lifeline--;
					    a2=sc.next();
					    if(a2.equals("C")) {
					    	System.out.println("Correct");
			 				points+=100;
			 				System.out.println("the point is"+points);
					    	}
					    else{
					    	System.out.println("Sorry, the correct answer is option C.");
			 			    System.out.println("the game is terminated");
			        	    System.out.println("the point is"+points);
			 			    System.exit(0);
					    	}
					}
					else if(lifeline == 1 && pole == 0 && fiffty == 0 && flip==1) {
						System.out.println(" you can flip the question ");
						System.out.println("What is the return type of a constructor in Java?");
		         		System.out.println("A.void");
		         		System.out.println("B.int");
		         		System.out.println("C.String");
		         		System.out.println("D.No return type");		         		
		         		flip--;
		         		lifeline--;
		         		a2=sc.next();
		         		if (a2.equals("D")) { 
		         			System.out.println("Correct");
		         			points+=100;
		         			System.out.println("the point is"+points);		   	      
		         			}
		         		else{
		         			System.out.println("Sorry, the correct answer is option D.");
		         			System.out.println("the game is terminated");
		         			System.out.println("the point is"+points);
		         			System.exit(0);
		         			}
						}
					else if(lifeline==0) {
						System.out.println("No lifelines left ");
						System.out.println("Select one option : ");
						a2 = sc.next();
						if (a2.equals("C")) { 
							System.out.println("Correct");
							points+=100;
							System.out.println("the point is"+points);		         	      
							}
						else {
							System.out.println("Sorry, the correct answer is option C.");
							System.out.println("the game is terminated");
							System.out.println("the point is"+points);
							System.exit(0);	
							}
						if(a2.equals("F"))
						{
							System.exit(0);
								}				 
						}
				}
				else {
					System.out.println("Sorry, the correct answer is option C.");
					System.out.println("the game is terminated");
					System.out.println("the point is"+points);
					System.exit(0);
			    	}
				System.out.println("======================================================");
				System.out.println("3.Which of the following is not a Java feature?");
				System.out.println("A.Object-oriented");
				System.out.println("B.Use of pointers");
				System.out.println("C.Platform independent");
			    System.out.println("D.Dynamic and extensible");
			    System.out.println("E.lifeline are: ");
				System.out.println("F.quit");
			    String a3=sc.next();
			    if(a3.equals("F"))
			    {
			    	System.exit(0);
			    }
			
			    else if (a3.equals("B")) { 
			    	System.out.println("Correct");
			    	points+=100;
			    	System.out.println("the point is"+points);		      
			    	}
			    else if(a3.equals("E"))
			    {
			    	if (lifeline == 3 && pole == 1 && fiffty == 1 && flip==1) {
			    		System.out.println("You have 3 Lifelines left");
			    		System.out.println("choose 1.50-50                   2.pole           3.flip");
			            choice=sc.nextInt();
			            if(choice==1)
			             {
			                System.out.println("3.Which of the following is not a Java feature?");
			            	System.out.println("B.Use of pointers");
			            	System.out.println("C.Platform independent");
			              	fiffty--;
			                lifeline--;
							System.out.println("You are used your 50:50 lifeline ");
			                a3=sc.next();
			                 if(a3.equals("B")) {
			                	 System.out.println("Correct");
			                	 points+=100;
			                	 System.out.println("the point is"+points);						     
			                 }
			                 else {
			                	 System.out.println("Sorry, the correct answer is option B.");
				                 System.out.println("the game is terminated");
				                 System.out.println("the point is"+points);
				                 System.exit(0);
			                	 }
			             }
			                else if(choice==2)
			        			{
			                		System.out.println("According to auidence poll the ratio of answer will be :");
			                		System.out.println("3.Which of the following is not a Java feature?");
				                	System.out.println("A.Object-oriented          19%");
				                	System.out.println("B.Use of pointers          50%");
				                	System.out.println("C.Platform independent     10%");
				                    System.out.println("D.Dynamic and extensible   21%");
				        			pole--;
								    lifeline--;
				        			a3=sc.next();
				        			if(a3.equals("B")) {
				        				System.out.println("Correct");
				        				points+=100;
				        				System.out.println("the point is"+points);
				        			}
				        			else{
				        				System.out.println("Sorry, the correct answer is option B.");
				        				System.out.println("the game is terminated");
				                		System.out.println("the point is"+points);
				                		System.exit(0);
				        				}
			        			}
			                else if(choice==3) {
			                		System.out.println(" you can flip the question ");
			                		System.out.println("What is the return type of a constructor in Java?");
			                		System.out.println("A.void");
			                		System.out.println("B.int");
			                		System.out.println("C.String");
			                		System.out.println("D.No return type");
			                		flip--;
			                		lifeline--;
			                		a3=sc.next();
			                		if (a3.equals("D")) { 
			                			System.out.println("Correct");
			                			points+=100;
			                			System.out.println("the point is"+points);			          	      
			                		}
			                		else{
			                			System.out.println("Sorry, the correct answer is option D.");
			                			System.out.println("the game is terminated");
			                			System.out.println("the point is"+points);
			                			System.exit(0);
			                			}
			                	}			                
			    	}
			    	else if(lifeline ==2 && pole == 1 && fiffty == 1 && flip ==0) {
			    		System.out.println("You have only two lifeline fiffty and pole");
			    		System.out.println("choose 1.50-50                   2.pole");
			            choice=sc.nextInt();
			            if(choice==1) {
			            	System.out.println("3.Which of the following is not a Java feature?");
			            	System.out.println("B.Use of pointers");
			            	System.out.println("C.Platform independent");
			            	fiffty--;
			            	lifeline--;
			            	System.out.println("You are used your 50:50 lifeline ");
			            	a3=sc.next();
			            	if(a3.equals("B")) {
			            		System.out.println("Correct");
			            		points+=100;
			            		System.out.println("the point is"+points); 
			            	}
			            	else {
			            		System.out.println("Sorry, the correct answer is option B.");
			            		System.out.println("the game is terminated");
			            		System.out.println("the point is"+points);
			            		System.exit(0);
			            		}
			            }
			            if(choice==2) {
			            	System.out.println("According to auidence poll the ratio of answer will be :");
			            	System.out.println("3.Which of the following is not a Java feature?");
				        	System.out.println("A.Object-oriented               19%");
				        	System.out.println("B.Use of pointers               50%");
				        	System.out.println("C.Platform independent          10%");
				            System.out.println("D.Dynamic and extensible        21%");
							pole--;
						    lifeline--;
							a3=sc.next();
							if(a3.equals("B")) {
								System.out.println("Correct");
								points+=100;
								System.out.println("the point is"+points);
							}
							else{
								System.out.println("Sorry, the correct answer is option B.");
								System.out.println("the game is terminated");
								System.out.println("the point is"+points);
								System.exit(0);
								}
			            	}
			    	}
			    	else if(lifeline ==2 && pole == 0 && fiffty == 1 && flip ==1) {
			    		System.out.println("You have 2 Lifelines left fiffty and flip");
			    		System.out.println("choose 1.50-50                      3.flip");
		                choice=sc.nextInt();
		                if(choice==1) {
							System.out.println("3.Which of the following is not a Java feature?");
			        		System.out.println("B.Use of pointers");
			        		System.out.println("C.Platform independent");
			        		fiffty--;
			        		lifeline--;
			        		System.out.println("You are used your 50:50 lifeline ");
			        		a3=sc.next();
			        		if(a3.equals("B")) {
			        			System.out.println("Correct");
			        			points+=100;
			        			System.out.println("the point is"+points);		  
			        		}
			        		else {
			        			System.out.println("Sorry, the correct answer is option B.");
			        			System.out.println("the game is terminated");
			        			System.out.println("the point is"+points);
			        			System.exit(0);
			        			}
		                }
		                if(choice==3) {
		                	System.out.println(" you can flip the question ");
		                	System.out.println("What is the return type of a constructor in Java?");
				    		System.out.println("A.void");
				    		System.out.println("B.int");
				    		System.out.println("C.String");
				    		System.out.println("D.No return type");				    		
				    		flip--;
				    		lifeline--;
				    		a3=sc.next();
				    		if (a3.equals("D")) { 
				    			System.out.println("Correct");
				    			points+=100;
				    			System.out.println("the point is"+points);		      
				    		}
				    		else{
				    			System.out.println("Sorry, the correct answer is option D.");
				    			System.out.println("the game is terminated");
				    			System.out.println("the point is"+points);
				    			System.exit(0);
				    			} 
		                	}
			    	}
			    	else if(lifeline ==2 && pole == 1 && fiffty == 0 && flip ==1) {
			    		System.out.println("You have 2 Lifelines left pole and flip");
			    		System.out.println("choose 2.pole                      3.flip");
			            choice=sc.nextInt();
			            if(choice==2) {
						System.out.println("According to auidence poll the ratio of answer will be :");
						System.out.println("3.Which of the following is not a Java feature?");
			        	System.out.println("A.Object-oriented        19%");
			        	System.out.println("B.Use of pointers        50%");
			        	System.out.println("C.Platform independent   10%");
			            System.out.println("D.Dynamic and extensible 21%");
						pole--;
					    lifeline--;
						a3=sc.next();
						if(a3.equals("B")) {
							System.out.println("Correct");
							points+=100;
							System.out.println("the point is"+points);
						}
							else{
								System.out.println("Sorry, the correct answer is option B.");
								System.out.println("the game is terminated");
								System.out.println("the point is"+points);
								System.exit(0);
								}
			            }
			            if(choice==3) {
			            	System.out.println(" you can flip the question ");
			            	System.out.println("What is the return type of a constructor in Java?");
				    		System.out.println("A.void");
				    		System.out.println("B.int");
				    		System.out.println("C.String");
				    		System.out.println("D.No return type");				    		
				    		flip--;
				    		lifeline--;
				    		a3=sc.next();
				    		if (a3.equals("D")) { 
				    			System.out.println("Correct");
				    			points+=100;
				    			System.out.println("the point is"+points);					      
				    		}
				    		else{
				    			System.out.println("Sorry, the correct answer is option D.");
				    			System.out.println("the game is terminated");
				    			System.out.println("the point is"+points);
				    			System.exit(0);
				    			} 
			            	}
			    	}
			    	else if (lifeline == 1 && pole == 0 && fiffty == 1 && flip==0) {
			    		System.out.println("You have only one lifeline(50:50)");
			    		System.out.println("3.Which of the following is not a Java feature?");
			    		System.out.println("B.Use of pointers");
			    		System.out.println("C.Platform independent");
			    		fiffty--;
			    		lifeline--;
			    		System.out.println("You are used your 50:50 lifeline ");
			    		a3=sc.next();
			    		if(a3.equals("B")) {
			    			System.out.println("Correct");
			    			points+=100;
			    			System.out.println("the point is"+points);			     
			    		}
			    		else {
			    			System.out.println("Sorry, the correct answer is option B.");
			    			System.out.println("the game is terminated");
			    			System.out.println("the point is"+points);
			    			System.exit(0);
			    			}	     		
			    	}
			    	else if(lifeline == 1 && pole == 1 && fiffty == 0 && flip==0) {
			    		System.out.println("According to auidence poll the ratio of answer will be :");
			    		System.out.println("3.Which of the following is not a Java feature?");
			    		System.out.println("A.Object-oriented        19%");
			    		System.out.println("B.Use of pointers        50%");
			    		System.out.println("C.Platform independent   10%");
			    		System.out.println("D.Dynamic and extensible 21%");
			    		pole--;
			    		lifeline--;
			    		a3=sc.next();
			    		if(a3.equals("B")) {
			    			System.out.println("Correct");
			    			points+=100;
			    			System.out.println("the point is"+points);
			    		}
			    		else{
			    			System.out.println("Sorry, the correct answer is option B.");
			    			System.out.println("the game is terminated");
			    			System.out.println("the point is"+points);
			    			System.exit(0);
			    			}
			    	}
			       else if(lifeline == 1 && pole == 0 && fiffty == 0 && flip==1) {
			    	   System.out.println(" you can flip the question ");
			    	   System.out.println("What is the return type of a constructor in Java?");
		         	   System.out.println("A.void");
		         	   System.out.println("B.int");
		         	   System.out.println("C.String");
		         	   System.out.println("D.No return type");		         		
		         	   flip--;
		         	   lifeline--;
		         	   a3=sc.next();
		         	   if (a3.equals("D")) { 
		         		   System.out.println("Correct");
		         		   points+=100;
		         		   System.out.println("the point is"+points);		   	      
		         	   }
		         	   else{
		         		   System.out.println("Sorry, the correct answer is option D.");
		         		   System.out.println("the game is terminated");
		         		   System.out.println("the point is"+points);
		         		   System.exit(0);
		         	   	}
			       }
			       else if(lifeline==0) {
			    	   System.out.println("No lifelines left ");
			    	   System.out.println("Select one option : ");
			    	   a3 = sc.next();
			    	   if (a3.equals("B")) { 
			    		   System.out.println("Correct");
			    		   points+=100;
			    		   System.out.println("the point is"+points);		         	      
			    	   }
			    	   else {
			    		   System.out.println("Sorry, the correct answer is option B.");
			    		   System.out.println("the game is terminated");
			    		   System.out.println("the point is"+points);
			    		   System.exit(0);	
			    	   }
			    		   if(a3.equals("F"))
			    		   {
			    			   System.exit(0);
			    		   }				 
			       }
			    }
			    else {
			    	System.out.println("Sorry, the correct answer is option B.");
			    	System.out.println("the game is terminated");
			    	System.out.println("the point is"+points);
			    	System.exit(0);
			    }
			    System.out.println("===================================================");
			    System.out.println("4 What is the size of an int data type in Java");
				System.out.println("A.16-bit");
				System.out.println("B.32-bit");
				System.out.println("C.64-bit");
			    System.out.println("D.Depends on the operating system");
			    System.out.println("E.lifeline are: ");
				System.out.println("F.quit");
			    String a4=sc.next();
			    if(a4.equals("F"))
			    {
			    	System.exit(0);
			    }
			
			    else if (a4.equals("B")) { 
			    	System.out.println("Correct");
			    	points+=100;
			    	System.out.println("the point is"+points);			      
			    }
			
			    else if(a4.equals("E"))
			    {
			    	if (lifeline == 3 && pole == 1 && fiffty == 1 && flip==1) {
			    		System.out.println("You have 3 Lifelines left");
			    		System.out.println("choose 1.50-50                   2.pole                3.flip");
			            choice=sc.nextInt();
			            if(choice==1)
			            {
			            	System.out.println("4.What is the size of an int data type in Java");
			            	System.out.println("B.32-bit");
			            	System.out.println("C.64-bit");
			            	fiffty--;
			            	lifeline--;
			            	System.out.println("You are used your 50:50 lifeline ");
			            	a4=sc.next();
			            	if(a4.equals("B")) {
			            		System.out.println("Correct");
			            		points+=100;
			            		System.out.println("the point is"+points);						     
			            	}
			            	else {
			            		System.out.println("Sorry, the correct answer is option B.");
			            		System.out.println("the game is terminated");
			            		System.out.println("the point is"+points);
			            		System.exit(0);
			            	}
			                	}
			              else if(choice==2)
			               	{
			            	  System.out.println("According to auidence poll the ratio of answer will be :");
			            	  System.out.println("4.What is the size of an int data type in Java");
			            	  System.out.println("A.16-bit                                         5%");
			            	  System.out.println("B.32-bit                                        75%");
			            	  System.out.println("C.64-bit                                         8%");
			            	  System.out.println("D.Depends on the operating system               12%");
			            	  pole--;
			            	  lifeline--;
			            	  a4=sc.next();
			            	  if(a4.equals("B")) {
			            		  System.out.println("Correct");
			            		  points+=100;
			            		  System.out.println("the point is"+points);
			        				}
			        				else{
			        					System.out.println("Sorry, the correct answer is option B.");
			        					System.out.println("the game is terminated");
			        					System.out.println("the point is"+points);
			        					System.exit(0);
			        				}
			               	}
			              else if(choice==3) {
			                		System.out.println(" you can flip the question ");
			                		System.out.println("What is the return type of a constructor in Java?");
			                		System.out.println("A. void");
			                		System.out.println("B. int");
			                		System.out.println("C. String");
			                		System.out.println("D. No return type");
			                		flip--;
			                		lifeline--;
			                		a4=sc.next();
			                		if (a4.equals("D")) { 
			                			System.out.println("Correct");
			                			points+=100;
			                			System.out.println("the point is"+points);			          	      
			                		}
			                		else{
			                			System.out.println("Sorry, the correct answer is option D.");
			                			System.out.println("the game is terminated");
			                			System.out.println("the point is"+points);
			                			System.exit(0);
			                		}
			              }
			    	}
			    	else if(lifeline ==2 && pole == 1 && fiffty == 1 && flip ==0) {
			    		System.out.println("You have only two lifeline fiffty and pole");
			    		System.out.println("choose 1.50-50                   2.pole");
			            choice=sc.nextInt();
			            if(choice==1) {
			            	System.out.println("4.What is the size of an int data type in Java");
				            System.out.println("B.32-bit");
				            System.out.println("C.64-bit");
				            fiffty--;
				            lifeline--;
				            System.out.println("You are used your 50:50 lifeline ");
				            a4=sc.next();
				            if(a4.equals("B")) {
				            	System.out.println("Correct");
				            	points+=100;
				            	System.out.println("the point is"+points);			     
				            }
				            else {
				            	System.out.println("Sorry, the correct answer is option B.");
				            	System.out.println("the point is"+points);
				            	System.exit(0);
				            }
			            }
			            if(choice==2) {
			            	System.out.println("According to auidence poll the ratio of answer will be :");
			            	System.out.println("4.What is the size of an int data type in Java");
			            	System.out.println("A.16-bit                                     5%");
			            	System.out.println("B.32-bit                                    75%");
			            	System.out.println("C.64-bit                                     8%");
			            	System.out.println("D.Depends on the operating system           12%");
			            	pole--;
			            	lifeline--;
			            	a4=sc.next();
			            	if(a4.equals("B")) {
			            		System.out.println("Correct");
			            		points+=100;
			            		System.out.println("the point is"+points);
			            	}
			            	else{
			            		System.out.println("Sorry, the correct answer is option B.");
			            		System.out.println("the game is terminated");
			            		System.out.println("the point is"+points);
			            		System.exit(0);
			            	}
			            }
			    	}
			    	else if(lifeline ==2 && pole == 0 && fiffty == 1 && flip ==1) {
			    		System.out.println("You have 2 Lifelines left fiffty and flip");
			    		System.out.println("choose 1.50-50                      3.flip");
		                choice=sc.nextInt();
		                if(choice==1) {
		                	System.out.println("4.What is the size of an int data type in Java");
		                	System.out.println("B.32-bit");
		                	System.out.println("C.64-bit");
		                	fiffty--;
		                	lifeline--;
		                	System.out.println("You are used your 50:50 lifeline ");
		                	a4=sc.next();
		                	if(a4.equals("B")) {
		                		System.out.println("Correct");
		                		points+=100;
		                		System.out.println("the point is"+points);		  
		                	}
		                	else {
		                		System.out.println("Sorry, the correct answer is option B.");
		                		System.out.println("the game is terminated");
		                		System.out.println("the point is"+points);
		                		System.exit(0);
		                	}
		                }
		                if(choice==3) {
		                	System.out.println(" you can flip the question ");
		                	System.out.println("What is the return type of a constructor in Java?");
				    		System.out.println("A. void");
				    		System.out.println("B. int");
				    		System.out.println("C. String");
				    		System.out.println("D. No return type");
				    		flip--;
				    		lifeline--;
				    		a4=sc.next();
				    		if (a4.equals("D")) { 
				    			System.out.println("Correct");
							    points+=100;
							    System.out.println("the point is"+points);						      
				    		}
				    		else{
				    			System.out.println("Sorry, the correct answer is option D.");
				    			System.out.println("the game is terminated");
				    			System.out.println("the point is"+points);
				    			System.exit(0);
				    		} 
		                }
			    	}
			    	else if(lifeline ==2 && pole == 1 && fiffty == 0 && flip ==1) {
			    		System.out.println("You have 2 Lifelines left pole and flip");
			    		System.out.println("choose 2.pole                      3.flip");
			    		choice=sc.nextInt();
			    		if(choice==2) {
			    			System.out.println("According to auidence poll the ratio of answer will be :");
							System.out.println("4.What is the size of an int data type in Java");
				        	System.out.println("A.16-bit                                     5%");
				        	System.out.println("B.32-bit                                    75%");
				        	System.out.println("C.64-bit                                     8%");
				            System.out.println("D. Depends on the operating system          12%");
							pole--;
							lifeline--;
							a4=sc.next();
							if(a4.equals("B")) {
								System.out.println("Correct");
								points+=100;
								System.out.println("the point is"+points);
							}
							else{
								System.out.println("Sorry, the correct answer is option B.");
								System.out.println("the game is terminated");
								System.out.println("the point is"+points);
								System.exit(0);
								}
			    		}
			    		if(choice==3) {						
			    			System.out.println(" you can flip the question ");
			    			System.out.println("What is the return type of a constructor in Java?");
				    		System.out.println("A. void");
				    		System.out.println("B. int");
				    		System.out.println("C. String");
				    		System.out.println("D. No return type");				    		
				    		flip--;
				    		lifeline--;
				    		a4=sc.next();
				    		if (a4.equals("D")) { 
				    			System.out.println("Correct");
				    			points+=100;
				    			System.out.println("the point is"+points);					      
				    		}
				    		else{
				    			System.out.println("Sorry, the correct answer is option D.");
				    			System.out.println("the game is terminated");
				    			System.out.println("the point is"+points);
				    			System.exit(0);
				    			} 
			    		}
			    	}
			    	else if (lifeline == 1 && pole == 0 && fiffty == 1 && flip==0) {
			    		System.out.println("You have only one lifeline(50:50)");
			    		System.out.println("4.What is the size of an int data type in Java");
			    		System.out.println("B.32-bit");
			    		System.out.println("C.64-bit");
			    		fiffty--;
			    		lifeline--;
			    		System.out.println("You are used your 50:50 lifeline ");
			    		a4=sc.next();
			    		if(a4.equals("B")) {
			    			System.out.println("Correct");
			    			points+=100;
			    			System.out.println("the point is"+points);			     
			    		}
			    		else {
			    			System.out.println("Sorry, the correct answer is option B.");
			    			System.out.println("the game is terminated");
			    			System.out.println("the point is"+points);
			    			System.exit(0);
			    		}		     		
			    	}
			    	else if(lifeline == 1 && pole == 1 && fiffty == 0 && flip==0) {
			    		System.out.println("According to auidence poll the ratio of answer will be :");
			    		System.out.println("4.What is the size of an int data type in Java");
			    		System.out.println("A.16-bit                               5%");
			    		System.out.println("B.32-bit                              75%");
			    		System.out.println("C.64-bit                               8%");
			    		System.out.println("D.Depends on the operating system     12%");
			    		lifeline--;
			    		a4=sc.next();
			    		if(a4.equals("B")) {
			    			System.out.println("Correct");
			    			points+=100;
			    			System.out.println("the point is"+points);
			    		}
			    		else{
			    			System.out.println("Sorry, the correct answer is option B.");
			    			System.out.println("the game is terminated");
			    			System.out.println("the point is"+points);
			    			System.exit(0);
			    			}
			    	}
			    	else if(lifeline == 1 && pole == 0 && fiffty == 0 && flip==1) {
			    		System.out.println(" you can flip the question ");
			    		System.out.println("What is the return type of a constructor in Java?");
		         		System.out.println("A. void");
		         		System.out.println("B. int");
		         		System.out.println("C. String");
		         		System.out.println("D. No return type");		         		
		         		flip--;
		         		lifeline--;
		         		a4=sc.next();
		         		if (a4.equals("D")) { 
		         			System.out.println("Correct");
		         			points+=100;
		         			System.out.println("the point is"+points);
		   	      
		         		}
		         		else{
		         			System.out.println("Sorry, the correct answer is option D.");
		         			System.out.println("the game is terminated");
		         			System.out.println("the point is"+points);
		         			System.exit(0);
		         			}
			    	}
			    	else if(lifeline==0) {
			    		System.out.println("No lifelines left ");
			    		System.out.println("Select one option : ");
			    		a4 = sc.next();
			    		if (a4.equals("B")) { 
			    			System.out.println("Correct");
			    			points+=100;
		          		 	System.out.println("the point is"+points);		         	      
			    		}
			    		else {
			         	      System.out.println("Sorry, the correct answer is option B.");
			         	      System.out.println("the game is terminated");
			         	      System.out.println("the point is"+points);
			         	      System.exit(0);
			    			}
			         	      if(a4.equals("F"))
			         	      {
			         	    	  System.exit(0);
			         	      }			 
			    	}
			    }
			    else {
				      System.out.println("Sorry, the correct answer is option B.");
				      System.out.println("the game is terminated");
				      System.out.println("the point is"+points);
				      System.exit(0);
			    	}
			    System.out.println("======================================================");
				System.out.println("5.Which of these keywords is used to define an abstract class in Java?");
				System.out.println("A.interface");
				System.out.println("B.abstract");
				System.out.println("C.class");
			    System.out.println("D.extends");
			    System.out.println("E.lifeline are: ");
				System.out.println("F.quit");
			    String a5=sc.next();
			    if(a5.equals("F"))
			   	{
			   		System.exit(0);
			   	}
		   	
			    else if (a5.equals("B")) { 
		   	      	System.out.println("Correct");
		   	      	points+=100;
		   	      	System.out.println("the point is"+points);		   	      
			    }
		   	
			    else if(a5.equals("E"))
			    {
			    	if (lifeline == 3 && pole == 1 && fiffty == 1 && flip==1) {
			    		System.out.println("You have 3 Lifelines left");
		   			 	System.out.println("choose 1.50-50                   2.pole                    3.flip");
		   	            choice=sc.nextInt();
		   	            if(choice==1)
		   	            {
		   	            	System.out.println("5.Which of these keywords is used to define an abstract class in Java?");
		   	            	System.out.println("B.abstract");
		   	            	System.out.println("C.class");
		   	            	fiffty--;
		   	            	lifeline--;
		   	            	System.out.println("You are used your 50:50 lifeline ");
		   	            	a5=sc.next();
		   	            	if(a5.equals("B")) {
		   	            		System.out.println("Correct");
		   	            		points+=100;
		   	            		System.out.println("the point is"+points);		   				     
		   	            	}
		   	            	else {
		   	            		System.out.println("Sorry, the correct answer is option B.");
		   	            		System.out.println("the game is terminated");
		   	            		System.out.println("the point is"+points);
		   	            		System.exit(0);
		   	            	}
		   	                	}
		   	            else if(choice==2)
		   	            {
		   	            	System.out.println("According to auidence poll the ratio of answer will be :");
		   	            	System.out.println("5.Which of these keywords is used to define an abstract class in Java?");
		   	            	System.out.println("A.interface      13%");
		   	             	System.out.println("B.abstract       44%");
		   	             	System.out.println("C.class          10%");
		   	             	System.out.println("D.extends        33%");
		   	             	pole--;
		   	             	lifeline--;
		   	             	a5=sc.next();
		   	             	if(a5.equals("B")) {
		   	             		System.out.println("Correct");
		   	             		points+=100;
		   	             		System.out.println("the point is"+points);
		   	        				}
		   	             	else{
		   	             		System.out.println("Sorry, the correct answer is option B.");
		   	             		System.out.println("the game is terminated");
		   	             		System.out.println("the point is"+points);
		   	             		System.exit(0);
		   	        				}
		   	            }
		   	            else if(choice==3) {
		   	            	System.out.println(" you can flip the question ");
		   	            	System.out.println("What is the return type of a constructor in Java?");
		   	            	System.out.println("A. void");
		   	            	System.out.println("B. int");
		   	            	System.out.println("C. String");
		   	            	System.out.println("D. No return type");
		   	            	flip--;
		   	            	lifeline--;
		   	            	a5=sc.next();
		   	            	if (a5.equals("D")) { 
		   	            		System.out.println("Correct");
		   	            		points+=100;
		   	            		System.out.println("the point is"+points);	          	      
		   	            	}
		   	            	else{
		   	            		System.out.println("Sorry, the correct answer is option D.");
		   	            		System.out.println("the game is terminated");
		   	            		System.out.println("the point is"+points);
		   	            		System.exit(0);
		   	            	}
			                	}
		   					}
			    	else if(lifeline ==2 && pole == 1 && fiffty == 1 && flip ==0) {
			    		System.out.println("You have only two lifeline fiffty and pole");
			    		System.out.println("choose 1.50-50                   2.pole");
			    		choice=sc.nextInt();
			    		if(choice==1) {
			    			System.out.println("5.Which of these keywords is used to define an abstract class in Java?");
			    			System.out.println("B.abstract");
			    			System.out.println("C.class");
			    			fiffty--;
			    			lifeline--;
			    			System.out.println("You are used your 50:50 lifeline ");
			    			a5=sc.next();
			    			if(a5.equals("B")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);			     
			    			}
			    			else {
			    				System.out.println("Sorry, the correct answer is option B.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    		if(choice==2) {
			    			System.out.println("According to auidence poll the ratio of answer will be :");
			    			System.out.println("5.Which of these keywords is used to define an abstract class in Java?");
			    			System.out.println("A.interface      13%");
			    			System.out.println("B.abstract       44%");
			    			System.out.println("C.class          10%");
			    			System.out.println("D.extends        33%");
			    			pole--;
			    			lifeline--;
			    			a5=sc.next();
			    			if(a5.equals("B")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    			}
			    			else{
			    				System.out.println("Sorry, the correct answer is option B.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    	}
			    	else if(lifeline ==2 && pole == 0 && fiffty == 1 && flip ==1) {
			    		System.out.println("You have 2 Lifelines left fiffty and flip");
			    		System.out.println("choose 1.50-50                      3.flip");
			    		choice=sc.nextInt();
			    		if(choice==1) {
			    			System.out.println("5.Which of these keywords is used to define an abstract class in Java?");
			    			System.out.println("B.abstract");
			    			System.out.println("C.class");
			    			fiffty--;
			    			lifeline--;
			    			System.out.println("You are used your 50:50 lifeline ");
			    			a5=sc.next();
			    			if(a5.equals("B")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);		  
			    			}
			    			else {
			    				System.out.println("Sorry, the correct answer is option B.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    		if(choice==3) {
			    			System.out.println(" you can flip the question ");
			    			System.out.println("What is the return type of a constructor in Java?");
			    			System.out.println("A. void");
			    			System.out.println("B. int");
			    			System.out.println("C. String");
			    			System.out.println("D. No return type");		    		
			    			flip--;
			    			lifeline--;
			    			a5=sc.next();
			    			if (a5.equals("D")) { 
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);		      
			    			}
			    			else{
			    				System.out.println("Sorry, the correct answer is option D.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			} 
			    		}
			    	}
			    	else if(lifeline ==2 && pole == 1 && fiffty == 0 && flip ==1) {
			    		System.out.println("You have 2 Lifelines left pole and flip");
			    		System.out.println("choose 2.pole                      3.flip");
			            choice=sc.nextInt();
			            if(choice==2) {
			            	System.out.println("According to auidence poll the ratio of answer will be :");
							System.out.println("5.Which of these keywords is used to define an abstract class in Java?");
				           	System.out.println("A.interface      13%");
				        	System.out.println("B.abstract       44%");
				        	System.out.println("C.class          10%");
				            System.out.println("D.extends        33%");
							pole--;
							lifeline--;
							a5=sc.next();
							if(a5.equals("B")) {
							System.out.println("Correct");
							points+=100;
							System.out.println("the point is"+points);
							}
							else{
								System.out.println("Sorry, the correct answer is option B.");
								System.out.println("the game is terminated");
								System.out.println("the point is"+points);
								System.exit(0);
							}
			            }
			            if(choice==3) {					
			            	System.out.println(" you can flip the question ");
			            	System.out.println("What is the return type of a constructor in Java?");
				    		System.out.println("A. void");
				    		System.out.println("B. int");
				    		System.out.println("C. String");
				    		System.out.println("D. No return type");			    		
				    		flip--;
				    		lifeline--;
				    		a5=sc.next();
				    		if (a5.equals("D")) { 
				    			System.out.println("Correct");
				    			points+=100;
				    			System.out.println("the point is"+points);				      
				    		}
				    		else{
				    			System.out.println("Sorry, the correct answer is option D.");
				    			System.out.println("the game is terminated");
				    			System.out.println("the point is"+points);
				    			System.exit(0);
				    			} 
			            }
						}
		   		 	else if (lifeline == 1 && pole == 0 && fiffty == 1 && flip==0) {
		   		 		System.out.println("You have only one lifeline(50:50)");
		   		 		System.out.println("5.Which of these keywords is used to define an abstract class in Java?");
		        		System.out.println("B.abstract");
		        		System.out.println("C.class");
		        		fiffty--;
		          	    lifeline--;
		          	    System.out.println("You are used your 50:50 lifeline ");
		          	    a5=sc.next();
		          	   	if (a5.equals("B")) { 
		          	   	      	System.out.println("Correct");
		          	   	      	points+=100;
		          	   	      	System.out.println("the point is"+points);	          	   	      
		          	   	    	}
		          	   	else {
		          	   		System.out.println("Sorry, the correct answer is option B.");
		          	   		System.out.println("the game is terminated");
		          	   		System.out.println("the point is"+points);
		          	   		System.exit(0);
		          	   	}
		   		 }
		   		   else if(lifeline == 1 && pole == 1 && fiffty == 0 && flip==0) {
		   			   System.out.println("According to auidence poll the ratio of answer will be :");
		   			   System.out.println("5.Which of these keywords is used to define an abstract class in Java?");
		   			   System.out.println("A.interface      13%");
		   			   System.out.println("B.abstract     44%");
		   			   System.out.println("C.class        10%");
		   			   System.out.println("D.extends       33%");
		   			   pole--;
		   			   lifeline--;
		   			   a5=sc.next();
		   			   if(a5.equals("B")) {
		   				   	System.out.println("Correct");
		    				points+=100;
		    				System.out.println("the point is"+points);
		   			   }
		   			   else{
		   				   System.out.println("Sorry, the correct answer is option B.");
		   				   System.out.println("the game is terminated");
		   				   System.out.println("the point is"+points);
		   				   System.exit(0);
		   			   }
		   		   }
		   		   else if(lifeline == 1 && pole == 0 && fiffty == 0 && flip==1) {
		   			   System.out.println(" you can flip the question ");
		         		System.out.println("What is the return type of a constructor in Java?");
		         		System.out.println("A. void");
		         		System.out.println("B. int");
		         		System.out.println("C. String");
		         		System.out.println("D. No return type");	         		
		         		flip--;
		         		lifeline--;
		         		a5=sc.next();
		        	if (a5.equals("D")) { 
		        		System.out.println("Correct");
		        		points+=100;
		        		System.out.println("the point is"+points);     
		        	}
		        	else{
							System.out.println("Sorry, the correct answer is option D.");
							System.out.println("the game is terminated");
							System.out.println("the point is"+points);
							System.exit(0);
						}
		   		   }
		   		   else if(lifeline==0) {
		   			   System.out.println("No lifelines left ");
		   			   System.out.println("Select one option : ");
		   			   a5 = sc.next();
		   			   if (a5.equals("B")) { 
		   				   System.out.println("Correct");
		   				   points+=100;
		   				   System.out.println("the point is"+points);		         	      
		   			   }
		   			   else {
		   				   System.out.println("Sorry, the correct answer is option B.");
		   				   System.out.println("the game is terminated");
		   				   System.out.println("the point is"+points);
		   				   System.exit(0);
		   			   }
		   				   if(a5.equals("F"))
		   				   {
		   					   System.exit(0);
		   				   }			 
		   			   }
			    }
			    else {
			    	System.out.println("Sorry, the correct answer is option B.");
			    	System.out.println("the game is terminated");
			    	System.out.println("the point is"+points);
			    	System.exit(0);
		   	    	}
			    System.out.println("======================================================");
			    System.out.println("6.Which of the following is used to prevent inheritance in Java?");
			    System.out.println("A.static");
			    System.out.println("B.const");
			    System.out.println("C.final");
			    System.out.println("D.abstract");
			    System.out.println("E.lifeline are: ");
			    System.out.println("F.quit");
			    String a6=sc.next();
			    if(a6.equals("F"))
			    {
			    	System.exit(0);
			    }
		   	
			    else if (a6.equals("C")) { 
		   	      	System.out.println("Correct");
		   	      	points+=100;
		    		 System.out.println("the point is"+points);	   	      
			    	}
		   	
			    else if(a6.equals("E"))
			    {
			    	if (lifeline == 3 && pole == 1 && fiffty == 1 && flip==1) {
			    		System.out.println("You have 3 Lifelines left");
		   			 	System.out.println("choose 1.50-50                   2.pole                    3.flip");
		   			 	choice=sc.nextInt();
		   			 	if(choice==1)
		   			 	{
		   			 		System.out.println("6.Which of the following is used to prevent inheritance in Java?");
		   	                System.out.println("C.final");
			   	         	System.out.println("D.abstract");	
			   	         	fiffty--;
			   	         	lifeline--;
			   	         	System.out.println("You are used your 50:50 lifeline ");
			   	         	a6=sc.next();
			   	         	if(a6.equals("C")) {
			   	         		System.out.println("Correct");
			   	         		points+=100;
			   	         		System.out.println("the point is"+points);		     
			   	         	}
			   	         	else {
			   	         		System.out.println("Sorry, the correct answer is option C.");
			   	         		System.out.println("the game is terminated");
			   	         		System.out.println("the point is"+points);
			   	         		System.exit(0);
			   	         	}
		   			 	}
		   			 	else if(choice==2)
		   			 	{
		   			 		System.out.println("According to auidence poll the ratio of answer will be :");
		   			 		System.out.println("6.Which of the following is used to prevent inheritance in Java?");
		   	         		System.out.println("A.static      11%");
		   	         		System.out.println("B.const       20%");
		   	         		System.out.println("C.final       45%");
		   	         	    System.out.println("D.abstract    24%");
		   	         	    pole--;
		   	         	    lifeline--;
		   	         	    a6=sc.next();
		   	         	    if(a6.equals("C")) {
		   	         	    	System.out.println("Correct");
		   	         	    	points+=100;
		   	         	    	System.out.println("the point is"+points);
		   	         	    }
		   	        				else{
		   	        					System.out.println("Sorry, the correct answer is option C.");
		   	        					System.out.println("the game is terminated");
		   	        					System.out.println("the point is"+points);
		   	        					System.exit(0);
		   	        				}
		   	        			}
		   	             	else if(choice==3) {
		   	             		System.out.println(" you can flip the question ");
		   	             		System.out.println("What is the return type of a constructor in Java?");
		   	             		System.out.println("A. void");
		   	             		System.out.println("B. int");
		   	             		System.out.println("C. String");
		   	             		System.out.println("D. No return type");
		   	             		flip--;
		   	             		lifeline--;
		   	             		a6=sc.next();
		   	             		if (a6.equals("D")) { 
		   	             			System.out.println("Correct");
		   	             			points+=100;
		   	             			System.out.println("the point is"+points);		          	      
		   	             		}
		   	             		else{
		   	             			System.out.println("Sorry, the correct answer is option D.");
		   	             			System.out.println("the game is terminated");
		   	             			System.out.println("the point is"+points);
		   	             			System.exit(0);
		   	             		}
		   	             	}
		   					}
			    	else if(lifeline ==2 && pole == 1 && fiffty == 1 && flip ==0) {
			    		System.out.println("You have only two lifeline fiffty and pole");
			    		System.out.println("choose 1.50-50                   2.pole");
			            choice=sc.nextInt();
			            if(choice==1) {
			            	System.out.println("6.Which of the following is used to prevent inheritance in Java?");
			            	System.out.println("C.final");
			            	System.out.println("D.abstract");
			            	fiffty--;
			            	lifeline--;
			            	System.out.println("You are used your 50:50 lifeline ");
			            	a6=sc.next();
			            	if(a6.equals("C")) {
			            		System.out.println("Correct");
			            		points+=100;
			            		System.out.println("the point is"+points);
			            	}
			            	else {
			            		System.out.println("Sorry, the correct answer is option C.");
			            		System.out.println("the game is terminated");
			            		System.out.println("the point is"+points);
			            		System.exit(0);
			            	}
			            }
			            if(choice==2) {
			            	System.out.println("According to auidence poll the ratio of answer will be :");
			            	System.out.println("6.Which of the following is used to prevent inheritance in Java?");
			            	System.out.println("A.static      11%");
			            	System.out.println("B.const       20%");
			            	System.out.println("C.final       45%");
			            	System.out.println("D.abstract    24%");
			            	pole--;
			            	lifeline--;
			            	a6=sc.next();
			            	if(a6.equals("C")) {
			            		System.out.println("Correct");
			            		points+=100;
			            		System.out.println("the point is"+points);
			            	}
			            	else{
			            		System.out.println("Sorry, the correct answer is option C.");
			            		System.out.println("the game is terminated");
			            		System.out.println("the point is"+points);
			            		System.exit(0);
			            	}
			            }
			    	}
			    	else if(lifeline ==2 && pole == 0 && fiffty == 1 && flip ==1) {
			    		System.out.println("You have 2 Lifelines left fiffty and flip");
			    		System.out.println("choose 1.50-50                      3.flip");
			    		choice=sc.nextInt();
			    		if(choice==1) {
			    			System.out.println("6.Which of the following is used to prevent inheritance in Java?");
			    			System.out.println("C.final");
			    			System.out.println("D.abstract");
			    			fiffty--;
			    			lifeline--;
			    			System.out.println("You are used your 50:50 lifeline ");
			    			a6=sc.next();
			    			if(a6.equals("C")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);	  
			    			}
			    			else {
			    				System.out.println("Sorry, the correct answer is option C.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    		if(choice==3) {
			    			System.out.println(" you can flip the question ");
			    			System.out.println("What is the return type of a constructor in Java?");
			    			System.out.println("A. void");
			    			System.out.println("B. int");
			    			System.out.println("C. String");
			    			System.out.println("D. No return type");	    		
			    			flip--;
			    			lifeline--;
			    			a6=sc.next();
			    			if (a6.equals("D")) { 
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);		      
			    			}
			    			else{
			    				System.out.println("Sorry, the correct answer is option D.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			} 
			    		}
			    	}
			    	else if(lifeline ==2 && pole == 1 && fiffty == 0 && flip ==1) {
			    		System.out.println("You have 2 Lifelines left pole and flip");
			    		System.out.println("choose 2.pole                      3.flip");
			    		choice=sc.nextInt();
			    		if(choice==2) {
			    			System.out.println("According to auidence poll the ratio of answer will be :");
			    			System.out.println("6.Which of the following is used to prevent inheritance in Java?");
			    			System.out.println("A.static      11%");
			    			System.out.println("B.const       20%");
			    			System.out.println("C.final       45%");
			    			System.out.println("D.abstract    24%");
			    			pole--;
			    			lifeline--;
			    			a6=sc.next();
			    			if(a6.equals("C")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    			}
			    			else{
			    				System.out.println("Sorry, the correct answer is option C.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    		if(choice==3) {						
			    			System.out.println(" you can flip the question ");
			    			System.out.println("What is the return type of a constructor in Java?");
				    		System.out.println("A. void");
				    		System.out.println("B. int");
				    		System.out.println("C. String");
				    		System.out.println("D. No return type");				    		
				    		flip--;
				    		lifeline--;
				    		a6=sc.next();
				    		if (a6.equals("D")) { 
				    			System.out.println("Correct");
				    			points+=100;
				    			System.out.println("the point is"+points);				      
				    		}
				    		else{
				    			System.out.println("Sorry, the correct answer is option D.");
				    			System.out.println("the game is terminated");
				    			System.out.println("the point is"+points);
				    			System.exit(0);
				    		} 
			    		}
			    	}
			    	else if (lifeline == 1 && pole == 0 && fiffty == 1 && flip==0) {
			    		System.out.println("You have only one lifeline(50:50)");
			    		System.out.println("6.Which of the following is used to prevent inheritance in Java?");
			    		System.out.println("C.final");
		         		System.out.println("D.abstract");
		        		fiffty--;
		          	    lifeline--;
		   		    	 System.out.println("You are used your 50:50 lifeline ");
		   		    	 a6=sc.next();
		   		    	 if (a6.equals("C")) { 
		   		    		 System.out.println("Correct");
		   		    		 points+=100;
		   		    		 System.out.println("the point is"+points);	          	   	      
		   		    	 }
		   		    	 else {
		   		    		 System.out.println("Sorry, the correct answer is option C.");
		   		    		 System.out.println("the game is terminated");
		   		    		 System.out.println("the point is"+points);
		   		    		 System.exit(0);
		   		    	 }		        		
			    	}
			    	else if(lifeline == 1 && pole == 1 && fiffty == 0 && flip==0) {
			    		System.out.println("According to auidence poll the ratio of answer will be :");
			    		System.out.println("6.Which of the following is used to prevent inheritance in Java?");
			    		System.out.println("A.static      11%");
			    		System.out.println("B.const       20%");
			    		System.out.println("C.final       45%");
			    		System.out.println("D.abstract    24%");
			    		pole--;
			    		lifeline--;
		    			a6=sc.next();
		    			if(a6.equals("C")) {
		    				System.out.println("Correct");
		    				points+=100;
		    				System.out.println("the point is"+points);
		    				}
		    			else{
		    				System.out.println("Sorry, the correct answer is option C.");
		    			    System.out.println("the game is terminated");
		    			    System.out.println("the point is"+points);
		    			    System.exit(0);
		    				}
			    	}
			    	else if(lifeline == 1 && pole == 0 && fiffty == 0 && flip==1) {
			    		System.out.println(" you can flip the question ");
			    		System.out.println("What is the return type of a constructor in Java?");
		         		System.out.println("A. void");
		         		System.out.println("B. int");
		         		System.out.println("C. String");
		         		System.out.println("D. No return type");		         		
		         		flip--;
		         		lifeline--;
		         		a6=sc.next();
		         		if (a6.equals("D")) { 
		         			System.out.println("Correct");
		         			points+=100;
		         			System.out.println("the point is"+points); 
		         		}
		         		else{
		         			System.out.println("Sorry, the correct answer is option D.");
		         			System.out.println("the game is terminated");
		         			System.out.println("the point is"+points);
		         			System.exit(0);
		         		}
			    	}
			    	else if(lifeline==0) {
			    		System.out.println("No lifelines left ");
			    		System.out.println("Select one option : ");
			    		a6 = sc.next();
			    		if (a6.equals("C")) { 
			    			System.out.println("Correct");
			    			points+=100;
			    			System.out.println("the point is"+points);		         	      
		         	    	}	
			    		else {
			    			System.out.println("Sorry, the correct answer is option C.");
			    			System.out.println("the game is terminated");
			    			System.out.println("the point is"+points);
			    			System.exit(0);
			    		}
			    			if(a6.equals("F"))
			    			{
			    				System.exit(0);
			    			}				 
			    	}
			    }
			    else {
			    	System.out.println("Sorry, the correct answer is option C.");
			    	System.out.println("the game is terminated");
			    	System.out.println("the point is"+points);
			    	System.exit(0);
		   	    	}
			    System.out.println("======================================================");
			    System.out.println("7.Which of the following is a reserved keyword in Java?");
			    System.out.println("A.const");
			    System.out.println("B.goto");
			    System.out.println("C.break");
			    System.out.println("D.All of the above");
			    System.out.println("E.lifeline are: ");
			    System.out.println("F.quit");
			    String a7=sc.next();
			    if(a7.equals("F"))
			    {
			    	System.exit(0);
			    }
		   	
			    else if (a7.equals("D")) { 
			    	System.out.println("Correct");
			    	points+=100;
			    	System.out.println("the point is"+points);      
		   	    	}
		   	
			    else if(a7.equals("E"))
			    {
			    	if (lifeline == 3 && pole == 1 && fiffty == 1 && flip==1) {
			    		System.out.println("You have 3 Lifelines left");
			    		System.out.println("choose 1.50-50                   2.pole                    3.flip");
			    		choice=sc.nextInt();
			    		if(choice==1)
			    		{
			    			System.out.println("7.Which of the following is a reserved keyword in Java?");
			    			System.out.println("A.const");
			    			System.out.println("D.All of the above");      		
			    			fiffty--;
			    			lifeline--;
			    			System.out.println("You are used your 50:50 lifeline ");
			    			a7=sc.next();
			    			if(a7.equals("D")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);	     
			    			}
			    			else {
			    				System.out.println("Sorry, the correct answer is option D.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
		   	                	}
			    		else if(choice==2)
		   	        			{
		   	                		System.out.println("According to auidence poll the ratio of answer will be :");
		   	                		System.out.println("7.Which of the following is a reserved keyword in Java?");
		   	                		System.out.println("A.const                5%");
		   	                		System.out.println("B.goto                30%");
		   	                		System.out.println("C.break               20%");
		   	                		System.out.println("D.All of the above    45%");
		   	                		pole--;
		   	                		lifeline--;
		   	                		a7=sc.next();
		   	                		if(a7.equals("D")) {
		   	                			System.out.println("Correct");
		   	                			points+=100;
		   	                			System.out.println("the point is"+points);
		   	                		}
		   	                		else{
		   	                			System.out.println("Sorry, the correct answer is option D.");
		   	                			System.out.println("the game is terminated");
		   	                			System.out.println("the point is"+points);
		   	                			System.exit(0);
		   	                		}
		   	        			}
		   	             	else if(choice==3) {
		   	             		System.out.println(" you can flip the question ");
		   	             		System.out.println("What is the return type of a constructor in Java?");
		   	             		System.out.println("A. void");
		   	             		System.out.println("B. int");
		   	             		System.out.println("C. String");
		   	             		System.out.println("D. No return type");
		   	             		flip--;
		   	             		lifeline--;
		   	             		a7=sc.next();
		   	             		if (a7.equals("D")) { 
		   	             			System.out.println("Correct");
		   	             			points+=100;
		   	             			System.out.println("the point is"+points);	          	      
		   	             		}
		   	             		else{
		   	             			System.out.println("Sorry, the correct answer is option D.");
		   	             			System.out.println("the game is terminated");
		   	             			System.out.println("the point is"+points);
		   	             			System.exit(0);
		   	             		}
		   	             	}
		   					}
			    	else if(lifeline ==2 && pole == 1 && fiffty == 1 && flip ==0) {
			    		System.out.println("You have only two lifeline fiffty and pole");
			    		System.out.println("choose 1.50-50                   2.pole");
			    		choice=sc.nextInt();
			    		if(choice==1) {
			    			System.out.println("7.Which of the following is a reserved keyword in Java?");
			    			System.out.println("A.const");
			    			System.out.println("D.All of the above");
			    			fiffty--;
			    			lifeline--;
			    			System.out.println("You are used your 50:50 lifeline ");
			    			a7=sc.next();
			    			if(a7.equals("D")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);		     
			    			}
			    			else {
			    				System.out.println("Sorry, the correct answer is option D.");
			    				System.out.println("the game is terminated");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    		if(choice==2) {
			    			System.out.println("According to auidence poll the ratio of answer will be :");
			    			System.out.println("7.Which of the following is a reserved keyword in Java?");
			    			System.out.println("A.const                5%");
			    			System.out.println("B.goto                30%");
			    			System.out.println("C.break               20%");
			    			System.out.println("D.All of the above    45%");
			    			pole--;
			    			lifeline--;
			    			a7=sc.next();
			    			if(a7.equals("D")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    			}
			    			else{
			    				System.out.println("Sorry, the correct answer is option D.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    	}
			    	else if(lifeline ==2 && pole == 0 && fiffty == 1 && flip ==1) {
			    		System.out.println("You have 2 Lifelines left fiffty and flip");
			    		System.out.println("choose 1.50-50                      3.flip");
			    		choice=sc.nextInt();
			    		if(choice==1) {
			    			System.out.println("7.Which of the following is a reserved keyword in Java?");
			    			System.out.println("A.const");
			    			System.out.println("D.All of the above");
			    			fiffty--;
			    			lifeline--;
			    			System.out.println("You are used your 50:50 lifeline ");
			    			a7=sc.next();
			    			if(a7.equals("D")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);	  
			    			}
			    			else {
			    				System.out.println("Sorry, the correct answer is option D.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    		if(choice==3) {
			    			System.out.println(" you can flip the question ");
			    			System.out.println("What is the return type of a constructor in Java?");
			    			System.out.println("A. void");
			    			System.out.println("B. int");
			    			System.out.println("C. String");
			    			System.out.println("D. No return type");    		
			    			flip--;
			    			lifeline--;
			    			a7=sc.next();
			    			if (a7.equals("D")) { 
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);	      
			    			}
			    			else{
			    				System.out.println("Sorry, the correct answer is option D.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			} 
			    		}
			    	}
			    	else if(lifeline ==2 && pole == 1 && fiffty == 0 && flip ==1) {
			    		System.out.println("You have 2 Lifelines left pole and flip");
			    		System.out.println("choose 2.pole                      3.flip");
			    		choice=sc.nextInt();
			    		if(choice==2) {
			    			System.out.println("According to auidence poll the ratio of answer will be :");
			    			System.out.println("7.Which of the following is a reserved keyword in Java?");
			    			System.out.println("A.const                5%");
			    			System.out.println("B.goto                30%");
			    			System.out.println("C.break               20%");
			    			System.out.println("D.All of the above    45%");
			    			pole--;
			    			lifeline--;
			    			a7=sc.next();
			    			if(a7.equals("D")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    			}
			    			else{
			    				System.out.println("Sorry, the correct answer is option D.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    		if(choice==3) {				
			    			System.out.println(" you can flip the question ");
			    			System.out.println("What is the return type of a constructor in Java?");
				    		System.out.println("A. void");
				    		System.out.println("B. int");
				    		System.out.println("C. String");
				    		System.out.println("D. No return type");				    		
				    		flip--;
				    		lifeline--;
				    		a7=sc.next();
				    		if (a7.equals("D")) { 
				    			System.out.println("Correct");
				    			points+=100;
				    			System.out.println("the point is"+points);				      
				    		}
				    		else{
				    			System.out.println("Sorry, the correct answer is option D.");
				    			System.out.println("the game is terminated");
				    			System.out.println("the point is"+points);
				    			System.exit(0);
				    		} 
			    		}
			    	}
			    	else if (lifeline == 1 && pole == 0 && fiffty == 1 && flip==0) {
			    		System.out.println("You have only one lifeline(50:50)");
			    		System.out.println("7.Which of the following is a reserved keyword in Java?");
			    		System.out.println("A.const");
			    		System.out.println("D.All of the above");
		        		fiffty--;
		          	    lifeline--;
		          	    System.out.println("You are used your 50:50 lifeline ");
		          	    a7=sc.next();
		          	    if (a7.equals("D")) { 
		          	    	System.out.println("Correct");
		          	    	points+=100;
		          	    	System.out.println("the point is"+points);	          	   	      
		          	    }
		          	    else {
		          	    	System.out.println("Sorry, the correct answer is option D.");
		          	    	System.out.println("the game is terminated");
		          	    	System.out.println("the point is"+points);
		          	    	System.exit(0);
		          	    }		
			    	}
			    	else if(lifeline == 1 && pole == 1 && fiffty == 0 && flip==0) {
			    		System.out.println("According to auidence poll the ratio of answer will be :");
			    		System.out.println("7.Which of the following is a reserved keyword in Java?");
			    		System.out.println("A.const                5%");
			    		System.out.println("B.goto                30%");
			    		System.out.println("C.break               20%");
			    		System.out.println("D.All of the above    45%");
		    			pole--;
		    			lifeline--;
		    			a7=sc.next();
		    			if(a7.equals("D")) {
		    				System.out.println("Correct");
		    				points+=100;
		    				System.out.println("the point is"+points);
		    			}
		    			else{
		    				System.out.println("Sorry, the correct answer is option D.");
		    				System.out.println("the game is terminated");
		    				System.out.println("the point is"+points);
		    				System.exit(0);
		    			}
			    	}
			    	else if(lifeline == 1 && pole == 0 && fiffty == 0 && flip==1) {
			    		System.out.println(" you can flip the question ");
			    		System.out.println("What is the return type of a constructor in Java?");
		         		System.out.println("A. void");
		         		System.out.println("B. int");
		         		System.out.println("C. String");
		         		System.out.println("D. No return type");	
		         		flip--;
		         		lifeline--;
		         		a7=sc.next();
		         		if (a7.equals("D")) { 
		         			System.out.println("Correct");
		         			points+=100;
		         			System.out.println("the point is"+points);
		         		}
		         		else{
		         			System.out.println("Sorry, the correct answer is option D.");
		         			System.out.println("the game is terminated");
		         			System.out.println("the point is"+points);
		         			System.exit(0);
		         		}
			    	}	
			    	else if(lifeline==0) {
			    		System.out.println("No lifelines left ");
			    		System.out.println("Select one option : ");
			    		a7 = sc.next();
			    		if (a7.equals("D")) { 
			    			System.out.println("Correct");
			    			points+=100;
			    			System.out.println("the point is"+points);
			    		}
			    		else {
			    			System.out.println("Sorry, the correct answer is option D.");
			    			System.out.println("the game is terminated");
			    			System.out.println("the point is"+points);
			    			System.exit(0);
			    		}
			    			if(a7.equals("F"))
			    			{
			    				System.exit(0);
			    			}
			    	}
			    }
			    else {
			    	System.out.println("Sorry, the correct answer is option D.");
			    	System.out.println("the game is terminated");
			    	System.out.println("the point is"+points);
			    	System.exit(0);
			    }
			    System.out.println("======================================================");
			    System.out.println("8. Which of the following is used to create an instance of a class in Java?");
			    System.out.println("A.new");
			    System.out.println("B.static");
			    System.out.println("C.extends");
			    System.out.println("D.super");
			    System.out.println("E.lifeline are: ");
			    System.out.println("F.quit");
			    String a8=sc.next();
			    if(a8.equals("F"))
			    {
			    	System.exit(0);
			    }
		   	
			    else if (a8.equals("A")) { 
			    	System.out.println("Correct");
			    	points+=100;
			    	System.out.println("the point is"+points);
		   	    }
		   	
			    else if(a8.equals("E"))
			    {
			    	if (lifeline == 3 && pole == 1 && fiffty == 1 && flip==1) {
			    		System.out.println("You have 3 Lifelines left");
			    		System.out.println("choose 1.50-50                   2.pole                    3.flip");
			    		choice=sc.nextInt();
			    		if(choice==1)
			    		{
			    			System.out.println("8. Which of the following is used to create an instance of a class in Java?");
		   	         		System.out.println("A.new");
		   	         		System.out.println("B.static");
		   	         		fiffty--;
		   	         		lifeline--;
		   	         		System.out.println("You are used your 50:50 lifeline ");
		   	         		a8=sc.next();
		   	         		if(a8.equals("A")) {
		   	         			System.out.println("Correct");
		   	         			points+=100;
		   	         			System.out.println("the point is"+points);
		   	         		}
		   	         		else {
		   	         			System.out.println("Sorry, the correct answer is option A.");
		   	         			System.out.println("the game is terminated");
		   	         			System.out.println("the point is"+points);
		   	         			System.exit(0);
		   	         		}
			    		}
			    		else if(choice==2)
			    		{
			    			System.out.println("According to auidence poll the ratio of answer will be :");
			    			System.out.println("8. Which of the following is used to create an instance of a class in Java?");
		   	         		System.out.println("A.new         50%");
		   	         		System.out.println("B.static      10%");
		   	         		System.out.println("C.extends     20%");
		   	         	    System.out.println("D.super       20%");
		   	         	    pole--;
		   	         	    lifeline--;
		   	         	    a8=sc.next();
		   	         	    if(a8.equals("A")) {
		   	         	    	System.out.println("Correct");
		   	         	    	points+=100;
		   	         	    	System.out.println("the point is"+points);
		   	         	    }
		   	         	    else{
		   	         	    	System.out.println("Sorry, the correct answer is option A.");
		   	         	    	System.out.println("the game is terminated");
		   	         	    	System.out.println("the point is"+points);
		   	         	    	System.exit(0);
		   	         	    }
			    		}
			    		else if(choice==3) {
			                	System.out.println(" you can flip the question ");
			                	System.out.println("What is the return type of a constructor in Java?");
			                	System.out.println("A. void");
			                	System.out.println("B. int");
			                	System.out.println("C. String");
			                	System.out.println("D. No return type");
			                	flip--;
			                	lifeline--;
			                	a8=sc.next();
			                	if (a8.equals("D")) { 
			                		System.out.println("Correct");
			                		points+=100;
			                		System.out.println("the point is"+points);
			                	}
			                	else{
			                		System.out.println("Sorry, the correct answer is option D.");
			                		System.out.println("the game is terminated");
			                		System.out.println("the point is"+points);
			                		System.exit(0);
			                	}
			    			}
			    	}
			    	else if(lifeline ==2 && pole == 1 && fiffty == 1 && flip ==0) {
			    		System.out.println("You have only two lifeline fiffty and pole");
			    		System.out.println("choose 1.50-50                   2.pole");
			    		choice=sc.nextInt();
			    		if(choice==1) {
			    			System.out.println("8. Which of the following is used to create an instance of a class in Java?");
			    			System.out.println("A.new");
			    			System.out.println("B.static");
			    			fiffty--;
			    			lifeline--;
			    			System.out.println("You are used your 50:50 lifeline ");
			    			a8=sc.next();
			    			if(a8.equals("A")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    			}
			    			else {
			    				System.out.println("Sorry, the correct answer is option D.");
			    				System.out.println("the game is terminated");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    		if(choice==2) {
			    			System.out.println("According to auidence poll the ratio of answer will be :");
			    			System.out.println("8. Which of the following is used to create an instance of a class in Java?");
			    			System.out.println("A.new         50%");
			    			System.out.println("B.static      10%");
			    			System.out.println("C.extends     20%");
			    			System.out.println("D.super       20%");
			    			pole--;
			    			lifeline--;
			    			a8=sc.next();
			    			if(a8.equals("A")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    				}
			    			else{
			    				System.out.println("Sorry, the correct answer is option A.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    	}
			    	else if(lifeline ==2 && pole == 0 && fiffty == 1 && flip ==1) {
			    		System.out.println("You have 2 Lifelines left fiffty and flip");
			    		System.out.println("choose 1.50-50                      3.flip");
			    		choice=sc.nextInt();
			    		if(choice==1) {
			    			System.out.println("8. Which of the following is used to create an instance of a class in Java?");
			    			System.out.println("A.new");
			    			System.out.println("B.static");
			    			fiffty--;
			    			lifeline--;
			    			System.out.println("You are used your 50:50 lifeline ");
			    			a8=sc.next();
			    			if(a8.equals("A")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    			}
			    			else {
			    				System.out.println("Sorry, the correct answer is option A.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    		if(choice==3) {
			    			System.out.println(" you can flip the question ");
			    			System.out.println("What is the return type of a constructor in Java?");
			    			System.out.println("A. void");
			    			System.out.println("B. int");
			    			System.out.println("C. String");
			    			System.out.println("D. No return type");
			    			flip--;
			    			lifeline--;
			    			a8=sc.next();
			    			if (a8.equals("D")) { 
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    			}
			    			else{
			    				System.out.println("Sorry, the correct answer is option D.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			} 
			    		}
			    	}
			    	else if(lifeline ==2 && pole == 1 && fiffty == 0 && flip ==1) {
			    		System.out.println("You have 2 Lifelines left pole and flip");
			    		System.out.println("choose 2.pole                      3.flip");
			    		choice=sc.nextInt();
			    		if(choice==2) {
			    			System.out.println("According to auidence poll the ratio of answer will be :");
			    			System.out.println("8. Which of the following is used to create an instance of a class in Java?");
			    			System.out.println("A.new         50%");
			    			System.out.println("B.static      10%");
			    			System.out.println("C.extends     20%");
			    			System.out.println("D.super       20%");
			    			pole--;
			    			lifeline--;
			    			a8=sc.next();
			    			if(a8.equals("A")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    			}
			    			else{
			    				System.out.println("Sorry, the correct answer is option A.");
			    				System.out.println("the game is terminated");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    		if(choice==3) {
			    			System.out.println(" you can flip the question ");
			    			System.out.println("What is the return type of a constructor in Java?");
				    		System.out.println("A. void");
				    		System.out.println("B. int");
				    		System.out.println("C. String");
				    		System.out.println("D. No return type");
				    		flip--;
				    		lifeline--;
				    		a8=sc.next();
				    		if (a8.equals("D")) { 
				    			System.out.println("Correct");
				    			points+=100;
				    			System.out.println("the point is"+points);
				    		}
				    		else{
				    			System.out.println("Sorry, the correct answer is option D.");
				    			System.out.println("the game is terminated");
				    			System.out.println("the point is"+points);
				    			System.exit(0);
				    		} 
			    		}
						}
			    	else if (lifeline == 1 && pole == 0 && fiffty == 1 && flip==0) {
			    		System.out.println("You have only one lifeline(50:50)");
			    		System.out.println("8. Which of the following is used to create an instance of a class in Java?");
			    		System.out.println("A.new");
			    		System.out.println("B.static");
		        		fiffty--;
		          	    lifeline--;
		          	    System.out.println("You are used your 50:50 lifeline ");
		          	    a8=sc.next();
		          	    if (a8.equals("A")) { 
		          	    	System.out.println("Correct");
		          	    	points+=100;
		          	    	System.out.println("the point is"+points);
		          	    }
		          	    else {
		          	    	System.out.println("Sorry, the correct answer is option A.");
		          	    	System.out.println("the game is terminated");
		          	    	System.out.println("the point is"+points);
		          	    	System.exit(0);
		          	    }
			    	}
		   		 	else if(lifeline == 1 && pole == 1 && fiffty == 0 && flip==0) {
		   		 		System.out.println("According to auidence poll the ratio of answer will be :");
		   		 		System.out.println("8. Which of the following is used to create an instance of a class in Java?");
		   		 		System.out.println("A.new         50%");
		   		 		System.out.println("B.static      10%");
		   		 		System.out.println("C.extends     20%");
		   		 		System.out.println("D.super       20%");
		    			pole--;
		    			lifeline--;
		    			a8=sc.next();
		    			if(a8.equals("A")) {
		    				System.out.println("Correct");
		    				points+=100;
		    				System.out.println("the point is"+points);
		    				}
		    				else{
		    					System.out.println("Sorry, the correct answer is option A.");
		    					System.out.println("the game is terminated");
		    					System.out.println("the point is"+points);
		    					System.exit(0);
		    				}
		   		 	}
		   		 	else if(lifeline == 1 && pole == 0 && fiffty == 0 && flip==1) {
		   		 		System.out.println(" you can flip the question ");
		   		 		System.out.println("What is the return type of a constructor in Java?");
		         		System.out.println("A. void");
		         		System.out.println("B. int");
		         		System.out.println("C. String");
		         		System.out.println("D. No return type");
		           		flip--;
		         		lifeline--;
		         		a8=sc.next();
		         		if (a8.equals("D")) { 
		         			System.out.println("Correct");
		         			points+=100;
		         			System.out.println("the point is"+points);
		         		}
		         		else{
		         			System.out.println("Sorry, the correct answer is option D.");
		         			System.out.println("the game is terminated");
		         			System.out.println("the point is"+points);
		         			System.exit(0);
		         		}
		   		 	}
		   		 	else if(lifeline==0) {
		   		 		System.out.println("No lifelines left ");
		   		 		System.out.println("Select one option : ");
		   		 		a8 = sc.next();
		   		 		if (a8.equals("A")) { 
		   		 			System.out.println("Correct");
		   		 			points+=100;
		   		 			System.out.println("the point is"+points);
		   		 		}
		   		 		else {
		   		 			System.out.println("Sorry, the correct answer is option A.");
		   		 			System.out.println("the game is terminated");
		   		 			System.out.println("the point is"+points);
		   		 			System.exit(0);
		   		 		}	
		   		 		if(a8.equals("F"))
		   		 		{
		   		 			System.exit(0);
		   		 		}
		   		 	}
			    }
			    else {
			    	System.out.println("Sorry, the correct answer is option A.");
			    	System.out.println("the game is terminated");
			    	System.out.println("the point is"+points);
			    	System.exit(0);
			    }
		    
			    System.out.println("======================================================");
			    System.out.println("9. What is the default value of a boolean variable in Java?");
			    System.out.println("A.true");
			    System.out.println("B.false");
			    System.out.println("C.0");
			    System.out.println("D.1");
			    System.out.println("E.lifeline are: ");
			    System.out.println("F.quit");
			    String a9=sc.next();
			    if(a9.equals("F"))
			    {
			    	System.exit(0);
			    }
		   	
			    else if (a9.equals("B")) { 
			    	System.out.println("Correct");
			    	points+=100;
			    	System.out.println("the point is"+points);
			    }
		   	
			    else if(a9.equals("E"))
			    {
			    	if (lifeline == 3 && pole == 1 && fiffty == 1 && flip==1) {
			    		System.out.println("You have 3 Lifelines left");
			    		System.out.println("choose 1.50-50                   2.pole                    3.flip");
			    		choice=sc.nextInt();
			    		if(choice==1)
			    		{
			    			System.out.println("9. What is the default value of a boolean variable in Java?");
		   	         		System.out.println("B.false");
		   	         		System.out.println("C.0");
		   	         		fiffty--;
		   	         		lifeline--;
		   	         		System.out.println("You are used your 50:50 lifeline ");
		   	         		a9=sc.next();
		   	         		if(a9.equals("B")) {
		   	         			System.out.println("Correct");
		   	         			points+=100;
		   	         			System.out.println("the point is"+points);
		   	         		}
		   	         		else {
		   	         			System.out.println("Sorry, the correct answer is option B.");
		   	         			System.out.println("the game is terminated");
		   	         			System.out.println("the point is"+points);
		   	         			System.exit(0);
		   	         		}
			    		}
			    		else if(choice==2)
			    		{
			    			System.out.println("According to auidence poll the ratio of answer will be :");
			    			System.out.println("9. What is the default value of a boolean variable in Java?");
		   	         		System.out.println("A.true      15%");
		   	         		System.out.println("B.false     50%");
		   	         		System.out.println("C.0         30%");
		   	         	    System.out.println("D.1          5%");
		   	         	    pole--;
		   	         	    lifeline--;
		   	         	    a9=sc.next();
		   	         	    if(a9.equals("B")) {
		   	         	    	System.out.println("Correct");
		   	         	    	points+=100;
		   	         	    	System.out.println("the point is"+points);
		   	         	    }
		   	         	    else{
		   	         	    	System.out.println("Sorry, the correct answer is option B.");
		   	         	    	System.out.println("the game is terminated");
		   	         	    	System.out.println("the point is"+points);
		   	         	    	System.exit(0);
		   	         	    }
			    		}
			    		else if(choice==3) {
			    			System.out.println(" you can flip the question ");
			    			System.out.println("What is the return type of a constructor in Java?");
			    			System.out.println("A. void");
			    			System.out.println("B. int");
			    			System.out.println("C. String");
			    			System.out.println("D. No return type");
			    			flip--;
			    			lifeline--;
			    			a9=sc.next();
			    			if (a9.equals("D")) { 
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    			}
			    			else{
			    				System.out.println("Sorry, the correct answer is option D.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
		   						}
			    	else if(lifeline ==2 && pole == 1 && fiffty == 1 && flip ==0) {
			    		System.out.println("You have only two lifeline fiffty and pole");
			    		System.out.println("choose 1.50-50                   2.pole");
			    		choice=sc.nextInt();
			    		if(choice==1) {
			    			System.out.println("9. What is the default value of a boolean variable in Java?");
			    			System.out.println("B.false");
			    			System.out.println("C.0");
			    			fiffty--;
			    			lifeline--;
			    			System.out.println("You are used your 50:50 lifeline ");
			    			a9=sc.next();
			    			if(a9.equals("B")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    			}
			    			else {
			    				System.out.println("Sorry, the correct answer is option B.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    		if(choice==2) {
			    			System.out.println("According to auidence poll the ratio of answer will be :");
			    			System.out.println("9. What is the default value of a boolean variable in Java?");
			    			System.out.println("A.true      15%");
			    			System.out.println("B.false     50%");
			    			System.out.println("C.0         30%");
			    			System.out.println("D.1          5%");
			    			pole--;
			    			lifeline--;
			    			a9=sc.next();
			    			if(a9.equals("B")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    			}
			    			else{
			    				System.out.println("Sorry, the correct answer is option B.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    	}
			    	else if(lifeline ==2 && pole == 0 && fiffty == 1 && flip ==1) {
			    		System.out.println("You have 2 Lifelines left fiffty and flip");
			    		System.out.println("choose 1.50-50                      3.flip");
			    		choice=sc.nextInt();
			    		if(choice==1) {
			    			System.out.println("9. What is the default value of a boolean variable in Java?");
			    			System.out.println("B.false");
			    			System.out.println("C.0");
			    			fiffty--;
			    			lifeline--;
			    			System.out.println("You are used your 50:50 lifeline ");
			    			a9=sc.next();
			    			if(a9.equals("B")) {
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    			}
			    			else {
			    				System.out.println("Sorry, the correct answer is option B.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			}
			    		}
			    		if(choice==3) {
			    			System.out.println(" you can flip the question ");
			    			System.out.println("What is the return type of a constructor in Java?");
			    			System.out.println("A. void");
			    			System.out.println("B. int");
			    			System.out.println("C. String");
			    			System.out.println("D. No return type");
			    			flip--;
			    			lifeline--;
			    			a9=sc.next();
			    			if (a9.equals("D")) { 
			    				System.out.println("Correct");
			    				points+=100;
			    				System.out.println("the point is"+points);
			    			}
			    			else{
			    				System.out.println("Sorry, the correct answer is option D.");
			    				System.out.println("the game is terminated");
			    				System.out.println("the point is"+points);
			    				System.exit(0);
			    			} 
			    		}
			    	}
			    	else if(lifeline ==2 && pole == 1 && fiffty == 0 && flip ==1) {
			    		System.out.println("You have 2 Lifelines left pole and flip");
			    		System.out.println("choose 2.pole                      3.flip");
			            choice=sc.nextInt();
			            if(choice==2) {
			            	System.out.println("According to auidence poll the ratio of answer will be :");
			            	System.out.println("9. What is the default value of a boolean variable in Java?");
			            	System.out.println("A.true      15%");
			            	System.out.println("B.false     50%");
			            	System.out.println("C.0         30%");
			            	System.out.println("D.1          5%");
			            	pole--;
			            	lifeline--;
			            	a9=sc.next();
			            	if(a9.equals("B")) {
			            		System.out.println("Correct");
			            		points+=100;
			            		System.out.println("the point is"+points);
			            	}
			            	else{
			            		System.out.println("Sorry, the correct answer is option B.");
			            		System.out.println("the game is terminated");
			            		System.out.println("the point is"+points);
			            		System.exit(0);
			            		}
			            }
			            if(choice==3) {
			            	System.out.println(" you can flip the question ");
			            	System.out.println("What is the return type of a constructor in Java?");
				    		System.out.println("A. void");
				    		System.out.println("B. int");
				    		System.out.println("C. String");
				    		System.out.println("D. No return type");
				    		flip--;
				    		lifeline--;
				    		a9=sc.next();
				    		if (a9.equals("D")) { 
				    			System.out.println("Correct");
				    			points+=100;
				    			System.out.println("the point is"+points);
				    		}
				    		else{
				    			System.out.println("Sorry, the correct answer is option D.");
				    			System.out.println("the game is terminated");
				    			System.out.println("the point is"+points);
				    			System.exit(0);
				    		} 
			            }
			    	}
		   		 	else if (lifeline == 1 && pole == 0 && fiffty == 1 && flip==0) {
		   		 		System.out.println("You have only one lifeline(50:50)");
		   		 		System.out.println("9. What is the default value of a boolean variable in Java?");
		   		 		System.out.println("B.false");
		   		 		System.out.println("C.0");
		        		fiffty--;
		          	    lifeline--;
		          	    System.out.println("You are used your 50:50 lifeline ");
		          	    a9=sc.next();
		          	    if (a9.equals("B")) { 
		          	    	System.out.println("Correct");
		          	    	points+=100;
		          	    	System.out.println("the point is"+points);
		          	    }
		          	    else {
		          	    	System.out.println("Sorry, the correct answer is option B.");
		          	    	System.out.println("the game is terminated");
		          	    	System.out.println("the point is"+points);
		          	    	System.exit(0);
		          	    }
		   		 	}
		   		 	else if(lifeline == 1 && pole == 1 && fiffty == 0 && flip==0) {
		   		 		System.out.println("According to auidence poll the ratio of answer will be :");
		   		 		System.out.println("9. What is the default value of a boolean variable in Java?");
		   		 		System.out.println("A.true      15%");
		   		 		System.out.println("B.false     50%");
		   		 		System.out.println("C.0         30%");
		   		 		System.out.println("D.1          5%");
		    			pole--;
		    			lifeline--;
		    			a9=sc.next();
		    			if(a9.equals("B")) {
		    				System.out.println("Correct");
		    				points+=100;
		    				System.out.println("the point is"+points);
		    				}
		    				else{
		    					System.out.println("Sorry, the correct answer is option B.");
		    					System.out.println("the game is terminated");
		    					System.out.println("the point is"+points);
		    					System.exit(0);
		    				}
		   		 	}
		   		 	else if(lifeline == 1 && pole == 0 && fiffty == 0 && flip==1) {
		   		 		System.out.println(" you can flip the question ");
		   		 		System.out.println("What is the return type of a constructor in Java?");
		         		System.out.println("A. void");
		         		System.out.println("B. int");
		         		System.out.println("C. String");
		         		System.out.println("D. No return type");
		         		flip--;
		         		lifeline--;
		         		a9=sc.next();
		         		if (a9.equals("D")) { 
		         			System.out.println("Correct");
		         			points+=100;
		         			System.out.println("the point is"+points);
		         		}
		         		else{
		         			System.out.println("Sorry, the correct answer is option D.");
		         			System.out.println("the game is terminated");
		         			System.out.println("the point is"+points);
		         			System.exit(0);
		         		}
		   		 	}
		   		 	else if(lifeline==0) {
		   		 		System.out.println("No lifelines left ");
		   		 		System.out.println("Select one option : ");
		   		 		a9 = sc.next();
		   		 		if (a9.equals("B")) { 
		   		 			System.out.println("Correct");
		   		 			points+=100;
		   		 			System.out.println("the point is"+points);
		         	    }
		   		 		else {
		   		 			System.out.println("Sorry, the correct answer is option B.");
		   		 			System.out.println("the game is terminated");
		   		 			System.out.println("the point is"+points);
		   		 			System.exit(0);
		   		 		}	
		   		 		if(a9.equals("F"))
		   		 		{
		   		 			System.exit(0);
		   		 		}
		   		 	}
			    }
			    else {
			    	System.out.println("Sorry, the correct answer is option B.");
			    	System.out.println("the game is terminated");
			    	System.out.println("the point is"+points);
			    	System.exit(0);
			    	}
			    	System.out.println("======================================================");
		  			System.out.println("10.In which memory area are objects stored in Java?");
		  			System.out.println("A.Stack");
		  			System.out.println("B.Data Segment");
		  			System.out.println("C.Code Segment");
		  			System.out.println("D.Heap");
		  			System.out.println("E.lifeline are: ");
		  			System.out.println("F.quit");
		  			String a10=sc.next();
		  			if(a10.equals("F"))
		  			{
		  				System.exit(0);
		  			}
		  	   	
		  			else if (a10.equals("D")) { 
		  				System.out.println("Correct");
		  	   	      	points+=100;
		  	   	      	System.out.println("the point is"+points);
		  	   	    	}
		  			else if(a10.equals("E"))
		  			{
		  				if (lifeline == 3 && pole == 1 && fiffty == 1 && flip==1) {
		  					System.out.println("You have 3 Lifelines left");
		  					System.out.println("choose 1.50-50                   2.pole                    3.flip");
		  					choice=sc.nextInt();
		  					if(choice==1)
		  					{
		  						System.out.println("10.In which memory area are objects stored in Java?");
		  						System.out.println("C.Code Segment");
		  						System.out.println("D.Heap");
		  						fiffty--;
		  						lifeline--;
		  						System.out.println("You are used your 50:50 lifeline ");
		  						a10=sc.next();
		  						if(a10.equals("D")) {
		  							System.out.println("Correct");
		  							points+=100;
		  							System.out.println("the point is"+points);
		  						}
		  						else {
		  							System.out.println("Sorry, the correct answer is option D.");
		  							System.out.println("the game is terminated");
		  							System.out.println("the point is"+points);
		  							System.exit(0);
		  						}
		  					}
		  					else if(choice==2)
		  	   	        			{
		  						System.out.println("According to auidence poll the ratio of answer will be :");
		  						System.out.println("10.In which memory area are objects stored in Java?");
		  						System.out.println("A.Stack         10%");
		  	   		  			System.out.println("B.Data Segment   5%");
		  	   		  			System.out.println("C.Code Segment  15%");
		  	   		  			System.out.println("D.Heap          70%");
		  	   		  			lifeline--;
		  	   		  			a10=sc.next();
		  	   		  			if(a10.equals("D")) {
		  	   		  				System.out.println("Correct");
		  	   		  				points+=100;
		  	   		  				System.out.println("the point is"+points);
		  	   		  			}
		  	   		  			else{
		  	   		  				System.out.println("Sorry, the correct answer is option D.");
		  	   		  				System.out.println("the game is terminated");
		  	   		  				System.out.println("the point is"+points);
		  	   		  				System.exit(0);
		  	   		  			}
		  	   	        			}
		  					else if(choice==3) {
		  						System.out.println(" you can flip the question ");
		  						System.out.println("What is the return type of a constructor in Java?");
		  						System.out.println("A. void");
		  						System.out.println("B. int");
		  						System.out.println("C. String");
		  						System.out.println("D. No return type");
		  						flip--;
		  						lifeline--;
		  						a10=sc.next();
		  						if (a10.equals("D")) { 
		  		          	      	System.out.println("Correct");
		  		          	      	points+=100;
		  		          	      	System.out.println("the point is"+points);
		  						}
		  						else{
		  							System.out.println("Sorry, the correct answer is option D.");
		  							System.out.println("the game is terminated");
		  							System.out.println("the point is"+points);
		  							System.exit(0);
		  							}
		  					}
		  				}
		  				else if(lifeline ==2 && pole == 1 && fiffty == 1 && flip ==0) {
		  					System.out.println("You have only two lifeline fiffty and pole");
		  					System.out.println("choose 1.50-50                   2.pole");
		  					choice=sc.nextInt();
		  					if(choice==1) {
		  						System.out.println("10.In which memory area are objects stored in Java?");
		  						System.out.println("C. Code Segment");
		  						System.out.println("D.Heap");
		  						fiffty--;
		  						lifeline--;
		  						System.out.println("You are used your 50:50 lifeline ");
		  						a10=sc.next();
		  						if(a10.equals("D")) {
		  							System.out.println("Correct");
		  							points+=100;
		  							System.out.println("the point is"+points);
		  						}
		  						else {
		  							System.out.println("Sorry, the correct answer is option D.");
		  							System.out.println("the game is terminated");
		  							System.out.println("the point is"+points);
		  							System.exit(0);
		  						}
		  					}
		  					if(choice==2) {
		  						System.out.println("According to auidence poll the ratio of answer will be :");
		  						System.out.println("10.In which memory area are objects stored in Java?");
		  						System.out.println("A.Stack         10%");
		  						System.out.println("B.Data Segment   5%");
		  						System.out.println("C.Code Segment  15%");
		  						System.out.println("D.Heap          70%");
		  						pole--;
		  						lifeline--;
		  						a10=sc.next();
		  						if(a10.equals("D")) {
		  							System.out.println("Correct");
		  							points+=100;
		  							System.out.println("the point is"+points);
		  						}
		  						else{
		  							System.out.println("Sorry, the correct answer is option D.");
		  							System.out.println("the game is terminated");
		  							System.out.println("the point is"+points);
		  							System.exit(0);
		  						}
		  					}
		  				}
		  				else if(lifeline ==2 && pole == 0 && fiffty == 1 && flip ==1) {
		  					System.out.println("You have 2 Lifelines left fiffty and flip");
		  					System.out.println("choose 1.50-50                      3.flip");
		  					choice=sc.nextInt();
		  					if(choice==1) {
		  						System.out.println("10.In which memory area are objects stored in Java?");
			  	  	  			System.out.println("C. Code Segment");
			  	  	  			System.out.println("D.Heap");
			  	  	  			fiffty--;
			  	  	  			lifeline--;
			  	  	  			System.out.println("You are used your 50:50 lifeline ");
			  	  	  			a10=sc.next();
			  	  	  			if(a10.equals("D")) {
			  	  	  				System.out.println("Correct");
			  	  	  				points+=100;
			  	  	  				System.out.println("the point is"+points);
			  	  	  			}
			  	  	  			else {
			  	  	  				System.out.println("Sorry, the correct answer is option D.");
			  	  	  				System.out.println("the game is terminated");
			  	  	  				System.out.println("the point is"+points);
			  	  	  				System.exit(0);
			  	  	  			}
		  					}
		  					if(choice==3) {
		  						System.out.println(" you can flip the question ");
		  						System.out.println("What is the return type of a constructor in Java?");
		  						System.out.println("A. void");
		  						System.out.println("B. int");
		  						System.out.println("C. String");
		  						System.out.println("D. No return type");
		  						flip--;
		  						lifeline--;
		  						a10=sc.next();
		  						if (a10.equals("D")) { 
		  							System.out.println("Correct");
		  							points+=100;
		  							System.out.println("the point is"+points);
		  						}
		  						else{
		  							System.out.println("Sorry, the correct answer is option D.");
		  							System.out.println("the game is terminated");
		  							System.out.println("the point is"+points);
		  							System.exit(0);
		  						} 
		  					}
		  				}
		  				else if(lifeline ==2 && pole == 1 && fiffty == 0 && flip ==1) {
		  					System.out.println("You have 2 Lifelines left pole and flip");
		  					System.out.println("choose 2.pole                      3.flip");
		  		            choice=sc.nextInt();
		  		            if(choice==2) {
		  		            	System.out.println("According to auidence poll the ratio of answer will be :");
		  		            	System.out.println("10.In which memory area are objects stored in Java?");
		  		            	System.out.println("A.Stack         10%");
		  		            	System.out.println("B.Data Segment   5%");
		  		            	System.out.println("C. Code Segment 15%");
		  		            	System.out.println("D.Heap          70%");
		  		            	pole--;
		  		            	lifeline--;
		  		            	a10=sc.next();
		  		            	if(a10.equals("D")) {
		  		            		System.out.println("Correct");
		  		            		points+=100;
		  		            		System.out.println("the point is"+points);
		  		            	}
		  		            	else{
		  		            		System.out.println("Sorry, the correct answer is option D.");
		  		            		System.out.println("the game is terminated");
		  		            		System.out.println("the point is"+points);
		  		            		System.exit(0);
		  		            	}
		  		            }
		  		            if(choice==3) {
		  		            	System.out.println(" you can flip the question ");
		  		            	System.out.println("What is the return type of a constructor in Java?");
		  			    		System.out.println("A. void");
		  			    		System.out.println("B. int");
		  			    		System.out.println("C. String");
		  			    		System.out.println("D. No return type");
		  			    		flip--;
		  			    		lifeline--;
		  			    		a10=sc.next();
		  			    			if (a10.equals("D")) { 
		  			    				System.out.println("Correct");
		  			    				points+=100;
		  			    				System.out.println("the point is"+points);
		  			    			}
		  			    			else{
		  			    				System.out.println("Sorry, the correct answer is option D.");
		  			    				System.out.println("the game is terminated");
		  			    				System.out.println("the point is"+points);
		  			    				System.exit(0);
		  			    			} 
		  		            }
		  				}
		  	   		 	else if (lifeline == 1 && pole == 0 && fiffty == 1 && flip==0) {
		  	   		 		System.out.println("You have only one lifeline(50:50)");
		  	   		 		System.out.println("10.In which memory area are objects stored in Java?");
		  	   		 		System.out.println("C.Code Segment");
		  	   		 		System.out.println("D.Heap");
		  	        		fiffty--;
		  	          	    lifeline--;
		  	          	    System.out.println("You are used your 50:50 lifeline ");
		  	          	    a10=sc.next();
		  	          	    if (a10.equals("D")) { 
		  	          	    	System.out.println("Correct");
		  	          	    	points+=100;
		  	          	    	System.out.println("the point is"+points);
		  	          	    }
		  	          	    else {
		  	          	    	System.out.println("Sorry, the correct answer is option D.");
		  	          	    	System.out.println("the game is terminated");
		  	          	    	System.out.println("the point is"+points);
		  	          	    	System.exit(0);
		  	          	    }
		  	   		 	}
		  	   		 	else if(lifeline == 1 && pole == 1 && fiffty == 0 && flip==0) {
		  	   		 		System.out.println("According to auidence poll the ratio of answer will be :");
		  	   		 		System.out.println("10.In which memory area are objects stored in Java?");
		  	   		 		System.out.println("A.Stack         10%");
		  	   		 		System.out.println("B.Data Segment   5%");
		  	   		 		System.out.println("C.Code Segment 15%");
		  	   		 		System.out.println("D.Heap          70%");
		  	    			pole--;
		  	    			lifeline--;
		  	    			a10=sc.next();
		  	    			if(a10.equals("D")) {
		  	    				System.out.println("Correct");
		  	    				points+=100;
		  	    				System.out.println("the point is"+points);
		  	    				}
		  	    				else{
		  	    					System.out.println("Sorry, the correct answer is option D.");
		  	    					System.out.println("the game is terminated");
		  	    					System.out.println("the point is"+points);
		  	    					System.exit(0);
		  	    				}
		  	   		 	}
		  	   		 	else if(lifeline == 1 && pole == 0 && fiffty == 0 && flip==1) {
		  	   		 		System.out.println(" you can flip the question ");
		  	   		 		System.out.println("What is the return type of a constructor in Java?");
		  	         		System.out.println("A. void");
		  	         		System.out.println("B. int");
		  	         		System.out.println("C. String");
		  	         		System.out.println("D. No return type");
		  	         		flip--;
		  	         		lifeline--;
		  	         		a10=sc.next();
		  	         		if (a10.equals("D")) { 
		  	         			System.out.println("Correct");
		  	         			points+=100;
		  	         			System.out.println("the point is"+points);
		  	         		}
		  	         		else{
		  	         			System.out.println("Sorry, the correct answer is option D.");
		  	         			System.out.println("the game is terminated");
		  	         			System.out.println("the point is"+points);
		  	         			System.exit(0);
		  	         		}
		  	   		 	}
		  	   		 	else if(lifeline==0) {
		  	   		 		System.out.println("No lifelines left ");
		  	   		 		System.out.println("Select one option : ");
		  	   		 		a10 = sc.next();
		  	   		 		if (a10.equals("D")) { 
		  	   		 			System.out.println("Correct");
		  	   		 			points+=100;
		  	   		 			System.out.println("the point is"+points);
		  	   		 		}
		  	   		 		else {
		  	   		 			System.out.println("Sorry, the correct answer is option D.");
		  	   		 			System.out.println("the game is terminated");
		  	   		 			System.out.println("the point is"+points);
		  	   		 			System.exit(0);
		  	   		 		}
		  	   		 		if(a10.equals("F"))
		  	   		 		{
		  	   		 			System.exit(0);
		  	   		 		}
		  	   		 	}
		  			}
			  	   	else {
			  	   	      System.out.println("Sorry, the correct answer is option D.");
			  	   	      System.out.println("the game is terminated");
			  	   	      System.out.println("the point is"+points);
			  	   	      System.exit(0);
			  	   	}
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				}
			}
