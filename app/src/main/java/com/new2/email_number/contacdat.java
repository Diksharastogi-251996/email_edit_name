package com.new2.email_number;

public class contacdat {


        private String email;
        private String number;

        public contacdat(String email, String number) {
            this.email = email;
            this.number = number;
        }

        public String getName() {
            return email;
        }

        public void setName(String name) {
            this.email = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }