
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetVariantAvailabilityChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetVariantAvailabilityChange setVariantAvailabilityChange = SetVariantAvailabilityChange.builder()
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
public class SetVariantAvailabilityChangeBuilder implements Builder<SetVariantAvailabilityChange> {

    private String change;

    private com.commercetools.history.models.common.ProductVariantAvailability previousValue;

    private com.commercetools.history.models.common.ProductVariantAvailability nextValue;

    private String catalogData;

    private String variant;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetVariantAvailabilityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetVariantAvailabilityChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ProductVariantAvailabilityBuilder, com.commercetools.history.models.common.ProductVariantAvailabilityBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.common.ProductVariantAvailabilityBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetVariantAvailabilityChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ProductVariantAvailabilityBuilder, com.commercetools.history.models.common.ProductVariantAvailability> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.common.ProductVariantAvailabilityBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetVariantAvailabilityChangeBuilder previousValue(
            final com.commercetools.history.models.common.ProductVariantAvailability previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetVariantAvailabilityChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ProductVariantAvailabilityBuilder, com.commercetools.history.models.common.ProductVariantAvailabilityBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ProductVariantAvailabilityBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetVariantAvailabilityChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ProductVariantAvailabilityBuilder, com.commercetools.history.models.common.ProductVariantAvailability> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ProductVariantAvailabilityBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetVariantAvailabilityChangeBuilder nextValue(
            final com.commercetools.history.models.common.ProductVariantAvailability nextValue) {
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

    public SetVariantAvailabilityChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     * @return Builder
     */

    public SetVariantAvailabilityChangeBuilder variant(final String variant) {
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

    public com.commercetools.history.models.common.ProductVariantAvailability getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.ProductVariantAvailability getNextValue() {
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
     * builds SetVariantAvailabilityChange with checking for non-null required values
     * @return SetVariantAvailabilityChange
     */
    public SetVariantAvailabilityChange build() {
        Objects.requireNonNull(change, SetVariantAvailabilityChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetVariantAvailabilityChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetVariantAvailabilityChange.class + ": nextValue is missing");
        Objects.requireNonNull(catalogData, SetVariantAvailabilityChange.class + ": catalogData is missing");
        Objects.requireNonNull(variant, SetVariantAvailabilityChange.class + ": variant is missing");
        return new SetVariantAvailabilityChangeImpl(change, previousValue, nextValue, catalogData, variant);
    }

    /**
     * builds SetVariantAvailabilityChange without checking for non-null required values
     * @return SetVariantAvailabilityChange
     */
    public SetVariantAvailabilityChange buildUnchecked() {
        return new SetVariantAvailabilityChangeImpl(change, previousValue, nextValue, catalogData, variant);
    }

    /**
     * factory method for an instance of SetVariantAvailabilityChangeBuilder
     * @return builder
     */
    public static SetVariantAvailabilityChangeBuilder of() {
        return new SetVariantAvailabilityChangeBuilder();
    }

    /**
     * create builder for SetVariantAvailabilityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetVariantAvailabilityChangeBuilder of(final SetVariantAvailabilityChange template) {
        SetVariantAvailabilityChangeBuilder builder = new SetVariantAvailabilityChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        return builder;
    }

}
