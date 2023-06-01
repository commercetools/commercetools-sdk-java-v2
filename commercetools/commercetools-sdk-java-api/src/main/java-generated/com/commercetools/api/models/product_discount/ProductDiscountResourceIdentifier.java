package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifierImpl;

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
 *  <p>ResourceIdentifier to a ProductDiscount.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountResourceIdentifier productDiscountResourceIdentifier = ProductDiscountResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductDiscountResourceIdentifierImpl.class)
public interface ProductDiscountResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<ProductDiscount> {

    /**
     * discriminator value for ProductDiscountResourceIdentifier
     */
    String PRODUCT_DISCOUNT = "product-discount";

    /**
     *  <p>Unique identifier of the referenced ProductDiscount. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */
    
    @JsonProperty("id")
    public String getId();
    /**
     *  <p>User-defined unique identifier of the referenced ProductDiscount. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced ProductDiscount. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     */
    
    public void setId(final String id);
    
    
    /**
     *  <p>User-defined unique identifier of the referenced ProductDiscount. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of ProductDiscountResourceIdentifier
     */
    public static ProductDiscountResourceIdentifier of(){
        return new ProductDiscountResourceIdentifierImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductDiscountResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountResourceIdentifier of(final ProductDiscountResourceIdentifier template) {
        ProductDiscountResourceIdentifierImpl instance = new ProductDiscountResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductDiscountResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountResourceIdentifier deepCopy(@Nullable final ProductDiscountResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        ProductDiscountResourceIdentifierImpl instance = new ProductDiscountResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ProductDiscountResourceIdentifier
     * @return builder
     */
    public static ProductDiscountResourceIdentifierBuilder builder() {
        return ProductDiscountResourceIdentifierBuilder.of();
    }
    
    /**
     * create builder for ProductDiscountResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountResourceIdentifierBuilder builder(final ProductDiscountResourceIdentifier template) {
        return ProductDiscountResourceIdentifierBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountResourceIdentifier(Function<ProductDiscountResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountResourceIdentifier>";
            }
        };
    }
}
