
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
