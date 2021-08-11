
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddAttributeDefinitionChangeBuilder implements Builder<AddAttributeDefinitionChange> {

    private String change;

    private com.commercetools.history.models.common.AttributeDefinition nextValue;

    public AddAttributeDefinitionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddAttributeDefinitionChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AttributeDefinitionBuilder, com.commercetools.history.models.common.AttributeDefinitionBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AttributeDefinitionBuilder.of()).build();
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
        Objects.requireNonNull(change, AddAttributeDefinitionChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddAttributeDefinitionChange.class + ": nextValue is missing");
        return new AddAttributeDefinitionChangeImpl(change, nextValue);
    }

    /**
     * builds AddAttributeDefinitionChange without checking for non null required values
     */
    public AddAttributeDefinitionChange buildUnchecked() {
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
