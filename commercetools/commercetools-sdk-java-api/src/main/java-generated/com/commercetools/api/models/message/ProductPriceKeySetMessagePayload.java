
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Price Key update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceKeySetMessagePayload productPriceKeySetMessagePayload = ProductPriceKeySetMessagePayload.builder()
 *             .variantId(0.3)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceKeySetMessagePayloadImpl.class)
public interface ProductPriceKeySetMessagePayload extends MessagePayload {

    String PRODUCT_PRICE_KEY_SET = "ProductPriceKeySet";

    /**
     *
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>Unique identifier of the Embedded Price.</p>
     */

    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p><code>key</code> value of the Embedded Price before the Set Price Key update action.</p>
     */

    @JsonProperty("oldKey")
    public String getOldKey();

    /**
     *  <p><code>key</code> value of the Embedded Price after the Set Price Key update action.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setPriceId(final String priceId);

    public void setOldKey(final String oldKey);

    public void setKey(final String key);

    public void setStaged(final Boolean staged);

    public static ProductPriceKeySetMessagePayload of() {
        return new ProductPriceKeySetMessagePayloadImpl();
    }

    public static ProductPriceKeySetMessagePayload of(final ProductPriceKeySetMessagePayload template) {
        ProductPriceKeySetMessagePayloadImpl instance = new ProductPriceKeySetMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setPriceId(template.getPriceId());
        instance.setOldKey(template.getOldKey());
        instance.setKey(template.getKey());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductPriceKeySetMessagePayloadBuilder builder() {
        return ProductPriceKeySetMessagePayloadBuilder.of();
    }

    public static ProductPriceKeySetMessagePayloadBuilder builder(final ProductPriceKeySetMessagePayload template) {
        return ProductPriceKeySetMessagePayloadBuilder.of(template);
    }

    default <T> T withProductPriceKeySetMessagePayload(Function<ProductPriceKeySetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceKeySetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceKeySetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceKeySetMessagePayload>";
            }
        };
    }
}
