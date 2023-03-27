
package com.commercetools.api.models.customer_group;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupChangeNameAction customerGroupChangeNameAction = CustomerGroupChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupChangeNameActionBuilder implements Builder<CustomerGroupChangeNameAction> {

    private String name;

    /**
     *  <p>New name of the CustomerGroup.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomerGroupChangeNameActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>New name of the CustomerGroup.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds CustomerGroupChangeNameAction with checking for non-null required values
     * @return CustomerGroupChangeNameAction
     */
    public CustomerGroupChangeNameAction build() {
        Objects.requireNonNull(name, CustomerGroupChangeNameAction.class + ": name is missing");
        return new CustomerGroupChangeNameActionImpl(name);
    }

    /**
     * builds CustomerGroupChangeNameAction without checking for non-null required values
     * @return CustomerGroupChangeNameAction
     */
    public CustomerGroupChangeNameAction buildUnchecked() {
        return new CustomerGroupChangeNameActionImpl(name);
    }

    /**
     * factory method for an instance of CustomerGroupChangeNameActionBuilder
     * @return builder
     */
    public static CustomerGroupChangeNameActionBuilder of() {
        return new CustomerGroupChangeNameActionBuilder();
    }

    /**
     * create builder for CustomerGroupChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupChangeNameActionBuilder of(final CustomerGroupChangeNameAction template) {
        CustomerGroupChangeNameActionBuilder builder = new CustomerGroupChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
