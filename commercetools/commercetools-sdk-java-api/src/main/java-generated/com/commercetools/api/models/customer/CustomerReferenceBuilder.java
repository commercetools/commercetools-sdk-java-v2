
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerReferenceBuilder implements Builder<CustomerReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.customer.Customer obj;

    public CustomerReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CustomerReferenceBuilder obj(
            Function<com.commercetools.api.models.customer.CustomerBuilder, com.commercetools.api.models.customer.CustomerBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.customer.CustomerBuilder.of()).build();
        return this;
    }

    public CustomerReferenceBuilder obj(@Nullable final com.commercetools.api.models.customer.Customer obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.customer.Customer getObj() {
        return this.obj;
    }

    public CustomerReference build() {
        Objects.requireNonNull(id, CustomerReference.class + ": id is missing");
        return new CustomerReferenceImpl(id, obj);
    }

    /**
     * builds CustomerReference without checking for non null required values
     */
    public CustomerReference buildUnchecked() {
        return new CustomerReferenceImpl(id, obj);
    }

    public static CustomerReferenceBuilder of() {
        return new CustomerReferenceBuilder();
    }

    public static CustomerReferenceBuilder of(final CustomerReference template) {
        CustomerReferenceBuilder builder = new CustomerReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
