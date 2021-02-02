
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerSetFirstNameActionBuilder {

    @Nullable
    private String firstName;

    public MyCustomerSetFirstNameActionBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Nullable
    public String getFirstName() {
        return this.firstName;
    }

    public MyCustomerSetFirstNameAction build() {
        return new MyCustomerSetFirstNameActionImpl(firstName);
    }

    public static MyCustomerSetFirstNameActionBuilder of() {
        return new MyCustomerSetFirstNameActionBuilder();
    }

    public static MyCustomerSetFirstNameActionBuilder of(final MyCustomerSetFirstNameAction template) {
        MyCustomerSetFirstNameActionBuilder builder = new MyCustomerSetFirstNameActionBuilder();
        builder.firstName = template.getFirstName();
        return builder;
    }

}
