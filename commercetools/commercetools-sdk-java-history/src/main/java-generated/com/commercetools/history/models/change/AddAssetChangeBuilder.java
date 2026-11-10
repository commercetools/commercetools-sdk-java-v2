
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddAssetChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddAssetChange addAssetChange = AddAssetChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddAssetChangeBuilder implements Builder<AddAssetChange> {

    private String change;

    private com.commercetools.history.models.common.Asset previousValue;

    private com.commercetools.history.models.common.Asset nextValue;

    private String catalogData;

    private String variant;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddAssetChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddAssetChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AssetBuilder, com.commercetools.history.models.common.AssetBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AssetBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddAssetChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.AssetBuilder, com.commercetools.history.models.common.Asset> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AssetBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public AddAssetChangeBuilder previousValue(final com.commercetools.history.models.common.Asset previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddAssetChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AssetBuilder, com.commercetools.history.models.common.AssetBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AssetBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddAssetChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.AssetBuilder, com.commercetools.history.models.common.Asset> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AssetBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddAssetChangeBuilder nextValue(final com.commercetools.history.models.common.Asset nextValue) {
        this.nextValue = nextValue;
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

    public AddAssetChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     * @return Builder
     */

    public AddAssetChangeBuilder variant(final String variant) {
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

    public com.commercetools.history.models.common.Asset getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Asset getNextValue() {
        return this.nextValue;
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
     * builds AddAssetChange with checking for non-null required values
     * @return AddAssetChange
     */
    public AddAssetChange build() {
        Objects.requireNonNull(change, AddAssetChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, AddAssetChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddAssetChange.class + ": nextValue is missing");
        Objects.requireNonNull(catalogData, AddAssetChange.class + ": catalogData is missing");
        Objects.requireNonNull(variant, AddAssetChange.class + ": variant is missing");
        return new AddAssetChangeImpl(change, previousValue, nextValue, catalogData, variant);
    }

    /**
     * builds AddAssetChange without checking for non-null required values
     * @return AddAssetChange
     */
    public AddAssetChange buildUnchecked() {
        return new AddAssetChangeImpl(change, previousValue, nextValue, catalogData, variant);
    }

    /**
     * factory method for an instance of AddAssetChangeBuilder
     * @return builder
     */
    public static AddAssetChangeBuilder of() {
        return new AddAssetChangeBuilder();
    }

    /**
     * create builder for AddAssetChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddAssetChangeBuilder of(final AddAssetChange template) {
        AddAssetChangeBuilder builder = new AddAssetChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        return builder;
    }

}
