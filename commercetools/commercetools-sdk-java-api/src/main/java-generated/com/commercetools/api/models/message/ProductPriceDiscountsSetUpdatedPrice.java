
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
 *  <p>Details about a Embedded Price that was updated due to a Discount. Specific to ProductPriceDiscountsSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceDiscountsSetUpdatedPrice productPriceDiscountsSetUpdatedPrice = ProductPriceDiscountsSetUpdatedPrice.builder()
 *             .variantId(1)
 *             .priceId("{priceId}")
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceDiscountsSetUpdatedPriceImpl.class)
public interface ProductPriceDiscountsSetUpdatedPrice {

    /**
     *  <p>Unique identifier of the ProductVariant for which the Discount was set.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     *  <p>Key of the ProductVariant for which Discount was set.</p>
     * @return variantKey
     */

    @JsonProperty("variantKey")
    public String getVariantKey();

    /**
     *  <p>SKU of the ProductVariant for which Discount was set.</p>
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
     *  <p>Discounted Price for the ProductVariant for which Discount was set.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>Whether the update was only applied to the staged ProductProjection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Unique identifier of the ProductVariant for which the Discount was set.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Integer variantId);

    /**
     *  <p>Key of the ProductVariant for which Discount was set.</p>
     * @param variantKey value to be set
     */

    public void setVariantKey(final String variantKey);

    /**
     *  <p>SKU of the ProductVariant for which Discount was set.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Unique identifier of the Price.</p>
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     *  <p>Discounted Price for the ProductVariant for which Discount was set.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPrice discounted);

    /**
     *  <p>Whether the update was only applied to the staged ProductProjection.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductPriceDiscountsSetUpdatedPrice
     */
    public static ProductPriceDiscountsSetUpdatedPrice of() {
        return new ProductPriceDiscountsSetUpdatedPriceImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceDiscountsSetUpdatedPrice
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceDiscountsSetUpdatedPrice of(final ProductPriceDiscountsSetUpdatedPrice template) {
        ProductPriceDiscountsSetUpdatedPriceImpl instance = new ProductPriceDiscountsSetUpdatedPriceImpl();
        instance.setVariantId(template.getVariantId());
        instance.setVariantKey(template.getVariantKey());
        instance.setSku(template.getSku());
        instance.setPriceId(template.getPriceId());
        instance.setDiscounted(template.getDiscounted());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPriceDiscountsSetUpdatedPrice
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceDiscountsSetUpdatedPrice deepCopy(
            @Nullable final ProductPriceDiscountsSetUpdatedPrice template) {
        if (template == null) {
            return null;
        }
        ProductPriceDiscountsSetUpdatedPriceImpl instance = new ProductPriceDiscountsSetUpdatedPriceImpl();
        instance.setVariantId(template.getVariantId());
        instance.setVariantKey(template.getVariantKey());
        instance.setSku(template.getSku());
        instance.setPriceId(template.getPriceId());
        instance.setDiscounted(com.commercetools.api.models.common.DiscountedPrice.deepCopy(template.getDiscounted()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductPriceDiscountsSetUpdatedPrice
     * @return builder
     */
    public static ProductPriceDiscountsSetUpdatedPriceBuilder builder() {
        return ProductPriceDiscountsSetUpdatedPriceBuilder.of();
    }

    /**
     * create builder for ProductPriceDiscountsSetUpdatedPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceDiscountsSetUpdatedPriceBuilder builder(
            final ProductPriceDiscountsSetUpdatedPrice template) {
        return ProductPriceDiscountsSetUpdatedPriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceDiscountsSetUpdatedPrice(Function<ProductPriceDiscountsSetUpdatedPrice, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceDiscountsSetUpdatedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceDiscountsSetUpdatedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceDiscountsSetUpdatedPrice>";
            }
        };
    }
}
