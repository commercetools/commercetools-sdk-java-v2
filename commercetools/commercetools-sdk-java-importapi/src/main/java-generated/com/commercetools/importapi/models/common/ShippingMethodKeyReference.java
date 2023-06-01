package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.ShippingMethodKeyReferenceImpl;

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
 *  <p>References a shipping method by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodKeyReference shippingMethodKeyReference = ShippingMethodKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodKeyReferenceImpl.class)
public interface ShippingMethodKeyReference extends KeyReference {

    /**
     * discriminator value for ShippingMethodKeyReference
     */
    String SHIPPING_METHOD = "shipping-method";



    /**
     * factory method
     * @return instance of ShippingMethodKeyReference
     */
    public static ShippingMethodKeyReference of(){
        return new ShippingMethodKeyReferenceImpl();
    }
    

    /**
     * factory method to create a shallow copy ShippingMethodKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodKeyReference of(final ShippingMethodKeyReference template) {
        ShippingMethodKeyReferenceImpl instance = new ShippingMethodKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodKeyReference deepCopy(@Nullable final ShippingMethodKeyReference template) {
        if (template == null) {
            return null;
        }
        ShippingMethodKeyReferenceImpl instance = new ShippingMethodKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodKeyReference
     * @return builder
     */
    public static ShippingMethodKeyReferenceBuilder builder() {
        return ShippingMethodKeyReferenceBuilder.of();
    }
    
    /**
     * create builder for ShippingMethodKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodKeyReferenceBuilder builder(final ShippingMethodKeyReference template) {
        return ShippingMethodKeyReferenceBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodKeyReference(Function<ShippingMethodKeyReference, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodKeyReference>";
            }
        };
    }
}
