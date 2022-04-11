
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TypeChangeLocalizedEnumValueOrderActionBuilder
        implements Builder<TypeChangeLocalizedEnumValueOrderAction> {

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

    public TypeChangeLocalizedEnumValueOrderActionBuilder plusKeys(final String... keys) {
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

    public TypeChangeLocalizedEnumValueOrderAction build() {
        Objects.requireNonNull(fieldName, TypeChangeLocalizedEnumValueOrderAction.class + ": fieldName is missing");
        Objects.requireNonNull(keys, TypeChangeLocalizedEnumValueOrderAction.class + ": keys is missing");
        return new TypeChangeLocalizedEnumValueOrderActionImpl(fieldName, keys);
    }

    /**
     * builds TypeChangeLocalizedEnumValueOrderAction without checking for non null required values
     */
    public TypeChangeLocalizedEnumValueOrderAction buildUnchecked() {
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
