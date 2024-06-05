package Enums;

public enum Users {
//    Admin_Email("hsheyab@aspire-infotech.net"),
//    Admin_Password("Aspire@123456H");

//    Admin_Email("bhanu.surya@global-csg.com"),
//    Admin_Password("biscred123");

    Admin_Email("suchismita.kanapala@global-csg.com"),
    Admin_Password("biscred123");

    public final String value;

    Users(String value) {
        this.value = value;
    }

    public enum Bisreach_Users {
        Bisreach_Admin_Email("bisreach-admin1@bisnow.com"),
        Katalon_Password("change me");

        public final String value;

        Bisreach_Users(String value) {this.value = value;
        }
    }
}
