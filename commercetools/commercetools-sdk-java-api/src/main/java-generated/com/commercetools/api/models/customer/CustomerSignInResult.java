package com.commercetools.api.models.customer;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerSignInResultImpl;

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
 * CustomerSignInResult
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSignInResult customerSignInResult = CustomerSignInResult.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomerSignInResultImpl.class)
public interface CustomerSignInResult  {


    /**
     *  <p>Customer signed up or signed in after authentication.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public Customer getCustomer();
    /**
     *  <p>Cart associated with the Customer. If empty, the Customer does not have a Cart assigned.</p>
     * @return cart
     */
    @Valid
    @JsonProperty("cart")
    public Cart getCart();

    /**
     *  <p>Customer signed up or signed in after authentication.</p>
     * @param customer value to be set
     */
    
    public void setCustomer(final Customer customer);
    
    
    /**
     *  <p>Cart associated with the Customer. If empty, the Customer does not have a Cart assigned.</p>
     * @param cart value to be set
     */
    
    public void setCart(final Cart cart);
    

    /**
     * factory method
     * @return instance of CustomerSignInResult
     */
    public static CustomerSignInResult of(){
        return new CustomerSignInResultImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomerSignInResult
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSignInResult of(final CustomerSignInResult template) {
        CustomerSignInResultImpl instance = new CustomerSignInResultImpl();
        instance.setCustomer(template.getCustomer());
        instance.setCart(template.getCart());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerSignInResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSignInResult deepCopy(@Nullable final CustomerSignInResult template) {
        if (template == null) {
            return null;
        }
        CustomerSignInResultImpl instance = new CustomerSignInResultImpl();
        instance.setCustomer(com.commercetools.api.models.customer.Customer.deepCopy(template.getCustomer()));
        instance.setCart(com.commercetools.api.models.cart.Cart.deepCopy(template.getCart()));
        return instance;
    }

    /**
     * builder factory method for CustomerSignInResult
     * @return builder
     */
    public static CustomerSignInResultBuilder builder() {
        return CustomerSignInResultBuilder.of();
    }
    
    /**
     * create builder for CustomerSignInResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSignInResultBuilder builder(final CustomerSignInResult template) {
        return CustomerSignInResultBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSignInResult(Function<CustomerSignInResult, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSignInResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSignInResult>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSignInResult>";
            }
        };
    }
}
