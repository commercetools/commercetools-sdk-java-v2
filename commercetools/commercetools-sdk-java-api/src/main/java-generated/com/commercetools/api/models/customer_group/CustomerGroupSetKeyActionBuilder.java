
package com.commercetools.api.models.customer_group;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerGroupSetKeyActionBuilder implements Builder<CustomerGroupSetKeyAction> {

    @Nullable
    private String key;

    public CustomerGroupSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public CustomerGroupSetKeyAction build() {
        return new CustomerGroupSetKeyActionImpl(key);
    }

    /**
     * builds CustomerGroupSetKeyAction without checking for non null required values
     */
    public CustomerGroupSetKeyAction buildUnchecked() {
        return new CustomerGroupSetKeyActionImpl(key);
    }

    public static CustomerGroupSetKeyActionBuilder of() {
        return new CustomerGroupSetKeyActionBuilder();
    }

    public static CustomerGroupSetKeyActionBuilder of(final CustomerGroupSetKeyAction template) {
        CustomerGroupSetKeyActionBuilder builder = new CustomerGroupSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
