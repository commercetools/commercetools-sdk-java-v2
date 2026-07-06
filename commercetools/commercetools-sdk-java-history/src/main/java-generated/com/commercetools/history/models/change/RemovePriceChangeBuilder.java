
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemovePriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemovePriceChange removePriceChange = RemovePriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .priceId("{priceId}")
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public class RemovePriceChangeBuilder implements Builder<RemovePriceChange> {

    private String change;

    private com.commercetools.history.models.common.Price previousValue;

    private com.commercetools.history.models.common.Price nextValue;

    private String catalogData;

    private String priceId;

    private String variant;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemovePriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemovePriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemovePriceChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemovePriceChangeBuilder previousValue(final com.commercetools.history.models.common.Price previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemovePriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemovePriceChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public RemovePriceChangeBuilder nextValue(final com.commercetools.history.models.common.Price nextValue) {
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

    public RemovePriceChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *  <p><code>id</code> of the Embedded <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a>.</p>
     * @param priceId value to be set
     * @return Builder
     */

    public RemovePriceChangeBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     * @return Builder
     */

    public RemovePriceChangeBuilder variant(final String variant) {
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

    public com.commercetools.history.models.common.Price getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Price getNextValue() {
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
     *  <p><code>id</code> of the Embedded <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a>.</p>
     * @return priceId
     */

    public String getPriceId() {
        return this.priceId;
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
     * builds RemovePriceChange with checking for non-null required values
     * @return RemovePriceChange
     */
    public RemovePriceChange build() {
        Objects.requireNonNull(change, RemovePriceChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemovePriceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemovePriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(catalogData, RemovePriceChange.class + ": catalogData is missing");
        Objects.requireNonNull(priceId, RemovePriceChange.class + ": priceId is missing");
        Objects.requireNonNull(variant, RemovePriceChange.class + ": variant is missing");
        return new RemovePriceChangeImpl(change, previousValue, nextValue, catalogData, priceId, variant);
    }

    /**
     * builds RemovePriceChange without checking for non-null required values
     * @return RemovePriceChange
     */
    public RemovePriceChange buildUnchecked() {
        return new RemovePriceChangeImpl(change, previousValue, nextValue, catalogData, priceId, variant);
    }

    /**
     * factory method for an instance of RemovePriceChangeBuilder
     * @return builder
     */
    public static RemovePriceChangeBuilder of() {
        return new RemovePriceChangeBuilder();
    }

    /**
     * create builder for RemovePriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemovePriceChangeBuilder of(final RemovePriceChange template) {
        RemovePriceChangeBuilder builder = new RemovePriceChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.catalogData = template.getCatalogData();
        builder.priceId = template.getPriceId();
        builder.variant = template.getVariant();
        return builder;
    }

}
