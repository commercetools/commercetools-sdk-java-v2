
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
     * @param email value to be set
     * @return Builder
     */

    public CustomerChangeEmailActionBuilder email(final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @return email
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * builds CustomerChangeEmailAction with checking for non-null required values
     * @return CustomerChangeEmailAction
     */
    public CustomerChangeEmailAction build() {
        Objects.requireNonNull(email, CustomerChangeEmailAction.class + ": email is missing");
        return new CustomerChangeEmailActionImpl(email);
    }

    /**
     * builds CustomerChangeEmailAction without checking for non-null required values
     * @return CustomerChangeEmailAction
     */
    public CustomerChangeEmailAction buildUnchecked() {
        return new CustomerChangeEmailActionImpl(email);
    }

    /**
     * factory method for an instance of CustomerChangeEmailActionBuilder
     * @return builder
     */
    public static CustomerChangeEmailActionBuilder of() {
        return new CustomerChangeEmailActionBuilder();
    }

    /**
     * create builder for CustomerChangeEmailAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerChangeEmailActionBuilder of(final CustomerChangeEmailAction template) {
        CustomerChangeEmailActionBuilder builder = new CustomerChangeEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
