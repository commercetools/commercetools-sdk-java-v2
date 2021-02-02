
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetCustomerIdActionBuilder {

    @Nullable
    private String customerId;

    public StagedOrderSetCustomerIdActionBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    @Nullable
    public String getCustomerId() {
        return this.customerId;
    }

    public StagedOrderSetCustomerIdAction build() {
        return new StagedOrderSetCustomerIdActionImpl(customerId);
    }

    public static StagedOrderSetCustomerIdActionBuilder of() {
        return new StagedOrderSetCustomerIdActionBuilder();
    }

    public static StagedOrderSetCustomerIdActionBuilder of(final StagedOrderSetCustomerIdAction template) {
        StagedOrderSetCustomerIdActionBuilder builder = new StagedOrderSetCustomerIdActionBuilder();
        builder.customerId = template.getCustomerId();
        return builder;
    }

}
