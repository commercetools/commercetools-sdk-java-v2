
package com.commercetools.api.models.me;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.me.MyCustomerChangeEmailAction;
import com.commercetools.api.models.me.MyCustomerUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerChangeEmailActionBuilder {

    private String email;

    public MyCustomerChangeEmailActionBuilder email(final String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public MyCustomerChangeEmailAction build() {
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
