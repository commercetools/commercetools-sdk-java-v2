
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Prices update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPricesSetMessagePayload productPricesSetMessagePayload = ProductPricesSetMessagePayload.builder()
 *             .variantId(0.3)
 *             .plusPrices(pricesBuilder -> pricesBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPricesSetMessagePayloadImpl.class)
public interface ProductPricesSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductPricesSetMessagePayload
     */
    String PRODUCT_PRICES_SET = "ProductPricesSet";

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was set.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     * @return prices
     */
    @NotNull
    @Valid
    @JsonProperty("prices")
    public List<Price> getPrices();

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was set.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     * @param prices values to be set
     */

    @JsonIgnore
    public void setPrices(final Price... prices);

    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     * @param prices values to be set
     */

    public void setPrices(final List<Price> prices);

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductPricesSetMessagePayload
     */
    public static ProductPricesSetMessagePayload of() {
        return new ProductPricesSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductPricesSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPricesSetMessagePayload of(final ProductPricesSetMessagePayload template) {
        ProductPricesSetMessagePayloadImpl instance = new ProductPricesSetMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setPrices(template.getPrices());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPricesSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPricesSetMessagePayload deepCopy(@Nullable final ProductPricesSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductPricesSetMessagePayloadImpl instance = new ProductPricesSetMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setPrices(Optional.ofNullable(template.getPrices())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Price::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductPricesSetMessagePayload
     * @return builder
     */
    public static ProductPricesSetMessagePayloadBuilder builder() {
        return ProductPricesSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductPricesSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPricesSetMessagePayloadBuilder builder(final ProductPricesSetMessagePayload template) {
        return ProductPricesSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPricesSetMessagePayload(Function<ProductPricesSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPricesSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPricesSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPricesSetMessagePayload>";
            }
        };
    }
}
