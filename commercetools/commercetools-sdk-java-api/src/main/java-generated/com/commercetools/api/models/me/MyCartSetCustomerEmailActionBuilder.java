
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartSetCustomerEmailActionBuilder implements Builder<MyCartSetCustomerEmailAction> {

    @Nullable
    private String email;

    public MyCartSetCustomerEmailActionBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    @Nullable
    public String getEmail() {
        return this.email;
    }

    public MyCartSetCustomerEmailAction build() {
        return new MyCartSetCustomerEmailActionImpl(email);
    }

    /**
     * builds MyCartSetCustomerEmailAction without checking for non null required values
     */
    public MyCartSetCustomerEmailAction buildUnchecked() {
        return new MyCartSetCustomerEmailActionImpl(email);
    }

    public static MyCartSetCustomerEmailActionBuilder of() {
        return new MyCartSetCustomerEmailActionBuilder();
    }

    public static MyCartSetCustomerEmailActionBuilder of(final MyCartSetCustomerEmailAction template) {
        MyCartSetCustomerEmailActionBuilder builder = new MyCartSetCustomerEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
