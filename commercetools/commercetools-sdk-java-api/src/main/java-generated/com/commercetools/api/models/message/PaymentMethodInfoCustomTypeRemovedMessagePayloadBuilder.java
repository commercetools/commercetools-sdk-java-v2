
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoCustomTypeRemovedMessagePayload paymentMethodInfoCustomTypeRemovedMessagePayload = PaymentMethodInfoCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder
        implements Builder<PaymentMethodInfoCustomTypeRemovedMessagePayload> {

    @Nullable
    private String oldTypeId;

    /**
     *  <p><code>id</code> of the Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder oldTypeId(@Nullable final String oldTypeId) {
        this.oldTypeId = oldTypeId;
        return this;
    }

    /**
     *  <p><code>id</code> of the Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @Nullable
    public String getOldTypeId() {
        return this.oldTypeId;
    }

    /**
     * builds PaymentMethodInfoCustomTypeRemovedMessagePayload with checking for non-null required values
     * @return PaymentMethodInfoCustomTypeRemovedMessagePayload
     */
    public PaymentMethodInfoCustomTypeRemovedMessagePayload build() {
        return new PaymentMethodInfoCustomTypeRemovedMessagePayloadImpl(oldTypeId);
    }

    /**
     * builds PaymentMethodInfoCustomTypeRemovedMessagePayload without checking for non-null required values
     * @return PaymentMethodInfoCustomTypeRemovedMessagePayload
     */
    public PaymentMethodInfoCustomTypeRemovedMessagePayload buildUnchecked() {
        return new PaymentMethodInfoCustomTypeRemovedMessagePayloadImpl(oldTypeId);
    }

    /**
     * factory method for an instance of PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder of() {
        return new PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodInfoCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder of(
            final PaymentMethodInfoCustomTypeRemovedMessagePayload template) {
        PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder builder = new PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder();
        builder.oldTypeId = template.getOldTypeId();
        return builder;
    }

}
