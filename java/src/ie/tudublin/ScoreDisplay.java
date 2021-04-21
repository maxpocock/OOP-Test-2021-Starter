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
		int length = notes.size();
		String Type;
		for (i = 0; i < length; i++)
		{
			String t = notes.get(i);
			if (t.contains("1"))
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
		background(255);
		
	}

	void drawNotes()
	{
	}

	
}
