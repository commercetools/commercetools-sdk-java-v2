
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomTypeChangeBuilder implements Builder<SetCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.common.CustomFields nextValue;

    private com.commercetools.history.models.common.CustomFields previousValue;

    public SetCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public SetCustomTypeChangeBuilder nextValue(final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public SetCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    public SetCustomTypeChange build() {
        Objects.requireNonNull(change, SetCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetCustomTypeChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetCustomTypeChange.class + ": previousValue is missing");
        return new SetCustomTypeChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetCustomTypeChange without checking for non null required values
     */
    public SetCustomTypeChange buildUnchecked() {
        return new SetCustomTypeChangeImpl(change, nextValue, previousValue);
    }

    public static SetCustomTypeChangeBuilder of() {
        return new SetCustomTypeChangeBuilder();
    }

    public static SetCustomTypeChangeBuilder of(final SetCustomTypeChange template) {
        SetCustomTypeChangeBuilder builder = new SetCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
