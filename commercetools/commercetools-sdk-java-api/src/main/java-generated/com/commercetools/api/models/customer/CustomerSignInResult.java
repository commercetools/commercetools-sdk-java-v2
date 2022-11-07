
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.Cart;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSignInResultImpl.class)
public interface CustomerSignInResult {

    /**
     *  <p>Customer signed up or signed in after authentication.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public Customer getCustomer();

    /**
     *  <p>Cart associated with the Customer. If empty, the Customer does not have a Cart assigned.</p>
     */
    @Valid
    @JsonProperty("cart")
    public Cart getCart();

    public void setCustomer(final Customer customer);

    public void setCart(final Cart cart);

    public static CustomerSignInResult of() {
        return new CustomerSignInResultImpl();
    }

    public static CustomerSignInResult of(final CustomerSignInResult template) {
        CustomerSignInResultImpl instance = new CustomerSignInResultImpl();
        instance.setCustomer(template.getCustomer());
        instance.setCart(template.getCart());
        return instance;
    }

    public static CustomerSignInResultBuilder builder() {
        return CustomerSignInResultBuilder.of();
    }

    public static CustomerSignInResultBuilder builder(final CustomerSignInResult template) {
        return CustomerSignInResultBuilder.of(template);
    }

    default <T> T withCustomerSignInResult(Function<CustomerSignInResult, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSignInResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSignInResult>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSignInResult>";
            }
        };
    }
}
