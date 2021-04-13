
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAssetKeyChangeBuilder {

    private String change;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private String nextValue;

    private String previousValue;

    public SetAssetKeyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetAssetKeyChangeBuilder asset(final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    public SetAssetKeyChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetAssetKeyChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public SetAssetKeyChange build() {
        return new SetAssetKeyChangeImpl(change, asset, nextValue, previousValue);
    }

    public static SetAssetKeyChangeBuilder of() {
        return new SetAssetKeyChangeBuilder();
    }

    public static SetAssetKeyChangeBuilder of(final SetAssetKeyChange template) {
        SetAssetKeyChangeBuilder builder = new SetAssetKeyChangeBuilder();
        builder.change = template.getChange();
        builder.asset = template.getAsset();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
