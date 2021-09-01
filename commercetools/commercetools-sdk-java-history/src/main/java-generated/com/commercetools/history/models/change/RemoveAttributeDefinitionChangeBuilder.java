
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveAttributeDefinitionChangeBuilder implements Builder<RemoveAttributeDefinitionChange> {

    private String change;

    private com.commercetools.history.models.common.AttributeDefinition previousValue;

    public RemoveAttributeDefinitionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveAttributeDefinitionChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AttributeDefinitionBuilder, com.commercetools.history.models.common.AttributeDefinitionBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AttributeDefinitionBuilder.of())
                .build();
        return this;
    }

    public RemoveAttributeDefinitionChangeBuilder previousValue(
            final com.commercetools.history.models.common.AttributeDefinition previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.AttributeDefinition getPreviousValue() {
        return this.previousValue;
    }

    public RemoveAttributeDefinitionChange build() {
        Objects.requireNonNull(change, RemoveAttributeDefinitionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveAttributeDefinitionChange.class + ": previousValue is missing");
        return new RemoveAttributeDefinitionChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveAttributeDefinitionChange without checking for non null required values
     */
    public RemoveAttributeDefinitionChange buildUnchecked() {
        return new RemoveAttributeDefinitionChangeImpl(change, previousValue);
    }

    public static RemoveAttributeDefinitionChangeBuilder of() {
        return new RemoveAttributeDefinitionChangeBuilder();
    }

    public static RemoveAttributeDefinitionChangeBuilder of(final RemoveAttributeDefinitionChange template) {
        RemoveAttributeDefinitionChangeBuilder builder = new RemoveAttributeDefinitionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
