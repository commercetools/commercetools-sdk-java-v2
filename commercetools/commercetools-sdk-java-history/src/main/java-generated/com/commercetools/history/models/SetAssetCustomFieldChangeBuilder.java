
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAssetCustomFieldChangeBuilder {

    private String change;

    private String name;

    private String customTypeId;

    private com.commercetools.history.models.AssetChangeValue asset;

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

    public SetAssetCustomFieldChangeBuilder asset(final com.commercetools.history.models.AssetChangeValue asset) {
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

    public com.commercetools.history.models.AssetChangeValue getAsset() {
        return this.asset;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public SetAssetCustomFieldChange build() {
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
