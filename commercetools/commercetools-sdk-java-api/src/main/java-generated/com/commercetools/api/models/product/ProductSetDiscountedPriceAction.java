
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.DiscountedPriceDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Produces the ProductPriceExternalDiscountSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetDiscountedPriceAction productSetDiscountedPriceAction = ProductSetDiscountedPriceAction.builder()
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetDiscountedPriceActionImpl.class)
public interface ProductSetDiscountedPriceAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetDiscountedPriceAction
     */
    String SET_DISCOUNTED_PRICE = "setDiscountedPrice";

    /**
     *  <p>The <code>id</code> of the Price to set the Discount.</p>
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The referenced ProductDiscount must have the Type <code>external</code>, be active, and its predicate must match the referenced Price.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPriceDraft getDiscounted();

    /**
     *  <p>The <code>id</code> of the Price to set the Discount.</p>
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The referenced ProductDiscount must have the Type <code>external</code>, be active, and its predicate must match the referenced Price.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPriceDraft discounted);

    /**
     * factory method
     * @return instance of ProductSetDiscountedPriceAction
     */
    public static ProductSetDiscountedPriceAction of() {
        return new ProductSetDiscountedPriceActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetDiscountedPriceAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetDiscountedPriceAction of(final ProductSetDiscountedPriceAction template) {
        ProductSetDiscountedPriceActionImpl instance = new ProductSetDiscountedPriceActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        instance.setDiscounted(template.getDiscounted());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSetDiscountedPriceAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetDiscountedPriceAction deepCopy(@Nullable final ProductSetDiscountedPriceAction template) {
        if (template == null) {
            return null;
        }
        ProductSetDiscountedPriceActionImpl instance = new ProductSetDiscountedPriceActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        instance.setDiscounted(Optional.ofNullable(template.getDiscounted())
                .map(com.commercetools.api.models.common.DiscountedPriceDraft::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSetDiscountedPriceAction
     * @return builder
     */
    public static ProductSetDiscountedPriceActionBuilder builder() {
        return ProductSetDiscountedPriceActionBuilder.of();
    }

    /**
     * create builder for ProductSetDiscountedPriceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetDiscountedPriceActionBuilder builder(final ProductSetDiscountedPriceAction template) {
        return ProductSetDiscountedPriceActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetDiscountedPriceAction(Function<ProductSetDiscountedPriceAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetDiscountedPriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetDiscountedPriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetDiscountedPriceAction>";
            }
        };
    }
}
