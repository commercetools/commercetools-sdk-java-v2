
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
 *  <p>Generated after a successful Set Embedded Prices update action.</p>
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

    public void setVariantId(final Long variantId);

    @JsonIgnore
    public void setPrices(final Price... prices);

    public void setPrices(final List<Price> prices);

    public void setStaged(final Boolean staged);

    public static ProductPricesSetMessagePayload of() {
        return new ProductPricesSetMessagePayloadImpl();
    }

    public static ProductPricesSetMessagePayload of(final ProductPricesSetMessagePayload template) {
        ProductPricesSetMessagePayloadImpl instance = new ProductPricesSetMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setPrices(template.getPrices());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductPricesSetMessagePayloadBuilder builder() {
        return ProductPricesSetMessagePayloadBuilder.of();
    }

    public static ProductPricesSetMessagePayloadBuilder builder(final ProductPricesSetMessagePayload template) {
        return ProductPricesSetMessagePayloadBuilder.of(template);
    }

    default <T> T withProductPricesSetMessagePayload(Function<ProductPricesSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductPricesSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPricesSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPricesSetMessagePayload>";
            }
        };
    }
}
