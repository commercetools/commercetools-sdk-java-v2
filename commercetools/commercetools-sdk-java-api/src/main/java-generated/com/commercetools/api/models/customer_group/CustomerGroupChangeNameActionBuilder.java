
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
     * @param name
     * @return Builder
     */

    public CustomerGroupChangeNameActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public CustomerGroupChangeNameAction build() {
        Objects.requireNonNull(name, CustomerGroupChangeNameAction.class + ": name is missing");
        return new CustomerGroupChangeNameActionImpl(name);
    }

    /**
     * builds CustomerGroupChangeNameAction without checking for non null required values
     */
    public CustomerGroupChangeNameAction buildUnchecked() {
        return new CustomerGroupChangeNameActionImpl(name);
    }

    public static CustomerGroupChangeNameActionBuilder of() {
        return new CustomerGroupChangeNameActionBuilder();
    }

    public static CustomerGroupChangeNameActionBuilder of(final CustomerGroupChangeNameAction template) {
        CustomerGroupChangeNameActionBuilder builder = new CustomerGroupChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
