
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantValuesBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantValues variantValues = VariantValues.builder()
 *             .plusPrices(pricesBuilder -> pricesBuilder)
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantValuesBuilder implements Builder<VariantValues> {

    @Nullable
    private String sku;

    private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;

    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    /**
     *  <p>SKU of the ProductVariant.</p>
     * @param sku value to be set
     * @return Builder
     */

    public VariantValuesBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Embedded Prices of the ProductVariant.</p>
     * @param prices value to be set
     * @return Builder
     */

    public VariantValuesBuilder prices(final com.commercetools.api.models.common.PriceDraft... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>Embedded Prices of the ProductVariant.</p>
     * @param prices value to be set
     * @return Builder
     */

    public VariantValuesBuilder prices(final java.util.List<com.commercetools.api.models.common.PriceDraft> prices) {
        this.prices = prices;
        return this;
    }

    /**
     *  <p>Embedded Prices of the ProductVariant.</p>
     * @param prices value to be set
     * @return Builder
     */

    public VariantValuesBuilder plusPrices(final com.commercetools.api.models.common.PriceDraft... prices) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.addAll(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>Embedded Prices of the ProductVariant.</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public VariantValuesBuilder plusPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Embedded Prices of the ProductVariant.</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public VariantValuesBuilder withPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes of the ProductVariant.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantValuesBuilder attributes(final com.commercetools.api.models.product.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the ProductVariant.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantValuesBuilder attributes(
            final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes of the ProductVariant.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantValuesBuilder plusAttributes(final com.commercetools.api.models.product.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the ProductVariant.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantValuesBuilder plusAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Attributes of the ProductVariant.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantValuesBuilder withAttributes(
            Function<com.commercetools.api.models.product.AttributeBuilder, com.commercetools.api.models.product.AttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.product.AttributeBuilder.of()).build());
        return this;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices() {
        return this.prices;
    }

    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     * builds VariantValues with checking for non-null required values
     * @return VariantValues
     */
    public VariantValues build() {
        Objects.requireNonNull(prices, VariantValues.class + ": prices is missing");
        Objects.requireNonNull(attributes, VariantValues.class + ": attributes is missing");
        return new VariantValuesImpl(sku, prices, attributes);
    }

    /**
     * builds VariantValues without checking for non-null required values
     * @return VariantValues
     */
    public VariantValues buildUnchecked() {
        return new VariantValuesImpl(sku, prices, attributes);
    }

    public static VariantValuesBuilder of() {
        return new VariantValuesBuilder();
    }

    public static VariantValuesBuilder of(final VariantValues template) {
        VariantValuesBuilder builder = new VariantValuesBuilder();
        builder.sku = template.getSku();
        builder.prices = template.getPrices();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
