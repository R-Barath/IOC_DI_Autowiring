package in.barath.beans;

public class UserService {

	private IEmailService emailService;

	private IUserDAO userDao;

	private IPasswordService passwordService;

	
	public UserService(IEmailService emailService, IUserDAO userDao, IPasswordService passwordService) {
		this.emailService = emailService;
		this.userDao = userDao;
		this.passwordService = passwordService;
	}
	
	public void userRegistration() {
		passwordService.generatePwd();
		userDao.saveUser();
		emailService.sendEmail();

		System.out.println("***user registration is successful***");
	}

	
}
