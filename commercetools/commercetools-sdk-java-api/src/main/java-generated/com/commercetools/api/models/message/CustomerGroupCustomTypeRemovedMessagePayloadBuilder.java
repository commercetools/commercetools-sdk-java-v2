
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupCustomTypeRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupCustomTypeRemovedMessagePayload customerGroupCustomTypeRemovedMessagePayload = CustomerGroupCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupCustomTypeRemovedMessagePayloadBuilder
        implements Builder<CustomerGroupCustomTypeRemovedMessagePayload> {

    @Nullable
    private String oldTypeId;

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     * @return Builder
     */

    public CustomerGroupCustomTypeRemovedMessagePayloadBuilder oldTypeId(@Nullable final String oldTypeId) {
        this.oldTypeId = oldTypeId;
        return this;
    }

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @Nullable
    public String getOldTypeId() {
        return this.oldTypeId;
    }

    /**
     * builds CustomerGroupCustomTypeRemovedMessagePayload with checking for non-null required values
     * @return CustomerGroupCustomTypeRemovedMessagePayload
     */
    public CustomerGroupCustomTypeRemovedMessagePayload build() {
        return new CustomerGroupCustomTypeRemovedMessagePayloadImpl(oldTypeId);
    }

    /**
     * builds CustomerGroupCustomTypeRemovedMessagePayload without checking for non-null required values
     * @return CustomerGroupCustomTypeRemovedMessagePayload
     */
    public CustomerGroupCustomTypeRemovedMessagePayload buildUnchecked() {
        return new CustomerGroupCustomTypeRemovedMessagePayloadImpl(oldTypeId);
    }

    /**
     * factory method for an instance of CustomerGroupCustomTypeRemovedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerGroupCustomTypeRemovedMessagePayloadBuilder of() {
        return new CustomerGroupCustomTypeRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerGroupCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupCustomTypeRemovedMessagePayloadBuilder of(
            final CustomerGroupCustomTypeRemovedMessagePayload template) {
        CustomerGroupCustomTypeRemovedMessagePayloadBuilder builder = new CustomerGroupCustomTypeRemovedMessagePayloadBuilder();
        builder.oldTypeId = template.getOldTypeId();
        return builder;
    }

}
