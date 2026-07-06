
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerCustomTypeRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCustomTypeRemovedMessagePayload customerCustomTypeRemovedMessagePayload = CustomerCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerCustomTypeRemovedMessagePayloadBuilder
        implements Builder<CustomerCustomTypeRemovedMessagePayload> {

    @Nullable
    private String previousTypeId;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     * @return Builder
     */

    public CustomerCustomTypeRemovedMessagePayloadBuilder previousTypeId(@Nullable final String previousTypeId) {
        this.previousTypeId = previousTypeId;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @Nullable
    public String getPreviousTypeId() {
        return this.previousTypeId;
    }

    /**
     * builds CustomerCustomTypeRemovedMessagePayload with checking for non-null required values
     * @return CustomerCustomTypeRemovedMessagePayload
     */
    public CustomerCustomTypeRemovedMessagePayload build() {
        return new CustomerCustomTypeRemovedMessagePayloadImpl(previousTypeId);
    }

    /**
     * builds CustomerCustomTypeRemovedMessagePayload without checking for non-null required values
     * @return CustomerCustomTypeRemovedMessagePayload
     */
    public CustomerCustomTypeRemovedMessagePayload buildUnchecked() {
        return new CustomerCustomTypeRemovedMessagePayloadImpl(previousTypeId);
    }

    /**
     * factory method for an instance of CustomerCustomTypeRemovedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerCustomTypeRemovedMessagePayloadBuilder of() {
        return new CustomerCustomTypeRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCustomTypeRemovedMessagePayloadBuilder of(
            final CustomerCustomTypeRemovedMessagePayload template) {
        CustomerCustomTypeRemovedMessagePayloadBuilder builder = new CustomerCustomTypeRemovedMessagePayloadBuilder();
        builder.previousTypeId = template.getPreviousTypeId();
        return builder;
    }

}
