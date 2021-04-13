
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddFieldDefinitionChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.FieldDefinition nextValue;

    public AddFieldDefinitionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddFieldDefinitionChangeBuilder nextValue(
            final com.commercetools.history.models.common.FieldDefinition nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.FieldDefinition getNextValue() {
        return this.nextValue;
    }

    public AddFieldDefinitionChange build() {
        return new AddFieldDefinitionChangeImpl(change, nextValue);
    }

    public static AddFieldDefinitionChangeBuilder of() {
        return new AddFieldDefinitionChangeBuilder();
    }

    public static AddFieldDefinitionChangeBuilder of(final AddFieldDefinitionChange template) {
        AddFieldDefinitionChangeBuilder builder = new AddFieldDefinitionChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
