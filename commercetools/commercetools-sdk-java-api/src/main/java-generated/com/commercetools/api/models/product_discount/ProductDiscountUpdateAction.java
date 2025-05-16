
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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

    public ProductDiscountUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of ProductDiscountUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountUpdateAction deepCopy(@Nullable final ProductDiscountUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ProductDiscountUpdateActionImpl)) {
            return template.copyDeep();
        }
        ProductDiscountUpdateActionImpl instance = new ProductDiscountUpdateActionImpl();
        return instance;
    }

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
