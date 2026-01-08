
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerExternalIdSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerExternalIdSetMessagePayload customerExternalIdSetMessagePayload = CustomerExternalIdSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerExternalIdSetMessagePayloadBuilder implements Builder<CustomerExternalIdSetMessagePayload> {

    @Nullable
    private String externalId;

    /**
     *  <p>The identifier that was set.</p>
     * @param externalId value to be set
     * @return Builder
     */

    public CustomerExternalIdSetMessagePayloadBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>The identifier that was set.</p>
     * @return externalId
     */

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    /**
     * builds CustomerExternalIdSetMessagePayload with checking for non-null required values
     * @return CustomerExternalIdSetMessagePayload
     */
    public CustomerExternalIdSetMessagePayload build() {
        return new CustomerExternalIdSetMessagePayloadImpl(externalId);
    }

    /**
     * builds CustomerExternalIdSetMessagePayload without checking for non-null required values
     * @return CustomerExternalIdSetMessagePayload
     */
    public CustomerExternalIdSetMessagePayload buildUnchecked() {
        return new CustomerExternalIdSetMessagePayloadImpl(externalId);
    }

    /**
     * factory method for an instance of CustomerExternalIdSetMessagePayloadBuilder
     * @return builder
     */
    public static CustomerExternalIdSetMessagePayloadBuilder of() {
        return new CustomerExternalIdSetMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerExternalIdSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerExternalIdSetMessagePayloadBuilder of(final CustomerExternalIdSetMessagePayload template) {
        CustomerExternalIdSetMessagePayloadBuilder builder = new CustomerExternalIdSetMessagePayloadBuilder();
        builder.externalId = template.getExternalId();
        return builder;
    }

}
