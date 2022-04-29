
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TypeChangeFieldDefinitionOrderActionBuilder implements Builder<TypeChangeFieldDefinitionOrderAction> {

    private java.util.List<String> fieldNames;

    public TypeChangeFieldDefinitionOrderActionBuilder fieldNames(final String... fieldNames) {
        this.fieldNames = new ArrayList<>(Arrays.asList(fieldNames));
        return this;
    }

    public TypeChangeFieldDefinitionOrderActionBuilder fieldNames(final java.util.List<String> fieldNames) {
        this.fieldNames = fieldNames;
        return this;
    }

    public TypeChangeFieldDefinitionOrderActionBuilder plusFieldNames(final String... fieldNames) {
        if (this.fieldNames == null) {
            this.fieldNames = new ArrayList<>();
        }
        this.fieldNames.addAll(Arrays.asList(fieldNames));
        return this;
    }

    public java.util.List<String> getFieldNames() {
        return this.fieldNames;
    }

    public TypeChangeFieldDefinitionOrderAction build() {
        Objects.requireNonNull(fieldNames, TypeChangeFieldDefinitionOrderAction.class + ": fieldNames is missing");
        return new TypeChangeFieldDefinitionOrderActionImpl(fieldNames);
    }

    /**
     * builds TypeChangeFieldDefinitionOrderAction without checking for non null required values
     */
    public TypeChangeFieldDefinitionOrderAction buildUnchecked() {
        return new TypeChangeFieldDefinitionOrderActionImpl(fieldNames);
    }

    public static TypeChangeFieldDefinitionOrderActionBuilder of() {
        return new TypeChangeFieldDefinitionOrderActionBuilder();
    }

    public static TypeChangeFieldDefinitionOrderActionBuilder of(final TypeChangeFieldDefinitionOrderAction template) {
        TypeChangeFieldDefinitionOrderActionBuilder builder = new TypeChangeFieldDefinitionOrderActionBuilder();
        builder.fieldNames = template.getFieldNames();
        return builder;
    }

}
