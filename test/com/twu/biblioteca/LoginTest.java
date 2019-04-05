package com.twu.biblioteca;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.LogApp;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class LoginTest {


    @Test
    public void whenLoginWithCorrectUsernameAndPasswordThenShowsSuccessfulMessage(){
        LogApp logApp = new LogApp();
        Library library = new Library();
        String username = "use-1234";
        String password = "pass1";
        String expectedResultMessage = "Success";

        String resultMessage = logApp.login(library.getUserList(), username, password);

        assertThat(expectedResultMessage, is(resultMessage));
    }


    @Test
    public void whenLoginWithInCorrectUsernameThenShowsUnsuccessfulMessage(){
        LogApp logApp = new LogApp();
        Library library = new Library();
        String username = "use-123";
        String password = "pass1";
        String expectedResultMessage = "Your username or password is incorrect";

        String resultMessage = logApp.login(library.getUserList(), username, password);

        assertThat(expectedResultMessage, is(resultMessage));
    }
}
