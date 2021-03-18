
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAssetSourcesChangeBuilder {

    private String change;

    private com.commercetools.history.models.AssetChangeValue asset;

    private java.util.List<com.commercetools.history.models.AssetSource> nextValue;

    private java.util.List<com.commercetools.history.models.AssetSource> previousValue;

    public SetAssetSourcesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetAssetSourcesChangeBuilder asset(final com.commercetools.history.models.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    public SetAssetSourcesChangeBuilder nextValue(final com.commercetools.history.models.AssetSource... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public SetAssetSourcesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.AssetSource> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetAssetSourcesChangeBuilder previousValue(
            final com.commercetools.history.models.AssetSource... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public SetAssetSourcesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.AssetSource> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.AssetChangeValue getAsset() {
        return this.asset;
    }

    public java.util.List<com.commercetools.history.models.AssetSource> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.AssetSource> getPreviousValue() {
        return this.previousValue;
    }

    public SetAssetSourcesChange build() {
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
