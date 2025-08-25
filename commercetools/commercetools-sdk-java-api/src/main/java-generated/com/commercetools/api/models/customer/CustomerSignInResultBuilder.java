
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSignInResultBuilder
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
public class CustomerSignInResultBuilder implements Builder<CustomerSignInResult> {

    private com.commercetools.api.models.customer.Customer customer;

    @Nullable
    private com.commercetools.api.models.cart.Cart cart;

    /**
     *  <p>Customer <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/customers:POST" rel="nofollow">signed up</a> or <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/login:POST" rel="nofollow">signed in</a> after authentication.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public CustomerSignInResultBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerBuilder, com.commercetools.api.models.customer.CustomerBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Customer <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/customers:POST" rel="nofollow">signed up</a> or <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/login:POST" rel="nofollow">signed in</a> after authentication.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public CustomerSignInResultBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerBuilder, com.commercetools.api.models.customer.Customer> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerBuilder.of());
        return this;
    }

    /**
     *  <p>Customer <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/customers:POST" rel="nofollow">signed up</a> or <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/login:POST" rel="nofollow">signed in</a> after authentication.</p>
     * @param customer value to be set
     * @return Builder
     */

    public CustomerSignInResultBuilder customer(final com.commercetools.api.models.customer.Customer customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Cart associated with the Customer. If empty, the Customer does not have a Cart assigned.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public CustomerSignInResultBuilder cart(
            Function<com.commercetools.api.models.cart.CartBuilder, com.commercetools.api.models.cart.CartBuilder> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Cart associated with the Customer. If empty, the Customer does not have a Cart assigned.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public CustomerSignInResultBuilder withCart(
            Function<com.commercetools.api.models.cart.CartBuilder, com.commercetools.api.models.cart.Cart> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartBuilder.of());
        return this;
    }

    /**
     *  <p>Cart associated with the Customer. If empty, the Customer does not have a Cart assigned.</p>
     * @param cart value to be set
     * @return Builder
     */

    public CustomerSignInResultBuilder cart(@Nullable final com.commercetools.api.models.cart.Cart cart) {
        this.cart = cart;
        return this;
    }

    /**
     *  <p>Customer <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/customers:POST" rel="nofollow">signed up</a> or <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/login:POST" rel="nofollow">signed in</a> after authentication.</p>
     * @return customer
     */

    public com.commercetools.api.models.customer.Customer getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Cart associated with the Customer. If empty, the Customer does not have a Cart assigned.</p>
     * @return cart
     */

    @Nullable
    public com.commercetools.api.models.cart.Cart getCart() {
        return this.cart;
    }

    /**
     * builds CustomerSignInResult with checking for non-null required values
     * @return CustomerSignInResult
     */
    public CustomerSignInResult build() {
        Objects.requireNonNull(customer, CustomerSignInResult.class + ": customer is missing");
        return new CustomerSignInResultImpl(customer, cart);
    }

    /**
     * builds CustomerSignInResult without checking for non-null required values
     * @return CustomerSignInResult
     */
    public CustomerSignInResult buildUnchecked() {
        return new CustomerSignInResultImpl(customer, cart);
    }

    /**
     * factory method for an instance of CustomerSignInResultBuilder
     * @return builder
     */
    public static CustomerSignInResultBuilder of() {
        return new CustomerSignInResultBuilder();
    }

    /**
     * create builder for CustomerSignInResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSignInResultBuilder of(final CustomerSignInResult template) {
        CustomerSignInResultBuilder builder = new CustomerSignInResultBuilder();
        builder.customer = template.getCustomer();
        builder.cart = template.getCart();
        return builder;
    }

}
