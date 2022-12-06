
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
 *  <p>Generated after a successful Set Embedded Price update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceSetMessagePayload productPriceSetMessagePayload = ProductPriceSetMessagePayload.builder()
 *             .variantId(0.3)
 *             .plusPrices(pricesBuilder -> pricesBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceSetMessagePayloadImpl.class)
public interface ProductPriceSetMessagePayload extends MessagePayload {

    String PRODUCT_PRICE_SET = "ProductPriceSet";

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was set.</p>
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("prices")
    public List<Price> getPrices();

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    @JsonIgnore
    public void setPrices(final Price... prices);

    public void setPrices(final List<Price> prices);

    public void setStaged(final Boolean staged);

    public static ProductPriceSetMessagePayload of() {
        return new ProductPriceSetMessagePayloadImpl();
    }

    public static ProductPriceSetMessagePayload of(final ProductPriceSetMessagePayload template) {
        ProductPriceSetMessagePayloadImpl instance = new ProductPriceSetMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setPrices(template.getPrices());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductPriceSetMessagePayloadBuilder builder() {
        return ProductPriceSetMessagePayloadBuilder.of();
    }

    public static ProductPriceSetMessagePayloadBuilder builder(final ProductPriceSetMessagePayload template) {
        return ProductPriceSetMessagePayloadBuilder.of(template);
    }

    default <T> T withProductPriceSetMessagePayload(Function<ProductPriceSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceSetMessagePayload>";
            }
        };
    }
}
