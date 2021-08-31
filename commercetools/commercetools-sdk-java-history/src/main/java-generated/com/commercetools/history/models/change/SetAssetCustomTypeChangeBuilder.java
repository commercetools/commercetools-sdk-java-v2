
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAssetCustomTypeChangeBuilder implements Builder<SetAssetCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private com.commercetools.history.models.common.CustomFields nextValue;

    private com.commercetools.history.models.common.CustomFields previousValue;

    public SetAssetCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetAssetCustomTypeChangeBuilder asset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValueBuilder> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of()).build();
        return this;
    }

    public SetAssetCustomTypeChangeBuilder asset(
            final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    public SetAssetCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public SetAssetCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetAssetCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public SetAssetCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
    }

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    public SetAssetCustomTypeChange build() {
        Objects.requireNonNull(change, SetAssetCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(asset, SetAssetCustomTypeChange.class + ": asset is missing");
        Objects.requireNonNull(nextValue, SetAssetCustomTypeChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetAssetCustomTypeChange.class + ": previousValue is missing");
        return new SetAssetCustomTypeChangeImpl(change, asset, nextValue, previousValue);
    }

    /**
     * builds SetAssetCustomTypeChange without checking for non null required values
     */
    public SetAssetCustomTypeChange buildUnchecked() {
        return new SetAssetCustomTypeChangeImpl(change, asset, nextValue, previousValue);
    }

    public static SetAssetCustomTypeChangeBuilder of() {
        return new SetAssetCustomTypeChangeBuilder();
    }

    public static SetAssetCustomTypeChangeBuilder of(final SetAssetCustomTypeChange template) {
        SetAssetCustomTypeChangeBuilder builder = new SetAssetCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.asset = template.getAsset();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
