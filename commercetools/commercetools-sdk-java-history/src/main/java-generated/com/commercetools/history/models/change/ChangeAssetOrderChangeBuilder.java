
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeAssetOrderChangeBuilder implements Builder<ChangeAssetOrderChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.LocalizedString> previousValue;

    private java.util.List<com.commercetools.history.models.common.LocalizedString> nextValue;

    public ChangeAssetOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeAssetOrderChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public ChangeAssetOrderChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue
                .add(builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    public ChangeAssetOrderChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue
                .add(builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    public ChangeAssetOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.LocalizedString> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeAssetOrderChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public ChangeAssetOrderChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    public ChangeAssetOrderChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    public ChangeAssetOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.LocalizedString> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.common.LocalizedString> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.common.LocalizedString> getNextValue() {
        return this.nextValue;
    }

    public ChangeAssetOrderChange build() {
        Objects.requireNonNull(change, ChangeAssetOrderChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeAssetOrderChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeAssetOrderChange.class + ": nextValue is missing");
        return new ChangeAssetOrderChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeAssetOrderChange without checking for non null required values
     */
    public ChangeAssetOrderChange buildUnchecked() {
        return new ChangeAssetOrderChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeAssetOrderChangeBuilder of() {
        return new ChangeAssetOrderChangeBuilder();
    }

    public static ChangeAssetOrderChangeBuilder of(final ChangeAssetOrderChange template) {
        ChangeAssetOrderChangeBuilder builder = new ChangeAssetOrderChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
