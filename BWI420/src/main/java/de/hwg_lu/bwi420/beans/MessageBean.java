package de.hwg_lu.bwi420.beans;

public class MessageBean {
	
	String infoMsg;
	String actionMsg;

	public MessageBean() {
		this.setGeneralWelcome();
	}

	public String getMessageHtml() {
		String html = "";
		html += "<h3>" + this.getInfoMsg() + "</h3>\n";
		html += "<h4>" + this.getActionMsg() + "</h4>\n";
		return html;
	}
	public void setLoginFailed() {
		this.setInfoMsg("Ihre Anmeldung ist fehlgeschlagen");
		this.setActionMsg("Bitte versuchen Sie es noch einmal");
	};
	public void setLogoutSuccessful() {
		this.setInfoMsg("Sie haben sich abgemeldet");
		this.setActionMsg("Bitte melden Sie sich wieder an");
	};
	public void setPortalWelcome() {
		this.setInfoMsg("Willkommen am BWI420-Portal");
		this.setActionMsg("Bitte waehlen Sie eine Anwendung");
	};
	public void setGeneralWelcome() {
		this.setInfoMsg("Willkommen am BWI420-Portal");
		this.setActionMsg("Bitte melden Sie sich an");
	};
	public void setRegSuccessful(String userid) {
		this.setInfoMsg("Account " + userid + " erfolgreich angelegt");
		this.setActionMsg("Bitte gehen Sie jetzt zur Anmeldung");
	};
	public void setAccountAlreadyExists(String userid) {
		this.setInfoMsg("Nickname " + userid + " existiert bereits");
		this.setActionMsg("Bitte waehlen Sie einen anderen Nickname");
	};
	public void setDBError() {
		this.setInfoMsg("Es ist ein Datenbankfehler aufgetreten");
		this.setActionMsg("Bitte informieren Sie Ihren Administrator");
	};
	
	public void setRegWelcome() {
		this.setInfoMsg("Willkommen am BWI420-Portal");
		this.setActionMsg("Bitte registrieren Sie sich");
	}

	public String getInfoMsg() {
		return infoMsg;
	}
	public void setInfoMsg(String infoMsg) {
		this.infoMsg = infoMsg;
	}
	public String getActionMsg() {
		return actionMsg;
	}
	public void setActionMsg(String actionMsg) {
		this.actionMsg = actionMsg;
	}
}
