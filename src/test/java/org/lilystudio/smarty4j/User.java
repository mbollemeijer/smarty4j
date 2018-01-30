package org.lilystudio.smarty4j;

import javax.print.attribute.standard.PrinterURI;

/**
 * user
 *
 * @author linux_china
 */
public class User {
    private Integer id;
    private String name;
    private boolean admin;
    private String emptyValue;

    public User() {

    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(final boolean admin) {
        this.admin = admin;
    }

    public String getEmptyValue() {
        return emptyValue;
    }

    public void setEmptyValue(final String emptyValue) {
        this.emptyValue = emptyValue;
    }
}
