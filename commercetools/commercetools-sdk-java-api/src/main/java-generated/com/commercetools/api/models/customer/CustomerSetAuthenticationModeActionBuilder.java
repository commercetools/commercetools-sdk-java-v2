
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
     *
     */

    public CustomerSetAuthenticationModeActionBuilder authMode(
            final com.commercetools.api.models.customer.AuthenticationMode authMode) {
        this.authMode = authMode;
        return this;
    }

    /**
     *  <p>Required when <code>authMode</code> is <code>Password</code></p>
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

    public CustomerSetAuthenticationModeAction build() {
        Objects.requireNonNull(authMode, CustomerSetAuthenticationModeAction.class + ": authMode is missing");
        return new CustomerSetAuthenticationModeActionImpl(authMode, password);
    }

    /**
     * builds CustomerSetAuthenticationModeAction without checking for non null required values
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
