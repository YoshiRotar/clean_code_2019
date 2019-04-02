package pl.zzpj2019.solid.isp.contactbook.solution;

interface Emailer {

	void sendMessage(Contact emailable, String subject, String body);
	void sendEmail(String emailAddress, String subject, String body);
}