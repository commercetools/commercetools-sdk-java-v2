
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeRemoveFieldDefinitionActionBuilder {

    private String fieldName;

    public TypeRemoveFieldDefinitionActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public TypeRemoveFieldDefinitionAction build() {
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
