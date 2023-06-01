package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountValue;
import com.commercetools.api.models.product_discount.ProductDiscountValueExternalImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Discounts the Product Price by allowing the client to explicitly set a discounted value. Used when setting discounts using an external service.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValueExternal productDiscountValueExternal = ProductDiscountValueExternal.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductDiscountValueExternalImpl.class)
public interface ProductDiscountValueExternal extends ProductDiscountValue {

    /**
     * discriminator value for ProductDiscountValueExternal
     */
    String EXTERNAL = "external";



    /**
     * factory method
     * @return instance of ProductDiscountValueExternal
     */
    public static ProductDiscountValueExternal of(){
        return new ProductDiscountValueExternalImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductDiscountValueExternal
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountValueExternal of(final ProductDiscountValueExternal template) {
        ProductDiscountValueExternalImpl instance = new ProductDiscountValueExternalImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductDiscountValueExternal
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountValueExternal deepCopy(@Nullable final ProductDiscountValueExternal template) {
        if (template == null) {
            return null;
        }
        ProductDiscountValueExternalImpl instance = new ProductDiscountValueExternalImpl();
        return instance;
    }

    /**
     * builder factory method for ProductDiscountValueExternal
     * @return builder
     */
    public static ProductDiscountValueExternalBuilder builder() {
        return ProductDiscountValueExternalBuilder.of();
    }
    
    /**
     * create builder for ProductDiscountValueExternal instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountValueExternalBuilder builder(final ProductDiscountValueExternal template) {
        return ProductDiscountValueExternalBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountValueExternal(Function<ProductDiscountValueExternal, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueExternal> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueExternal>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountValueExternal>";
            }
        };
    }
}
