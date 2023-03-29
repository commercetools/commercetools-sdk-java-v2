
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.DiscountedPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Discounted Embedded Price update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceExternalDiscountSetMessagePayload productPriceExternalDiscountSetMessagePayload = ProductPriceExternalDiscountSetMessagePayload.builder()
 *             .variantId(1)
 *             .priceId("{priceId}")
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceExternalDiscountSetMessagePayloadImpl.class)
public interface ProductPriceExternalDiscountSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductPriceExternalDiscountSetMessagePayload
     */
    String PRODUCT_PRICE_EXTERNAL_DISCOUNT_SET = "ProductPriceExternalDiscountSet";

    /**
     *  <p>Unique identifier of the Product Variant for which the Discount was set.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     *  <p>Key of the Product Variant for which the Discount was set.</p>
     * @return variantKey
     */

    @JsonProperty("variantKey")
    public String getVariantKey();

    /**
     *  <p>SKU of the Product Variant for which Discount was set.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Unique identifier of the Price.</p>
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p>Discounted Price for the Product Variant for which Discount was set.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Unique identifier of the Product Variant for which the Discount was set.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Integer variantId);

    /**
     *  <p>Key of the Product Variant for which the Discount was set.</p>
     * @param variantKey value to be set
     */

    public void setVariantKey(final String variantKey);

    /**
     *  <p>SKU of the Product Variant for which Discount was set.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Unique identifier of the Price.</p>
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     *  <p>Discounted Price for the Product Variant for which Discount was set.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPrice discounted);

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductPriceExternalDiscountSetMessagePayload
     */
    public static ProductPriceExternalDiscountSetMessagePayload of() {
        return new ProductPriceExternalDiscountSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceExternalDiscountSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceExternalDiscountSetMessagePayload of(
            final ProductPriceExternalDiscountSetMessagePayload template) {
        ProductPriceExternalDiscountSetMessagePayloadImpl instance = new ProductPriceExternalDiscountSetMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setVariantKey(template.getVariantKey());
        instance.setSku(template.getSku());
        instance.setPriceId(template.getPriceId());
        instance.setDiscounted(template.getDiscounted());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPriceExternalDiscountSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceExternalDiscountSetMessagePayload deepCopy(
            @Nullable final ProductPriceExternalDiscountSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductPriceExternalDiscountSetMessagePayloadImpl instance = new ProductPriceExternalDiscountSetMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setVariantKey(template.getVariantKey());
        instance.setSku(template.getSku());
        instance.setPriceId(template.getPriceId());
        instance.setDiscounted(Optional.ofNullable(template.getDiscounted())
                .map(com.commercetools.api.models.common.DiscountedPrice::deepCopy)
                .orElse(null));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductPriceExternalDiscountSetMessagePayload
     * @return builder
     */
    public static ProductPriceExternalDiscountSetMessagePayloadBuilder builder() {
        return ProductPriceExternalDiscountSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductPriceExternalDiscountSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceExternalDiscountSetMessagePayloadBuilder builder(
            final ProductPriceExternalDiscountSetMessagePayload template) {
        return ProductPriceExternalDiscountSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceExternalDiscountSetMessagePayload(
            Function<ProductPriceExternalDiscountSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceExternalDiscountSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceExternalDiscountSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceExternalDiscountSetMessagePayload>";
            }
        };
    }
}
