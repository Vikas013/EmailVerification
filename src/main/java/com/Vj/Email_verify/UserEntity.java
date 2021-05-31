package com.Vj.Email_verify;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
    @Table(name = "users")
    public class UserEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="user_id")
        private long userid;
        @Column(name="first_name")
        private String firstName;
        @Column(name="last_name")
        private String lastName;
        private boolean isEnabled;
        private String emailId;
        private String password;

        public long getUserid() {
            return userid;
        }

        public String getEmailId() {
            return emailId;
        }

        public String getPassword() {
            return password;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public boolean isEnabled() {
            return isEnabled;
        }

        public void setUserid(long userid) {
            this.userid = userid;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setEnabled(boolean enabled) {
            isEnabled = enabled;
        }
        // getters and setters methods
    }

