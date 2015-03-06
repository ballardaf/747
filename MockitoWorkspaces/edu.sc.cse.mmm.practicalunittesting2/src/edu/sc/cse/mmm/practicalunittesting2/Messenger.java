package edu.sc.cse.mmm.practicalunittesting2;

public class Messenger {
	private TemplateEngine 	templateEngine;
	private MailServer  	mailServer;
	
	public Messenger(MailServer  mailServer, TemplateEngine  templateEng)  {
		this.mailServer = mailServer;
		this.templateEngine = templateEng;
	}
	
	public void sendMessage(Client client, TemplateEngine tmpl)  {
		String msg = templateEngine.prepareMessage(tmpl, client);
		mailServer.send(client.getEmail(), msg);
	}


}
