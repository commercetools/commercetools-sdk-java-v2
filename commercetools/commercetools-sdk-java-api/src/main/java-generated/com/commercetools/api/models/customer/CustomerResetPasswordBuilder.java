
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerResetPasswordBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerResetPassword customerResetPassword = CustomerResetPassword.builder()
 *             .tokenValue("{tokenValue}")
 *             .newPassword("{newPassword}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerResetPasswordBuilder implements Builder<CustomerResetPassword> {

    private String tokenValue;

    private String newPassword;

    @Nullable
    private Long version;

    /**
     *  <p>Value of the token to reset the Customer password.</p>
     * @param tokenValue value to be set
     * @return Builder
     */

    public CustomerResetPasswordBuilder tokenValue(final String tokenValue) {
        this.tokenValue = tokenValue;
        return this;
    }

    /**
     *  <p>New password to be set.</p>
     * @param newPassword value to be set
     * @return Builder
     */

    public CustomerResetPasswordBuilder newPassword(final String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    /**
     *  <p>Expected version of the Customer.</p>
     * @param version value to be set
     * @return Builder
     */

    public CustomerResetPasswordBuilder version(@Nullable final Long version) {
        this.version = version;
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
     *  <p>Expected version of the Customer.</p>
     * @return version
     */

    @Nullable
    public Long getVersion() {
        return this.version;
    }

    /**
     * builds CustomerResetPassword with checking for non-null required values
     * @return CustomerResetPassword
     */
    public CustomerResetPassword build() {
        Objects.requireNonNull(tokenValue, CustomerResetPassword.class + ": tokenValue is missing");
        Objects.requireNonNull(newPassword, CustomerResetPassword.class + ": newPassword is missing");
        return new CustomerResetPasswordImpl(tokenValue, newPassword, version);
    }

    /**
     * builds CustomerResetPassword without checking for non-null required values
     * @return CustomerResetPassword
     */
    public CustomerResetPassword buildUnchecked() {
        return new CustomerResetPasswordImpl(tokenValue, newPassword, version);
    }

    /**
     * factory method for an instance of CustomerResetPasswordBuilder
     * @return builder
     */
    public static CustomerResetPasswordBuilder of() {
        return new CustomerResetPasswordBuilder();
    }

    /**
     * create builder for CustomerResetPassword instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerResetPasswordBuilder of(final CustomerResetPassword template) {
        CustomerResetPasswordBuilder builder = new CustomerResetPasswordBuilder();
        builder.tokenValue = template.getTokenValue();
        builder.newPassword = template.getNewPassword();
        builder.version = template.getVersion();
        return builder;
    }

}
