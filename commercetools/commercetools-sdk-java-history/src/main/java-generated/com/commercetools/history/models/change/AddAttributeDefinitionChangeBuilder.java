
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddAttributeDefinitionChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.AttributeDefinition nextValue;

    public AddAttributeDefinitionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddAttributeDefinitionChangeBuilder nextValue(
            final com.commercetools.history.models.common.AttributeDefinition nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.AttributeDefinition getNextValue() {
        return this.nextValue;
    }

    public AddAttributeDefinitionChange build() {
        return new AddAttributeDefinitionChangeImpl(change, nextValue);
    }

    public static AddAttributeDefinitionChangeBuilder of() {
        return new AddAttributeDefinitionChangeBuilder();
    }

    public static AddAttributeDefinitionChangeBuilder of(final AddAttributeDefinitionChange template) {
        AddAttributeDefinitionChangeBuilder builder = new AddAttributeDefinitionChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
