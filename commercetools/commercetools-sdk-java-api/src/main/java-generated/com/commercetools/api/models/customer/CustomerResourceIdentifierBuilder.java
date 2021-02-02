
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerResourceIdentifierBuilder {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public CustomerResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public CustomerResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public CustomerResourceIdentifier build() {
        return new CustomerResourceIdentifierImpl(id, key);
    }

    public static CustomerResourceIdentifierBuilder of() {
        return new CustomerResourceIdentifierBuilder();
    }

    public static CustomerResourceIdentifierBuilder of(final CustomerResourceIdentifier template) {
        CustomerResourceIdentifierBuilder builder = new CustomerResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
