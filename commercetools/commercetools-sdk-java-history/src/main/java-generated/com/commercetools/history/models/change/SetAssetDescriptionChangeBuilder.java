
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAssetDescriptionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetDescriptionChange setAssetDescriptionChange = SetAssetDescriptionChange.builder()
 *             .change("{change}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAssetDescriptionChangeBuilder implements Builder<SetAssetDescriptionChange> {

    private String change;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    /**
     *  <p>Update action for <code>setAssetDescription</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetAssetDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the asset using the builder function
     * @param builder function to build the asset value
     * @return Builder
     */

    public SetAssetDescriptionChangeBuilder asset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValueBuilder> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the asset
     * @param asset value to be set
     * @return Builder
     */

    public SetAssetDescriptionChangeBuilder asset(
            final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetAssetDescriptionChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAssetDescriptionChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetAssetDescriptionChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAssetDescriptionChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setAssetDescription</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of asset}
     * @return asset
     */

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetAssetDescriptionChange with checking for non-null required values
     * @return SetAssetDescriptionChange
     */
    public SetAssetDescriptionChange build() {
        Objects.requireNonNull(change, SetAssetDescriptionChange.class + ": change is missing");
        Objects.requireNonNull(asset, SetAssetDescriptionChange.class + ": asset is missing");
        Objects.requireNonNull(nextValue, SetAssetDescriptionChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetAssetDescriptionChange.class + ": previousValue is missing");
        return new SetAssetDescriptionChangeImpl(change, asset, nextValue, previousValue);
    }

    /**
     * builds SetAssetDescriptionChange without checking for non-null required values
     * @return SetAssetDescriptionChange
     */
    public SetAssetDescriptionChange buildUnchecked() {
        return new SetAssetDescriptionChangeImpl(change, asset, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetAssetDescriptionChangeBuilder
     * @return builder
     */
    public static SetAssetDescriptionChangeBuilder of() {
        return new SetAssetDescriptionChangeBuilder();
    }

    /**
     * create builder for SetAssetDescriptionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAssetDescriptionChangeBuilder of(final SetAssetDescriptionChange template) {
        SetAssetDescriptionChangeBuilder builder = new SetAssetDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.asset = template.getAsset();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
