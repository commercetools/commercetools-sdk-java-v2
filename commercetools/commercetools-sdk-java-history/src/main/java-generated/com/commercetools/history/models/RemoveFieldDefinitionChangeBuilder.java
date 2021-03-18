
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveFieldDefinitionChangeBuilder {

    private String change;

    private com.commercetools.history.models.FieldDefinition previousValue;

    public RemoveFieldDefinitionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveFieldDefinitionChangeBuilder previousValue(
            final com.commercetools.history.models.FieldDefinition previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.FieldDefinition getPreviousValue() {
        return this.previousValue;
    }

    public RemoveFieldDefinitionChange build() {
        return new RemoveFieldDefinitionChangeImpl(change, previousValue);
    }

    public static RemoveFieldDefinitionChangeBuilder of() {
        return new RemoveFieldDefinitionChangeBuilder();
    }

    public static RemoveFieldDefinitionChangeBuilder of(final RemoveFieldDefinitionChange template) {
        RemoveFieldDefinitionChangeBuilder builder = new RemoveFieldDefinitionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
