
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *  <p>Email address of the Customer treated as case-insensitive.</p>
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Password of the Customer.</p>
     */
    @NotNull
    @JsonProperty("password")
    public String getPassword();

    /**
     *  <p>Deprecated since it is now possible to identify an anonymous cart by using its <code>id</code> or external <code>key</code>.</p>
     */
    @Deprecated
    @JsonProperty("anonymousCartId")
    public String getAnonymousCartId();

    /**
     *  <p>Identifies a Cart that will be assigned to the Customer.</p>
     */
    @Valid
    @JsonProperty("anonymousCart")
    public CartResourceIdentifier getAnonymousCart();

    /**
     *  <ul>
     *   <li>Set to <code>MergeWithExistingCustomerCart</code> if LineItems of the anonymous Cart should be merged with the active Customer Cart that has been modified most recently.</li>
     *   <li>Set to <code>UseAsNewActiveCustomerCart</code> if the anonymous Cart should be used as the new active Customer Cart and no LineItems are to be merged.</li>
     *  </ul>
     */

    @JsonProperty("anonymousCartSignInMode")
    public AnonymousCartSignInMode getAnonymousCartSignInMode();

    /**
     *  <p>If both <code>anonymousCart</code> and <code>anonymousId</code> are provided, the <code>anonymousId</code> on the CustomerSignin must match that of the anonymous [Cart](ctp:api:type:Cart]. Otherwise a 400 Bad Request <code>Invalid Operation</code> error is returned with the message: "Cart with the ID cart-id does not have the expected anonymousId.".</p>
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <ul>
     *   <li>If <code>true</code>, the LineItem Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart will be updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates will be updated.</li>
     *  </ul>
     */

    @JsonProperty("updateProductData")
    public Boolean getUpdateProductData();

    public void setEmail(final String email);

    public void setPassword(final String password);

    @Deprecated
    public void setAnonymousCartId(final String anonymousCartId);

    public void setAnonymousCart(final CartResourceIdentifier anonymousCart);

    public void setAnonymousCartSignInMode(final AnonymousCartSignInMode anonymousCartSignInMode);

    public void setAnonymousId(final String anonymousId);

    public void setUpdateProductData(final Boolean updateProductData);

    public static CustomerSignin of() {
        return new CustomerSigninImpl();
    }

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

    public static CustomerSigninBuilder builder() {
        return CustomerSigninBuilder.of();
    }

    public static CustomerSigninBuilder builder(final CustomerSignin template) {
        return CustomerSigninBuilder.of(template);
    }

    default <T> T withCustomerSignin(Function<CustomerSignin, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSignin> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSignin>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSignin>";
            }
        };
    }
}
