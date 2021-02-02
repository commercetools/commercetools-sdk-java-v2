
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeChangeLocalizedEnumValueOrderActionBuilder {

    private String fieldName;

    private java.util.List<String> keys;

    public TypeChangeLocalizedEnumValueOrderActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public TypeChangeLocalizedEnumValueOrderActionBuilder keys(final String... keys) {
        this.keys = new ArrayList<>(Arrays.asList(keys));
        return this;
    }

    public TypeChangeLocalizedEnumValueOrderActionBuilder keys(final java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public TypeChangeLocalizedEnumValueOrderAction build() {
        return new TypeChangeLocalizedEnumValueOrderActionImpl(fieldName, keys);
    }

    public static TypeChangeLocalizedEnumValueOrderActionBuilder of() {
        return new TypeChangeLocalizedEnumValueOrderActionBuilder();
    }

    public static TypeChangeLocalizedEnumValueOrderActionBuilder of(
            final TypeChangeLocalizedEnumValueOrderAction template) {
        TypeChangeLocalizedEnumValueOrderActionBuilder builder = new TypeChangeLocalizedEnumValueOrderActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.keys = template.getKeys();
        return builder;
    }

}
