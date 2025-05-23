
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
 * ProductDiscountValueDraft
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValueDraft productDiscountValueDraft = ProductDiscountValueDraft.absoluteBuilder()
 *             plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ProductDiscountValueDraftImpl.class, visible = true)
@JsonDeserialize(as = ProductDiscountValueDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductDiscountValueDraft {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public ProductDiscountValueDraft copyDeep();

    /**
     * factory method to create a deep copy of ProductDiscountValueDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountValueDraft deepCopy(@Nullable final ProductDiscountValueDraft template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ProductDiscountValueDraftImpl)) {
            return template.copyDeep();
        }
        ProductDiscountValueDraftImpl instance = new ProductDiscountValueDraftImpl();
        return instance;
    }

    /**
     * builder for absolute subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteDraftBuilder absoluteBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteDraftBuilder.of();
    }

    /**
     * builder for external subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountValueExternalDraftBuilder externalBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountValueExternalDraftBuilder.of();
    }

    /**
     * builder for relative subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_discount.ProductDiscountValueRelativeDraftBuilder relativeBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountValueRelativeDraftBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountValueDraft(Function<ProductDiscountValueDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountValueDraft>";
            }
        };
    }
}
