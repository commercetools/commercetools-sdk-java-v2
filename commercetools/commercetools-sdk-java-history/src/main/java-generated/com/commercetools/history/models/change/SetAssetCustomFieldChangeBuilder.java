
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAssetCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetCustomFieldChange setAssetCustomFieldChange = SetAssetCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAssetCustomFieldChangeBuilder implements Builder<SetAssetCustomFieldChange> {

    private String change;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    private String name;

    private String customTypeId;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private String catalogData;

    private String variant;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Information about the updated Asset.</p>
     * @param builder function to build the asset value
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder asset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValueBuilder> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Information about the updated Asset.</p>
     * @param builder function to build the asset value
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder withAsset(
            Function<com.commercetools.history.models.change_value.AssetChangeValueBuilder, com.commercetools.history.models.change_value.AssetChangeValue> builder) {
        this.asset = builder.apply(com.commercetools.history.models.change_value.AssetChangeValueBuilder.of());
        return this;
    }

    /**
     *  <p>Information about the updated Asset.</p>
     * @param asset value to be set
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder asset(
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

    public SetAssetCustomFieldChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     * @return Builder
     */

    public SetAssetCustomFieldChangeBuilder variant(final String variant) {
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

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return customTypeId
     */

    public String getCustomTypeId() {
        return this.customTypeId;
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
     * builds SetAssetCustomFieldChange with checking for non-null required values
     * @return SetAssetCustomFieldChange
     */
    public SetAssetCustomFieldChange build() {
        Objects.requireNonNull(change, SetAssetCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetAssetCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAssetCustomFieldChange.class + ": nextValue is missing");
        Objects.requireNonNull(name, SetAssetCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetAssetCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(asset, SetAssetCustomFieldChange.class + ": asset is missing");
        Objects.requireNonNull(catalogData, SetAssetCustomFieldChange.class + ": catalogData is missing");
        Objects.requireNonNull(variant, SetAssetCustomFieldChange.class + ": variant is missing");
        return new SetAssetCustomFieldChangeImpl(change, previousValue, nextValue, name, customTypeId, asset,
            catalogData, variant);
    }

    /**
     * builds SetAssetCustomFieldChange without checking for non-null required values
     * @return SetAssetCustomFieldChange
     */
    public SetAssetCustomFieldChange buildUnchecked() {
        return new SetAssetCustomFieldChangeImpl(change, previousValue, nextValue, name, customTypeId, asset,
            catalogData, variant);
    }

    /**
     * factory method for an instance of SetAssetCustomFieldChangeBuilder
     * @return builder
     */
    public static SetAssetCustomFieldChangeBuilder of() {
        return new SetAssetCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetAssetCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAssetCustomFieldChangeBuilder of(final SetAssetCustomFieldChange template) {
        SetAssetCustomFieldChangeBuilder builder = new SetAssetCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.asset = template.getAsset();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        return builder;
    }

}
