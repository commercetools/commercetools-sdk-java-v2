
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAssetCustomFieldChangeBuilder implements Builder<SetAssetCustomFieldChange> {

    private String change;

    private String name;

    private String customTypeId;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    public SetAssetCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetAssetCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public SetAssetCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    public SetAssetCustomFieldChangeBuilder asset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValueBuilder> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of()).build();
        return this;
    }

    public SetAssetCustomFieldChangeBuilder asset(
            final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    public SetAssetCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetAssetCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getName() {
        return this.name;
    }

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public SetAssetCustomFieldChange build() {
        Objects.requireNonNull(change, SetAssetCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(name, SetAssetCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetAssetCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(asset, SetAssetCustomFieldChange.class + ": asset is missing");
        Objects.requireNonNull(nextValue, SetAssetCustomFieldChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetAssetCustomFieldChange.class + ": previousValue is missing");
        return new SetAssetCustomFieldChangeImpl(change, name, customTypeId, asset, nextValue, previousValue);
    }

    /**
     * builds SetAssetCustomFieldChange without checking for non null required values
     */
    public SetAssetCustomFieldChange buildUnchecked() {
        return new SetAssetCustomFieldChangeImpl(change, name, customTypeId, asset, nextValue, previousValue);
    }

    public static SetAssetCustomFieldChangeBuilder of() {
        return new SetAssetCustomFieldChangeBuilder();
    }

    public static SetAssetCustomFieldChangeBuilder of(final SetAssetCustomFieldChange template) {
        SetAssetCustomFieldChangeBuilder builder = new SetAssetCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.asset = template.getAsset();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
