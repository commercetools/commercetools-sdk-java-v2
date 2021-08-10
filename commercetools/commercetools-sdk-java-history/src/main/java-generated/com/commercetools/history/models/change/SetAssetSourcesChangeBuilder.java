
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAssetSourcesChangeBuilder implements Builder<SetAssetSourcesChange> {

    private String change;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private java.util.List<com.commercetools.history.models.common.AssetSource> nextValue;

    private java.util.List<com.commercetools.history.models.common.AssetSource> previousValue;

    public SetAssetSourcesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetAssetSourcesChangeBuilder asset(
            final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    public SetAssetSourcesChangeBuilder nextValue(
            final com.commercetools.history.models.common.AssetSource... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public SetAssetSourcesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.AssetSource> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetAssetSourcesChangeBuilder previousValue(
            final com.commercetools.history.models.common.AssetSource... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public SetAssetSourcesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.AssetSource> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
    }

    public java.util.List<com.commercetools.history.models.common.AssetSource> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.common.AssetSource> getPreviousValue() {
        return this.previousValue;
    }

    public SetAssetSourcesChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(asset);
        Objects.requireNonNull(nextValue);
        Objects.requireNonNull(previousValue);
        return new SetAssetSourcesChangeImpl(change, asset, nextValue, previousValue);
    }

    /**
     * builds SetAssetSourcesChange without checking for non null required values
     */
    public SetAssetSourcesChange buildUnchecked() {
        return new SetAssetSourcesChangeImpl(change, asset, nextValue, previousValue);
    }

    public static SetAssetSourcesChangeBuilder of() {
        return new SetAssetSourcesChangeBuilder();
    }

    public static SetAssetSourcesChangeBuilder of(final SetAssetSourcesChange template) {
        SetAssetSourcesChangeBuilder builder = new SetAssetSourcesChangeBuilder();
        builder.change = template.getChange();
        builder.asset = template.getAsset();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
