package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	ArrayList<String> notes;
	public ArrayList<String> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<String> notes) {
		this.notes = notes;
	}

	int i;
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		loadScore();
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{
	}

	public void loadScore()
	{
		String x;
		char y;

		for (i = 0; i < score.length(); i++)
		{
			y = score.charAt(i);
			x = String.valueOf(y);
			notes.add(x);
			//if (score.isDigit())
		}
	}

	public void printScores()
	{
		for (i = 0; i < score.length(); i++)
		{
			println(notes.get(i));
		}
	}
}
