
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Remove Embedded Price update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceRemovedMessagePayload productPriceRemovedMessagePayload = ProductPriceRemovedMessagePayload.builder()
 *             .variantId(0.3)
 *             .price(priceBuilder -> priceBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceRemovedMessagePayloadImpl.class)
public interface ProductPriceRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductPriceRemovedMessagePayload
     */
    String PRODUCT_PRICE_REMOVED = "ProductPriceRemoved";

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was removed.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The Embedded Price that was removed from the ProductVariant.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Price getPrice();

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was removed.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The Embedded Price that was removed from the ProductVariant.</p>
     * @param price value to be set
     */

    public void setPrice(final Price price);

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductPriceRemovedMessagePayload
     */
    public static ProductPriceRemovedMessagePayload of() {
        return new ProductPriceRemovedMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of ProductPriceRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceRemovedMessagePayload of(final ProductPriceRemovedMessagePayload template) {
        ProductPriceRemovedMessagePayloadImpl instance = new ProductPriceRemovedMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setPrice(template.getPrice());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductPriceRemovedMessagePayload
     * @return builder
     */
    public static ProductPriceRemovedMessagePayloadBuilder builder() {
        return ProductPriceRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductPriceRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceRemovedMessagePayloadBuilder builder(final ProductPriceRemovedMessagePayload template) {
        return ProductPriceRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceRemovedMessagePayload(Function<ProductPriceRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceRemovedMessagePayload>";
            }
        };
    }
}
