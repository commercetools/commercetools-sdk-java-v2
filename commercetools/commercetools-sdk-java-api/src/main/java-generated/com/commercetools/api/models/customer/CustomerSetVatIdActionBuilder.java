
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetVatIdActionBuilder implements Builder<CustomerSetVatIdAction> {

    @Nullable
    private String vatId;

    public CustomerSetVatIdActionBuilder vatId(@Nullable final String vatId) {
        this.vatId = vatId;
        return this;
    }

    @Nullable
    public String getVatId() {
        return this.vatId;
    }

    public CustomerSetVatIdAction build() {
        return new CustomerSetVatIdActionImpl(vatId);
    }

    /**
     * builds CustomerSetVatIdAction without checking for non null required values
     */
    public CustomerSetVatIdAction buildUnchecked() {
        return new CustomerSetVatIdActionImpl(vatId);
    }

    public static CustomerSetVatIdActionBuilder of() {
        return new CustomerSetVatIdActionBuilder();
    }

    public static CustomerSetVatIdActionBuilder of(final CustomerSetVatIdAction template) {
        CustomerSetVatIdActionBuilder builder = new CustomerSetVatIdActionBuilder();
        builder.vatId = template.getVatId();
        return builder;
    }

}
