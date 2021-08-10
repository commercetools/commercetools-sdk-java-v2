
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetKeyActionBuilder implements Builder<CustomerSetKeyAction> {

    @Nullable
    private String key;

    public CustomerSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public CustomerSetKeyAction build() {
        return new CustomerSetKeyActionImpl(key);
    }

    /**
     * builds CustomerSetKeyAction without checking for non null required values
     */
    public CustomerSetKeyAction buildUnchecked() {
        return new CustomerSetKeyActionImpl(key);
    }

    public static CustomerSetKeyActionBuilder of() {
        return new CustomerSetKeyActionBuilder();
    }

    public static CustomerSetKeyActionBuilder of(final CustomerSetKeyAction template) {
        CustomerSetKeyActionBuilder builder = new CustomerSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
