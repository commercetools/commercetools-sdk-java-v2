package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.cart.CartSetDeliveryAddressCustomFieldActionImpl;

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
 * CartSetDeliveryAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetDeliveryAddressCustomFieldAction cartSetDeliveryAddressCustomFieldAction = CartSetDeliveryAddressCustomFieldAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartSetDeliveryAddressCustomFieldActionImpl.class)
public interface CartSetDeliveryAddressCustomFieldAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetDeliveryAddressCustomFieldAction
     */
    String SET_DELIVERY_ADDRESS_CUSTOM_FIELD = "setDeliveryAddressCustomField";

    /**
     *  <p><code>id</code> of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();
    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */
    
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p><code>id</code> of the Delivery.</p>
     * @param deliveryId value to be set
     */
    
    public void setDeliveryId(final String deliveryId);
    
    
    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */
    
    public void setName(final String name);
    
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */
    
    public void setValue(final Object value);
    

    /**
     * factory method
     * @return instance of CartSetDeliveryAddressCustomFieldAction
     */
    public static CartSetDeliveryAddressCustomFieldAction of(){
        return new CartSetDeliveryAddressCustomFieldActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CartSetDeliveryAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetDeliveryAddressCustomFieldAction of(final CartSetDeliveryAddressCustomFieldAction template) {
        CartSetDeliveryAddressCustomFieldActionImpl instance = new CartSetDeliveryAddressCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetDeliveryAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetDeliveryAddressCustomFieldAction deepCopy(@Nullable final CartSetDeliveryAddressCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        CartSetDeliveryAddressCustomFieldActionImpl instance = new CartSetDeliveryAddressCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CartSetDeliveryAddressCustomFieldAction
     * @return builder
     */
    public static CartSetDeliveryAddressCustomFieldActionBuilder builder() {
        return CartSetDeliveryAddressCustomFieldActionBuilder.of();
    }
    
    /**
     * create builder for CartSetDeliveryAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetDeliveryAddressCustomFieldActionBuilder builder(final CartSetDeliveryAddressCustomFieldAction template) {
        return CartSetDeliveryAddressCustomFieldActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetDeliveryAddressCustomFieldAction(Function<CartSetDeliveryAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
    public static CartSetDeliveryAddressCustomFieldAction ofUnset(final String name, final String deliveryId) {
        return CartSetDeliveryAddressCustomFieldActionBuilder.of().name(name).deliveryId(deliveryId).build();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetDeliveryAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetDeliveryAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetDeliveryAddressCustomFieldAction>";
            }
        };
    }
}
