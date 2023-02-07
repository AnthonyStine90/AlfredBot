import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;

public class AlfredQuotes {

  public String basicGreeting() {
    // You do not need to code here, this is an example method
    return "Hello, lovely to see you. How are you?";
  }

  public String guestGreeting(String name) {
    return String.format("Hello, %s. Lovely to see you", name);
    // %s represents a string, add the variable name after the sentence. %d = decimal
  }

  public String dateAnnouncement() {
    Date date = Calendar.getInstance().getTime();
    DateFormat dateFormat = new SimpleDateFormat("E MMM yyy 'at' hh:mm:ss a zzz");
    // date syntax. Day=E MMM=Month yyy=Year hh:mm:ss = hour, minute, seconds a = am/pm zzz=timezone
    String strDate = dateFormat.format(date);
    return String.format("It is currently" + " " + strDate); 
  }

  public String respondBeforeAlexis(String conversation) {

    int alexis = conversation.indexOf("Alexis");
    int alfred = conversation.indexOf("Alfred");

    if(alexis != -1) {
      return String.format("Right away, sir. She certainly isn't sophisticated enough for that.");
    }
    else if (alfred != -1) {
      return String.format("At your service. As you wish, naturally.");
    }
    else {
      return String.format("Right. And with that I shall retire.");
    }
    
}

// NINJA BONUS
// See the specs to overload the guessGreeting method
// SENSEI BONUS
// Write your own AlfredQuote method using any of the String methods you have learned!
}
