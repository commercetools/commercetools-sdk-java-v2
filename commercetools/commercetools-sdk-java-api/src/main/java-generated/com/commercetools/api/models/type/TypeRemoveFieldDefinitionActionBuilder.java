
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TypeRemoveFieldDefinitionActionBuilder implements Builder<TypeRemoveFieldDefinitionAction> {

    private String fieldName;

    /**
    *  <p><code>name</code> of the FieldDefinition to remove. The removal of a FieldDefinition deletes asynchronously all Custom Fields using the FieldDefinition as well.</p>
    */

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
