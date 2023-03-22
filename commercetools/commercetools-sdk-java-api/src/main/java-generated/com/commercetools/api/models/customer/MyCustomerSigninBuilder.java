
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSigninBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSignin myCustomerSignin = MyCustomerSignin.builder()
 *             .email("{email}")
 *             .password("{password}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSigninBuilder implements Builder<MyCustomerSignin> {

    private String email;

    private String password;

    @Nullable
    private com.commercetools.api.models.customer.AnonymousCartSignInMode activeCartSignInMode;

    @Nullable
    private Boolean updateProductData;

    /**
     *  <p>Email address of the Customer treated as case-insensitive.</p>
     * @param email
     * @return Builder
     */

    public MyCustomerSigninBuilder email(final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>Password of the Customer.</p>
     * @param password
     * @return Builder
     */

    public MyCustomerSigninBuilder password(final String password) {
        this.password = password;
        return this;
    }

    /**
     *  <ul>
     *   <li>If <code>MergeWithExistingCustomerCart</code>, LineItems of the anonymous Cart are merged with the recently modified active Customer Cart.</li>
     *   <li>If <code>UseAsNewActiveCustomerCart</code>, the anonymous Cart is used as the new active Customer Cart, and no LineItems are merged.</li>
     *  </ul>
     * @param activeCartSignInMode
     * @return Builder
     */

    public MyCustomerSigninBuilder activeCartSignInMode(
            @Nullable final com.commercetools.api.models.customer.AnonymousCartSignInMode activeCartSignInMode) {
        this.activeCartSignInMode = activeCartSignInMode;
        return this;
    }

    /**
     *  <ul>
     *   <li>If <code>true</code>, the LineItem Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart is updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates are updated.</li>
     *  </ul>
     * @param updateProductData
     * @return Builder
     */

    public MyCustomerSigninBuilder updateProductData(@Nullable final Boolean updateProductData) {
        this.updateProductData = updateProductData;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    @Nullable
    public com.commercetools.api.models.customer.AnonymousCartSignInMode getActiveCartSignInMode() {
        return this.activeCartSignInMode;
    }

    @Nullable
    public Boolean getUpdateProductData() {
        return this.updateProductData;
    }

    public MyCustomerSignin build() {
        Objects.requireNonNull(email, MyCustomerSignin.class + ": email is missing");
        Objects.requireNonNull(password, MyCustomerSignin.class + ": password is missing");
        return new MyCustomerSigninImpl(email, password, activeCartSignInMode, updateProductData);
    }

    /**
     * builds MyCustomerSignin without checking for non null required values
     */
    public MyCustomerSignin buildUnchecked() {
        return new MyCustomerSigninImpl(email, password, activeCartSignInMode, updateProductData);
    }

    public static MyCustomerSigninBuilder of() {
        return new MyCustomerSigninBuilder();
    }

    public static MyCustomerSigninBuilder of(final MyCustomerSignin template) {
        MyCustomerSigninBuilder builder = new MyCustomerSigninBuilder();
        builder.email = template.getEmail();
        builder.password = template.getPassword();
        builder.activeCartSignInMode = template.getActiveCartSignInMode();
        builder.updateProductData = template.getUpdateProductData();
        return builder;
    }

}
