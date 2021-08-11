
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerChangeEmailActionBuilder implements Builder<MyCustomerChangeEmailAction> {

    private String email;

    public MyCustomerChangeEmailActionBuilder email(final String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public MyCustomerChangeEmailAction build() {
        Objects.requireNonNull(email, MyCustomerChangeEmailAction.class + ": email is missing");
        return new MyCustomerChangeEmailActionImpl(email);
    }

    /**
     * builds MyCustomerChangeEmailAction without checking for non null required values
     */
    public MyCustomerChangeEmailAction buildUnchecked() {
        return new MyCustomerChangeEmailActionImpl(email);
    }

    public static MyCustomerChangeEmailActionBuilder of() {
        return new MyCustomerChangeEmailActionBuilder();
    }

    public static MyCustomerChangeEmailActionBuilder of(final MyCustomerChangeEmailAction template) {
        MyCustomerChangeEmailActionBuilder builder = new MyCustomerChangeEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
