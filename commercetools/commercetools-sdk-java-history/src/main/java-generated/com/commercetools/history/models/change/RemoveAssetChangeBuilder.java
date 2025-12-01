
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveAssetChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveAssetChange removeAssetChange = RemoveAssetChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveAssetChangeBuilder implements Builder<RemoveAssetChange> {

    private String change;

    private com.commercetools.history.models.common.Asset previousValue;

    private String catalogData;

    private String variant;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemoveAssetChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveAssetChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AssetBuilder, com.commercetools.history.models.common.AssetBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AssetBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveAssetChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.AssetBuilder, com.commercetools.history.models.common.Asset> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AssetBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveAssetChangeBuilder previousValue(final com.commercetools.history.models.common.Asset previousValue) {
        this.previousValue = previousValue;
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

    public RemoveAssetChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     * @return Builder
     */

    public RemoveAssetChangeBuilder variant(final String variant) {
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
     * builds RemoveAssetChange with checking for non-null required values
     * @return RemoveAssetChange
     */
    public RemoveAssetChange build() {
        Objects.requireNonNull(change, RemoveAssetChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveAssetChange.class + ": previousValue is missing");
        Objects.requireNonNull(catalogData, RemoveAssetChange.class + ": catalogData is missing");
        Objects.requireNonNull(variant, RemoveAssetChange.class + ": variant is missing");
        return new RemoveAssetChangeImpl(change, previousValue, catalogData, variant);
    }

    /**
     * builds RemoveAssetChange without checking for non-null required values
     * @return RemoveAssetChange
     */
    public RemoveAssetChange buildUnchecked() {
        return new RemoveAssetChangeImpl(change, previousValue, catalogData, variant);
    }

    /**
     * factory method for an instance of RemoveAssetChangeBuilder
     * @return builder
     */
    public static RemoveAssetChangeBuilder of() {
        return new RemoveAssetChangeBuilder();
    }

    /**
     * create builder for RemoveAssetChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveAssetChangeBuilder of(final RemoveAssetChange template) {
        RemoveAssetChangeBuilder builder = new RemoveAssetChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        return builder;
    }

}
