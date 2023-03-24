
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetAuthenticationModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetAuthenticationModeAction customerSetAuthenticationModeAction = CustomerSetAuthenticationModeAction.builder()
 *             .authMode(AuthenticationMode.PASSWORD)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetAuthenticationModeActionBuilder implements Builder<CustomerSetAuthenticationModeAction> {

    private com.commercetools.api.models.customer.AuthenticationMode authMode;

    @Nullable
    private String password;

    /**
     *  <p>Value to set. Changing a Customer's <code>authMode</code> from <code>Password</code> to <code>ExternalAuth</code> deletes the Customer's password.</p>
     * @param authMode value to be set
     * @return Builder
     */

    public CustomerSetAuthenticationModeActionBuilder authMode(
            final com.commercetools.api.models.customer.AuthenticationMode authMode) {
        this.authMode = authMode;
        return this;
    }

    /**
     *  <p>Required when <code>authMode</code> is <code>Password</code>.</p>
     * @param password value to be set
     * @return Builder
     */

    public CustomerSetAuthenticationModeActionBuilder password(@Nullable final String password) {
        this.password = password;
        return this;
    }

    public com.commercetools.api.models.customer.AuthenticationMode getAuthMode() {
        return this.authMode;
    }

    @Nullable
    public String getPassword() {
        return this.password;
    }

    /**
     * builds CustomerSetAuthenticationModeAction with checking for non-null required values
     * @return CustomerSetAuthenticationModeAction
     */
    public CustomerSetAuthenticationModeAction build() {
        Objects.requireNonNull(authMode, CustomerSetAuthenticationModeAction.class + ": authMode is missing");
        return new CustomerSetAuthenticationModeActionImpl(authMode, password);
    }

    /**
     * builds CustomerSetAuthenticationModeAction without checking for non-null required values
     * @return CustomerSetAuthenticationModeAction
     */
    public CustomerSetAuthenticationModeAction buildUnchecked() {
        return new CustomerSetAuthenticationModeActionImpl(authMode, password);
    }

    public static CustomerSetAuthenticationModeActionBuilder of() {
        return new CustomerSetAuthenticationModeActionBuilder();
    }

    public static CustomerSetAuthenticationModeActionBuilder of(final CustomerSetAuthenticationModeAction template) {
        CustomerSetAuthenticationModeActionBuilder builder = new CustomerSetAuthenticationModeActionBuilder();
        builder.authMode = template.getAuthMode();
        builder.password = template.getPassword();
        return builder;
    }

}
