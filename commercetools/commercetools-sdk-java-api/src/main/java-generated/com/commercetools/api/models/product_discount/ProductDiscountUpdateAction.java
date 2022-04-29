
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountChangeIsActiveActionImpl.class, name = ProductDiscountChangeIsActiveAction.CHANGE_IS_ACTIVE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountChangeNameActionImpl.class, name = ProductDiscountChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountChangePredicateActionImpl.class, name = ProductDiscountChangePredicateAction.CHANGE_PREDICATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountChangeSortOrderActionImpl.class, name = ProductDiscountChangeSortOrderAction.CHANGE_SORT_ORDER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountChangeValueActionImpl.class, name = ProductDiscountChangeValueAction.CHANGE_VALUE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountSetDescriptionActionImpl.class, name = ProductDiscountSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountSetKeyActionImpl.class, name = ProductDiscountSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountSetValidFromActionImpl.class, name = ProductDiscountSetValidFromAction.SET_VALID_FROM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAndUntilActionImpl.class, name = ProductDiscountSetValidFromAndUntilAction.SET_VALID_FROM_AND_UNTIL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountSetValidUntilActionImpl.class, name = ProductDiscountSetValidUntilAction.SET_VALID_UNTIL) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ProductDiscountUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ProductDiscountUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ProductDiscountUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<ProductDiscountUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.product_discount.ProductDiscountChangeIsActiveActionBuilder changeIsActiveBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountChangeIsActiveActionBuilder.of();
    }

    public static com.commercetools.api.models.product_discount.ProductDiscountChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountChangeNameActionBuilder.of();
    }

    public static com.commercetools.api.models.product_discount.ProductDiscountChangePredicateActionBuilder changePredicateBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountChangePredicateActionBuilder.of();
    }

    public static com.commercetools.api.models.product_discount.ProductDiscountChangeSortOrderActionBuilder changeSortOrderBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountChangeSortOrderActionBuilder.of();
    }

    public static com.commercetools.api.models.product_discount.ProductDiscountChangeValueActionBuilder changeValueBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountChangeValueActionBuilder.of();
    }

    public static com.commercetools.api.models.product_discount.ProductDiscountSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountSetDescriptionActionBuilder.of();
    }

    public static com.commercetools.api.models.product_discount.ProductDiscountSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountSetKeyActionBuilder.of();
    }

    public static com.commercetools.api.models.product_discount.ProductDiscountSetValidFromActionBuilder setValidFromBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountSetValidFromActionBuilder.of();
    }

    public static com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAndUntilActionBuilder setValidFromAndUntilBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAndUntilActionBuilder.of();
    }

    public static com.commercetools.api.models.product_discount.ProductDiscountSetValidUntilActionBuilder setValidUntilBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountSetValidUntilActionBuilder.of();
    }

    default <T> T withProductDiscountUpdateAction(Function<ProductDiscountUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountUpdateAction>";
            }
        };
    }
}
