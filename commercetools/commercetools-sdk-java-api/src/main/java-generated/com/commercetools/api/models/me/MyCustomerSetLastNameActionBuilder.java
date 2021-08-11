
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerSetLastNameActionBuilder implements Builder<MyCustomerSetLastNameAction> {

    @Nullable
    private String lastName;

    public MyCustomerSetLastNameActionBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    public MyCustomerSetLastNameAction build() {
        return new MyCustomerSetLastNameActionImpl(lastName);
    }

    /**
     * builds MyCustomerSetLastNameAction without checking for non null required values
     */
    public MyCustomerSetLastNameAction buildUnchecked() {
        return new MyCustomerSetLastNameActionImpl(lastName);
    }

    public static MyCustomerSetLastNameActionBuilder of() {
        return new MyCustomerSetLastNameActionBuilder();
    }

    public static MyCustomerSetLastNameActionBuilder of(final MyCustomerSetLastNameAction template) {
        MyCustomerSetLastNameActionBuilder builder = new MyCustomerSetLastNameActionBuilder();
        builder.lastName = template.getLastName();
        return builder;
    }

}
