
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomerGroupSetMessagePayload customerGroupSetMessagePayload = CustomerGroupSetMessagePayload.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupSetMessagePayloadBuilder implements Builder<CustomerGroupSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    /**
     *  <p>Reference to a CustomerGroup.</p>
     */

    public CustomerGroupSetMessagePayloadBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a CustomerGroup.</p>
     */

    public CustomerGroupSetMessagePayloadBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    public CustomerGroupSetMessagePayload build() {
        return new CustomerGroupSetMessagePayloadImpl(customerGroup);
    }

    /**
     * builds CustomerGroupSetMessagePayload without checking for non null required values
     */
    public CustomerGroupSetMessagePayload buildUnchecked() {
        return new CustomerGroupSetMessagePayloadImpl(customerGroup);
    }

    public static CustomerGroupSetMessagePayloadBuilder of() {
        return new CustomerGroupSetMessagePayloadBuilder();
    }

    public static CustomerGroupSetMessagePayloadBuilder of(final CustomerGroupSetMessagePayload template) {
        CustomerGroupSetMessagePayloadBuilder builder = new CustomerGroupSetMessagePayloadBuilder();
        builder.customerGroup = template.getCustomerGroup();
        return builder;
    }

}
