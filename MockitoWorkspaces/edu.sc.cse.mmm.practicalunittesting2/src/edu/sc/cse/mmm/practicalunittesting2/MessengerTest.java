package edu.sc.cse.mmm.practicalunittesting2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class MessengerTest {

	@Test
	public void test() {
		TemplateEngine templ = mock(TemplateEngine.class);  // dummy objects: Listing 5.13
		MailServer ms = mock(MailServer.class);
		Client cl = mock(Client.class);
		
		Messenger sut = new Messenger(ms, templ);
		sut.sendMessage(cl,  templ);
		
		when(templ.prepareMessage(templ, cl));
	}

}
