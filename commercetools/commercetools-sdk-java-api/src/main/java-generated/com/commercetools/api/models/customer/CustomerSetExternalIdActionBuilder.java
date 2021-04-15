
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetExternalIdActionBuilder {

    @Nullable
    private String externalId;

    public CustomerSetExternalIdActionBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    public CustomerSetExternalIdAction build() {
        return new CustomerSetExternalIdActionImpl(externalId);
    }

    public static CustomerSetExternalIdActionBuilder of() {
        return new CustomerSetExternalIdActionBuilder();
    }

    public static CustomerSetExternalIdActionBuilder of(final CustomerSetExternalIdAction template) {
        CustomerSetExternalIdActionBuilder builder = new CustomerSetExternalIdActionBuilder();
        builder.externalId = template.getExternalId();
        return builder;
    }

}
