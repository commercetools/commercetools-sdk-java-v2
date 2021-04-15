
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerCreatePasswordResetTokenBuilder {

    private String email;

    @Nullable
    private Long ttlMinutes;

    public CustomerCreatePasswordResetTokenBuilder email(final String email) {
        this.email = email;
        return this;
    }

    public CustomerCreatePasswordResetTokenBuilder ttlMinutes(@Nullable final Long ttlMinutes) {
        this.ttlMinutes = ttlMinutes;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    @Nullable
    public Long getTtlMinutes() {
        return this.ttlMinutes;
    }

    public CustomerCreatePasswordResetToken build() {
        return new CustomerCreatePasswordResetTokenImpl(email, ttlMinutes);
    }

    public static CustomerCreatePasswordResetTokenBuilder of() {
        return new CustomerCreatePasswordResetTokenBuilder();
    }

    public static CustomerCreatePasswordResetTokenBuilder of(final CustomerCreatePasswordResetToken template) {
        CustomerCreatePasswordResetTokenBuilder builder = new CustomerCreatePasswordResetTokenBuilder();
        builder.email = template.getEmail();
        builder.ttlMinutes = template.getTtlMinutes();
        return builder;
    }

}
