package wu.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Transaction {
	private int hash;
	private String sender;
	private String recipient;
	private double amount;
	private String date;
	private String time;
	private Date dateTime;
	private boolean isValid;
	private DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyy");
	private DateFormat timeFormat = new SimpleDateFormat("hh:mma");
	private DecimalFormat decimalFormat = new DecimalFormat("#.##");

	public Transaction() {
		hash = 0;
		sender = "";
		recipient = "";
		amount = Double.valueOf(decimalFormat.format(0.00));
		// gets the system date & time whenever a new Transaction is initiated
		dateTime = new Date();
		date = dateFormat.format(dateTime);
		time = timeFormat.format(dateTime);
		isValid = false;
	}

	public Transaction(String sender, String recipient, double amount) {
		this.sender = sender;
		this.recipient = recipient;
		this.amount = Double.valueOf(decimalFormat.format(amount));
		dateTime = new Date();
		date = dateFormat.format(dateTime);
		time = timeFormat.format(dateTime);
		isValid = false;
	}

	// gets the value from the hash file to be used as the hash value for a given
	// transaction
	public void generateHash() throws IOException {
		int hash = 0;
		File file = new File("Transaction Hash.txt");
		if (file.exists()) {
			Scanner fileScanner = new Scanner(new File("Transaction Hash.txt"));
			while (fileScanner.hasNext()) {
				hash = Integer.valueOf(fileScanner.next());
			}
			fileScanner.close();

		} else {
			hash = 1;
		}
		setHash(hash);
		updateHash(hash);
	}

	// overrides the hash file with the latest hash value
	private void updateHash(int hash) throws IOException {
		FileWriter hashFile = new FileWriter("Transaction Hash.txt");
		hash += 1;
		hashFile.write("" + hash);
		hashFile.close();
	}

	public int getHash() {
		return hash;
	}

	public void setHash(int hash) {
		this.hash = hash;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

}
