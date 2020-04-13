package com.easyway.covid19.model;



public class Response {


	public interface StatusMessage {


		String NO_DATA_FOUND = "No data found for the requested service";

		String SUCCESS_MESSAGE = "Success.";

		String INVALID_TOKEN = "Invalid token.";

		String USER_EXISTS = "Username already exists.";

		String EMAIL_NOT_FOUND = "Email not found.";

		String INVALID_USER = "Invalid User";

		String UPDATE_FAILED = "Update failed";

		String LOGIN_FAILED = "Login failed";

		String LOGOUT_FAILED = "Logout failed";

		String INVALID_LOGIN = "Invalid Login";

		String INVALID_SESSION = "Invalid Session";

		String DELETE_FAILED = "Delete failed";

		String INSERTION_SUCCESS = "Insertion success";

		String USER_ADD_SUCCESS = "User added successfully";


		String UPDATE_SUCCESS = "Update success";

		String DELETE_SUCCESS = "Delete success";

		String LOGIN_SUCCESS = "Login success";

		String LOGOUT_SUCCESS = "Logout success";

		String SESSION_VERIFY_SUCCESS = "User Session verification success";

		String SESSIONTOKEN_ERROR_MESSAGE = "Please provide Session Token Id";

		String SESSIONTOKEN_ERROR_MESSAGE_2 = "Please provide valid Session Token Id";

		String PASSWWORD_ERROR_MESSAGE = "Please provide password";

	}

}
