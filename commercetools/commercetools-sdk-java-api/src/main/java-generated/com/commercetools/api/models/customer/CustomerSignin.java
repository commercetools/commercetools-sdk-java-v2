
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * CustomerSignin
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSignin customerSignin = CustomerSignin.builder()
 *             .email("{email}")
 *             .password("{password}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSigninImpl.class)
public interface CustomerSignin {

    /**
     *  <p>Email address of the Customer treated as <span>case-insensitive</span>.</p>
     * @return email
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Password of the Customer.</p>
     * @return password
     */
    @NotNull
    @JsonProperty("password")
    public String getPassword();

    /**
     *  <p>Deprecated since it is now possible to identify an anonymous cart by using its <code>id</code> or external <code>key</code>.</p>
     * @return anonymousCartId
     */
    @Deprecated
    @JsonProperty("anonymousCartId")
    public String getAnonymousCartId();

    /**
     *  <p>Identifies a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> that will be assigned to the Customer.</p>
     * @return anonymousCart
     */
    @Valid
    @JsonProperty("anonymousCart")
    public CartResourceIdentifier getAnonymousCart();

    /**
     *  <ul>
     *   <li>Set to <code>MergeWithExistingCustomerCart</code> if <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> of the anonymous Cart should be merged with the active Customer Cart that has been modified most recently.</li>
     *   <li>Set to <code>UseAsNewActiveCustomerCart</code> if the anonymous Cart should be used as the new active Customer Cart and no <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> are to be merged.</li>
     *  </ul>
     * @return anonymousCartSignInMode
     */

    @JsonProperty("anonymousCartSignInMode")
    public AnonymousCartSignInMode getAnonymousCartSignInMode();

    /**
     *  <p>If both <code>anonymousCart</code> and <code>anonymousId</code> are provided, the <code>anonymousId</code> on the CustomerSignin must match that of the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>. Otherwise a <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">400 Bad Request</a> <code>Invalid Operation</code> error is returned with the message: "Cart with the ID cart-id does not have the expected anonymousId.".</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <ul>
     *   <li>If <code>true</code>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart will be updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates will be updated.</li>
     *  </ul>
     * @return updateProductData
     */

    @JsonProperty("updateProductData")
    public Boolean getUpdateProductData();

    /**
     *  <p>Email address of the Customer treated as <span>case-insensitive</span>.</p>
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     *  <p>Password of the Customer.</p>
     * @param password value to be set
     */

    public void setPassword(final String password);

    /**
     *  <p>Deprecated since it is now possible to identify an anonymous cart by using its <code>id</code> or external <code>key</code>.</p>
     * @param anonymousCartId value to be set
     */
    @Deprecated
    public void setAnonymousCartId(final String anonymousCartId);

    /**
     *  <p>Identifies a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> that will be assigned to the Customer.</p>
     * @param anonymousCart value to be set
     */

    public void setAnonymousCart(final CartResourceIdentifier anonymousCart);

    /**
     *  <ul>
     *   <li>Set to <code>MergeWithExistingCustomerCart</code> if <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> of the anonymous Cart should be merged with the active Customer Cart that has been modified most recently.</li>
     *   <li>Set to <code>UseAsNewActiveCustomerCart</code> if the anonymous Cart should be used as the new active Customer Cart and no <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> are to be merged.</li>
     *  </ul>
     * @param anonymousCartSignInMode value to be set
     */

    public void setAnonymousCartSignInMode(final AnonymousCartSignInMode anonymousCartSignInMode);

    /**
     *  <p>If both <code>anonymousCart</code> and <code>anonymousId</code> are provided, the <code>anonymousId</code> on the CustomerSignin must match that of the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>. Otherwise a <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">400 Bad Request</a> <code>Invalid Operation</code> error is returned with the message: "Cart with the ID cart-id does not have the expected anonymousId.".</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     *  <ul>
     *   <li>If <code>true</code>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart will be updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates will be updated.</li>
     *  </ul>
     * @param updateProductData value to be set
     */

    public void setUpdateProductData(final Boolean updateProductData);

    /**
     * factory method
     * @return instance of CustomerSignin
     */
    public static CustomerSignin of() {
        return new CustomerSigninImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSignin
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSignin of(final CustomerSignin template) {
        CustomerSigninImpl instance = new CustomerSigninImpl();
        instance.setEmail(template.getEmail());
        instance.setPassword(template.getPassword());
        instance.setAnonymousCartId(template.getAnonymousCartId());
        instance.setAnonymousCart(template.getAnonymousCart());
        instance.setAnonymousCartSignInMode(template.getAnonymousCartSignInMode());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setUpdateProductData(template.getUpdateProductData());
        return instance;
    }

    public CustomerSignin copyDeep();

    /**
     * factory method to create a deep copy of CustomerSignin
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSignin deepCopy(@Nullable final CustomerSignin template) {
        if (template == null) {
            return null;
        }
        CustomerSigninImpl instance = new CustomerSigninImpl();
        instance.setEmail(template.getEmail());
        instance.setPassword(template.getPassword());
        instance.setAnonymousCartId(template.getAnonymousCartId());
        instance.setAnonymousCart(
            com.commercetools.api.models.cart.CartResourceIdentifier.deepCopy(template.getAnonymousCart()));
        instance.setAnonymousCartSignInMode(template.getAnonymousCartSignInMode());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setUpdateProductData(template.getUpdateProductData());
        return instance;
    }

    /**
     * builder factory method for CustomerSignin
     * @return builder
     */
    public static CustomerSigninBuilder builder() {
        return CustomerSigninBuilder.of();
    }

    /**
     * create builder for CustomerSignin instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSigninBuilder builder(final CustomerSignin template) {
        return CustomerSigninBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSignin(Function<CustomerSignin, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSignin> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSignin>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSignin>";
            }
        };
    }
}
