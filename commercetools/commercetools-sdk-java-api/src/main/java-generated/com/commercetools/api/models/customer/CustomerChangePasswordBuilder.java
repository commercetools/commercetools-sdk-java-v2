
package com.commercetools.api.models.customer;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerChangePasswordBuilder {

    private String id;

    private Long version;

    private String currentPassword;

    private String newPassword;

    public CustomerChangePasswordBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CustomerChangePasswordBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public CustomerChangePasswordBuilder currentPassword(final String currentPassword) {
        this.currentPassword = currentPassword;
        return this;
    }

    public CustomerChangePasswordBuilder newPassword(final String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    public String getId() {
        return this.id;
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

    public CustomerChangePassword build() {
        return new CustomerChangePasswordImpl(id, version, currentPassword, newPassword);
    }

    public static CustomerChangePasswordBuilder of() {
        return new CustomerChangePasswordBuilder();
    }

    public static CustomerChangePasswordBuilder of(final CustomerChangePassword template) {
        CustomerChangePasswordBuilder builder = new CustomerChangePasswordBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.currentPassword = template.getCurrentPassword();
        builder.newPassword = template.getNewPassword();
        return builder;
    }

}
