
package com.commercetools.api.models.customer_group;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerGroupSetCustomTypeActionBuilder {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public CustomerGroupSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public CustomerGroupSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
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

    public CustomerGroupSetCustomTypeAction build() {
        return new CustomerGroupSetCustomTypeActionImpl(type, fields);
    }

    public static CustomerGroupSetCustomTypeActionBuilder of() {
        return new CustomerGroupSetCustomTypeActionBuilder();
    }

    public static CustomerGroupSetCustomTypeActionBuilder of(final CustomerGroupSetCustomTypeAction template) {
        CustomerGroupSetCustomTypeActionBuilder builder = new CustomerGroupSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
