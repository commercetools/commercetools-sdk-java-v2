
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
     *  <p>Email address of the Customer treated as <span>case-insensitive</span>.</p>
     * @param email value to be set
     * @return Builder
     */

    public CustomerSigninBuilder email(final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>Password of the Customer.</p>
     * @param password value to be set
     * @return Builder
     */

    public CustomerSigninBuilder password(final String password) {
        this.password = password;
        return this;
    }

    /**
     *  <p>Deprecated since it is now possible to identify an anonymous cart by using its <code>id</code> or external <code>key</code>.</p>
     * @param anonymousCartId value to be set
     * @return Builder
     */
    @Deprecated
    public CustomerSigninBuilder anonymousCartId(@Nullable final String anonymousCartId) {
        this.anonymousCartId = anonymousCartId;
        return this;
    }

    /**
     *  <p>Identifies a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> that will be assigned to the Customer.</p>
     * @param builder function to build the anonymousCart value
     * @return Builder
     */

    public CustomerSigninBuilder anonymousCart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifierBuilder> builder) {
        this.anonymousCart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Identifies a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> that will be assigned to the Customer.</p>
     * @param builder function to build the anonymousCart value
     * @return Builder
     */

    public CustomerSigninBuilder withAnonymousCart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifier> builder) {
        this.anonymousCart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Identifies a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> that will be assigned to the Customer.</p>
     * @param anonymousCart value to be set
     * @return Builder
     */

    public CustomerSigninBuilder anonymousCart(
            @Nullable final com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart) {
        this.anonymousCart = anonymousCart;
        return this;
    }

    /**
     *  <ul>
     *   <li>Set to <code>MergeWithExistingCustomerCart</code> if <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> of the anonymous Cart should be merged with the active Customer Cart that has been modified most recently.</li>
     *   <li>Set to <code>UseAsNewActiveCustomerCart</code> if the anonymous Cart should be used as the new active Customer Cart and no <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> are to be merged.</li>
     *  </ul>
     * @param anonymousCartSignInMode value to be set
     * @return Builder
     */

    public CustomerSigninBuilder anonymousCartSignInMode(
            @Nullable final com.commercetools.api.models.customer.AnonymousCartSignInMode anonymousCartSignInMode) {
        this.anonymousCartSignInMode = anonymousCartSignInMode;
        return this;
    }

    /**
     *  <p>If both <code>anonymousCart</code> and <code>anonymousId</code> are provided, the <code>anonymousId</code> on the CustomerSignin must match that of the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>. Otherwise a <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">400 Bad Request</a> <code>Invalid Operation</code> error is returned with the message: "Cart with the ID cart-id does not have the expected anonymousId.".</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public CustomerSigninBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <ul>
     *   <li>If <code>true</code>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart will be updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates will be updated.</li>
     *  </ul>
     * @param updateProductData value to be set
     * @return Builder
     */

    public CustomerSigninBuilder updateProductData(@Nullable final Boolean updateProductData) {
        this.updateProductData = updateProductData;
        return this;
    }

    /**
     *  <p>Email address of the Customer treated as <span>case-insensitive</span>.</p>
     * @return email
     */

    public String getEmail() {
        return this.email;
    }

    /**
     *  <p>Password of the Customer.</p>
     * @return password
     */

    public String getPassword() {
        return this.password;
    }

    /**
     *  <p>Deprecated since it is now possible to identify an anonymous cart by using its <code>id</code> or external <code>key</code>.</p>
     * @return anonymousCartId
     */
    @Deprecated
    @Nullable
    public String getAnonymousCartId() {
        return this.anonymousCartId;
    }

    /**
     *  <p>Identifies a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> that will be assigned to the Customer.</p>
     * @return anonymousCart
     */

    @Nullable
    public com.commercetools.api.models.cart.CartResourceIdentifier getAnonymousCart() {
        return this.anonymousCart;
    }

    /**
     *  <ul>
     *   <li>Set to <code>MergeWithExistingCustomerCart</code> if <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> of the anonymous Cart should be merged with the active Customer Cart that has been modified most recently.</li>
     *   <li>Set to <code>UseAsNewActiveCustomerCart</code> if the anonymous Cart should be used as the new active Customer Cart and no <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> are to be merged.</li>
     *  </ul>
     * @return anonymousCartSignInMode
     */

    @Nullable
    public com.commercetools.api.models.customer.AnonymousCartSignInMode getAnonymousCartSignInMode() {
        return this.anonymousCartSignInMode;
    }

    /**
     *  <p>If both <code>anonymousCart</code> and <code>anonymousId</code> are provided, the <code>anonymousId</code> on the CustomerSignin must match that of the anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>. Otherwise a <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">400 Bad Request</a> <code>Invalid Operation</code> error is returned with the message: "Cart with the ID cart-id does not have the expected anonymousId.".</p>
     * @return anonymousId
     */

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <ul>
     *   <li>If <code>true</code>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart will be updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates will be updated.</li>
     *  </ul>
     * @return updateProductData
     */

    @Nullable
    public Boolean getUpdateProductData() {
        return this.updateProductData;
    }

    /**
     * builds CustomerSignin with checking for non-null required values
     * @return CustomerSignin
     */
    public CustomerSignin build() {
        Objects.requireNonNull(email, CustomerSignin.class + ": email is missing");
        Objects.requireNonNull(password, CustomerSignin.class + ": password is missing");
        return new CustomerSigninImpl(email, password, anonymousCartId, anonymousCart, anonymousCartSignInMode,
            anonymousId, updateProductData);
    }

    /**
     * builds CustomerSignin without checking for non-null required values
     * @return CustomerSignin
     */
    public CustomerSignin buildUnchecked() {
        return new CustomerSigninImpl(email, password, anonymousCartId, anonymousCart, anonymousCartSignInMode,
            anonymousId, updateProductData);
    }

    /**
     * factory method for an instance of CustomerSigninBuilder
     * @return builder
     */
    public static CustomerSigninBuilder of() {
        return new CustomerSigninBuilder();
    }

    /**
     * create builder for CustomerSignin instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
