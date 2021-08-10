
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAssetDescriptionChangeBuilder implements Builder<SetAssetDescriptionChange> {

    private String change;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    public SetAssetDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetAssetDescriptionChangeBuilder asset(
            final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    public SetAssetDescriptionChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetAssetDescriptionChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
    }

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public SetAssetDescriptionChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(asset);
        Objects.requireNonNull(nextValue);
        Objects.requireNonNull(previousValue);
        return new SetAssetDescriptionChangeImpl(change, asset, nextValue, previousValue);
    }

    /**
     * builds SetAssetDescriptionChange without checking for non null required values
     */
    public SetAssetDescriptionChange buildUnchecked() {
        return new SetAssetDescriptionChangeImpl(change, asset, nextValue, previousValue);
    }

    public static SetAssetDescriptionChangeBuilder of() {
        return new SetAssetDescriptionChangeBuilder();
    }

    public static SetAssetDescriptionChangeBuilder of(final SetAssetDescriptionChange template) {
        SetAssetDescriptionChangeBuilder builder = new SetAssetDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.asset = template.getAsset();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
