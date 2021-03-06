/*
 * UCF COP3330 Summer 2021 Assignment Solution
 * Copyright 2021 Harry Hocker
 */

package ucf.assignments;

import java.io.Serializable;
import java.time.LocalDate;

// class must be Serializable to save to file
public class Todo implements Serializable {


	private String dueDate;
	private String todoText;
	private Boolean bool;

	// blank and parameter constructors
	public Todo() {
		// set Date to blank
		// set default string to blank ""
		// set default Boolean to false
		this.dueDate = (LocalDate.now().toString());
		this.todoText = ("");
		this.bool = false;

	}

	public Todo(LocalDate date, String string) {
		// set Date to datepicker date from parameter
		// set string to parameter from GUI
		setDueDate(date.toString());
		setTodoText(string);
		this.bool = false;
	}


	// collection of Getters
	public String getDueDate() {
		// return Date value of object
		return dueDate;
	}

	public String getTodoText() {
		// return todoText String
		return todoText;
	}

	public Boolean getBool() {
		// return boolean of completed value
		return bool;
	}


	// collection of Setters
	public void setDueDate(String date) {
		// this.dueDate = date
		this.dueDate = date;
	}

	public void setTodoText(String string) {
		// limit the string to 256 characters
		// this.todoText equals given todoText String parameter
		if (string.length() > 256) {
			this.todoText = (string.substring(0, 256));}
		else {
			this.todoText = (string);
		}
	}

	public void setBool(Boolean bool) {
		// set value based off of boolean parameter
		// this.setCompleted = bool
		this.bool = bool;
	}


}
