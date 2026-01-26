package Bai5_Locator.Baitap;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocatorsCRM {

    public static String url = "https://crm.anhtester.com/admin/authentication";

    //Locators for Login page

    public static String headerLoginpage = "//h1[normalize-space() = 'Login']";
    public static String inputEmail = "//input[@id = 'email']";
    public static String inputPassword = "//input[@id = 'password']";
    public static String buttonLogin = "//button[normalize-space() = 'Login']";
    public static String checkboxRememberMe = "//input[@id='remember']";
    public static String labelRememberMe = "//label[@for='remember']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot Password?']";
    public static String alertErrorMessage = "//div[contains(@class,'alert-danger')]";
    public static String alertErrorPasswordRequired = "//div[normalize-space()='The Password field is required.']";
    public static String alertErrorEmailRequired = "//div[normalize-space()='The Email Address field is required.']";

//Locator for Dashboard page

    public static String menuDashboard = "//span[normalize-space()='Dashboard' and @class='menu-text']";
    public static String menuCustomers = "//span[normalize-space()='Customers' and @class='menu-text']";
    public static String menuContracts = "//span[normalize-space()='Contracts' and @class='menu-text']";
    public static String menuProjects = "//span[normalize-space()='Projects' and @class='menu-text']";
    public static String menuTasks = "//span[normalize-space()='Tasks' and @class='menu-text']";

//Locator for Customer page

    public static String buttonNewCustomers = "//a[normalize-space()='New Customer']";
    public static String buttonImportCustomers = "//a[normalize-space()='Import Customers']";
    public static String buttonContacts = "//a[normalize-space()='Contacts' and contains(@href, 'all_contacts')]";
    public static String headerCustomerspage = "//span[normalize-space()='Customers Summary']";
    public static String inputSearchCustomers = "//div[@id='clients_filter']/descendant::input[@type='search']";

    //Locator for New Customers

    public static String inputCompany = "//input[@id='company']";
    public static String inputVatNumber = "//input[@id='vat']";
    public static String inputPhone = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";
    public static String inputAddress = "//textarea[@id='address']";
    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String inputZipCode = "//input[@id='zip']";
    public static String inputGroup = "//button[@data-id='groups_in[]']";
    public static String inputSearchGroup = "//button [contains(@data-id,'groups_in')]/following-sibling::div//input[@type='search']";
    public static String selectGroupVIP = "//span[normalize-space()='VIP']";
    public static String inputCurrency = "//button[@data-id='default_currency']";
    public static String inputSearchCurrency = "//button [contains(@data-id,'default_currency')]/following-sibling::div//input[@type='search']";

    public static String inputDefaultLanguage = "//button[@data-id='default_language']";
    public static String selectDefaultLanguage = "//span[normalize-space()='Vietnamese']";
    //Cách 2: viết 1 biến rồi truyền tham số vào
    public static String selectDefaultLanguage2 = "//span[normalize-space()='%s']";
    //cách 3: viết hàm rồi return về xpath
    public static String xpathSelectLanguage(String language){
        String xpathDefaultLaguage = "//span[normalize-space()='" + language + "']";
        return xpathDefaultLaguage;
    }



    public static String inputCountry = "//div[@app-field-wrapper='country']/descendant::div//button[contains(@data-id,'country') and (@title='Nothing selected')]";
    public static String selectCountry = "//div[@app-field-wrapper='country']/descendant::div//button[contains(@data-id,'country')]/following-sibling::div//input[@type='search']";
    public static String buttonSaveAndCreateContactCustumers = "//button[normalize-space()='Save and create contact']";
    public static String buttonSaveCustomers = "//button[normalize-space()='Save and create contact']/following-sibling::button[normalize-space()='Save']";

    //Locator for Project page

    public static String buttonNewProject = "//a[normalize-space()='New Project']";
    public static String headerProjectpage = "//span[normalize-space()='Projects Summary']";
    public static String searchProject = "//div[@id='projects_filter']/descendant::input[@type='search']";

    //Locator for New Project

    public static String inputProjectName = "//input[@id='name']";
    public static String inputCustomer = "//button[@data-id='clientid' and @title='Select and begin typing']";
    public static String searchCustomers = "//button[@data-id='clientid' and @title='Select and begin typing']/following-sibling::div//input[@type='search']";
    public static String inputBillingType = "//button[@data-id='billing_type']";
    public static String selectBillingType = "//button[@data-id='billing_type']/following-sibling::div//span[normalize-space()='Project Hours']";
    public static String inputStatus = "//button[@data-id='status']";
    public static String selectStatus = "//button[@data-id='status']/following-sibling::div//span[normalize-space()='In Progress']";
    public static String inputStartDate = "//input[@id='start_date']";
    public static String buttonSaveProject = "//button[normalize-space()='Save']";


    //Lấy ngày hiện tại
    public static LocalDateTime now = LocalDateTime.now();
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public static String formatted = now.format(formatter);

}
