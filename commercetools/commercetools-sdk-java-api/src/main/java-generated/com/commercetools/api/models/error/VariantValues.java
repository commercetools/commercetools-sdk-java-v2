
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantValues
 *
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
@JsonDeserialize(as = VariantValuesImpl.class)
public interface VariantValues {

    /**
     *  <p>SKU of the ProductVariant.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Embedded Prices of the ProductVariant.</p>
     * @return prices
     */
    @NotNull
    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();

    /**
     *  <p>Attributes of the ProductVariant.</p>
     * @return attributes
     */
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>SKU of the ProductVariant.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Embedded Prices of the ProductVariant.</p>
     * @param prices values to be set
     */

    @JsonIgnore
    public void setPrices(final PriceDraft... prices);

    /**
     *  <p>Embedded Prices of the ProductVariant.</p>
     * @param prices values to be set
     */

    public void setPrices(final List<PriceDraft> prices);

    /**
     *  <p>Attributes of the ProductVariant.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>Attributes of the ProductVariant.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     * factory method
     * @return instance of VariantValues
     */
    public static VariantValues of() {
        return new VariantValuesImpl();
    }

    /**
     * factory method to create a shallow copy VariantValues
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantValues of(final VariantValues template) {
        VariantValuesImpl instance = new VariantValuesImpl();
        instance.setSku(template.getSku());
        instance.setPrices(template.getPrices());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    /**
     * factory method to create a deep copy of VariantValues
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantValues deepCopy(@Nullable final VariantValues template) {
        if (template == null) {
            return null;
        }
        VariantValuesImpl instance = new VariantValuesImpl();
        instance.setSku(template.getSku());
        instance.setPrices(Optional.ofNullable(template.getPrices())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.PriceDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.Attribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantValues
     * @return builder
     */
    public static VariantValuesBuilder builder() {
        return VariantValuesBuilder.of();
    }

    /**
     * create builder for VariantValues instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantValuesBuilder builder(final VariantValues template) {
        return VariantValuesBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantValues(Function<VariantValues, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<VariantValues> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<VariantValues>() {
            @Override
            public String toString() {
                return "TypeReference<VariantValues>";
            }
        };
    }
}
