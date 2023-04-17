
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
 * CartDiscountValueDraft
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueDraft cartDiscountValueDraft = CartDiscountValueDraft.absoluteBuilder()
 *             plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraftImpl.class, name = CartDiscountValueAbsoluteDraft.ABSOLUTE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountValueFixedDraftImpl.class, name = CartDiscountValueFixedDraft.FIXED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraftImpl.class, name = CartDiscountValueGiftLineItemDraft.GIFT_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountValueRelativeDraftImpl.class, name = CartDiscountValueRelativeDraft.RELATIVE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = CartDiscountValueDraftImpl.class, visible = true)
@JsonDeserialize(as = CartDiscountValueDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CartDiscountValueDraft {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * factory method to create a deep copy of CartDiscountValueDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountValueDraft deepCopy(@Nullable final CartDiscountValueDraft template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraft) {
            return com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraft
                    .deepCopy((com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraft) template);
        }
        if (template instanceof com.commercetools.api.models.cart_discount.CartDiscountValueFixedDraft) {
            return com.commercetools.api.models.cart_discount.CartDiscountValueFixedDraft
                    .deepCopy((com.commercetools.api.models.cart_discount.CartDiscountValueFixedDraft) template);
        }
        if (template instanceof com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraft) {
            return com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraft
                    .deepCopy((com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraft) template);
        }
        if (template instanceof com.commercetools.api.models.cart_discount.CartDiscountValueRelativeDraft) {
            return com.commercetools.api.models.cart_discount.CartDiscountValueRelativeDraft
                    .deepCopy((com.commercetools.api.models.cart_discount.CartDiscountValueRelativeDraft) template);
        }
        CartDiscountValueDraftImpl instance = new CartDiscountValueDraftImpl();
        return instance;
    }

    /**
     * builder for absolute subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraftBuilder absoluteBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraftBuilder.of();
    }

    /**
     * builder for fixed subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountValueFixedDraftBuilder fixedBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueFixedDraftBuilder.of();
    }

    /**
     * builder for giftLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraftBuilder giftLineItemBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraftBuilder.of();
    }

    /**
     * builder for relative subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountValueRelativeDraftBuilder relativeBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueRelativeDraftBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountValueDraft(Function<CartDiscountValueDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueDraft>";
            }
        };
    }
}
