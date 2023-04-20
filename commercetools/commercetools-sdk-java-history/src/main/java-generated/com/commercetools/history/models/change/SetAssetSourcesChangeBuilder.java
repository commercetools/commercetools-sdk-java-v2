
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAssetSourcesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetSourcesChange setAssetSourcesChange = SetAssetSourcesChange.builder()
 *             .change("{change}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAssetSourcesChangeBuilder implements Builder<SetAssetSourcesChange> {

    private String change;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private java.util.List<com.commercetools.history.models.common.AssetSource> nextValue;

    private java.util.List<com.commercetools.history.models.common.AssetSource> previousValue;

    /**
     *  <p>Update action for <code>setAssetSources</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the asset using the builder function
     * @param builder function to build the asset value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder asset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValueBuilder> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the asset using the builder function
     * @param builder function to build the asset value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder withAsset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValue> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the asset
     * @param asset value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder asset(
            final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    /**
     * set values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder nextValue(
            final com.commercetools.history.models.common.AssetSource... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     * set value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.AssetSource> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * add values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.AssetSource... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     * add the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.AssetSourceBuilder, com.commercetools.history.models.common.AssetSourceBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.AssetSourceBuilder, com.commercetools.history.models.common.AssetSourceBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.AssetSourceBuilder, com.commercetools.history.models.common.AssetSource> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.AssetSourceBuilder.of()));
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.AssetSourceBuilder, com.commercetools.history.models.common.AssetSource> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.AssetSourceBuilder.of()));
    }

    /**
     * set values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder previousValue(
            final com.commercetools.history.models.common.AssetSource... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     * set value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.AssetSource> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * add values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.AssetSource... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     * add the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.AssetSourceBuilder, com.commercetools.history.models.common.AssetSourceBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.AssetSourceBuilder, com.commercetools.history.models.common.AssetSourceBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.AssetSourceBuilder, com.commercetools.history.models.common.AssetSource> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.AssetSourceBuilder.of()));
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.AssetSourceBuilder, com.commercetools.history.models.common.AssetSource> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.AssetSourceBuilder.of()));
    }

    /**
     *  <p>Update action for <code>setAssetSources</code></p>
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

    public java.util.List<com.commercetools.history.models.common.AssetSource> getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.AssetSource> getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetAssetSourcesChange with checking for non-null required values
     * @return SetAssetSourcesChange
     */
    public SetAssetSourcesChange build() {
        Objects.requireNonNull(change, SetAssetSourcesChange.class + ": change is missing");
        Objects.requireNonNull(asset, SetAssetSourcesChange.class + ": asset is missing");
        Objects.requireNonNull(nextValue, SetAssetSourcesChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetAssetSourcesChange.class + ": previousValue is missing");
        return new SetAssetSourcesChangeImpl(change, asset, nextValue, previousValue);
    }

    /**
     * builds SetAssetSourcesChange without checking for non-null required values
     * @return SetAssetSourcesChange
     */
    public SetAssetSourcesChange buildUnchecked() {
        return new SetAssetSourcesChangeImpl(change, asset, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetAssetSourcesChangeBuilder
     * @return builder
     */
    public static SetAssetSourcesChangeBuilder of() {
        return new SetAssetSourcesChangeBuilder();
    }

    /**
     * create builder for SetAssetSourcesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAssetSourcesChangeBuilder of(final SetAssetSourcesChange template) {
        SetAssetSourcesChangeBuilder builder = new SetAssetSourcesChangeBuilder();
        builder.change = template.getChange();
        builder.asset = template.getAsset();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
