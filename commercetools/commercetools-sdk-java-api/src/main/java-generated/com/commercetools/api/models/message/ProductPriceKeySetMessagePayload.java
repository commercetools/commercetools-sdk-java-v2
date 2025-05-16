
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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
@io.vrap.rmf.base.client.utils.json.SubType("ProductPriceKeySet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceKeySetMessagePayloadImpl.class)
public interface ProductPriceKeySetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductPriceKeySetMessagePayload
     */
    String PRODUCT_PRICE_KEY_SET = "ProductPriceKeySet";

    /**
     *
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>Unique identifier of the Price.</p>
     * @return priceId
     */

    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p><code>key</code> value of the Price before the Set Price Key update action.</p>
     * @return oldKey
     */

    @JsonProperty("oldKey")
    public String getOldKey();

    /**
     *  <p><code>key</code> value of the Price after the Set Price Key update action.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     * set variantId
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>Unique identifier of the Price.</p>
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     *  <p><code>key</code> value of the Price before the Set Price Key update action.</p>
     * @param oldKey value to be set
     */

    public void setOldKey(final String oldKey);

    /**
     *  <p><code>key</code> value of the Price after the Set Price Key update action.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductPriceKeySetMessagePayload
     */
    public static ProductPriceKeySetMessagePayload of() {
        return new ProductPriceKeySetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceKeySetMessagePayload of(final ProductPriceKeySetMessagePayload template) {
        ProductPriceKeySetMessagePayloadImpl instance = new ProductPriceKeySetMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setPriceId(template.getPriceId());
        instance.setOldKey(template.getOldKey());
        instance.setKey(template.getKey());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductPriceKeySetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductPriceKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceKeySetMessagePayload deepCopy(@Nullable final ProductPriceKeySetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductPriceKeySetMessagePayloadImpl instance = new ProductPriceKeySetMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setPriceId(template.getPriceId());
        instance.setOldKey(template.getOldKey());
        instance.setKey(template.getKey());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductPriceKeySetMessagePayload
     * @return builder
     */
    public static ProductPriceKeySetMessagePayloadBuilder builder() {
        return ProductPriceKeySetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductPriceKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceKeySetMessagePayloadBuilder builder(final ProductPriceKeySetMessagePayload template) {
        return ProductPriceKeySetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceKeySetMessagePayload(Function<ProductPriceKeySetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceKeySetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceKeySetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceKeySetMessagePayload>";
            }
        };
    }
}
