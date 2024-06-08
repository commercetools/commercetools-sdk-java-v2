
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a Price is updated due to a Product Discount.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceDiscountsSetMessagePayload productPriceDiscountsSetMessagePayload = ProductPriceDiscountsSetMessagePayload.builder()
 *             .plusUpdatedPrices(updatedPricesBuilder -> updatedPricesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceDiscountsSetMessagePayloadImpl.class)
public interface ProductPriceDiscountsSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductPriceDiscountsSetMessagePayload
     */
    String PRODUCT_PRICE_DISCOUNTS_SET = "ProductPriceDiscountsSet";

    /**
     *  <p>Array containing details about the Embedded Prices that were updated.</p>
     * @return updatedPrices
     */
    @NotNull
    @Valid
    @JsonProperty("updatedPrices")
    public List<ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices();

    /**
     *  <p>Array containing details about the Embedded Prices that were updated.</p>
     * @param updatedPrices values to be set
     */

    @JsonIgnore
    public void setUpdatedPrices(final ProductPriceDiscountsSetUpdatedPrice... updatedPrices);

    /**
     *  <p>Array containing details about the Embedded Prices that were updated.</p>
     * @param updatedPrices values to be set
     */

    public void setUpdatedPrices(final List<ProductPriceDiscountsSetUpdatedPrice> updatedPrices);

    /**
     * factory method
     * @return instance of ProductPriceDiscountsSetMessagePayload
     */
    public static ProductPriceDiscountsSetMessagePayload of() {
        return new ProductPriceDiscountsSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceDiscountsSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceDiscountsSetMessagePayload of(final ProductPriceDiscountsSetMessagePayload template) {
        ProductPriceDiscountsSetMessagePayloadImpl instance = new ProductPriceDiscountsSetMessagePayloadImpl();
        instance.setUpdatedPrices(template.getUpdatedPrices());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPriceDiscountsSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceDiscountsSetMessagePayload deepCopy(
            @Nullable final ProductPriceDiscountsSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductPriceDiscountsSetMessagePayloadImpl instance = new ProductPriceDiscountsSetMessagePayloadImpl();
        instance.setUpdatedPrices(Optional.ofNullable(template.getUpdatedPrices())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductPriceDiscountsSetMessagePayload
     * @return builder
     */
    public static ProductPriceDiscountsSetMessagePayloadBuilder builder() {
        return ProductPriceDiscountsSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductPriceDiscountsSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceDiscountsSetMessagePayloadBuilder builder(
            final ProductPriceDiscountsSetMessagePayload template) {
        return ProductPriceDiscountsSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceDiscountsSetMessagePayload(
            Function<ProductPriceDiscountsSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceDiscountsSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceDiscountsSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceDiscountsSetMessagePayload>";
            }
        };
    }
}
