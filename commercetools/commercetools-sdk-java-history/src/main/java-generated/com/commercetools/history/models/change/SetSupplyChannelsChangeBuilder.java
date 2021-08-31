
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetSupplyChannelsChangeBuilder implements Builder<SetSupplyChannelsChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.Reference> previousValue;

    private java.util.List<com.commercetools.history.models.common.Reference> nextValue;

    public SetSupplyChannelsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetSupplyChannelsChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public SetSupplyChannelsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    public SetSupplyChannelsChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    public SetSupplyChannelsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Reference> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetSupplyChannelsChangeBuilder nextValue(
            final com.commercetools.history.models.common.Reference... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public SetSupplyChannelsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    public SetSupplyChannelsChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    public SetSupplyChannelsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Reference> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.common.Reference> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.common.Reference> getNextValue() {
        return this.nextValue;
    }

    public SetSupplyChannelsChange build() {
        Objects.requireNonNull(change, SetSupplyChannelsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetSupplyChannelsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetSupplyChannelsChange.class + ": nextValue is missing");
        return new SetSupplyChannelsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetSupplyChannelsChange without checking for non null required values
     */
    public SetSupplyChannelsChange buildUnchecked() {
        return new SetSupplyChannelsChangeImpl(change, previousValue, nextValue);
    }

    public static SetSupplyChannelsChangeBuilder of() {
        return new SetSupplyChannelsChangeBuilder();
    }

    public static SetSupplyChannelsChangeBuilder of(final SetSupplyChannelsChange template) {
        SetSupplyChannelsChangeBuilder builder = new SetSupplyChannelsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
