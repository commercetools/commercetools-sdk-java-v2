
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Indicates if a Product Discount or Cart Discount offers the best deal for a Cart or Order.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BestDeal bestDeal = BestDeal.builder()
 *             .chosenDiscountType("{chosenDiscountType}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BestDeal")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BestDealImpl.class)
public interface BestDeal extends DiscountTypeCombination {

    /**
     * discriminator value for BestDeal
     */
    String BEST_DEAL = "BestDeal";

    /**
     *  <p>Discount type that offers the best deal; the value can be <code>ProductDiscount</code> or <code>CartDiscount</code>.</p>
     * @return chosenDiscountType
     */
    @NotNull
    @JsonProperty("chosenDiscountType")
    public String getChosenDiscountType();

    /**
     *  <p>Discount type that offers the best deal; the value can be <code>ProductDiscount</code> or <code>CartDiscount</code>.</p>
     * @param chosenDiscountType value to be set
     */

    public void setChosenDiscountType(final String chosenDiscountType);

    /**
     * factory method
     * @return instance of BestDeal
     */
    public static BestDeal of() {
        return new BestDealImpl();
    }

    /**
     * factory method to create a shallow copy BestDeal
     * @param template instance to be copied
     * @return copy instance
     */
    public static BestDeal of(final BestDeal template) {
        BestDealImpl instance = new BestDealImpl();
        instance.setChosenDiscountType(template.getChosenDiscountType());
        return instance;
    }

    public BestDeal copyDeep();

    /**
     * factory method to create a deep copy of BestDeal
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BestDeal deepCopy(@Nullable final BestDeal template) {
        if (template == null) {
            return null;
        }
        BestDealImpl instance = new BestDealImpl();
        instance.setChosenDiscountType(template.getChosenDiscountType());
        return instance;
    }

    /**
     * builder factory method for BestDeal
     * @return builder
     */
    public static BestDealBuilder builder() {
        return BestDealBuilder.of();
    }

    /**
     * create builder for BestDeal instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BestDealBuilder builder(final BestDeal template) {
        return BestDealBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBestDeal(Function<BestDeal, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BestDeal> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BestDeal>() {
            @Override
            public String toString() {
                return "TypeReference<BestDeal>";
            }
        };
    }
}
