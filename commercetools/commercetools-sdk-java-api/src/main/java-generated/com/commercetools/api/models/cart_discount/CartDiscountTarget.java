
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountTarget
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountTarget cartDiscountTarget = CartDiscountTarget.customLineItemsBuilder()
 *             predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTargetImpl.class, name = CartDiscountCustomLineItemsTarget.CUSTOM_LINE_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountLineItemsTargetImpl.class, name = CartDiscountLineItemsTarget.LINE_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountShippingCostTargetImpl.class, name = CartDiscountShippingCostTarget.SHIPPING),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountTotalPriceTargetImpl.class, name = CartDiscountTotalPriceTarget.TOTAL_PRICE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.MultiBuyCustomLineItemsTargetImpl.class, name = MultiBuyCustomLineItemsTarget.MULTI_BUY_CUSTOM_LINE_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.MultiBuyLineItemsTargetImpl.class, name = MultiBuyLineItemsTarget.MULTI_BUY_LINE_ITEMS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = CartDiscountTargetImpl.class, visible = true)
@JsonDeserialize(as = CartDiscountTargetImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CartDiscountTarget {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * factory method to create a deep copy of CartDiscountTarget
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountTarget deepCopy(@Nullable final CartDiscountTarget template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTarget) {
            return com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTarget
                    .deepCopy((com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTarget) template);
        }
        if (template instanceof com.commercetools.api.models.cart_discount.CartDiscountLineItemsTarget) {
            return com.commercetools.api.models.cart_discount.CartDiscountLineItemsTarget
                    .deepCopy((com.commercetools.api.models.cart_discount.CartDiscountLineItemsTarget) template);
        }
        if (template instanceof com.commercetools.api.models.cart_discount.CartDiscountShippingCostTarget) {
            return com.commercetools.api.models.cart_discount.CartDiscountShippingCostTarget
                    .deepCopy((com.commercetools.api.models.cart_discount.CartDiscountShippingCostTarget) template);
        }
        if (template instanceof com.commercetools.api.models.cart_discount.CartDiscountTotalPriceTarget) {
            return com.commercetools.api.models.cart_discount.CartDiscountTotalPriceTarget
                    .deepCopy((com.commercetools.api.models.cart_discount.CartDiscountTotalPriceTarget) template);
        }
        if (template instanceof com.commercetools.api.models.cart_discount.MultiBuyCustomLineItemsTarget) {
            return com.commercetools.api.models.cart_discount.MultiBuyCustomLineItemsTarget
                    .deepCopy((com.commercetools.api.models.cart_discount.MultiBuyCustomLineItemsTarget) template);
        }
        if (template instanceof com.commercetools.api.models.cart_discount.MultiBuyLineItemsTarget) {
            return com.commercetools.api.models.cart_discount.MultiBuyLineItemsTarget
                    .deepCopy((com.commercetools.api.models.cart_discount.MultiBuyLineItemsTarget) template);
        }
        CartDiscountTargetImpl instance = new CartDiscountTargetImpl();
        return instance;
    }

    /**
     * builder for customLineItems subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTargetBuilder customLineItemsBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTargetBuilder.of();
    }

    /**
     * builder for lineItems subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountLineItemsTargetBuilder lineItemsBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountLineItemsTargetBuilder.of();
    }

    /**
     * builder for shipping subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountShippingCostTargetBuilder shippingBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountShippingCostTargetBuilder.of();
    }

    /**
     * builder for totalPrice subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountTotalPriceTargetBuilder totalPriceBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountTotalPriceTargetBuilder.of();
    }

    /**
     * builder for multiBuyCustomLineItems subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.MultiBuyCustomLineItemsTargetBuilder multiBuyCustomLineItemsBuilder() {
        return com.commercetools.api.models.cart_discount.MultiBuyCustomLineItemsTargetBuilder.of();
    }

    /**
     * builder for multiBuyLineItems subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.MultiBuyLineItemsTargetBuilder multiBuyLineItemsBuilder() {
        return com.commercetools.api.models.cart_discount.MultiBuyLineItemsTargetBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountTarget(Function<CartDiscountTarget, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountTarget> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountTarget>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountTarget>";
            }
        };
    }
}
