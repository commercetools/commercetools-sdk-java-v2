
package com.commercetools.api.models.customer;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MyCustomerChangePasswordBuilder implements Builder<MyCustomerChangePassword> {

    private Long version;

    private String currentPassword;

    private String newPassword;

    public MyCustomerChangePasswordBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public MyCustomerChangePasswordBuilder currentPassword(final String currentPassword) {
        this.currentPassword = currentPassword;
        return this;
    }

    public MyCustomerChangePasswordBuilder newPassword(final String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public String getCurrentPassword() {
        return this.currentPassword;
    }

    public String getNewPassword() {
        return this.newPassword;
    }

    public MyCustomerChangePassword build() {
        Objects.requireNonNull(version, MyCustomerChangePassword.class + ": version is missing");
        Objects.requireNonNull(currentPassword, MyCustomerChangePassword.class + ": currentPassword is missing");
        Objects.requireNonNull(newPassword, MyCustomerChangePassword.class + ": newPassword is missing");
        return new MyCustomerChangePasswordImpl(version, currentPassword, newPassword);
    }

    /**
     * builds MyCustomerChangePassword without checking for non null required values
     */
    public MyCustomerChangePassword buildUnchecked() {
        return new MyCustomerChangePasswordImpl(version, currentPassword, newPassword);
    }

    public static MyCustomerChangePasswordBuilder of() {
        return new MyCustomerChangePasswordBuilder();
    }

    public static MyCustomerChangePasswordBuilder of(final MyCustomerChangePassword template) {
        MyCustomerChangePasswordBuilder builder = new MyCustomerChangePasswordBuilder();
        builder.version = template.getVersion();
        builder.currentPassword = template.getCurrentPassword();
        builder.newPassword = template.getNewPassword();
        return builder;
    }

}
