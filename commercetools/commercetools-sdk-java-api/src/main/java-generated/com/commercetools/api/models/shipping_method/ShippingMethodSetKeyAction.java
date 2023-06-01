package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetKeyActionImpl;

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
 * ShippingMethodSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetKeyAction shippingMethodSetKeyAction = ShippingMethodSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodSetKeyActionImpl.class)
public interface ShippingMethodSetKeyAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of ShippingMethodSetKeyAction
     */
    public static ShippingMethodSetKeyAction of(){
        return new ShippingMethodSetKeyActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ShippingMethodSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSetKeyAction of(final ShippingMethodSetKeyAction template) {
        ShippingMethodSetKeyActionImpl instance = new ShippingMethodSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodSetKeyAction deepCopy(@Nullable final ShippingMethodSetKeyAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodSetKeyActionImpl instance = new ShippingMethodSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSetKeyAction
     * @return builder
     */
    public static ShippingMethodSetKeyActionBuilder builder() {
        return ShippingMethodSetKeyActionBuilder.of();
    }
    
    /**
     * create builder for ShippingMethodSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetKeyActionBuilder builder(final ShippingMethodSetKeyAction template) {
        return ShippingMethodSetKeyActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSetKeyAction(Function<ShippingMethodSetKeyAction, T> helper) {
        return helper.apply(this);
    }
    public static ShippingMethodSetKeyAction ofUnset() {
        return ShippingMethodSetKeyAction.of();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetKeyAction>";
            }
        };
    }
}
