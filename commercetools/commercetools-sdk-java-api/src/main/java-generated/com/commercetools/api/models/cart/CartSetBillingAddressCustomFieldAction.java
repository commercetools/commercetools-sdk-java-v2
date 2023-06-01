package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldActionImpl;

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
 * CartSetBillingAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetBillingAddressCustomFieldAction cartSetBillingAddressCustomFieldAction = CartSetBillingAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartSetBillingAddressCustomFieldActionImpl.class)
public interface CartSetBillingAddressCustomFieldAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetBillingAddressCustomFieldAction
     */
    String SET_BILLING_ADDRESS_CUSTOM_FIELD = "setBillingAddressCustomField";

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
     * @return instance of CartSetBillingAddressCustomFieldAction
     */
    public static CartSetBillingAddressCustomFieldAction of(){
        return new CartSetBillingAddressCustomFieldActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CartSetBillingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetBillingAddressCustomFieldAction of(final CartSetBillingAddressCustomFieldAction template) {
        CartSetBillingAddressCustomFieldActionImpl instance = new CartSetBillingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetBillingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetBillingAddressCustomFieldAction deepCopy(@Nullable final CartSetBillingAddressCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        CartSetBillingAddressCustomFieldActionImpl instance = new CartSetBillingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CartSetBillingAddressCustomFieldAction
     * @return builder
     */
    public static CartSetBillingAddressCustomFieldActionBuilder builder() {
        return CartSetBillingAddressCustomFieldActionBuilder.of();
    }
    
    /**
     * create builder for CartSetBillingAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetBillingAddressCustomFieldActionBuilder builder(final CartSetBillingAddressCustomFieldAction template) {
        return CartSetBillingAddressCustomFieldActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetBillingAddressCustomFieldAction(Function<CartSetBillingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
    public static CartSetBillingAddressCustomFieldAction ofUnset(final String name) {
        return CartSetBillingAddressCustomFieldActionBuilder.of().name(name).build();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetBillingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetBillingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetBillingAddressCustomFieldAction>";
            }
        };
    }
}
