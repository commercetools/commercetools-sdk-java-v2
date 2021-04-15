
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerResetPasswordBuilder {

    private String tokenValue;

    private String newPassword;

    @Nullable
    private Long version;

    public CustomerResetPasswordBuilder tokenValue(final String tokenValue) {
        this.tokenValue = tokenValue;
        return this;
    }

    public CustomerResetPasswordBuilder newPassword(final String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    public CustomerResetPasswordBuilder version(@Nullable final Long version) {
        this.version = version;
        return this;
    }

    public String getTokenValue() {
        return this.tokenValue;
    }

    public String getNewPassword() {
        return this.newPassword;
    }

    @Nullable
    public Long getVersion() {
        return this.version;
    }

    public CustomerResetPassword build() {
        return new CustomerResetPasswordImpl(tokenValue, newPassword, version);
    }

    public static CustomerResetPasswordBuilder of() {
        return new CustomerResetPasswordBuilder();
    }

    public static CustomerResetPasswordBuilder of(final CustomerResetPassword template) {
        CustomerResetPasswordBuilder builder = new CustomerResetPasswordBuilder();
        builder.tokenValue = template.getTokenValue();
        builder.newPassword = template.getNewPassword();
        builder.version = template.getVersion();
        return builder;
    }

}
