package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartSetCustomerIdActionImpl;

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
 *  <p>Setting the Cart's <code>customerId</code> can lead to updates on all its LineItem <code>prices</code>.</p>
 *  <p>If the Customer with the specified <code>id</code> cannot be found, this update action returns a ReferencedResourceNotFound error.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomerIdAction cartSetCustomerIdAction = CartSetCustomerIdAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartSetCustomerIdActionImpl.class)
public interface CartSetCustomerIdAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetCustomerIdAction
     */
    String SET_CUSTOMER_ID = "setCustomerId";

    /**
     *  <p><code>id</code> of an existing Customer. If empty, any value is removed.</p>
     * @return customerId
     */
    
    @JsonProperty("customerId")
    public String getCustomerId();

    /**
     *  <p><code>id</code> of an existing Customer. If empty, any value is removed.</p>
     * @param customerId value to be set
     */
    
    public void setCustomerId(final String customerId);
    

    /**
     * factory method
     * @return instance of CartSetCustomerIdAction
     */
    public static CartSetCustomerIdAction of(){
        return new CartSetCustomerIdActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CartSetCustomerIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetCustomerIdAction of(final CartSetCustomerIdAction template) {
        CartSetCustomerIdActionImpl instance = new CartSetCustomerIdActionImpl();
        instance.setCustomerId(template.getCustomerId());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetCustomerIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetCustomerIdAction deepCopy(@Nullable final CartSetCustomerIdAction template) {
        if (template == null) {
            return null;
        }
        CartSetCustomerIdActionImpl instance = new CartSetCustomerIdActionImpl();
        instance.setCustomerId(template.getCustomerId());
        return instance;
    }

    /**
     * builder factory method for CartSetCustomerIdAction
     * @return builder
     */
    public static CartSetCustomerIdActionBuilder builder() {
        return CartSetCustomerIdActionBuilder.of();
    }
    
    /**
     * create builder for CartSetCustomerIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomerIdActionBuilder builder(final CartSetCustomerIdAction template) {
        return CartSetCustomerIdActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetCustomerIdAction(Function<CartSetCustomerIdAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomerIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomerIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomerIdAction>";
            }
        };
    }
}
