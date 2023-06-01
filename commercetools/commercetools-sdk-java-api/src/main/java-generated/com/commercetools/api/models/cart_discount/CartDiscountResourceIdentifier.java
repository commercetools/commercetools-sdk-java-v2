package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierImpl;

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
 *  <p>ResourceIdentifier to a CartDiscount.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountResourceIdentifier cartDiscountResourceIdentifier = CartDiscountResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountResourceIdentifierImpl.class)
public interface CartDiscountResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<CartDiscount> {

    /**
     * discriminator value for CartDiscountResourceIdentifier
     */
    String CART_DISCOUNT = "cart-discount";

    /**
     *  <p>Unique identifier of the referenced CartDiscount. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */
    
    @JsonProperty("id")
    public String getId();
    /**
     *  <p>User-defined unique identifier of the referenced CartDiscount. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced CartDiscount. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     */
    
    public void setId(final String id);
    
    
    /**
     *  <p>User-defined unique identifier of the referenced CartDiscount. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of CartDiscountResourceIdentifier
     */
    public static CartDiscountResourceIdentifier of(){
        return new CartDiscountResourceIdentifierImpl();
    }
    

    /**
     * factory method to create a shallow copy CartDiscountResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountResourceIdentifier of(final CartDiscountResourceIdentifier template) {
        CartDiscountResourceIdentifierImpl instance = new CartDiscountResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountResourceIdentifier deepCopy(@Nullable final CartDiscountResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        CartDiscountResourceIdentifierImpl instance = new CartDiscountResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CartDiscountResourceIdentifier
     * @return builder
     */
    public static CartDiscountResourceIdentifierBuilder builder() {
        return CartDiscountResourceIdentifierBuilder.of();
    }
    
    /**
     * create builder for CartDiscountResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountResourceIdentifierBuilder builder(final CartDiscountResourceIdentifier template) {
        return CartDiscountResourceIdentifierBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountResourceIdentifier(Function<CartDiscountResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountResourceIdentifier>";
            }
        };
    }
}
