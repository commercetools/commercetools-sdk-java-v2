
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountChangeCartPredicateActionImpl.class, name = CartDiscountChangeCartPredicateAction.CHANGE_CART_PREDICATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountChangeIsActiveActionImpl.class, name = CartDiscountChangeIsActiveAction.CHANGE_IS_ACTIVE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountChangeNameActionImpl.class, name = CartDiscountChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountChangeRequiresDiscountCodeActionImpl.class, name = CartDiscountChangeRequiresDiscountCodeAction.CHANGE_REQUIRES_DISCOUNT_CODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountChangeSortOrderActionImpl.class, name = CartDiscountChangeSortOrderAction.CHANGE_SORT_ORDER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountChangeStackingModeActionImpl.class, name = CartDiscountChangeStackingModeAction.CHANGE_STACKING_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountChangeTargetActionImpl.class, name = CartDiscountChangeTargetAction.CHANGE_TARGET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountChangeValueActionImpl.class, name = CartDiscountChangeValueAction.CHANGE_VALUE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountSetCustomFieldActionImpl.class, name = CartDiscountSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountSetCustomTypeActionImpl.class, name = CartDiscountSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountSetDescriptionActionImpl.class, name = CartDiscountSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountSetKeyActionImpl.class, name = CartDiscountSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountSetValidFromActionImpl.class, name = CartDiscountSetValidFromAction.SET_VALID_FROM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountSetValidFromAndUntilActionImpl.class, name = CartDiscountSetValidFromAndUntilAction.SET_VALID_FROM_AND_UNTIL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountSetValidUntilActionImpl.class, name = CartDiscountSetValidUntilAction.SET_VALID_UNTIL) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = CartDiscountUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = CartDiscountUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface CartDiscountUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<CartDiscountUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.cart_discount.CartDiscountChangeCartPredicateActionBuilder changeCartPredicateBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeCartPredicateActionBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountChangeIsActiveActionBuilder changeIsActiveBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeIsActiveActionBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeNameActionBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountChangeRequiresDiscountCodeActionBuilder changeRequiresDiscountCodeBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeRequiresDiscountCodeActionBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountChangeSortOrderActionBuilder changeSortOrderBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeSortOrderActionBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountChangeStackingModeActionBuilder changeStackingModeBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeStackingModeActionBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountChangeTargetActionBuilder changeTargetBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeTargetActionBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountChangeValueActionBuilder changeValueBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountChangeValueActionBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetDescriptionActionBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetKeyActionBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountSetValidFromActionBuilder setValidFromBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetValidFromActionBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountSetValidFromAndUntilActionBuilder setValidFromAndUntilBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetValidFromAndUntilActionBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountSetValidUntilActionBuilder setValidUntilBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountSetValidUntilActionBuilder.of();
    }

    default <T> T withCartDiscountUpdateAction(Function<CartDiscountUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountUpdateAction>";
            }
        };
    }
}
