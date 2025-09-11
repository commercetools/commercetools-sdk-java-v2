
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDiscountedPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDiscountedPriceChange setDiscountedPriceChange = SetDiscountedPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDiscountedPriceChangeBuilder implements Builder<SetDiscountedPriceChange> {

    private String change;

    private com.commercetools.history.models.common.Price previousValue;

    private com.commercetools.history.models.common.Price nextValue;

    private String catalogData;

    private String variant;

    private String priceId;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetDiscountedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDiscountedPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDiscountedPriceChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDiscountedPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.Price previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDiscountedPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDiscountedPriceChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDiscountedPriceChangeBuilder nextValue(final com.commercetools.history.models.common.Price nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     * @return Builder
     */

    public SetDiscountedPriceChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *  <p><code>sku</code> or <code>key</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param variant value to be set
     * @return Builder
     */

    public SetDiscountedPriceChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p><code>id</code> of the Embedded <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a>.</p>
     * @param priceId value to be set
     * @return Builder
     */

    public SetDiscountedPriceChangeBuilder priceId(final String priceId) {
        this.priceId = priceId;
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
     *  <p><code>sku</code> or <code>key</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @return variant
     */

    public String getVariant() {
        return this.variant;
    }

    /**
     *  <p><code>id</code> of the Embedded <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a>.</p>
     * @return priceId
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     * builds SetDiscountedPriceChange with checking for non-null required values
     * @return SetDiscountedPriceChange
     */
    public SetDiscountedPriceChange build() {
        Objects.requireNonNull(change, SetDiscountedPriceChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetDiscountedPriceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDiscountedPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(catalogData, SetDiscountedPriceChange.class + ": catalogData is missing");
        Objects.requireNonNull(variant, SetDiscountedPriceChange.class + ": variant is missing");
        Objects.requireNonNull(priceId, SetDiscountedPriceChange.class + ": priceId is missing");
        return new SetDiscountedPriceChangeImpl(change, previousValue, nextValue, catalogData, variant, priceId);
    }

    /**
     * builds SetDiscountedPriceChange without checking for non-null required values
     * @return SetDiscountedPriceChange
     */
    public SetDiscountedPriceChange buildUnchecked() {
        return new SetDiscountedPriceChangeImpl(change, previousValue, nextValue, catalogData, variant, priceId);
    }

    /**
     * factory method for an instance of SetDiscountedPriceChangeBuilder
     * @return builder
     */
    public static SetDiscountedPriceChangeBuilder of() {
        return new SetDiscountedPriceChangeBuilder();
    }

    /**
     * create builder for SetDiscountedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDiscountedPriceChangeBuilder of(final SetDiscountedPriceChange template) {
        SetDiscountedPriceChangeBuilder builder = new SetDiscountedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        builder.priceId = template.getPriceId();
        return builder;
    }

}
