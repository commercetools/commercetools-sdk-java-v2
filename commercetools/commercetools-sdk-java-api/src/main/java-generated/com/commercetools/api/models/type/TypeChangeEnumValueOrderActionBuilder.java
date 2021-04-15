
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeChangeEnumValueOrderActionBuilder {

    private String fieldName;

    private java.util.List<String> keys;

    public TypeChangeEnumValueOrderActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public TypeChangeEnumValueOrderActionBuilder keys(final String... keys) {
        this.keys = new ArrayList<>(Arrays.asList(keys));
        return this;
    }

    public TypeChangeEnumValueOrderActionBuilder keys(final java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public TypeChangeEnumValueOrderAction build() {
        return new TypeChangeEnumValueOrderActionImpl(fieldName, keys);
    }

    public static TypeChangeEnumValueOrderActionBuilder of() {
        return new TypeChangeEnumValueOrderActionBuilder();
    }

    public static TypeChangeEnumValueOrderActionBuilder of(final TypeChangeEnumValueOrderAction template) {
        TypeChangeEnumValueOrderActionBuilder builder = new TypeChangeEnumValueOrderActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.keys = template.getKeys();
        return builder;
    }

}
