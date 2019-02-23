package utilities;


import pages.*;

public class Pages {

    private LoginPage login;
    private ContactsPage contactsPage;
    private HomePage homePage;
    private ImportUserPage importUserPage;
    private NewContact newContact;
    private SystemNavigatesToPage systemNavigatesToPage;
    private ImportUserPage importuserPage;
    private ContactActions contactActions;

    //-------------------------------------------------------
    public ImportUserPage importuserPage() {
        if (importuserPage == null) {
            importuserPage = new ImportUserPage();
        }
        return importuserPage;
    }

    public LoginPage login() {
        if (login == null) {
            login = new LoginPage();
        }
        return login;
    }

    public ContactsPage contactsPage() {
        if (contactsPage == null) {
            contactsPage = new ContactsPage();
        }
        return contactsPage;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public NewContact newContact() {
        if (newContact == null) {
            newContact = new NewContact();
        }
        return newContact;
    }

    public SystemNavigatesToPage systemNavigatesToPage() {
        if (systemNavigatesToPage == null) {
            systemNavigatesToPage = new SystemNavigatesToPage();
        }
        return systemNavigatesToPage;
    }

    public ContactActions contactActions() {
        if (contactActions == null) {
            contactActions = new ContactActions();
        }
        return contactActions;
    }
}