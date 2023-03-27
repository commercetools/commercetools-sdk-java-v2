
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountUpdateAction productDiscountUpdateAction = ProductDiscountUpdateAction.changeIsActiveBuilder()
 *             isActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductDiscountUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<ProductDiscountUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * builder for changeIsActive subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountChangeIsActiveActionBuilder changeIsActiveBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountChangeIsActiveActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountChangeNameActionBuilder.of();
    }

    /**
     * builder for changePredicate subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountChangePredicateActionBuilder changePredicateBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountChangePredicateActionBuilder.of();
    }

    /**
     * builder for changeSortOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountChangeSortOrderActionBuilder changeSortOrderBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountChangeSortOrderActionBuilder.of();
    }

    /**
     * builder for changeValue subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountChangeValueActionBuilder changeValueBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountChangeValueActionBuilder.of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountSetDescriptionActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountSetKeyActionBuilder.of();
    }

    /**
     * builder for setValidFrom subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountSetValidFromActionBuilder setValidFromBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountSetValidFromActionBuilder.of();
    }

    /**
     * builder for setValidFromAndUntil subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAndUntilActionBuilder setValidFromAndUntilBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAndUntilActionBuilder.of();
    }

    /**
     * builder for setValidUntil subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountSetValidUntilActionBuilder setValidUntilBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountSetValidUntilActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountUpdateAction(Function<ProductDiscountUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountUpdateAction>";
            }
        };
    }
}
