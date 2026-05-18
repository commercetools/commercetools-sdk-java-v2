
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
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .asset(assetBuilder -> assetBuilder)
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAssetSourcesChangeBuilder implements Builder<SetAssetSourcesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.AssetSource> previousValue;

    private java.util.List<com.commercetools.history.models.common.AssetSource> nextValue;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private String catalogData;

    private String variant;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder previousValue(
            final com.commercetools.history.models.common.AssetSource... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.AssetSource> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
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
     *  <p>Value before the change.</p>
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
     *  <p>Value before the change.</p>
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
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.AssetSourceBuilder, com.commercetools.history.models.common.AssetSource> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.AssetSourceBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.AssetSourceBuilder, com.commercetools.history.models.common.AssetSource> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.AssetSourceBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder nextValue(
            final com.commercetools.history.models.common.AssetSource... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.AssetSource> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
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
     *  <p>Value after the change.</p>
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
     *  <p>Value after the change.</p>
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
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.AssetSourceBuilder, com.commercetools.history.models.common.AssetSource> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.AssetSourceBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.AssetSourceBuilder, com.commercetools.history.models.common.AssetSource> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.AssetSourceBuilder.of()));
    }

    /**
     *  <p>Information about the updated Asset.</p>
     * @param builder function to build the asset value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder asset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValueBuilder> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Information about the updated Asset.</p>
     * @param builder function to build the asset value
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder withAsset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValue> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of());
        return this;
    }

    /**
     *  <p>Information about the updated Asset.</p>
     * @param asset value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder asset(
            final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
        return this;
    }

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     * @return Builder
     */

    public SetAssetSourcesChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.AssetSource> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.AssetSource> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Information about the updated Asset.</p>
     * @return asset
     */

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
    }

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @return catalogData
     */

    public String getCatalogData() {
        return this.catalogData;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @return variant
     */

    public String getVariant() {
        return this.variant;
    }

    /**
     * builds SetAssetSourcesChange with checking for non-null required values
     * @return SetAssetSourcesChange
     */
    public SetAssetSourcesChange build() {
        Objects.requireNonNull(change, SetAssetSourcesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetAssetSourcesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAssetSourcesChange.class + ": nextValue is missing");
        Objects.requireNonNull(asset, SetAssetSourcesChange.class + ": asset is missing");
        Objects.requireNonNull(catalogData, SetAssetSourcesChange.class + ": catalogData is missing");
        Objects.requireNonNull(variant, SetAssetSourcesChange.class + ": variant is missing");
        return new SetAssetSourcesChangeImpl(change, previousValue, nextValue, asset, catalogData, variant);
    }

    /**
     * builds SetAssetSourcesChange without checking for non-null required values
     * @return SetAssetSourcesChange
     */
    public SetAssetSourcesChange buildUnchecked() {
        return new SetAssetSourcesChangeImpl(change, previousValue, nextValue, asset, catalogData, variant);
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
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.asset = template.getAsset();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        return builder;
    }

}
