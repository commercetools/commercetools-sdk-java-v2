
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.PriceDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adds the given Price to the <code>prices</code> array of the ProductVariant. Either <code>variantId</code> or <code>sku</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddPriceAction productAddPriceAction = ProductAddPriceAction.builder()
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductAddPriceActionImpl.class)
public interface ProductAddPriceAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductAddPriceAction
     */
    String ADD_PRICE = "addPrice";

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Embedded Price to add to the Product Variant.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public PriceDraft getPrice();

    /**
     *  <p>If <code>true</code>, only the staged <code>prices</code> is updated. If <code>false</code>, both the current and staged <code>prices</code> are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Embedded Price to add to the Product Variant.</p>
     * @param price value to be set
     */

    public void setPrice(final PriceDraft price);

    /**
     *  <p>If <code>true</code>, only the staged <code>prices</code> is updated. If <code>false</code>, both the current and staged <code>prices</code> are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductAddPriceAction
     */
    public static ProductAddPriceAction of() {
        return new ProductAddPriceActionImpl();
    }

    /**
     * factory method to copy an instance of ProductAddPriceAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductAddPriceAction of(final ProductAddPriceAction template) {
        ProductAddPriceActionImpl instance = new ProductAddPriceActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setPrice(template.getPrice());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductAddPriceAction
     * @return builder
     */
    public static ProductAddPriceActionBuilder builder() {
        return ProductAddPriceActionBuilder.of();
    }

    /**
     * create builder for ProductAddPriceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductAddPriceActionBuilder builder(final ProductAddPriceAction template) {
        return ProductAddPriceActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductAddPriceAction(Function<ProductAddPriceAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductAddPriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductAddPriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductAddPriceAction>";
            }
        };
    }
}
