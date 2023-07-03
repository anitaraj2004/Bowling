package Objects;

import java.util.ArrayList;
import TurtleGraphics.KeyboardReader;
import java.util.Random;

public class BowlingGame 
{

	public static void main(String[] args) 
	{
		// Strike - if you knock down all 10 pins in the first shot of a frame, you get a strike
			// How to Score: a strike earns 10 points plus the sum of your next 2 shots
			// Wait for bonus
		// Spare - if you knock down all 10 pins using both shots of a frame, you get a spare
			// How to Score: a spare earns 10 plus the sum of your next 1 shot
		// Open Frame - if you do not knock down all 10 pins using both shots of your frame
			// 9 or fewer pins knocked down
			// How to Score: an open frame only earns the number of pins knocked down
		// The 10th Frame
			// If you roll a strike in the first shot of the 10th frame, you get 2 more shots
			// If you roll a spare in the first 2 shots of the 10th frame, you get 1 more shot
			// If you leave the 10th frame open after 2 shots, the game is over and you do not get an additional shot
			// How to Score: the score for the 10th frame is the total pins knocked down in the 10th frame
		// Use reader.pause after each whole frame (all n numbers of player, then pause)
		// 1-5 people bowling
		// Use array lists for each player
		// Randomly generate
		// At least 2 methods

		KeyboardReader reader = new KeyboardReader();
		int numOfPlayers=0;
		String player1Name="", player2Name="", player3Name="", player4Name="", player5Name="";
		int firstturn=0, secondturn=0, thirdturn=0, playertotal=0;
		Random generator = new Random();

		// automatically create 5 array lists representing 5 possible players
		ArrayList<Bowling> player1 = new ArrayList();
		ArrayList<Bowling> player2 = new ArrayList();
		ArrayList<Bowling> player3 = new ArrayList();
		ArrayList<Bowling> player4 = new ArrayList();
		ArrayList<Bowling> player5 = new ArrayList();

		// create empty frames and fill player array lists with the empty frames
		Bowling frame1 = new Bowling();
		Bowling frame2 = new Bowling();
		Bowling frame3 = new Bowling();
		Bowling frame4 = new Bowling();
		Bowling frame5 = new Bowling();
		Bowling frame6 = new Bowling();
		Bowling frame7 = new Bowling();
		Bowling frame8 = new Bowling();
		Bowling frame9 = new Bowling();
		Bowling frame10 = new Bowling();
		// add frames to player1
		player1.add(frame1);
		player1.add(frame2);
		player1.add(frame3);
		player1.add(frame4);
		player1.add(frame5);
		player1.add(frame6);
		player1.add(frame7);
		player1.add(frame8);
		player1.add(frame9);
		player1.add(frame10);
		
		// create empty frames and fill player array lists with the empty frames
		Bowling frame11 = new Bowling();
		Bowling frame12 = new Bowling();
		Bowling frame13 = new Bowling();
		Bowling frame14 = new Bowling();
		Bowling frame15 = new Bowling();
		Bowling frame16 = new Bowling();
		Bowling frame17 = new Bowling();
		Bowling frame18 = new Bowling();
		Bowling frame19 = new Bowling();
		Bowling frame20 = new Bowling();
		// add frames to player2
		player2.add(frame11);
		player2.add(frame12);
		player2.add(frame13);
		player2.add(frame14);
		player2.add(frame15);
		player2.add(frame16);
		player2.add(frame17);
		player2.add(frame18);
		player2.add(frame19);
		player2.add(frame20);
		
		// create empty frames and fill player array lists with the empty frames
		Bowling frame21 = new Bowling();
		Bowling frame22 = new Bowling();
		Bowling frame23 = new Bowling();
		Bowling frame24 = new Bowling();
		Bowling frame25 = new Bowling();
		Bowling frame26 = new Bowling();
		Bowling frame27 = new Bowling();
		Bowling frame28 = new Bowling();
		Bowling frame29 = new Bowling();
		Bowling frame30 = new Bowling();
		// add frames to player3
		player3.add(frame21);
		player3.add(frame22);
		player3.add(frame23);
		player3.add(frame24);
		player3.add(frame25);
		player3.add(frame26);
		player3.add(frame27);
		player3.add(frame28);
		player3.add(frame29);
		player3.add(frame30);
		
		// create empty frames and fill player array lists with the empty frames
		Bowling frame31 = new Bowling();
		Bowling frame32 = new Bowling();
		Bowling frame33 = new Bowling();
		Bowling frame34 = new Bowling();
		Bowling frame35 = new Bowling();
		Bowling frame36 = new Bowling();
		Bowling frame37 = new Bowling();
		Bowling frame38 = new Bowling();
		Bowling frame39 = new Bowling();
		Bowling frame40 = new Bowling();
		// add frames to player4
		player4.add(frame31);
		player4.add(frame32);
		player4.add(frame33);
		player4.add(frame34);
		player4.add(frame35);
		player4.add(frame36);
		player4.add(frame37);
		player4.add(frame38);
		player4.add(frame39);
		player4.add(frame40);
		
		// create empty frames and fill player array lists with the empty frames
		Bowling frame41 = new Bowling();
		Bowling frame42 = new Bowling();
		Bowling frame43 = new Bowling();
		Bowling frame44 = new Bowling();
		Bowling frame45 = new Bowling();
		Bowling frame46 = new Bowling();
		Bowling frame47 = new Bowling();
		Bowling frame48 = new Bowling();
		Bowling frame49 = new Bowling();
		Bowling frame50 = new Bowling();
		// add frames to player5
		player5.add(frame41);
		player5.add(frame42);
		player5.add(frame43);
		player5.add(frame44);
		player5.add(frame45);
		player5.add(frame46);
		player5.add(frame47);
		player5.add(frame48);
		player5.add(frame49);
		player5.add(frame50);

		// ask how many players, continue to ask until given in the correct range
		System.out.println("Welcome to bowling! How many players (1-5)?");
		numOfPlayers=reader.readInt();
		while((numOfPlayers<1)||(numOfPlayers>5))
		{
			System.out.println("Re-enter the number of players in the valid range (1-5).");
			numOfPlayers=reader.readInt();
		}
		
		System.out.println("What is player 1's name?");
		player1Name=reader.readLine();
			
			if(numOfPlayers>=2)
			{
				System.out.println("What is player 2's name?");
				player2Name=reader.readLine();
				
				if(numOfPlayers>=3)
				{
					System.out.println("What is player 3's name?");
					player3Name=reader.readLine();
					
					if(numOfPlayers>=4)
					{
						System.out.println("What is player 4's name?");
						player4Name=reader.readLine();
						
						if(numOfPlayers>=5)
						{
							System.out.println("What is player 5's name?");
							player5Name=reader.readLine();
						}
					}
				}
			}

		// determine all first 9 turns before finding totals
		for(int turnCounter=0; turnCounter<10; turnCounter++)
		{
			// CHANGE TO 10 FOR ALL STRIKES
			// firstturn=10;
			// comment out the firstturn generator below this
			
			// FOR ALL SPARES
			// firstturn=generator.nextInt(10);
			// secondturn=10-firstturn;
			// comment out the firstturn generator, if, and else statements directly below this
			
			// FOR ALL STRIKES AND SPARES
			// firstturn=generator.nextInt(11);
			// if(firstturn==10)
			//{
				//secondturn=0;
			//}
			//else
			//{
				//secondturn=10-firstturn;
			//}
			
			firstturn=generator.nextInt(11);
			if(firstturn==10)
			{
				secondturn=0;
			}
			else
			{
				secondturn=generator.nextInt(11-firstturn);
			}
			player1.get(turnCounter).SetFirstTurn(firstturn);
			player1.get(turnCounter).SetSecondTurn(secondturn);

			// add first and second turns, pass into player total
			playertotal=firstturn+secondturn;
			player1.get(turnCounter).SetPlayerTotal(playertotal);
		}

		// special conditions for scoring the tenth frame
		// if, on tenth turn, they got a strike (all pins in first turn) --> 2 more shots (can get another strike or spare)
		if(player1.get(9).GetFirstTurn()==10)
		{
			firstturn=player1.get(9).GetFirstTurn();
			// CHANGE TO 10 FOR ALL STRIKES
			// secondturn=10;
			secondturn=generator.nextInt(11);
			if(secondturn==10)
			{
				// CHANGE TO 10 FOR ALL STRIKES
				// thirdturn=10;
				thirdturn=generator.nextInt(11);
			}
			else
			{
				thirdturn=generator.nextInt(11-secondturn);
			}
			player1.get(9).SetSecondTurn(secondturn);
			player1.get(9).SetThirdTurn(thirdturn);

			// add third and fourth turns to player's total score
			playertotal=firstturn+secondturn+thirdturn;
			player1.get(9).SetPlayerTotal(playertotal);
		}
		// if, on tenth turn, they got a spare (all pins in the first two turns) --> 1 more shot
		else if((player1.get(9).GetFirstTurn()+player1.get(9).GetSecondTurn())==10)
		{
			thirdturn=generator.nextInt(11);
			player1.get(9).SetThirdTurn(thirdturn);

			// add third and fourth turns to player's total score
			playertotal=player1.get(9).GetPlayerTotal();
			playertotal=playertotal+thirdturn;
			player1.get(9).SetPlayerTotal(playertotal);
		}
		// if, on the tenth frame, you get an open frame
		else
		{
			playertotal=player1.get(9).GetFirstTurn()+player1.get(9).GetSecondTurn();
			player1.get(9).SetPlayerTotal(playertotal);
		}

		// determine totals for each frame
		for(int frame=0; frame<9; frame++)
		{
			// if there's a strike in the frame, add two turns of next frame
			if(player1.get(frame).GetFirstTurn()==10)
			{
				// if there's a strike in the first turn of the next frame as well
				if(player1.get(frame+1).GetFirstTurn()==10)
				{
					if(frame==8)
					{
						playertotal=player1.get(frame).GetPlayerTotal()+player1.get(frame+1).GetFirstTurn()+player1.get(frame+1).GetSecondTurn();
						player1.get(frame).SetPlayerTotal(playertotal);
					}
					// if there's a strike in the first turn of the next frame as well
					else if(player1.get(frame+2).GetFirstTurn()==10)
					{
						if(frame==7)
						{
							playertotal=player1.get(frame).GetPlayerTotal()+player1.get(frame+1).GetPlayerTotal()+player1.get(frame+2).GetFirstTurn();
							player1.get(frame).SetPlayerTotal(playertotal);
						}
						else
						{
							playertotal=player1.get(frame).GetPlayerTotal()+player1.get(frame+1).GetPlayerTotal()+player1.get(frame+2).GetPlayerTotal();
							player1.get(frame).SetPlayerTotal(playertotal);
						}
					}
					// if there's not a strike in the first turn of the next frame
					else
					{
						playertotal=player1.get(frame).GetPlayerTotal()+player1.get(frame+1).GetPlayerTotal()+player1.get(frame+2).GetFirstTurn();
						player1.get(frame).SetPlayerTotal(playertotal);
					}
				}
				// if there's not a strike in the first turn of the next frame
				else
				{
					if(frame==8)
					{
						playertotal=player1.get(frame).GetPlayerTotal()+player1.get(frame+1).GetFirstTurn()+player1.get(frame+1).GetSecondTurn();
						player1.get(frame).SetPlayerTotal(playertotal);
					}
					else
					{
						playertotal=player1.get(frame).GetPlayerTotal()+player1.get(frame+1).GetPlayerTotal();
						player1.get(frame).SetPlayerTotal(playertotal);
					}
				}
			}

			// if there's a spare in the frame, add one turn of next frame
			else if((player1.get(frame).GetFirstTurn()+player1.get(frame).GetSecondTurn())==10)
			{
				playertotal=player1.get(frame).GetPlayerTotal()+player1.get(frame+1).GetFirstTurn();
				player1.get(frame).SetPlayerTotal(playertotal);
			}

			// if there's an open frame, only add the two turns in that frame
			else if(player1.get(frame).GetPlayerTotal()<10)
			{
				playertotal=player1.get(frame).GetFirstTurn()+player1.get(frame).GetSecondTurn();
				player1.get(frame).SetPlayerTotal(playertotal);
			}
		}
		
		if(numOfPlayers>=2)
		{
			// determine all first 9 turns before finding totals
			for(int turnCounter=0; turnCounter<10; turnCounter++)
			{
				// CHANGE TO 10 FOR ALL STRIKES
				// firstturn=10;
				// comment out the firstturn generator below this
				
				// FOR ALL SPARES
				// firstturn=generator.nextInt(10);
				// secondturn=10-firstturn;
				// comment out the firstturn generator, if, and else statements directly below this
				
				// FOR ALL STRIKES AND SPARES
				// firstturn=generator.nextInt(11);
				// if(firstturn==10)
				//{
					//secondturn=0;
				//}
				//else
				//{
					//secondturn=10-firstturn;
				//}
				
				firstturn=generator.nextInt(11);
				if(firstturn==10)
				{
					secondturn=0;
				}
				else
				{
					secondturn=generator.nextInt(11-firstturn);
				}
				player2.get(turnCounter).SetFirstTurn(firstturn);
				player2.get(turnCounter).SetSecondTurn(secondturn);

				// add first and second turns, pass into player total
				playertotal=firstturn+secondturn;
				player2.get(turnCounter).SetPlayerTotal(playertotal);
			}

			// special conditions for scoring the tenth frame
			// if, on tenth turn, they got a strike (all pins in first turn) --> 2 more shots (can get another strike or spare)
			if(player2.get(9).GetFirstTurn()==10)
			{
				firstturn=player2.get(9).GetFirstTurn();
				// CHANGE TO 10 FOR ALL STRIKES
				// secondturn=10;
				secondturn=generator.nextInt(11);
				if(secondturn==10)
				{
					// CHANGE TO 10 FOR ALL STRIKES
					// thirdturn=10;
					thirdturn=generator.nextInt(11);
				}
				else
				{
					thirdturn=generator.nextInt(11-secondturn);
				}
				player2.get(9).SetSecondTurn(secondturn);
				player2.get(9).SetThirdTurn(thirdturn);

				// add third and fourth turns to player's total score
				playertotal=firstturn+secondturn+thirdturn;
				player2.get(9).SetPlayerTotal(playertotal);
			}
			// if, on tenth turn, they got a spare (all pins in the first two turns) --> 1 more shot
			else if((player2.get(9).GetFirstTurn()+player2.get(9).GetSecondTurn())==10)
			{
				thirdturn=generator.nextInt(11);
				player2.get(9).SetThirdTurn(thirdturn);

				// add third and fourth turns to player's total score
				playertotal=player2.get(9).GetPlayerTotal();
				playertotal=playertotal+thirdturn;
				player2.get(9).SetPlayerTotal(playertotal);
			}
			// if, on the tenth frame, you get an open frame
			else
			{
				playertotal=player2.get(9).GetFirstTurn()+player2.get(9).GetSecondTurn();
				player2.get(9).SetPlayerTotal(playertotal);
			}

			// determine totals for each frame
			for(int frame=0; frame<9; frame++)
			{
				// if there's a strike in the frame, add two turns of next frame
				if(player2.get(frame).GetFirstTurn()==10)
				{
					// if there's a strike in the first turn of the next frame as well
					if(player2.get(frame+1).GetFirstTurn()==10)
					{
						if(frame==8)
						{
							playertotal=player2.get(frame).GetPlayerTotal()+player2.get(frame+1).GetFirstTurn()+player2.get(frame+1).GetSecondTurn();
							player2.get(frame).SetPlayerTotal(playertotal);
						}
						// if there's a strike in the first turn of the next frame as well
						else if(player2.get(frame+2).GetFirstTurn()==10)
						{
							if(frame==7)
							{
								playertotal=player2.get(frame).GetPlayerTotal()+player2.get(frame+1).GetPlayerTotal()+player2.get(frame+2).GetFirstTurn();
								player2.get(frame).SetPlayerTotal(playertotal);
							}
							else
							{
								playertotal=player2.get(frame).GetPlayerTotal()+player2.get(frame+1).GetPlayerTotal()+player2.get(frame+2).GetPlayerTotal();
								player2.get(frame).SetPlayerTotal(playertotal);
							}
						}
						// if there's not a strike in the first turn of the next frame
						else
						{
							playertotal=player2.get(frame).GetPlayerTotal()+player2.get(frame+1).GetPlayerTotal()+player2.get(frame+2).GetFirstTurn();
							player2.get(frame).SetPlayerTotal(playertotal);
						}
					}
					// if there's not a strike in the first turn of the next frame
					else
					{
						if(frame==8)
						{
							playertotal=player2.get(frame).GetPlayerTotal()+player2.get(frame+1).GetFirstTurn()+player2.get(frame+1).GetSecondTurn();
							player2.get(frame).SetPlayerTotal(playertotal);
						}
						else
						{
							playertotal=player2.get(frame).GetPlayerTotal()+player2.get(frame+1).GetPlayerTotal();
							player2.get(frame).SetPlayerTotal(playertotal);
						}
					}
				}

				// if there's a spare in the frame, add one turn of next frame
				else if((player2.get(frame).GetFirstTurn()+player2.get(frame).GetSecondTurn())==10)
				{
					playertotal=player2.get(frame).GetPlayerTotal()+player2.get(frame+1).GetFirstTurn();
					player2.get(frame).SetPlayerTotal(playertotal);
				}

				// if there's an open frame, only add the two turns in that frame
				else if(player2.get(frame).GetPlayerTotal()<10)
				{
					playertotal=player2.get(frame).GetFirstTurn()+player2.get(frame).GetSecondTurn();
					player2.get(frame).SetPlayerTotal(playertotal);
				}
			}
			
			if(numOfPlayers>=3)
			{
				// determine all first 9 turns before finding totals
				for(int turnCounter=0; turnCounter<10; turnCounter++)
				{
					// CHANGE TO 10 FOR ALL STRIKES
					// firstturn=10;
					// comment out the firstturn generator below this
					
					// FOR ALL SPARES
					// firstturn=generator.nextInt(10);
					// secondturn=10-firstturn;
					// comment out the firstturn generator, if, and else statements directly below this
					
					// FOR ALL STRIKES AND SPARES
					// firstturn=generator.nextInt(11);
					// if(firstturn==10)
					//{
						//secondturn=0;
					//}
					//else
					//{
						//secondturn=10-firstturn;
					//}
					
					firstturn=generator.nextInt(11);
					if(firstturn==10)
					{
						secondturn=0;
					}
					else
					{
						secondturn=generator.nextInt(11-firstturn);
					}
					player3.get(turnCounter).SetFirstTurn(firstturn);
					player3.get(turnCounter).SetSecondTurn(secondturn);

					// add first and second turns, pass into player total
					playertotal=firstturn+secondturn;
					player3.get(turnCounter).SetPlayerTotal(playertotal);
				}

				// special conditions for scoring the tenth frame
				// if, on tenth turn, they got a strike (all pins in first turn) --> 2 more shots (can get another strike or spare)
				if(player3.get(9).GetFirstTurn()==10)
				{
					firstturn=player3.get(9).GetFirstTurn();
					// CHANGE TO 10 FOR ALL STRIKES
					// secondturn=10;
					secondturn=generator.nextInt(11);
					if(secondturn==10)
					{
						// CHANGE TO 10 FOR ALL STRIKES
						// thirdturn=10;
						thirdturn=generator.nextInt(11);
					}
					else
					{
						thirdturn=generator.nextInt(11-secondturn);
					}
					player3.get(9).SetSecondTurn(secondturn);
					player3.get(9).SetThirdTurn(thirdturn);

					// add third and fourth turns to player's total score
					playertotal=firstturn+secondturn+thirdturn;
					player3.get(9).SetPlayerTotal(playertotal);
				}
				// if, on tenth turn, they got a spare (all pins in the first two turns) --> 1 more shot
				else if((player3.get(9).GetFirstTurn()+player3.get(9).GetSecondTurn())==10)
				{
					thirdturn=generator.nextInt(11);
					player3.get(9).SetThirdTurn(thirdturn);

					// add third and fourth turns to player's total score
					playertotal=player3.get(9).GetPlayerTotal();
					playertotal=playertotal+thirdturn;
					player3.get(9).SetPlayerTotal(playertotal);
				}
				// if, on the tenth frame, you get an open frame
				else
				{
					playertotal=player3.get(9).GetFirstTurn()+player3.get(9).GetSecondTurn();
					player3.get(9).SetPlayerTotal(playertotal);
				}

				// determine totals for each frame
				for(int frame=0; frame<9; frame++)
				{
					// if there's a strike in the frame, add two turns of next frame
					if(player3.get(frame).GetFirstTurn()==10)
					{
						// if there's a strike in the first turn of the next frame as well
						if(player3.get(frame+1).GetFirstTurn()==10)
						{
							if(frame==8)
							{
								playertotal=player3.get(frame).GetPlayerTotal()+player3.get(frame+1).GetFirstTurn()+player3.get(frame+1).GetSecondTurn();
								player3.get(frame).SetPlayerTotal(playertotal);
							}
							// if there's a strike in the first turn of the next frame as well
							else if(player3.get(frame+2).GetFirstTurn()==10)
							{
								if(frame==7)
								{
									playertotal=player3.get(frame).GetPlayerTotal()+player3.get(frame+1).GetPlayerTotal()+player3.get(frame+2).GetFirstTurn();
									player3.get(frame).SetPlayerTotal(playertotal);
								}
								else
								{
									playertotal=player3.get(frame).GetPlayerTotal()+player3.get(frame+1).GetPlayerTotal()+player3.get(frame+2).GetPlayerTotal();
									player3.get(frame).SetPlayerTotal(playertotal);
								}
							}
							// if there's not a strike in the first turn of the next frame
							else
							{
								playertotal=player3.get(frame).GetPlayerTotal()+player3.get(frame+1).GetPlayerTotal()+player3.get(frame+2).GetFirstTurn();
								player3.get(frame).SetPlayerTotal(playertotal);
							}
						}
						// if there's not a strike in the first turn of the next frame
						else
						{
							if(frame==8)
							{
								playertotal=player3.get(frame).GetPlayerTotal()+player3.get(frame+1).GetFirstTurn()+player3.get(frame+1).GetSecondTurn();
								player3.get(frame).SetPlayerTotal(playertotal);
							}
							else
							{
								playertotal=player3.get(frame).GetPlayerTotal()+player3.get(frame+1).GetPlayerTotal();
								player3.get(frame).SetPlayerTotal(playertotal);
							}
						}
					}

					// if there's a spare in the frame, add one turn of next frame
					else if((player3.get(frame).GetFirstTurn()+player3.get(frame).GetSecondTurn())==10)
					{
						playertotal=player3.get(frame).GetPlayerTotal()+player3.get(frame+1).GetFirstTurn();
						player3.get(frame).SetPlayerTotal(playertotal);
					}

					// if there's an open frame, only add the two turns in that frame
					else if(player3.get(frame).GetPlayerTotal()<10)
					{
						playertotal=player3.get(frame).GetFirstTurn()+player3.get(frame).GetSecondTurn();
						player3.get(frame).SetPlayerTotal(playertotal);
					}
				}
				
				if(numOfPlayers>=4)
				{
					// determine all first 9 turns before finding totals
					for(int turnCounter=0; turnCounter<10; turnCounter++)
					{
						// CHANGE TO 10 FOR ALL STRIKES
						// firstturn=10;
						// comment out the firstturn generator below this
						
						// FOR ALL SPARES
						// firstturn=generator.nextInt(10);
						// secondturn=10-firstturn;
						// comment out the firstturn generator, if, and else statements directly below this
						
						// FOR ALL STRIKES AND SPARES
						// firstturn=generator.nextInt(11);
						// if(firstturn==10)
						// {
							// secondturn=0;
						// }
						// else
						// {
							// secondturn=10-firstturn;
						// }
						
						firstturn=generator.nextInt(11);
						if(firstturn==10)
						{
							secondturn=0;
						}
						else
						{
							secondturn=generator.nextInt(11-firstturn);
						}
						player4.get(turnCounter).SetFirstTurn(firstturn);
						player4.get(turnCounter).SetSecondTurn(secondturn);

						// add first and second turns, pass into player total
						playertotal=firstturn+secondturn;
						player4.get(turnCounter).SetPlayerTotal(playertotal);
					}

					// special conditions for scoring the tenth frame
					// if, on tenth turn, they got a strike (all pins in first turn) --> 2 more shots (can get another strike or spare)
					if(player4.get(9).GetFirstTurn()==10)
					{
						firstturn=player4.get(9).GetFirstTurn();
						// CHANGE TO 10 FOR ALL STRIKES
						// secondturn=10;
						secondturn=generator.nextInt(11);
						if(secondturn==10)
						{
							// CHANGE TO 10 FOR ALL STRIKES
							// thirdturn=10;
							thirdturn=generator.nextInt(11);
						}
						else
						{
							thirdturn=generator.nextInt(11-secondturn);
						}
						player4.get(9).SetSecondTurn(secondturn);
						player4.get(9).SetThirdTurn(thirdturn);

						// add third and fourth turns to player's total score
						playertotal=firstturn+secondturn+thirdturn;
						player4.get(9).SetPlayerTotal(playertotal);
					}
					// if, on tenth turn, they got a spare (all pins in the first two turns) --> 1 more shot
					else if((player4.get(9).GetFirstTurn()+player4.get(9).GetSecondTurn())==10)
					{
						thirdturn=generator.nextInt(11);
						player4.get(9).SetThirdTurn(thirdturn);

						// add third and fourth turns to player's total score
						playertotal=player4.get(9).GetPlayerTotal();
						playertotal=playertotal+thirdturn;
						player4.get(9).SetPlayerTotal(playertotal);
					}
					// if, on the tenth frame, you get an open frame
					else
					{
						playertotal=player4.get(9).GetFirstTurn()+player4.get(9).GetSecondTurn();
						player4.get(9).SetPlayerTotal(playertotal);
					}

					// determine totals for each frame
					for(int frame=0; frame<9; frame++)
					{
						// if there's a strike in the frame, add two turns of next frame
						if(player4.get(frame).GetFirstTurn()==10)
						{
							// if there's a strike in the first turn of the next frame as well
							if(player4.get(frame+1).GetFirstTurn()==10)
							{
								if(frame==8)
								{
									playertotal=player4.get(frame).GetPlayerTotal()+player4.get(frame+1).GetFirstTurn()+player4.get(frame+1).GetSecondTurn();
									player4.get(frame).SetPlayerTotal(playertotal);
								}
								// if there's a strike in the first turn of the next frame as well
								else if(player4.get(frame+2).GetFirstTurn()==10)
								{
									if(frame==7)
									{
										playertotal=player4.get(frame).GetPlayerTotal()+player4.get(frame+1).GetPlayerTotal()+player4.get(frame+2).GetFirstTurn();
										player4.get(frame).SetPlayerTotal(playertotal);
									}
									else
									{
										playertotal=player4.get(frame).GetPlayerTotal()+player4.get(frame+1).GetPlayerTotal()+player4.get(frame+2).GetPlayerTotal();
										player4.get(frame).SetPlayerTotal(playertotal);
									}
								}
								// if there's not a strike in the first turn of the next frame
								else
								{
									playertotal=player4.get(frame).GetPlayerTotal()+player4.get(frame+1).GetPlayerTotal()+player4.get(frame+2).GetFirstTurn();
									player4.get(frame).SetPlayerTotal(playertotal);
								}
							}
							// if there's not a strike in the first turn of the next frame
							else
							{
								if(frame==8)
								{
									playertotal=player4.get(frame).GetPlayerTotal()+player4.get(frame+1).GetFirstTurn()+player4.get(frame+1).GetSecondTurn();
									player4.get(frame).SetPlayerTotal(playertotal);
								}
								else
								{
									playertotal=player4.get(frame).GetPlayerTotal()+player4.get(frame+1).GetPlayerTotal();
									player4.get(frame).SetPlayerTotal(playertotal);
								}
							}
						}

						// if there's a spare in the frame, add one turn of next frame
						else if((player4.get(frame).GetFirstTurn()+player4.get(frame).GetSecondTurn())==10)
						{
							playertotal=player4.get(frame).GetPlayerTotal()+player4.get(frame+1).GetFirstTurn();
							player4.get(frame).SetPlayerTotal(playertotal);
						}

						// if there's an open frame, only add the two turns in that frame
						else if(player4.get(frame).GetPlayerTotal()<10)
						{
							playertotal=player4.get(frame).GetFirstTurn()+player4.get(frame).GetSecondTurn();
							player4.get(frame).SetPlayerTotal(playertotal);
						}
					}
					
					if(numOfPlayers==5)
					{
						// determine all first 9 turns before finding totals
						for(int turnCounter=0; turnCounter<10; turnCounter++)
						{
							// CHANGE TO 10 FOR ALL STRIKES
							// firstturn=10;
							// comment out the firstturn generator below this
							
							// FOR ALL SPARES
							// firstturn=generator.nextInt(10);
							// secondturn=10-firstturn;
							// comment out the firstturn generator, if, and else statements directly below this
							
							// FOR ALL STRIKES AND SPARES
							// firstturn=generator.nextInt(11);
							// if(firstturn==10)
							//{
								//secondturn=0;
							//}
							//else
							//{
								//secondturn=10-firstturn;
							//}
							
							firstturn=generator.nextInt(11);
							if(firstturn==10)
							{
								secondturn=0;
							}
							else
							{
								secondturn=generator.nextInt(11-firstturn);
							}
							player5.get(turnCounter).SetFirstTurn(firstturn);
							player5.get(turnCounter).SetSecondTurn(secondturn);

							// add first and second turns, pass into player total
							playertotal=firstturn+secondturn;
							player5.get(turnCounter).SetPlayerTotal(playertotal);
						}

						// special conditions for scoring the tenth frame
						// if, on tenth turn, they got a strike (all pins in first turn) --> 2 more shots (can get another strike or spare)
						if(player5.get(9).GetFirstTurn()==10)
						{
							firstturn=player4.get(9).GetFirstTurn();
							// CHANGE TO 10 FOR ALL STRIKES
							// secondturn=10;
							secondturn=generator.nextInt(11);
							if(secondturn==10)
							{
								// CHANGE TO 10 FOR ALL STRIKES
								// thirdturn=10;
								thirdturn=generator.nextInt(11);
							}
							else
							{
								thirdturn=generator.nextInt(11-secondturn);
							}
							player5.get(9).SetSecondTurn(secondturn);
							player5.get(9).SetThirdTurn(thirdturn);

							// add third and fourth turns to player's total score
							playertotal=firstturn+secondturn+thirdturn;
							player5.get(9).SetPlayerTotal(playertotal);
						}
						// if, on tenth turn, they got a spare (all pins in the first two turns) --> 1 more shot
						else if((player5.get(9).GetFirstTurn()+player5.get(9).GetSecondTurn())==10)
						{
							thirdturn=generator.nextInt(11);
							player5.get(9).SetThirdTurn(thirdturn);

							// add third and fourth turns to player's total score
							playertotal=player5.get(9).GetPlayerTotal();
							playertotal=playertotal+thirdturn;
							player5.get(9).SetPlayerTotal(playertotal);
						}
						// if, on the tenth frame, you get an open frame
						else
						{
							playertotal=player5.get(9).GetFirstTurn()+player5.get(9).GetSecondTurn();
							player5.get(9).SetPlayerTotal(playertotal);
						}

						// determine totals for each frame
						for(int frame=0; frame<9; frame++)
						{
							// if there's a strike in the frame, add two turns of next frame
							if(player5.get(frame).GetFirstTurn()==10)
							{
								// if there's a strike in the first turn of the next frame as well
								if(player5.get(frame+1).GetFirstTurn()==10)
								{
									if(frame==8)
									{
										playertotal=player5.get(frame).GetPlayerTotal()+player5.get(frame+1).GetFirstTurn()+player5.get(frame+1).GetSecondTurn();
										player5.get(frame).SetPlayerTotal(playertotal);
									}
									// if there's a strike in the first turn of the next frame as well
									else if(player5.get(frame+2).GetFirstTurn()==10)
									{
										if(frame==7)
										{
											playertotal=player5.get(frame).GetPlayerTotal()+player5.get(frame+1).GetPlayerTotal()+player5.get(frame+2).GetFirstTurn();
											player5.get(frame).SetPlayerTotal(playertotal);
										}
										else
										{
											playertotal=player5.get(frame).GetPlayerTotal()+player5.get(frame+1).GetPlayerTotal()+player5.get(frame+2).GetPlayerTotal();
											player5.get(frame).SetPlayerTotal(playertotal);
										}
									}
									// if there's not a strike in the first turn of the next frame
									else
									{
										playertotal=player5.get(frame).GetPlayerTotal()+player5.get(frame+1).GetPlayerTotal()+player5.get(frame+2).GetFirstTurn();
										player5.get(frame).SetPlayerTotal(playertotal);
									}
								}
								// if there's not a strike in the first turn of the next frame
								else
								{
									if(frame==8)
									{
										playertotal=player5.get(frame).GetPlayerTotal()+player5.get(frame+1).GetFirstTurn()+player5.get(frame+1).GetSecondTurn();
										player5.get(frame).SetPlayerTotal(playertotal);
									}
									else
									{
										playertotal=player5.get(frame).GetPlayerTotal()+player5.get(frame+1).GetPlayerTotal();
										player5.get(frame).SetPlayerTotal(playertotal);
									}
								}
							}

							// if there's a spare in the frame, add one turn of next frame
							else if((player5.get(frame).GetFirstTurn()+player5.get(frame).GetSecondTurn())==10)
							{
								playertotal=player5.get(frame).GetPlayerTotal()+player5.get(frame+1).GetFirstTurn();
								player5.get(frame).SetPlayerTotal(playertotal);
							}

							// if there's an open frame, only add the two turns in that frame
							else if(player5.get(frame).GetPlayerTotal()<10)
							{
								playertotal=player5.get(frame).GetFirstTurn()+player5.get(frame).GetSecondTurn();
								player5.get(frame).SetPlayerTotal(playertotal);
							}
						}
					}
				}
			}
		}

		// for printing the frames (first turn is top left, second top right, total in middle
		
		// for current frame
			// check if there's a strike or spare; if there is, then don't print it's total yet
			// go back and see if there's a strike or spare in previous frame
				// if there is a strike, add accordingly
		
		/*for (int i=0; i<10; i++)	
		{
			// for tenth frame
			if(i==9)
			{
				// all strikes on tenth frame
				if(player1.get(9).GetPlayerTotal()==30)
				{
					System.out.println(" _________");
					System.out.println("|X   X   X|");
					System.out.println("|    "+player1.get(i).GetPlayerTotal()+"    |");
					System.out.println("|_________|");
				}
				
				// if the tenth frame total is less than 10
				else if(player1.get(9).GetPlayerTotal()<10)
				{
					System.out.println(" _________");
					System.out.println("|"+player1.get(i).GetFirstTurn()+"   "+player1.get(i).GetSecondTurn()+"   "+player1.get(i).GetThirdTurn()+"|");
					System.out.println("|    "+player1.get(i).GetPlayerTotal()+"    |");
					System.out.println("|_________|");
				}
				
				// if the tenth frame total is greater than 10
				else if(player1.get(9).GetPlayerTotal()>=10)
				{
					// strike on first only, nothing on second and third
					if((player1.get(9).GetFirstTurn()==10)&&((player1.get(9).GetSecondTurn()+player1.get(9).GetThirdTurn())<10))
					{
						System.out.println(" _________");
						System.out.println("|X   "+player1.get(i).GetSecondTurn()+"   "+player1.get(i).GetThirdTurn()+"|");
						System.out.println("|    "+player1.get(i).GetPlayerTotal()+"   |");
						System.out.println("|_________|");
					}
					
					// strikes on first and second rolls
					else if((player1.get(9).GetFirstTurn()==10)&&(player1.get(9).GetSecondTurn()==10)&&(player1.get(9).GetThirdTurn()<10))
					{
						System.out.println(" _________");
						System.out.println("|X   X   "+player1.get(i).GetThirdTurn()+"|");
						System.out.println("|    "+player1.get(i).GetPlayerTotal()+"   |");
						System.out.println("|_________|");		
					}
					
					// strike on first roll, spare on second and third
					else if((player1.get(9).GetFirstTurn()==10)&&((player1.get(9).GetSecondTurn()+player1.get(9).GetThirdTurn())==10))
					{
						System.out.println(" _________");
						System.out.println("|X   "+player1.get(i).GetSecondTurn()+"   /|");
						System.out.println("|    "+player1.get(i).GetPlayerTotal()+"    |");
						System.out.println("|_________|");
					}
					
					// spare on first and second, strike on third
					else if(((player1.get(9).GetFirstTurn()+player1.get(9).GetSecondTurn())==10)&&(player1.get(9).GetThirdTurn()==10))
					{
						System.out.println(" _________");
						System.out.println("|"+player1.get(i).GetFirstTurn()+"   /   X|");
						System.out.println("|    "+player1.get(i).GetPlayerTotal()+"   |");
						System.out.println("|_________|");
					}
					
					// spare on first and second, nothing on third
					else if(((player1.get(9).GetFirstTurn()+player1.get(9).GetSecondTurn())==10)&&(player1.get(9).GetThirdTurn()<10))
					{
						System.out.println(" _________");
						System.out.println("|"+player1.get(i).GetFirstTurn()+"   /   "+player1.get(i).GetThirdTurn()+"|");
						System.out.println("|    "+player1.get(i).GetPlayerTotal()+"   |");
						System.out.println("|_________|");
					}
					
					// no strikes or spares
					else
					{
						System.out.println(" _________");
						System.out.println("|"+player1.get(i).GetFirstTurn()+"   "+player1.get(i).GetSecondTurn()+"   "+player1.get(i).GetThirdTurn()+"|");
						System.out.println("|   "+player1.get(i).GetPlayerTotal()+"    |");
						System.out.println("|_________|");
					}
				}
			}
			
			// if frame isn't tenth frame and total is less than 10
			else if(player1.get(i).GetPlayerTotal()<10)
			{
				System.out.println(" _________");
				System.out.println("|"+player1.get(i).GetFirstTurn()+"       "+player1.get(i).GetSecondTurn()+"|");
				System.out.println("|    "+player1.get(i).GetPlayerTotal()+"    |");
				System.out.println("|_________|");
			}
			
			// if frame isn't tenth frame and total is greater than 10
			else if(player1.get(i).GetPlayerTotal()>=10)
			{
				if(player1.get(i).GetFirstTurn()==10)
				{
					System.out.println(" _________");
					System.out.println("|X       0|");
					System.out.println("|   "+player1.get(i).GetPlayerTotal()+"    |");
					System.out.println("|_________|");
				}
				else if((player1.get(i).GetFirstTurn()+player1.get(i).GetSecondTurn())==10)
				{
					System.out.println(" _________");
					System.out.println("|"+player1.get(i).GetFirstTurn()+"       /|");
					System.out.println("|   "+player1.get(i).GetPlayerTotal()+"    |");
					System.out.println("|_________|");
				}
				else
				{
					System.out.println(" _________");
					System.out.println("|"+player1.get(i).GetFirstTurn()+"      "+player1.get(i).GetSecondTurn()+"|");
					System.out.println("|   "+player1.get(i).GetPlayerTotal()+"    |");
					System.out.println("|_________|");
				}
			}
		}*/
		
		// for printing the bowling game
		for(int frame=0; frame<10; frame++)
		{
			// print the frame
			System.out.println("Frame "+(frame+1));
			System.out.println("");
			
			// print player
			System.out.println("Player 1: "+player1Name);
			
			// add the bar at the top of the frame
			for(int topBar=0; topBar<=frame; topBar++)
			{
				System.out.print(" _________ ");
			}
			
			System.out.println("");
			
			// print each turn at the top of the frame
			for(int i=0; i<=frame; i++)
			{
				if(i==9)
				{
					// all strikes on tenth frame
					if(player1.get(9).GetPlayerTotal()==30)
					{
						System.out.print("|X   X   X|");
					}
					
					// if the tenth frame total is less than 10
					else if(player1.get(9).GetPlayerTotal()<10)
					{
						System.out.print("|"+player1.get(i).GetFirstTurn()+"   "+player1.get(i).GetSecondTurn()+"  --|");
					}
					
					// if the tenth frame total is greater than 10
					else if(player1.get(9).GetPlayerTotal()>=10)
					{
						// strike on first only, nothing on second and third
						if((player1.get(9).GetFirstTurn()==10)&&((player1.get(9).GetSecondTurn()+player1.get(9).GetThirdTurn())<10))
						{
							System.out.print("|X   "+player1.get(i).GetSecondTurn()+"   "+player1.get(i).GetThirdTurn()+"|");
						}
						
						// strikes on first and second rolls
						else if((player1.get(9).GetFirstTurn()==10)&&(player1.get(9).GetSecondTurn()==10)&&(player1.get(9).GetThirdTurn()<10))
						{
							System.out.print("|X   X   "+player1.get(i).GetThirdTurn()+"|");		
						}
						
						// strike on first roll, spare on second and third
						else if((player1.get(9).GetFirstTurn()==10)&&((player1.get(9).GetSecondTurn()+player1.get(9).GetThirdTurn())==10))
						{
							System.out.print("|X   "+player1.get(i).GetSecondTurn()+"   /|");
						}
						
						// spare on first and second, strike on third
						else if(((player1.get(9).GetFirstTurn()+player1.get(9).GetSecondTurn())==10)&&(player1.get(9).GetThirdTurn()==10))
						{
							System.out.print("|"+player1.get(i).GetFirstTurn()+"   /   X|");
						}
						
						// spare on first and second, nothing on third
						else if(((player1.get(9).GetFirstTurn()+player1.get(9).GetSecondTurn())==10)&&(player1.get(9).GetThirdTurn()<10))
						{
							System.out.print("|"+player1.get(i).GetFirstTurn()+"   /   "+player1.get(i).GetThirdTurn()+"|");
						}
						
						// no strikes or spares
						else
						{
							System.out.print("|"+player1.get(i).GetFirstTurn()+"   "+player1.get(i).GetSecondTurn()+"   "+player1.get(i).GetThirdTurn()+"|");
						}
					}
				}
				
				// if frame isn't tenth frame and total is less than 10
				else if(player1.get(i).GetPlayerTotal()<10)
				{
					System.out.print("|"+player1.get(i).GetFirstTurn()+"       "+player1.get(i).GetSecondTurn()+"|");
				}
				
				// if frame isn't tenth frame and total is greater than 10
				else if(player1.get(i).GetPlayerTotal()>=10)
				{
					if(player1.get(i).GetFirstTurn()==10)
					{
						System.out.print("|X       0|");
					}
					else if((player1.get(i).GetFirstTurn()+player1.get(i).GetSecondTurn())==10)
					{
						System.out.print("|"+player1.get(i).GetFirstTurn()+"       /|");
					}
					else
					{
						System.out.print("|"+player1.get(i).GetFirstTurn()+"      "+player1.get(i).GetSecondTurn()+"|");
					}
				}
			}
			
			System.out.println("");
			
			// add the total to the frame
			for(int j=0; j<=frame; j++)
			{
				playertotal=0;
				for(int i=0; i<=j; i++)
				{
					playertotal=playertotal+player1.get(i).GetPlayerTotal();
				}
				
				// as long as the frame isn't the last one (tenth one)
				if(frame<9)
				{
					// if there's a strike two frames ago, one frame ago, and in the current frame
					//if((j==frame-2)&&(player1.get(frame).GetFirstTurn()==10)&&(player1.get(j).GetFirstTurn()==10)&&(player1.get(j+1).GetFirstTurn()==10))
					//{	
						//System.out.print("|         |");
					//}
					
					// if there's a strike in the previous frame and current frame
					if((j==frame-1)&&(player1.get(frame).GetFirstTurn()==10)&&(player1.get(j).GetFirstTurn()==10))
					{	
						System.out.print("|         |");
					}
					
					// if there's a strike or spare in current frame
					else if((j==frame)&&((player1.get(j).GetFirstTurn()==10)||(player1.get(j).GetFirstTurn()+player1.get(j).GetSecondTurn()==10)))
					{	
						System.out.print("|         |");
					}
						
					// if none of the above is true but frame is less than the last (tenth) one
					else
					{
						if(playertotal<10)
						{
							System.out.print("|    "+playertotal+"    |");
						}
						else if((playertotal>=10)&&(playertotal<100))
						{
							System.out.print("|   "+playertotal+"    |");
						}
						else if(playertotal>=100)
						{
							System.out.print("|   "+playertotal+"   |");
						}
					}
				}
				
				// if frame is the 9 (tenth and last frame)
				else
				{
					if(playertotal<10)
					{
						System.out.print("|    "+playertotal+"    |");
					}
					else if((playertotal>=10)&&(playertotal<100))
					{
						System.out.print("|   "+playertotal+"    |");
					}
					else if(playertotal>=100)
					{
						System.out.print("|   "+playertotal+"   |");
					}
				}
			}
					
			System.out.println("");
			
			for(int k=0; k<=frame; k++)
			{
				System.out.print("|_________|");
			}
			
			if(numOfPlayers>=2)
			{
				System.out.println("");
				
				// print player
				System.out.println("Player 2: "+player2Name);
				
				// add the bar at the top of the frame
				for(int topBar=0; topBar<=frame; topBar++)
				{
					System.out.print(" _________ ");
				}
				
				System.out.println("");
				
				// print each turn at the top of the frame
				for(int i=0; i<=frame; i++)
				{
					if(i==9)
					{
						// all strikes on tenth frame
						if(player2.get(9).GetPlayerTotal()==30)
						{
							System.out.print("|X   X   X|");
						}
						
						// if the tenth frame total is less than 10
						else if(player2.get(9).GetPlayerTotal()<10)
						{
							System.out.print("|"+player2.get(i).GetFirstTurn()+"   "+player2.get(i).GetSecondTurn()+"  --|");
						}
						
						// if the tenth frame total is greater than 10
						else if(player2.get(9).GetPlayerTotal()>=10)
						{
							// strike on first only, nothing on second and third
							if((player2.get(9).GetFirstTurn()==10)&&((player2.get(9).GetSecondTurn()+player2.get(9).GetThirdTurn())<10))
							{
								System.out.print("|X   "+player2.get(i).GetSecondTurn()+"   "+player2.get(i).GetThirdTurn()+"|");
							}
							
							// strikes on first and second rolls
							else if((player2.get(9).GetFirstTurn()==10)&&(player2.get(9).GetSecondTurn()==10)&&(player2.get(9).GetThirdTurn()<10))
							{
								System.out.print("|X   X   "+player2.get(i).GetThirdTurn()+"|");		
							}
							
							// strike on first roll, spare on second and third
							else if((player2.get(9).GetFirstTurn()==10)&&((player2.get(9).GetSecondTurn()+player2.get(9).GetThirdTurn())==10))
							{
								System.out.print("|X   "+player2.get(i).GetSecondTurn()+"   /|");
							}
							
							// spare on first and second, strike on third
							else if(((player2.get(9).GetFirstTurn()+player2.get(9).GetSecondTurn())==10)&&(player2.get(9).GetThirdTurn()==10))
							{
								System.out.print("|"+player2.get(i).GetFirstTurn()+"   /   X|");
							}
							
							// spare on first and second, nothing on third
							else if(((player2.get(9).GetFirstTurn()+player2.get(9).GetSecondTurn())==10)&&(player2.get(9).GetThirdTurn()<10))
							{
								System.out.print("|"+player2.get(i).GetFirstTurn()+"   /   "+player2.get(i).GetThirdTurn()+"|");
							}
							
							// no strikes or spares
							else
							{
								System.out.print("|"+player2.get(i).GetFirstTurn()+"   "+player2.get(i).GetSecondTurn()+"   "+player2.get(i).GetThirdTurn()+"|");
							}
						}
					}
					
					// if frame isn't tenth frame and total is less than 10
					else if(player2.get(i).GetPlayerTotal()<10)
					{
						System.out.print("|"+player2.get(i).GetFirstTurn()+"       "+player2.get(i).GetSecondTurn()+"|");
					}
					
					// if frame isn't tenth frame and total is greater than 10
					else if(player2.get(i).GetPlayerTotal()>=10)
					{
						if(player2.get(i).GetFirstTurn()==10)
						{
							System.out.print("|X       0|");
						}
						else if((player2.get(i).GetFirstTurn()+player2.get(i).GetSecondTurn())==10)
						{
							System.out.print("|"+player2.get(i).GetFirstTurn()+"       /|");
						}
						else
						{
							System.out.print("|"+player2.get(i).GetFirstTurn()+"      "+player2.get(i).GetSecondTurn()+"|");
						}
					}
				}
				
				System.out.println("");
				
				// add the total to the frame
				for(int j=0; j<=frame; j++)
				{
					playertotal=0;
					for(int i=0; i<=j; i++)
					{
						playertotal=playertotal+player2.get(i).GetPlayerTotal();
					}
					
					// as long as the frame isn't the last one (tenth one)
					if(frame<9)
					{
						// if there's a strike two frames ago, one frame ago, and in the current frame
						//if((j==frame-2)&&(player1.get(frame).GetFirstTurn()==10)&&(player1.get(j).GetFirstTurn()==10)&&(player1.get(j+1).GetFirstTurn()==10))
						//{	
							//System.out.print("|         |");
						//}
						
						// if there's a strike in the previous frame and current frame
						if((j==frame-1)&&(player2.get(frame).GetFirstTurn()==10)&&(player2.get(j).GetFirstTurn()==10))
						{	
							System.out.print("|         |");
						}
						
						// if there's a strike or spare in current frame
						else if((j==frame)&&((player2.get(j).GetFirstTurn()==10)||(player2.get(j).GetFirstTurn()+player2.get(j).GetSecondTurn()==10)))
						{	
							System.out.print("|         |");
						}
							
						// if none of the above is true but frame is less than the last (tenth) one
						else
						{
							if(playertotal<10)
							{
								System.out.print("|    "+playertotal+"    |");
							}
							else if((playertotal>=10)&&(playertotal<100))
							{
								System.out.print("|   "+playertotal+"    |");
							}
							else if(playertotal>=100)
							{
								System.out.print("|   "+playertotal+"   |");
							}
						}
					}
					
					// if frame is the 9 (tenth and last frame)
					else
					{
						if(playertotal<10)
						{
							System.out.print("|    "+playertotal+"    |");
						}
						else if((playertotal>=10)&&(playertotal<100))
						{
							System.out.print("|   "+playertotal+"    |");
						}
						else if(playertotal>=100)
						{
							System.out.print("|   "+playertotal+"   |");
						}
					}
				}
						
				System.out.println("");
				
				for(int k=0; k<=frame; k++)
				{
					System.out.print("|_________|");
				}
				
				if(numOfPlayers>=3)
				{
					System.out.println("");
					
					// print player
					System.out.println("Player 3: "+player3Name);
					
					// add the bar at the top of the frame
					for(int topBar=0; topBar<=frame; topBar++)
					{
						System.out.print(" _________ ");
					}
					
					System.out.println("");
					
					// print each turn at the top of the frame
					for(int i=0; i<=frame; i++)
					{
						if(i==9)
						{
							// all strikes on tenth frame
							if(player3.get(9).GetPlayerTotal()==30)
							{
								System.out.print("|X   X   X|");
							}
							
							// if the tenth frame total is less than 10
							else if(player3.get(9).GetPlayerTotal()<10)
							{
								System.out.print("|"+player3.get(i).GetFirstTurn()+"   "+player3.get(i).GetSecondTurn()+"  --|");
							}
							
							// if the tenth frame total is greater than 10
							else if(player3.get(9).GetPlayerTotal()>=10)
							{
								// strike on first only, nothing on second and third
								if((player3.get(9).GetFirstTurn()==10)&&((player3.get(9).GetSecondTurn()+player3.get(9).GetThirdTurn())<10))
								{
									System.out.print("|X   "+player3.get(i).GetSecondTurn()+"   "+player3.get(i).GetThirdTurn()+"|");
								}
								
								// strikes on first and second rolls
								else if((player3.get(9).GetFirstTurn()==10)&&(player3.get(9).GetSecondTurn()==10)&&(player3.get(9).GetThirdTurn()<10))
								{
									System.out.print("|X   X   "+player3.get(i).GetThirdTurn()+"|");		
								}
								
								// strike on first roll, spare on second and third
								else if((player3.get(9).GetFirstTurn()==10)&&((player3.get(9).GetSecondTurn()+player3.get(9).GetThirdTurn())==10))
								{
									System.out.print("|X   "+player3.get(i).GetSecondTurn()+"   /|");
								}
								
								// spare on first and second, strike on third
								else if(((player3.get(9).GetFirstTurn()+player3.get(9).GetSecondTurn())==10)&&(player3.get(9).GetThirdTurn()==10))
								{
									System.out.print("|"+player3.get(i).GetFirstTurn()+"   /   X|");
								}
								
								// spare on first and second, nothing on third
								else if(((player3.get(9).GetFirstTurn()+player3.get(9).GetSecondTurn())==10)&&(player3.get(9).GetThirdTurn()<10))
								{
									System.out.print("|"+player3.get(i).GetFirstTurn()+"   /   "+player3.get(i).GetThirdTurn()+"|");
								}
								
								// no strikes or spares
								else
								{
									System.out.print("|"+player3.get(i).GetFirstTurn()+"   "+player3.get(i).GetSecondTurn()+"   "+player3.get(i).GetThirdTurn()+"|");
								}
							}
						}
						
						// if frame isn't tenth frame and total is less than 10
						else if(player3.get(i).GetPlayerTotal()<10)
						{
							System.out.print("|"+player3.get(i).GetFirstTurn()+"       "+player3.get(i).GetSecondTurn()+"|");
						}
						
						// if frame isn't tenth frame and total is greater than 10
						else if(player3.get(i).GetPlayerTotal()>=10)
						{
							if(player3.get(i).GetFirstTurn()==10)
							{
								System.out.print("|X       0|");
							}
							else if((player3.get(i).GetFirstTurn()+player3.get(i).GetSecondTurn())==10)
							{
								System.out.print("|"+player3.get(i).GetFirstTurn()+"       /|");
							}
							else
							{
								System.out.print("|"+player3.get(i).GetFirstTurn()+"      "+player3.get(i).GetSecondTurn()+"|");
							}
						}
					}
					
					System.out.println("");
					
					// add the total to the frame
					for(int j=0; j<=frame; j++)
					{
						playertotal=0;
						for(int i=0; i<=j; i++)
						{
							playertotal=playertotal+player3.get(i).GetPlayerTotal();
						}
						
						// as long as the frame isn't the last one (tenth one)
						if(frame<9)
						{
							// if there's a strike two frames ago, one frame ago, and in the current frame
							//if((j==frame-2)&&(player1.get(frame).GetFirstTurn()==10)&&(player1.get(j).GetFirstTurn()==10)&&(player1.get(j+1).GetFirstTurn()==10))
							//{	
								//System.out.print("|         |");
							//}
							
							// if there's a strike in the previous frame and current frame
							if((j==frame-1)&&(player3.get(frame).GetFirstTurn()==10)&&(player3.get(j).GetFirstTurn()==10))
							{	
								System.out.print("|         |");
							}
							
							// if there's a strike or spare in current frame
							else if((j==frame)&&((player3.get(j).GetFirstTurn()==10)||(player3.get(j).GetFirstTurn()+player3.get(j).GetSecondTurn()==10)))
							{	
								System.out.print("|         |");
							}
								
							// if none of the above is true but frame is less than the last (tenth) one
							else
							{
								if(playertotal<10)
								{
									System.out.print("|    "+playertotal+"    |");
								}
								else if((playertotal>=10)&&(playertotal<100))
								{
									System.out.print("|   "+playertotal+"    |");
								}
								else if(playertotal>=100)
								{
									System.out.print("|   "+playertotal+"   |");
								}
							}
						}
						
						// if frame is the 9 (tenth and last frame)
						else
						{
							if(playertotal<10)
							{
								System.out.print("|    "+playertotal+"    |");
							}
							else if((playertotal>=10)&&(playertotal<100))
							{
								System.out.print("|   "+playertotal+"    |");
							}
							else if(playertotal>=100)
							{
								System.out.print("|   "+playertotal+"   |");
							}
						}
					}
							
					System.out.println("");
					
					for(int k=0; k<=frame; k++)
					{
						System.out.print("|_________|");
					}
					
					if(numOfPlayers>=4)
					{
						System.out.println("");
						
						// print player
						System.out.println("Player 4: "+player4Name);
						
						// add the bar at the top of the frame
						for(int topBar=0; topBar<=frame; topBar++)
						{
							System.out.print(" _________ ");
						}
						
						System.out.println("");
						
						// print each turn at the top of the frame
						for(int i=0; i<=frame; i++)
						{
							if(i==9)
							{
								// all strikes on tenth frame
								if(player4.get(9).GetPlayerTotal()==30)
								{
									System.out.print("|X   X   X|");
								}
								
								// if the tenth frame total is less than 10
								else if(player4.get(9).GetPlayerTotal()<10)
								{
									System.out.print("|"+player4.get(i).GetFirstTurn()+"   "+player4.get(i).GetSecondTurn()+"  --|");
								}
								
								// if the tenth frame total is greater than 10
								else if(player4.get(9).GetPlayerTotal()>=10)
								{
									// strike on first only, nothing on second and third
									if((player4.get(9).GetFirstTurn()==10)&&((player4.get(9).GetSecondTurn()+player4.get(9).GetThirdTurn())<10))
									{
										System.out.print("|X   "+player4.get(i).GetSecondTurn()+"   "+player4.get(i).GetThirdTurn()+"|");
									}
									
									// strikes on first and second rolls
									else if((player4.get(9).GetFirstTurn()==10)&&(player4.get(9).GetSecondTurn()==10)&&(player4.get(9).GetThirdTurn()<10))
									{
										System.out.print("|X   X   "+player4.get(i).GetThirdTurn()+"|");		
									}
									
									// strike on first roll, spare on second and third
									else if((player4.get(9).GetFirstTurn()==10)&&((player4.get(9).GetSecondTurn()+player4.get(9).GetThirdTurn())==10))
									{
										System.out.print("|X   "+player4.get(i).GetSecondTurn()+"   /|");
									}
									
									// spare on first and second, strike on third
									else if(((player4.get(9).GetFirstTurn()+player4.get(9).GetSecondTurn())==10)&&(player4.get(9).GetThirdTurn()==10))
									{
										System.out.print("|"+player4.get(i).GetFirstTurn()+"   /   X|");
									}
									
									// spare on first and second, nothing on third
									else if(((player4.get(9).GetFirstTurn()+player4.get(9).GetSecondTurn())==10)&&(player4.get(9).GetThirdTurn()<10))
									{
										System.out.print("|"+player4.get(i).GetFirstTurn()+"   /   "+player4.get(i).GetThirdTurn()+"|");
									}
									
									// no strikes or spares
									else
									{
										System.out.print("|"+player4.get(i).GetFirstTurn()+"   "+player4.get(i).GetSecondTurn()+"   "+player4.get(i).GetThirdTurn()+"|");
									}
								}
							}
							
							// if frame isn't tenth frame and total is less than 10
							else if(player4.get(i).GetPlayerTotal()<10)
							{
								System.out.print("|"+player4.get(i).GetFirstTurn()+"       "+player4.get(i).GetSecondTurn()+"|");
							}
							
							// if frame isn't tenth frame and total is greater than 10
							else if(player4.get(i).GetPlayerTotal()>=10)
							{
								if(player4.get(i).GetFirstTurn()==10)
								{
									System.out.print("|X       0|");
								}
								else if((player4.get(i).GetFirstTurn()+player4.get(i).GetSecondTurn())==10)
								{
									System.out.print("|"+player4.get(i).GetFirstTurn()+"       /|");
								}
								else
								{
									System.out.print("|"+player4.get(i).GetFirstTurn()+"      "+player4.get(i).GetSecondTurn()+"|");
								}
							}
						}
						
						System.out.println("");
						
						// add the total to the frame
						for(int j=0; j<=frame; j++)
						{
							playertotal=0;
							for(int i=0; i<=j; i++)
							{
								playertotal=playertotal+player4.get(i).GetPlayerTotal();
							}
							
							// as long as the frame isn't the last one (tenth one)
							if(frame<9)
							{
								// if there's a strike two frames ago, one frame ago, and in the current frame
								//if((j==frame-2)&&(player1.get(frame).GetFirstTurn()==10)&&(player1.get(j).GetFirstTurn()==10)&&(player1.get(j+1).GetFirstTurn()==10))
								//{	
									//System.out.print("|         |");
								//}
								
								// if there's a strike in the previous frame and current frame
								if((j==frame-1)&&(player4.get(frame).GetFirstTurn()==10)&&(player4.get(j).GetFirstTurn()==10))
								{	
									System.out.print("|         |");
								}
								
								// if there's a strike or spare in current frame
								else if((j==frame)&&((player4.get(j).GetFirstTurn()==10)||(player4.get(j).GetFirstTurn()+player4.get(j).GetSecondTurn()==10)))
								{	
									System.out.print("|         |");
								}
									
								// if none of the above is true but frame is less than the last (tenth) one
								else
								{
									if(playertotal<10)
									{
										System.out.print("|    "+playertotal+"    |");
									}
									else if((playertotal>=10)&&(playertotal<100))
									{
										System.out.print("|   "+playertotal+"    |");
									}
									else if(playertotal>=100)
									{
										System.out.print("|   "+playertotal+"   |");
									}
								}
							}
							
							// if frame is the 9 (tenth and last frame)
							else
							{
								if(playertotal<10)
								{
									System.out.print("|    "+playertotal+"    |");
								}
								else if((playertotal>=10)&&(playertotal<100))
								{
									System.out.print("|   "+playertotal+"    |");
								}
								else if(playertotal>=100)
								{
									System.out.print("|   "+playertotal+"   |");
								}
							}
						}
								
						System.out.println("");
						
						for(int k=0; k<=frame; k++)
						{
							System.out.print("|_________|");
						}
						
						if(numOfPlayers==5)
						{
							System.out.println("");
							
							// print player
							System.out.println("Player 5: "+player5Name);
							
							// add the bar at the top of the frame
							for(int topBar=0; topBar<=frame; topBar++)
							{
								System.out.print(" _________ ");
							}
							
							System.out.println("");
							
							// print each turn at the top of the frame
							for(int i=0; i<=frame; i++)
							{
								if(i==9)
								{
									// all strikes on tenth frame
									if(player5.get(9).GetPlayerTotal()==30)
									{
										System.out.print("|X   X   X|");
									}
									
									// if the tenth frame total is less than 10
									else if(player5.get(9).GetPlayerTotal()<10)
									{
										System.out.print("|"+player5.get(i).GetFirstTurn()+"   "+player5.get(i).GetSecondTurn()+"  --|");
									}
									
									// if the tenth frame total is greater than 10
									else if(player5.get(9).GetPlayerTotal()>=10)
									{
										// strike on first only, nothing on second and third
										if((player5.get(9).GetFirstTurn()==10)&&((player5.get(9).GetSecondTurn()+player5.get(9).GetThirdTurn())<10))
										{
											System.out.print("|X   "+player5.get(i).GetSecondTurn()+"   "+player5.get(i).GetThirdTurn()+"|");
										}
										
										// strikes on first and second rolls
										else if((player5.get(9).GetFirstTurn()==10)&&(player5.get(9).GetSecondTurn()==10)&&(player5.get(9).GetThirdTurn()<10))
										{
											System.out.print("|X   X   "+player5.get(i).GetThirdTurn()+"|");		
										}
										
										// strike on first roll, spare on second and third
										else if((player5.get(9).GetFirstTurn()==10)&&((player5.get(9).GetSecondTurn()+player5.get(9).GetThirdTurn())==10))
										{
											System.out.print("|X   "+player5.get(i).GetSecondTurn()+"   /|");
										}
										
										// spare on first and second, strike on third
										else if(((player5.get(9).GetFirstTurn()+player5.get(9).GetSecondTurn())==10)&&(player5.get(9).GetThirdTurn()==10))
										{
											System.out.print("|"+player5.get(i).GetFirstTurn()+"   /   X|");
										}
										
										// spare on first and second, nothing on third
										else if(((player5.get(9).GetFirstTurn()+player5.get(9).GetSecondTurn())==10)&&(player5.get(9).GetThirdTurn()<10))
										{
											System.out.print("|"+player5.get(i).GetFirstTurn()+"   /   "+player5.get(i).GetThirdTurn()+"|");
										}
										
										// no strikes or spares
										else
										{
											System.out.print("|"+player5.get(i).GetFirstTurn()+"   "+player5.get(i).GetSecondTurn()+"   "+player5.get(i).GetThirdTurn()+"|");
										}
									}
								}
								
								// if frame isn't tenth frame and total is less than 10
								else if(player5.get(i).GetPlayerTotal()<10)
								{
									System.out.print("|"+player5.get(i).GetFirstTurn()+"       "+player5.get(i).GetSecondTurn()+"|");
								}
								
								// if frame isn't tenth frame and total is greater than 10
								else if(player5.get(i).GetPlayerTotal()>=10)
								{
									if(player5.get(i).GetFirstTurn()==10)
									{
										System.out.print("|X       0|");
									}
									else if((player5.get(i).GetFirstTurn()+player5.get(i).GetSecondTurn())==10)
									{
										System.out.print("|"+player5.get(i).GetFirstTurn()+"       /|");
									}
									else
									{
										System.out.print("|"+player5.get(i).GetFirstTurn()+"      "+player5.get(i).GetSecondTurn()+"|");
									}
								}
							}
							
							System.out.println("");
							
							// add the total to the frame
							for(int j=0; j<=frame; j++)
							{
								playertotal=0;
								for(int i=0; i<=j; i++)
								{
									playertotal=playertotal+player5.get(i).GetPlayerTotal();
								}
								
								// as long as the frame isn't the last one (tenth one)
								if(frame<9)
								{
									// if there's a strike two frames ago, one frame ago, and in the current frame
									//if((j==frame-2)&&(player1.get(frame).GetFirstTurn()==10)&&(player1.get(j).GetFirstTurn()==10)&&(player1.get(j+1).GetFirstTurn()==10))
									//{	
										//System.out.print("|         |");
									//}
									
									// if there's a strike in the previous frame and current frame
									if((j==frame-1)&&(player5.get(frame).GetFirstTurn()==10)&&(player5.get(j).GetFirstTurn()==10))
									{	
										System.out.print("|         |");
									}
									
									// if there's a strike or spare in current frame
									else if((j==frame)&&((player5.get(j).GetFirstTurn()==10)||(player5.get(j).GetFirstTurn()+player5.get(j).GetSecondTurn()==10)))
									{	
										System.out.print("|         |");
									}
										
									// if none of the above is true but frame is less than the last (tenth) one
									else
									{
										if(playertotal<10)
										{
											System.out.print("|    "+playertotal+"    |");
										}
										else if((playertotal>=10)&&(playertotal<100))
										{
											System.out.print("|   "+playertotal+"    |");
										}
										else if(playertotal>=100)
										{
											System.out.print("|   "+playertotal+"   |");
										}
									}
								}
								
								// if frame is the 9 (tenth and last frame)
								else
								{
									if(playertotal<10)
									{
										System.out.print("|    "+playertotal+"    |");
									}
									else if((playertotal>=10)&&(playertotal<100))
									{
										System.out.print("|   "+playertotal+"    |");
									}
									else if(playertotal>=100)
									{
										System.out.print("|   "+playertotal+"   |");
									}
								}
							}
									
							System.out.println("");
							
							for(int k=0; k<=frame; k++)
							{
								System.out.print("|_________|");
							}
						}
					}
				}
			}
			
			reader.pause();
		}
		
		System.out.println("");
		
		// print the totals at the end
		playertotal=0;
		for(int j=0; j<10; j++)
		{
			playertotal+=player1.get(j).GetPlayerTotal();
		}
		System.out.println("Player 1 ("+player1Name+") Total: "+playertotal);
		
		if(numOfPlayers>=2)
		{
			playertotal=0;
			for(int j=0; j<10; j++)
			{
				playertotal+=player2.get(j).GetPlayerTotal();
			}
			System.out.println("Player 2 ("+player2Name+") Total: "+playertotal);
			
			if(numOfPlayers>=3)
			{
				playertotal=0;
				for(int j=0; j<10; j++)
				{
					playertotal+=player3.get(j).GetPlayerTotal();
				}
				System.out.println("Player 3 ("+player3Name+") Total: "+playertotal);
				
				if(numOfPlayers>=4)
				{
					playertotal=0;
					for(int j=0; j<10; j++)
					{
						playertotal+=player4.get(j).GetPlayerTotal();
					}
					System.out.println("Player 4 ("+player4Name+") Total: "+playertotal);
					
					if(numOfPlayers==5)
					{
						playertotal=0;
						for(int j=0; j<10; j++)
						{
							playertotal+=player5.get(j).GetPlayerTotal();
						}
						System.out.println("Player 5 ("+player5Name+") Total: "+playertotal);
					}
				}
			}
		}
		
		System.out.println();
		
		// for printing purposes
		System.out.println("Player 1 ("+player1Name+") Rolls on Each Frame");
		for(int i=0; i<10; i++)
		{
			firstturn=player1.get(i).GetFirstTurn();
			secondturn=player1.get(i).GetSecondTurn();
			thirdturn=player1.get(i).GetThirdTurn();
			playertotal=player1.get(i).GetPlayerTotal();
			System.out.println(firstturn+", "+secondturn+", "+thirdturn+", "+playertotal);
		}
		
		if(numOfPlayers>=2)
		{
			System.out.println("");
			System.out.println("Player 2 ("+player2Name+") Rolls on Each Frame");
			for(int i=0; i<10; i++)
			{
				firstturn=player2.get(i).GetFirstTurn();
				secondturn=player2.get(i).GetSecondTurn();
				thirdturn=player2.get(i).GetThirdTurn();
				playertotal=player2.get(i).GetPlayerTotal();
				System.out.println(firstturn+", "+secondturn+", "+thirdturn+", "+playertotal);
			}
			
			if(numOfPlayers>=3)
			{
				System.out.println("");
				System.out.println("Player 3 ("+player3Name+") Rolls on Each Frame");
				for(int i=0; i<10; i++)
				{
					firstturn=player3.get(i).GetFirstTurn();
					secondturn=player3.get(i).GetSecondTurn();
					thirdturn=player3.get(i).GetThirdTurn();
					playertotal=player3.get(i).GetPlayerTotal();
					System.out.println(firstturn+", "+secondturn+", "+thirdturn+", "+playertotal);
				}
				
				if(numOfPlayers>=4)
				{
					System.out.println("");
					System.out.println("Player 4 ("+player4Name+") Rolls on Each Frame");
					for(int i=0; i<10; i++)
					{
						firstturn=player4.get(i).GetFirstTurn();
						secondturn=player4.get(i).GetSecondTurn();
						thirdturn=player4.get(i).GetThirdTurn();
						playertotal=player4.get(i).GetPlayerTotal();
						System.out.println(firstturn+", "+secondturn+", "+thirdturn+", "+playertotal);
					}
					
					if(numOfPlayers==5)
					{
						System.out.println("");
						System.out.println("Player 5 ("+player5Name+")  Rolls on Each Frame");
						for(int i=0; i<10; i++)
						{
							firstturn=player5.get(i).GetFirstTurn();
							secondturn=player5.get(i).GetSecondTurn();
							thirdturn=player5.get(i).GetThirdTurn();
							playertotal=player5.get(i).GetPlayerTotal();
							System.out.println(firstturn+", "+secondturn+", "+thirdturn+", "+playertotal);
						}
					}
				}
			}
		}
	}

}
