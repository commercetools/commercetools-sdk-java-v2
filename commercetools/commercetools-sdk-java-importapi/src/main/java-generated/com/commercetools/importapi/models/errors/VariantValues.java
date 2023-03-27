
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.prices.PriceImport;
import com.commercetools.importapi.models.productvariants.Attribute;
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
     *
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *
     * @return prices
     */
    @NotNull
    @Valid
    @JsonProperty("prices")
    public List<PriceImport> getPrices();

    /**
     *
     * @return attributes
     */
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     * set sku
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     * set prices
     * @param prices values to be set
     */

    @JsonIgnore
    public void setPrices(final PriceImport... prices);

    /**
     * set prices
     * @param prices values to be set
     */

    public void setPrices(final List<PriceImport> prices);

    /**
     * set attributes
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     * set attributes
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
     * factory method to copy an instance of VariantValues
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
