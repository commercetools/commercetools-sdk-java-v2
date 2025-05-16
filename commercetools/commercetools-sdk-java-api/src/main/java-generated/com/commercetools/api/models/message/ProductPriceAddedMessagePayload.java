
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Add Price update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceAddedMessagePayload productPriceAddedMessagePayload = ProductPriceAddedMessagePayload.builder()
 *             .variantId(0.3)
 *             .price(priceBuilder -> priceBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductPriceAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceAddedMessagePayloadImpl.class)
public interface ProductPriceAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductPriceAddedMessagePayload
     */
    String PRODUCT_PRICE_ADDED = "ProductPriceAdded";

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was added.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The Embedded Price that was added to the ProductVariant.</p>
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
     *  <p>Unique identifier of the ProductVariant for which the Price was added.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The Embedded Price that was added to the ProductVariant.</p>
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
     * @return instance of ProductPriceAddedMessagePayload
     */
    public static ProductPriceAddedMessagePayload of() {
        return new ProductPriceAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceAddedMessagePayload of(final ProductPriceAddedMessagePayload template) {
        ProductPriceAddedMessagePayloadImpl instance = new ProductPriceAddedMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setPrice(template.getPrice());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductPriceAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductPriceAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceAddedMessagePayload deepCopy(@Nullable final ProductPriceAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductPriceAddedMessagePayloadImpl instance = new ProductPriceAddedMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setPrice(com.commercetools.api.models.common.Price.deepCopy(template.getPrice()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductPriceAddedMessagePayload
     * @return builder
     */
    public static ProductPriceAddedMessagePayloadBuilder builder() {
        return ProductPriceAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductPriceAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceAddedMessagePayloadBuilder builder(final ProductPriceAddedMessagePayload template) {
        return ProductPriceAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceAddedMessagePayload(Function<ProductPriceAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceAddedMessagePayload>";
            }
        };
    }
}
