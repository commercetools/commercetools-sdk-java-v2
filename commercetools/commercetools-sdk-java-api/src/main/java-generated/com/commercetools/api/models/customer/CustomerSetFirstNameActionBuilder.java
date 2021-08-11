
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetFirstNameActionBuilder implements Builder<CustomerSetFirstNameAction> {

    @Nullable
    private String firstName;

    public CustomerSetFirstNameActionBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Nullable
    public String getFirstName() {
        return this.firstName;
    }

    public CustomerSetFirstNameAction build() {
        return new CustomerSetFirstNameActionImpl(firstName);
    }

    /**
     * builds CustomerSetFirstNameAction without checking for non null required values
     */
    public CustomerSetFirstNameAction buildUnchecked() {
        return new CustomerSetFirstNameActionImpl(firstName);
    }

    public static CustomerSetFirstNameActionBuilder of() {
        return new CustomerSetFirstNameActionBuilder();
    }

    public static CustomerSetFirstNameActionBuilder of(final CustomerSetFirstNameAction template) {
        CustomerSetFirstNameActionBuilder builder = new CustomerSetFirstNameActionBuilder();
        builder.firstName = template.getFirstName();
        return builder;
    }

}
