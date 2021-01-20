
package com.commercetools.api.models.customer;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer.CustomerChangeEmailAction;
import com.commercetools.api.models.customer.CustomerUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerChangeEmailActionBuilder {

    private String email;

    public CustomerChangeEmailActionBuilder email(final String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public CustomerChangeEmailAction build() {
        return new CustomerChangeEmailActionImpl(email);
    }

    public static CustomerChangeEmailActionBuilder of() {
        return new CustomerChangeEmailActionBuilder();
    }

    public static CustomerChangeEmailActionBuilder of(final CustomerChangeEmailAction template) {
        CustomerChangeEmailActionBuilder builder = new CustomerChangeEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
