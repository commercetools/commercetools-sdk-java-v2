
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetLastNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetLastNameAction customerSetLastNameAction = CustomerSetLastNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetLastNameActionBuilder implements Builder<CustomerSetLastNameAction> {

    @Nullable
    private String lastName;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param lastName value to be set
     * @return Builder
     */

    public CustomerSetLastNameActionBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return lastName
     */

    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    /**
     * builds CustomerSetLastNameAction with checking for non-null required values
     * @return CustomerSetLastNameAction
     */
    public CustomerSetLastNameAction build() {
        return new CustomerSetLastNameActionImpl(lastName);
    }

    /**
     * builds CustomerSetLastNameAction without checking for non-null required values
     * @return CustomerSetLastNameAction
     */
    public CustomerSetLastNameAction buildUnchecked() {
        return new CustomerSetLastNameActionImpl(lastName);
    }

    /**
     * factory method for an instance of CustomerSetLastNameActionBuilder
     * @return builder
     */
    public static CustomerSetLastNameActionBuilder of() {
        return new CustomerSetLastNameActionBuilder();
    }

    /**
     * create builder for CustomerSetLastNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetLastNameActionBuilder of(final CustomerSetLastNameAction template) {
        CustomerSetLastNameActionBuilder builder = new CustomerSetLastNameActionBuilder();
        builder.lastName = template.getLastName();
        return builder;
    }

}
