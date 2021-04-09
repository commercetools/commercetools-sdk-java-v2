
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddAssetChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.Asset nextValue;

    private com.commercetools.history.models.common.Asset previousValue;

    public AddAssetChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddAssetChangeBuilder nextValue(final com.commercetools.history.models.common.Asset nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public AddAssetChangeBuilder previousValue(final com.commercetools.history.models.common.Asset previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Asset getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Asset getPreviousValue() {
        return this.previousValue;
    }

    public AddAssetChange build() {
        return new AddAssetChangeImpl(change, nextValue, previousValue);
    }

    public static AddAssetChangeBuilder of() {
        return new AddAssetChangeBuilder();
    }

    public static AddAssetChangeBuilder of(final AddAssetChange template) {
        AddAssetChangeBuilder builder = new AddAssetChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
