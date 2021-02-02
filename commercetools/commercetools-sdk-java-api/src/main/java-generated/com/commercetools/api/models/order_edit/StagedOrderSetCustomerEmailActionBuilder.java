
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetCustomerEmailActionBuilder {

    @Nullable
    private String email;

    public StagedOrderSetCustomerEmailActionBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    @Nullable
    public String getEmail() {
        return this.email;
    }

    public StagedOrderSetCustomerEmailAction build() {
        return new StagedOrderSetCustomerEmailActionImpl(email);
    }

    public static StagedOrderSetCustomerEmailActionBuilder of() {
        return new StagedOrderSetCustomerEmailActionBuilder();
    }

    public static StagedOrderSetCustomerEmailActionBuilder of(final StagedOrderSetCustomerEmailAction template) {
        StagedOrderSetCustomerEmailActionBuilder builder = new StagedOrderSetCustomerEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
