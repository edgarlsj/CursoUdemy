package cursonelio.exercicioset.entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String userName;
    private Date monent;

    public LogEntry(String userName, Date monent) {
        this.userName = userName;
        this.monent = monent;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getMonent() {
        return monent;
    }

    public void setMonent(Date monent) {
        this.monent = monent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(userName, logEntry.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }
}
