
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
 *  <p>Generated after a successful Add Embedded Price update action.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceAddedMessagePayloadImpl.class)
public interface ProductPriceAddedMessagePayload extends MessagePayload {

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

    public void setVariantId(final Long variantId);

    public void setPrice(final Price price);

    public void setStaged(final Boolean staged);

    public static ProductPriceAddedMessagePayload of() {
        return new ProductPriceAddedMessagePayloadImpl();
    }

    public static ProductPriceAddedMessagePayload of(final ProductPriceAddedMessagePayload template) {
        ProductPriceAddedMessagePayloadImpl instance = new ProductPriceAddedMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setPrice(template.getPrice());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductPriceAddedMessagePayloadBuilder builder() {
        return ProductPriceAddedMessagePayloadBuilder.of();
    }

    public static ProductPriceAddedMessagePayloadBuilder builder(final ProductPriceAddedMessagePayload template) {
        return ProductPriceAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductPriceAddedMessagePayload(Function<ProductPriceAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceAddedMessagePayload>";
            }
        };
    }
}
