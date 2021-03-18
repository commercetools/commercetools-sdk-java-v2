
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAssetCustomTypeChangeBuilder {

    private String change;

    private com.commercetools.history.models.AssetChangeValue asset;

    private com.commercetools.history.models.CustomFields nextValue;

    private com.commercetools.history.models.CustomFields previousValue;

    public SetAssetCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetAssetCustomTypeChangeBuilder asset(final com.commercetools.history.models.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    public SetAssetCustomTypeChangeBuilder nextValue(final com.commercetools.history.models.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetAssetCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.AssetChangeValue getAsset() {
        return this.asset;
    }

    public com.commercetools.history.models.CustomFields getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    public SetAssetCustomTypeChange build() {
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
