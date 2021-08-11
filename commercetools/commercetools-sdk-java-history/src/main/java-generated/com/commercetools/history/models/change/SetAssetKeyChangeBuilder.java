
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAssetKeyChangeBuilder implements Builder<SetAssetKeyChange> {

    private String change;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private String nextValue;

    private String previousValue;

    public SetAssetKeyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetAssetKeyChangeBuilder asset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValueBuilder> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of()).build();
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
        Objects.requireNonNull(change, SetAssetKeyChange.class + ": change is missing");
        Objects.requireNonNull(asset, SetAssetKeyChange.class + ": asset is missing");
        Objects.requireNonNull(nextValue, SetAssetKeyChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetAssetKeyChange.class + ": previousValue is missing");
        return new SetAssetKeyChangeImpl(change, asset, nextValue, previousValue);
    }

    /**
     * builds SetAssetKeyChange without checking for non null required values
     */
    public SetAssetKeyChange buildUnchecked() {
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
