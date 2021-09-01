
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeRemoveFieldDefinitionActionBuilder implements Builder<TypeRemoveFieldDefinitionAction> {

    private String fieldName;

    public TypeRemoveFieldDefinitionActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public TypeRemoveFieldDefinitionAction build() {
        Objects.requireNonNull(fieldName, TypeRemoveFieldDefinitionAction.class + ": fieldName is missing");
        return new TypeRemoveFieldDefinitionActionImpl(fieldName);
    }

    /**
     * builds TypeRemoveFieldDefinitionAction without checking for non null required values
     */
    public TypeRemoveFieldDefinitionAction buildUnchecked() {
        return new TypeRemoveFieldDefinitionActionImpl(fieldName);
    }

    public static TypeRemoveFieldDefinitionActionBuilder of() {
        return new TypeRemoveFieldDefinitionActionBuilder();
    }

    public static TypeRemoveFieldDefinitionActionBuilder of(final TypeRemoveFieldDefinitionAction template) {
        TypeRemoveFieldDefinitionActionBuilder builder = new TypeRemoveFieldDefinitionActionBuilder();
        builder.fieldName = template.getFieldName();
        return builder;
    }

}
