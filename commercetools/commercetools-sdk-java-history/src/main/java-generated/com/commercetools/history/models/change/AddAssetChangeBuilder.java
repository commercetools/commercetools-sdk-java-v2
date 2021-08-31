
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddAssetChangeBuilder implements Builder<AddAssetChange> {

    private String change;

    private com.commercetools.history.models.common.Asset nextValue;

    private com.commercetools.history.models.common.Asset previousValue;

    public AddAssetChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddAssetChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AssetBuilder, com.commercetools.history.models.common.AssetBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AssetBuilder.of()).build();
        return this;
    }

    public AddAssetChangeBuilder nextValue(final com.commercetools.history.models.common.Asset nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public AddAssetChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AssetBuilder, com.commercetools.history.models.common.AssetBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AssetBuilder.of()).build();
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
        Objects.requireNonNull(change, AddAssetChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddAssetChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, AddAssetChange.class + ": previousValue is missing");
        return new AddAssetChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds AddAssetChange without checking for non null required values
     */
    public AddAssetChange buildUnchecked() {
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
