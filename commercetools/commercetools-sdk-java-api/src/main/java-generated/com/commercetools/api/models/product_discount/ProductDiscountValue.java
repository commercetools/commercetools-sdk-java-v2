
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
 * ProductDiscountValue
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValue productDiscountValue = ProductDiscountValue.absoluteBuilder()
 *             plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ProductDiscountValueImpl.class, visible = true)
@JsonDeserialize(as = ProductDiscountValueImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductDiscountValue {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public ProductDiscountValue copyDeep();

    /**
     * factory method to create a deep copy of ProductDiscountValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountValue deepCopy(@Nullable final ProductDiscountValue template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ProductDiscountValueImpl)) {
            return template.copyDeep();
        }
        ProductDiscountValueImpl instance = new ProductDiscountValueImpl();
        return instance;
    }

    /**
     * builder for absolute subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteBuilder absoluteBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteBuilder.of();
    }

    /**
     * builder for external subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountValueExternalBuilder externalBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountValueExternalBuilder.of();
    }

    /**
     * builder for relative subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountValueRelativeBuilder relativeBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountValueRelativeBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountValue(Function<ProductDiscountValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValue>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountValue>";
            }
        };
    }
}
