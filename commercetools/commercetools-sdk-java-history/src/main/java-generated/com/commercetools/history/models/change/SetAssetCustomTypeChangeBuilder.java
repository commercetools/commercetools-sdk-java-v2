
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAssetCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetCustomTypeChange setAssetCustomTypeChange = SetAssetCustomTypeChange.builder()
 *             .change("{change}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAssetCustomTypeChangeBuilder implements Builder<SetAssetCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private com.commercetools.history.models.common.CustomFields nextValue;

    private com.commercetools.history.models.common.CustomFields previousValue;

    /**
     *  <p>Update action for <code>setAssetCustomType</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetAssetCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param builder function to build the asset value
     * @return Builder
     */

    public SetAssetCustomTypeChangeBuilder asset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValueBuilder> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param asset value to be set
     * @return Builder
     */

    public SetAssetCustomTypeChangeBuilder asset(
            final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetAssetCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAssetCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetAssetCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAssetCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
    }

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetAssetCustomTypeChange with checking for non-null required values
     * @return SetAssetCustomTypeChange
     */
    public SetAssetCustomTypeChange build() {
        Objects.requireNonNull(change, SetAssetCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(asset, SetAssetCustomTypeChange.class + ": asset is missing");
        Objects.requireNonNull(nextValue, SetAssetCustomTypeChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetAssetCustomTypeChange.class + ": previousValue is missing");
        return new SetAssetCustomTypeChangeImpl(change, asset, nextValue, previousValue);
    }

    /**
     * builds SetAssetCustomTypeChange without checking for non-null required values
     * @return SetAssetCustomTypeChange
     */
    public SetAssetCustomTypeChange buildUnchecked() {
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
