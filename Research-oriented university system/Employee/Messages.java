package Employee;

import java.io.Serializable;
import java.util.Date;


public class Messages implements Serializable {
    
	private static final long serialVersionUID = 1L;
	private String messageFrom;
    private String messageTo;
    private String title;
    private String text;
    private Date msgDate;

    public Messages(String messageFrom, String messageTo, String title, String text) {
        this.messageFrom = messageFrom;
        this.messageTo = messageTo;
        this.title = title;
        this.text = text;
        this.msgDate = new Date();
    }

    public String getMessageFrom() {
        return this.messageFrom;
    }

    public void setMessageFrom(String messageFrom) {
        this.messageFrom = messageFrom;
    }

    public String getMessageTo() {
        return this.messageTo;
    }

    public void setMessageTo(String messageTo) {
        this.messageTo = messageTo;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getMsgDate() {
        return this.msgDate;
    }

    public void setMsgDate(Date msgDate) {
        this.msgDate = msgDate;
    }
    
                                   
    @Override
    public String toString() {
        return "{" +
            " messageFrom='" + getMessageFrom() + "'" +
            ", messageTo='" + getMessageTo() + "'" +
            ", title='" + getTitle() + "'" +
            ", text='" + getText() + "'" +
            ", msgDate='" + getMsgDate() + "'" +
            "}";
    }
}


