package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartSetCustomerEmailActionImpl;

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
 * CartSetCustomerEmailAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomerEmailAction cartSetCustomerEmailAction = CartSetCustomerEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartSetCustomerEmailActionImpl.class)
public interface CartSetCustomerEmailAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetCustomerEmailAction
     */
    String SET_CUSTOMER_EMAIL = "setCustomerEmail";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return email
     */
    
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param email value to be set
     */
    
    public void setEmail(final String email);
    

    /**
     * factory method
     * @return instance of CartSetCustomerEmailAction
     */
    public static CartSetCustomerEmailAction of(){
        return new CartSetCustomerEmailActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CartSetCustomerEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetCustomerEmailAction of(final CartSetCustomerEmailAction template) {
        CartSetCustomerEmailActionImpl instance = new CartSetCustomerEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetCustomerEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetCustomerEmailAction deepCopy(@Nullable final CartSetCustomerEmailAction template) {
        if (template == null) {
            return null;
        }
        CartSetCustomerEmailActionImpl instance = new CartSetCustomerEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    /**
     * builder factory method for CartSetCustomerEmailAction
     * @return builder
     */
    public static CartSetCustomerEmailActionBuilder builder() {
        return CartSetCustomerEmailActionBuilder.of();
    }
    
    /**
     * create builder for CartSetCustomerEmailAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomerEmailActionBuilder builder(final CartSetCustomerEmailAction template) {
        return CartSetCustomerEmailActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetCustomerEmailAction(Function<CartSetCustomerEmailAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomerEmailAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomerEmailAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomerEmailAction>";
            }
        };
    }
}
