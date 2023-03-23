
package com.commercetools.api.models.customer;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerChangeEmailActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerChangeEmailAction customerChangeEmailAction = CustomerChangeEmailAction.builder()
 *             .email("{email}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerChangeEmailActionBuilder implements Builder<CustomerChangeEmailAction> {

    private String email;

    /**
     *  <p>Value to set.</p>
     * @param email
     * @return Builder
     */

    public CustomerChangeEmailActionBuilder email(final String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public CustomerChangeEmailAction build() {
        Objects.requireNonNull(email, CustomerChangeEmailAction.class + ": email is missing");
        return new CustomerChangeEmailActionImpl(email);
    }

    /**
     * builds CustomerChangeEmailAction without checking for non null required values
     */
    public CustomerChangeEmailAction buildUnchecked() {
        return new CustomerChangeEmailActionImpl(email);
    }

    public static CustomerChangeEmailActionBuilder of() {
        return new CustomerChangeEmailActionBuilder();
    }

    public static CustomerChangeEmailActionBuilder of(final CustomerChangeEmailAction template) {
        CustomerChangeEmailActionBuilder builder = new CustomerChangeEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
