package pl.zzpj2019.solid.isp.contactbook.solution;

class InterfaceSegregationPrincipleGood implements Dialler, Emailer {

	public static void main(String[] args) {

		InterfaceSegregationPrincipleGood interfaceSegregationPrinciple = new InterfaceSegregationPrincipleGood();
		interfaceSegregationPrinciple.contactPeople();

	}

	public void contactPeople() {

		Contact contact = new Contact("Jan Kowalski", "Kielce", "jan.kowalski@gmail.com", "83744-23434");
		sendMessage(contact, "promocja", "tanio dzisiaj!");
		makeCall(contact);
	}


	@Override
	public void makeCall(Contact dialable) {
		String telephone = dialable.getTelephone();

		// call using telephone
	}

	@Override
	public void sendMessage(Contact emailable, String subject, String body) {

		String emailAddress = emailable.getEmailAddress();
		sendEmail(emailAddress, subject, body);
	}

	@Override
	public void sendEmail(String emailAddress, String subject, String body) {
		// TODO Auto-generated method stub
	}
}
