package Model;

import java.io.Serializable;

public class Admin implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.login
     *
     * @mbg.generated Sat May 25 22:07:04 CST 2019
     */
    private String login;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.password
     *
     * @mbg.generated Sat May 25 22:07:04 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.phone
     *
     * @mbg.generated Sat May 25 22:07:04 CST 2019
     */
    private String phone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.login
     *
     * @return the value of admin.login
     *
     * @mbg.generated Sat May 25 22:07:04 CST 2019
     */
    public String getLogin() {
        return login;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.login
     *
     * @param login the value for admin.login
     *
     * @mbg.generated Sat May 25 22:07:04 CST 2019
     */
    public void setLogin(String login) {
        this.login = login == null ? null : login.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.password
     *
     * @return the value of admin.password
     *
     * @mbg.generated Sat May 25 22:07:04 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.password
     *
     * @param password the value for admin.password
     *
     * @mbg.generated Sat May 25 22:07:04 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.phone
     *
     * @return the value of admin.phone
     *
     * @mbg.generated Sat May 25 22:07:04 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.phone
     *
     * @param phone the value for admin.phone
     *
     * @mbg.generated Sat May 25 22:07:04 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}