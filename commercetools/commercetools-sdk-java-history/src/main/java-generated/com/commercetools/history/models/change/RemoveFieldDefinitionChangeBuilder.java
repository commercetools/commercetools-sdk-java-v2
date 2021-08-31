
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveFieldDefinitionChangeBuilder implements Builder<RemoveFieldDefinitionChange> {

    private String change;

    private com.commercetools.history.models.common.FieldDefinition previousValue;

    public RemoveFieldDefinitionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveFieldDefinitionChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.FieldDefinitionBuilder, com.commercetools.history.models.common.FieldDefinitionBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.FieldDefinitionBuilder.of()).build();
        return this;
    }

    public RemoveFieldDefinitionChangeBuilder previousValue(
            final com.commercetools.history.models.common.FieldDefinition previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.FieldDefinition getPreviousValue() {
        return this.previousValue;
    }

    public RemoveFieldDefinitionChange build() {
        Objects.requireNonNull(change, RemoveFieldDefinitionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveFieldDefinitionChange.class + ": previousValue is missing");
        return new RemoveFieldDefinitionChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveFieldDefinitionChange without checking for non null required values
     */
    public RemoveFieldDefinitionChange buildUnchecked() {
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
