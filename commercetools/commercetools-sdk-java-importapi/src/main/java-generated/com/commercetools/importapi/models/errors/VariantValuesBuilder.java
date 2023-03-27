
package com.commercetools.importapi.models.errors;

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

    private java.util.List<com.commercetools.importapi.models.prices.PriceImport> prices;

    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    /**
     * set the value to the sku
     * @param sku value to be set
     * @return Builder
     */

    public VariantValuesBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * set values to the prices
     * @param prices value to be set
     * @return Builder
     */

    public VariantValuesBuilder prices(final com.commercetools.importapi.models.prices.PriceImport... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    /**
     * set value to the prices
     * @param prices value to be set
     * @return Builder
     */

    public VariantValuesBuilder prices(
            final java.util.List<com.commercetools.importapi.models.prices.PriceImport> prices) {
        this.prices = prices;
        return this;
    }

    /**
     * add values to the prices
     * @param prices value to be set
     * @return Builder
     */

    public VariantValuesBuilder plusPrices(final com.commercetools.importapi.models.prices.PriceImport... prices) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.addAll(Arrays.asList(prices));
        return this;
    }

    /**
     * add the value to the prices using the builder function
     * @param builder function to build the prices value
     * @return Builder
     */

    public VariantValuesBuilder plusPrices(
            Function<com.commercetools.importapi.models.prices.PriceImportBuilder, com.commercetools.importapi.models.prices.PriceImportBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(builder.apply(com.commercetools.importapi.models.prices.PriceImportBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the prices using the builder function
     * @param builder function to build the prices value
     * @return Builder
     */

    public VariantValuesBuilder withPrices(
            Function<com.commercetools.importapi.models.prices.PriceImportBuilder, com.commercetools.importapi.models.prices.PriceImportBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(builder.apply(com.commercetools.importapi.models.prices.PriceImportBuilder.of()).build());
        return this;
    }

    /**
     * set values to the attributes
     * @param attributes value to be set
     * @return Builder
     */

    public VariantValuesBuilder attributes(
            final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     * set value to the attributes
     * @param attributes value to be set
     * @return Builder
     */

    public VariantValuesBuilder attributes(
            final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * add values to the attributes
     * @param attributes value to be set
     * @return Builder
     */

    public VariantValuesBuilder plusAttributes(
            final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     * add a value to the attributes using the builder function
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantValuesBuilder plusAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the attributes using the builder function
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantValuesBuilder withAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     * value of sku}
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     * value of prices}
     * @return prices
     */

    public java.util.List<com.commercetools.importapi.models.prices.PriceImport> getPrices() {
        return this.prices;
    }

    /**
     * value of attributes}
     * @return attributes
     */

    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
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

    /**
     * factory method for an instance of VariantValuesBuilder
     * @return builder
     */
    public static VariantValuesBuilder of() {
        return new VariantValuesBuilder();
    }

    /**
     * create builder for VariantValues instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantValuesBuilder of(final VariantValues template) {
        VariantValuesBuilder builder = new VariantValuesBuilder();
        builder.sku = template.getSku();
        builder.prices = template.getPrices();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
