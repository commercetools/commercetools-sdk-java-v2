
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TypeChangeEnumValueOrderActionBuilder implements Builder<TypeChangeEnumValueOrderAction> {

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

    public TypeChangeEnumValueOrderActionBuilder plusKeys(final String... keys) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.addAll(Arrays.asList(keys));
        return this;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public TypeChangeEnumValueOrderAction build() {
        Objects.requireNonNull(fieldName, TypeChangeEnumValueOrderAction.class + ": fieldName is missing");
        Objects.requireNonNull(keys, TypeChangeEnumValueOrderAction.class + ": keys is missing");
        return new TypeChangeEnumValueOrderActionImpl(fieldName, keys);
    }

    /**
     * builds TypeChangeEnumValueOrderAction without checking for non null required values
     */
    public TypeChangeEnumValueOrderAction buildUnchecked() {
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
