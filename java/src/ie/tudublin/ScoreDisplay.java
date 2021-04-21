package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	ArrayList<Note> notes = new ArrayList<Note> ();

	public void loadScore()
	{
		int j = 0;

		for (i = 0; i < score.length(); i++)
		{
			if (i< score.length()-1)
			{
				j = i;
			}
			if (score.charAt(i) != '2')
			{
				if (score.charAt(j+1) == '2')
				{
					Note note = new Note(score.charAt(i), 2);
					notes.add(note);
				}
				else
				{
					Note note = new Note(score.charAt(i), 1);
					notes.add(note);
				}
			}
		}
	}

	public void printScores()
	{
		String noteType = notes.toString();
		char c;
		int length = notes.size();
		String Type;
		for (i = 1; i < length+1; i+=2)
		{
			c = noteType.charAt(i);
			if(c == 1)
			{
				Type = "Quaver";
			}
			else
			{
				Type = "Crotchet";
			}
			println(notes.get(i) + " " + Type);
		}
	}

	public void staves()
	{
		strokeWeight(5);
		line(100, 200, 900, 200);
		line(100, 225, 900, 225);
		line(100, 250, 900, 250);
		line(100, 275, 900, 275);
		line(100, 300, 900, 300);
	}

	

	public ArrayList<Note> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Note> notes) {
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
		printScores();
	}

	public void draw()
	{
		String noteType = notes.toString();
		int length = notes.size();
		int y = 325;
		char c;

		background(255);
		staves();
		drawNotes();

		
	}

	public void drawNotes()
	{
		String noteType = notes.toString();
		int length = notes.size();
		int y = 325;
		int x;
		char c;

		for (i = 0; i < length+1; i+=2)
		{
			c = noteType.charAt(i);

			switch (c) {
				case 'D':
					x = 0;
					break;
				case 'E':
					x = 1;
					break;
				case 'F':
					x = 3;
					break;
				case 'G':
					x = 4;
					break;
				case 'A':
					x = 5;
					break;
				case 'B':
					x = 6;
					break;
				case 'c':
					x = 7;
					break;
				case 'd':
					x = 8;
					break;

			if (x!=0)
			{
				x = x *12;
				x = x + 100;
			}
			else
			{
				x = 112;
			}
					
			circle(x, y, 25);
			fill(0,0,0);
			}
			y = y - 25;
		}
	}

	
}
