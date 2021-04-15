
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreSetCustomFieldActionBuilder {

    private String name;

    @Nullable
    private java.lang.Object value;

    public StoreSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public StoreSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public StoreSetCustomFieldAction build() {
        return new StoreSetCustomFieldActionImpl(name, value);
    }

    public static StoreSetCustomFieldActionBuilder of() {
        return new StoreSetCustomFieldActionBuilder();
    }

    public static StoreSetCustomFieldActionBuilder of(final StoreSetCustomFieldAction template) {
        StoreSetCustomFieldActionBuilder builder = new StoreSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
