
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreSetCustomTypeActionBuilder {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private java.lang.Object fields;

    public StoreSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public StoreSetCustomTypeActionBuilder fields(@Nullable final java.lang.Object fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public java.lang.Object getFields() {
        return this.fields;
    }

    public StoreSetCustomTypeAction build() {
        return new StoreSetCustomTypeActionImpl(type, fields);
    }

    public static StoreSetCustomTypeActionBuilder of() {
        return new StoreSetCustomTypeActionBuilder();
    }

    public static StoreSetCustomTypeActionBuilder of(final StoreSetCustomTypeAction template) {
        StoreSetCustomTypeActionBuilder builder = new StoreSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
