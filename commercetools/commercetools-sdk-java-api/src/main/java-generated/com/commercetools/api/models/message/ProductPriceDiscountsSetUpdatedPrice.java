
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     *  <p>Key of the ProductVariant for which Discount was set.</p>
     */

    @JsonProperty("variantKey")
    public String getVariantKey();

    /**
     *  <p>SKU of the ProductVariant for which Discount was set.</p>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Unique identifier of the Embedded Price.</p>
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p>Discounted Price for the ProductVariant for which Discount was set.</p>
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>Whether the update was only applied to the staged ProductProjection.</p>
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Integer variantId);

    public void setVariantKey(final String variantKey);

    public void setSku(final String sku);

    public void setPriceId(final String priceId);

    public void setDiscounted(final DiscountedPrice discounted);

    public void setStaged(final Boolean staged);

    public static ProductPriceDiscountsSetUpdatedPrice of() {
        return new ProductPriceDiscountsSetUpdatedPriceImpl();
    }

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

    public static ProductPriceDiscountsSetUpdatedPriceBuilder builder() {
        return ProductPriceDiscountsSetUpdatedPriceBuilder.of();
    }

    public static ProductPriceDiscountsSetUpdatedPriceBuilder builder(
            final ProductPriceDiscountsSetUpdatedPrice template) {
        return ProductPriceDiscountsSetUpdatedPriceBuilder.of(template);
    }

    default <T> T withProductPriceDiscountsSetUpdatedPrice(Function<ProductPriceDiscountsSetUpdatedPrice, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceDiscountsSetUpdatedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceDiscountsSetUpdatedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceDiscountsSetUpdatedPrice>";
            }
        };
    }
}
