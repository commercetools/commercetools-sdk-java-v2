
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetMiddleNameActionBuilder implements Builder<CustomerSetMiddleNameAction> {

    @Nullable
    private String middleName;

    public CustomerSetMiddleNameActionBuilder middleName(@Nullable final String middleName) {
        this.middleName = middleName;
        return this;
    }

    @Nullable
    public String getMiddleName() {
        return this.middleName;
    }

    public CustomerSetMiddleNameAction build() {
        return new CustomerSetMiddleNameActionImpl(middleName);
    }

    /**
     * builds CustomerSetMiddleNameAction without checking for non null required values
     */
    public CustomerSetMiddleNameAction buildUnchecked() {
        return new CustomerSetMiddleNameActionImpl(middleName);
    }

    public static CustomerSetMiddleNameActionBuilder of() {
        return new CustomerSetMiddleNameActionBuilder();
    }

    public static CustomerSetMiddleNameActionBuilder of(final CustomerSetMiddleNameAction template) {
        CustomerSetMiddleNameActionBuilder builder = new CustomerSetMiddleNameActionBuilder();
        builder.middleName = template.getMiddleName();
        return builder;
    }

}
