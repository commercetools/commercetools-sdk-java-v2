
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CartDiscountUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountUpdateAction cartDiscountUpdateAction = CartDiscountUpdateAction.addStoreBuilder()
 *             store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = CartDiscountUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = CartDiscountUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CartDiscountUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<CartDiscountUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public CartDiscountUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountUpdateAction deepCopy(@Nullable final CartDiscountUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof CartDiscountUpdateActionImpl)) {
            return template.copyDeep();
        }
        CartDiscountUpdateActionImpl instance = new CartDiscountUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addStore subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountAddStoreActionBuilder addStoreBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountAddStoreActionBuilder.of();
    }

    /**
     * builder for changeCartPredicate subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountChangeCartPredicateActionBuilder changeCartPredicateBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeCartPredicateActionBuilder.of();
    }

    /**
     * builder for changeIsActive subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountChangeIsActiveActionBuilder changeIsActiveBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeIsActiveActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeNameActionBuilder.of();
    }

    /**
     * builder for changeRequiresDiscountCode subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountChangeRequiresDiscountCodeActionBuilder changeRequiresDiscountCodeBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeRequiresDiscountCodeActionBuilder.of();
    }

    /**
     * builder for changeSortOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountChangeSortOrderActionBuilder changeSortOrderBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeSortOrderActionBuilder.of();
    }

    /**
     * builder for changeStackingMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountChangeStackingModeActionBuilder changeStackingModeBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeStackingModeActionBuilder.of();
    }

    /**
     * builder for changeTarget subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountChangeTargetActionBuilder changeTargetBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeTargetActionBuilder.of();
    }

    /**
     * builder for changeValue subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountChangeValueActionBuilder changeValueBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeValueActionBuilder.of();
    }

    /**
     * builder for removeStore subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountRemoveStoreActionBuilder removeStoreBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountRemoveStoreActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetDescriptionActionBuilder.of();
    }

    /**
     * builder for setDiscountGroup subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountSetDiscountGroupActionBuilder setDiscountGroupBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetDiscountGroupActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetKeyActionBuilder.of();
    }

    /**
     * builder for setStores subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountSetStoresActionBuilder setStoresBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetStoresActionBuilder.of();
    }

    /**
     * builder for setValidFrom subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountSetValidFromActionBuilder setValidFromBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetValidFromActionBuilder.of();
    }

    /**
     * builder for setValidFromAndUntil subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountSetValidFromAndUntilActionBuilder setValidFromAndUntilBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetValidFromAndUntilActionBuilder.of();
    }

    /**
     * builder for setValidUntil subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountSetValidUntilActionBuilder setValidUntilBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetValidUntilActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountUpdateAction(Function<CartDiscountUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountUpdateAction>";
            }
        };
    }
}
