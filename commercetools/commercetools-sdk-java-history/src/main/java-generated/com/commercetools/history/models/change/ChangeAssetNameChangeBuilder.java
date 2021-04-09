
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeAssetNameChangeBuilder {

    private String change;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    public ChangeAssetNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeAssetNameChangeBuilder asset(
            final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    public ChangeAssetNameChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeAssetNameChangeBuilder previousValue(
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

    public ChangeAssetNameChange build() {
        return new ChangeAssetNameChangeImpl(change, asset, nextValue, previousValue);
    }

    public static ChangeAssetNameChangeBuilder of() {
        return new ChangeAssetNameChangeBuilder();
    }

    public static ChangeAssetNameChangeBuilder of(final ChangeAssetNameChange template) {
        ChangeAssetNameChangeBuilder builder = new ChangeAssetNameChangeBuilder();
        builder.change = template.getChange();
        builder.asset = template.getAsset();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
