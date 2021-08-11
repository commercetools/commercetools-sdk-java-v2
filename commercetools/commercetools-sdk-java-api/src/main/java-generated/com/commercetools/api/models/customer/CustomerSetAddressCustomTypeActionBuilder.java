
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetAddressCustomTypeActionBuilder implements Builder<CustomerSetAddressCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    private String addressId;

    public CustomerSetAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public CustomerSetAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public CustomerSetAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public CustomerSetAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public CustomerSetAddressCustomTypeActionBuilder addressId(final String addressId) {
        this.addressId = addressId;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public String getAddressId() {
        return this.addressId;
    }

    public CustomerSetAddressCustomTypeAction build() {
        Objects.requireNonNull(addressId, CustomerSetAddressCustomTypeAction.class + ": addressId is missing");
        return new CustomerSetAddressCustomTypeActionImpl(type, fields, addressId);
    }

    /**
     * builds CustomerSetAddressCustomTypeAction without checking for non null required values
     */
    public CustomerSetAddressCustomTypeAction buildUnchecked() {
        return new CustomerSetAddressCustomTypeActionImpl(type, fields, addressId);
    }

    public static CustomerSetAddressCustomTypeActionBuilder of() {
        return new CustomerSetAddressCustomTypeActionBuilder();
    }

    public static CustomerSetAddressCustomTypeActionBuilder of(final CustomerSetAddressCustomTypeAction template) {
        CustomerSetAddressCustomTypeActionBuilder builder = new CustomerSetAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        builder.addressId = template.getAddressId();
        return builder;
    }

}
