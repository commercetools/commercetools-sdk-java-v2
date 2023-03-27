
package com.commercetools.api.models.customer;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerResetPasswordBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerResetPassword myCustomerResetPassword = MyCustomerResetPassword.builder()
 *             .tokenValue("{tokenValue}")
 *             .newPassword("{newPassword}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerResetPasswordBuilder implements Builder<MyCustomerResetPassword> {

    private String tokenValue;

    private String newPassword;

    /**
     *  <p>Value of the token to reset the Customer password.</p>
     * @param tokenValue value to be set
     * @return Builder
     */

    public MyCustomerResetPasswordBuilder tokenValue(final String tokenValue) {
        this.tokenValue = tokenValue;
        return this;
    }

    /**
     *  <p>New password to be set.</p>
     * @param newPassword value to be set
     * @return Builder
     */

    public MyCustomerResetPasswordBuilder newPassword(final String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    /**
     *  <p>Value of the token to reset the Customer password.</p>
     * @return tokenValue
     */

    public String getTokenValue() {
        return this.tokenValue;
    }

    /**
     *  <p>New password to be set.</p>
     * @return newPassword
     */

    public String getNewPassword() {
        return this.newPassword;
    }

    /**
     * builds MyCustomerResetPassword with checking for non-null required values
     * @return MyCustomerResetPassword
     */
    public MyCustomerResetPassword build() {
        Objects.requireNonNull(tokenValue, MyCustomerResetPassword.class + ": tokenValue is missing");
        Objects.requireNonNull(newPassword, MyCustomerResetPassword.class + ": newPassword is missing");
        return new MyCustomerResetPasswordImpl(tokenValue, newPassword);
    }

    /**
     * builds MyCustomerResetPassword without checking for non-null required values
     * @return MyCustomerResetPassword
     */
    public MyCustomerResetPassword buildUnchecked() {
        return new MyCustomerResetPasswordImpl(tokenValue, newPassword);
    }

    /**
     * factory method for an instance of MyCustomerResetPasswordBuilder
     * @return builder
     */
    public static MyCustomerResetPasswordBuilder of() {
        return new MyCustomerResetPasswordBuilder();
    }

    /**
     * create builder for MyCustomerResetPassword instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerResetPasswordBuilder of(final MyCustomerResetPassword template) {
        MyCustomerResetPasswordBuilder builder = new MyCustomerResetPasswordBuilder();
        builder.tokenValue = template.getTokenValue();
        builder.newPassword = template.getNewPassword();
        return builder;
    }

}
