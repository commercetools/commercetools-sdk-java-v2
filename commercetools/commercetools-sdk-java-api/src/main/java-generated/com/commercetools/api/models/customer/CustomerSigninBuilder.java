
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSigninBuilder
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
public class CustomerSigninBuilder implements Builder<CustomerSignin> {

    private String email;

    private String password;

    @Deprecated
    @Nullable
    private String anonymousCartId;

    @Nullable
    private com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart;

    @Nullable
    private com.commercetools.api.models.customer.AnonymousCartSignInMode anonymousCartSignInMode;

    @Nullable
    private String anonymousId;

    @Nullable
    private Boolean updateProductData;

    /**
     *  <p>Email address of the Customer treated as case-insensitive.</p>
     */

    public CustomerSigninBuilder email(final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>Password of the Customer.</p>
     */

    public CustomerSigninBuilder password(final String password) {
        this.password = password;
        return this;
    }

    /**
     *  <p>Deprecated since it is now possible to identify an anonymous cart by using its <code>id</code> or external <code>key</code>.</p>
     */
    @Deprecated
    public CustomerSigninBuilder anonymousCartId(@Nullable final String anonymousCartId) {
        this.anonymousCartId = anonymousCartId;
        return this;
    }

    /**
     *  <p>Identifies a Cart that will be assigned to the Customer.</p>
     */

    public CustomerSigninBuilder anonymousCart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifierBuilder> builder) {
        this.anonymousCart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Identifies a Cart that will be assigned to the Customer.</p>
     */

    public CustomerSigninBuilder anonymousCart(
            @Nullable final com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart) {
        this.anonymousCart = anonymousCart;
        return this;
    }

    /**
     *  <ul>
     *   <li>Set to <code>MergeWithExistingCustomerCart</code> if LineItems of the anonymous Cart should be merged with the active Customer Cart that has been modified most recently.</li>
     *   <li>Set to <code>UseAsNewActiveCustomerCart</code> if the anonymous Cart should be used as the new active Customer Cart and no LineItems are to be merged.</li>
     *  </ul>
     */

    public CustomerSigninBuilder anonymousCartSignInMode(
            @Nullable final com.commercetools.api.models.customer.AnonymousCartSignInMode anonymousCartSignInMode) {
        this.anonymousCartSignInMode = anonymousCartSignInMode;
        return this;
    }

    /**
     *  <p>If both <code>anonymousCart</code> and <code>anonymousId</code> are provided, the <code>anonymousId</code> on the CustomerSignin must match that of the anonymous [Cart](ctp:api:type:Cart]. Otherwise a 400 Bad Request <code>Invalid Operation</code> error is returned with the message: "Cart with the ID cart-id does not have the expected anonymousId.".</p>
     */

    public CustomerSigninBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <ul>
     *   <li>If <code>true</code>, the LineItem Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart will be updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates will be updated.</li>
     *  </ul>
     */

    public CustomerSigninBuilder updateProductData(@Nullable final Boolean updateProductData) {
        this.updateProductData = updateProductData;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    @Deprecated
    @Nullable
    public String getAnonymousCartId() {
        return this.anonymousCartId;
    }

    @Nullable
    public com.commercetools.api.models.cart.CartResourceIdentifier getAnonymousCart() {
        return this.anonymousCart;
    }

    @Nullable
    public com.commercetools.api.models.customer.AnonymousCartSignInMode getAnonymousCartSignInMode() {
        return this.anonymousCartSignInMode;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    public Boolean getUpdateProductData() {
        return this.updateProductData;
    }

    public CustomerSignin build() {
        Objects.requireNonNull(email, CustomerSignin.class + ": email is missing");
        Objects.requireNonNull(password, CustomerSignin.class + ": password is missing");
        return new CustomerSigninImpl(email, password, anonymousCartId, anonymousCart, anonymousCartSignInMode,
            anonymousId, updateProductData);
    }

    /**
     * builds CustomerSignin without checking for non null required values
     */
    public CustomerSignin buildUnchecked() {
        return new CustomerSigninImpl(email, password, anonymousCartId, anonymousCart, anonymousCartSignInMode,
            anonymousId, updateProductData);
    }

    public static CustomerSigninBuilder of() {
        return new CustomerSigninBuilder();
    }

    public static CustomerSigninBuilder of(final CustomerSignin template) {
        CustomerSigninBuilder builder = new CustomerSigninBuilder();
        builder.email = template.getEmail();
        builder.password = template.getPassword();
        builder.anonymousCartId = template.getAnonymousCartId();
        builder.anonymousCart = template.getAnonymousCart();
        builder.anonymousCartSignInMode = template.getAnonymousCartSignInMode();
        builder.anonymousId = template.getAnonymousId();
        builder.updateProductData = template.getUpdateProductData();
        return builder;
    }

}
