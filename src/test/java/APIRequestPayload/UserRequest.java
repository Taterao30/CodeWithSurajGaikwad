package APIRequestPayload;

	
	public record UserRequest(
	        String firstName,
	        String lastName,
	        String email,
	        String mobileNumber
	)
	{
		
		public static void main(String[] args) {
			UserRequest payload = new UserRequest(
			        "Suraj",
			        "Gaikwad",
			        "suraj@gmail.com",
			        "9876543210"
			);
		}
	}

