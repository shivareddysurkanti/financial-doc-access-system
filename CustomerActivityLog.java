import java.sql.Timestamp;

public class CustomerActivityLog {

    private int logID;
    private String action;
    private String details;
    private Timestamp timestamp;

    // Getter and Setter for logID
    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    // Getter and Setter for action
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    // Getter and Setter for details
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    // Getter and Setter for timestamp
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
