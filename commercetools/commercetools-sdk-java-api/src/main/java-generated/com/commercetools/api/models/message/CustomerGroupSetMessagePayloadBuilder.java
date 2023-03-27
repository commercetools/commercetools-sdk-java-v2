
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupSetMessagePayload customerGroupSetMessagePayload = CustomerGroupSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupSetMessagePayloadBuilder implements Builder<CustomerGroupSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    /**
     *  <p>Customer Group that was set during the Set Customer Group update action.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public CustomerGroupSetMessagePayloadBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Customer Group that was set during the Set Customer Group update action.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public CustomerGroupSetMessagePayloadBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Customer Group that was set during the Set Customer Group update action.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     * builds CustomerGroupSetMessagePayload with checking for non-null required values
     * @return CustomerGroupSetMessagePayload
     */
    public CustomerGroupSetMessagePayload build() {
        return new CustomerGroupSetMessagePayloadImpl(customerGroup);
    }

    /**
     * builds CustomerGroupSetMessagePayload without checking for non-null required values
     * @return CustomerGroupSetMessagePayload
     */
    public CustomerGroupSetMessagePayload buildUnchecked() {
        return new CustomerGroupSetMessagePayloadImpl(customerGroup);
    }

    /**
     * factory method for an instance of CustomerGroupSetMessagePayloadBuilder
     * @return builder
     */
    public static CustomerGroupSetMessagePayloadBuilder of() {
        return new CustomerGroupSetMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerGroupSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupSetMessagePayloadBuilder of(final CustomerGroupSetMessagePayload template) {
        CustomerGroupSetMessagePayloadBuilder builder = new CustomerGroupSetMessagePayloadBuilder();
        builder.customerGroup = template.getCustomerGroup();
        return builder;
    }

}
