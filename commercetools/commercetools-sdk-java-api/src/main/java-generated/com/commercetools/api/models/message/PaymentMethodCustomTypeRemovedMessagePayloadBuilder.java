
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodCustomTypeRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodCustomTypeRemovedMessagePayload paymentMethodCustomTypeRemovedMessagePayload = PaymentMethodCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodCustomTypeRemovedMessagePayloadBuilder
        implements Builder<PaymentMethodCustomTypeRemovedMessagePayload> {

    @Nullable
    private String oldTypeId;

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     * @return Builder
     */

    public PaymentMethodCustomTypeRemovedMessagePayloadBuilder oldTypeId(@Nullable final String oldTypeId) {
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
     * builds PaymentMethodCustomTypeRemovedMessagePayload with checking for non-null required values
     * @return PaymentMethodCustomTypeRemovedMessagePayload
     */
    public PaymentMethodCustomTypeRemovedMessagePayload build() {
        return new PaymentMethodCustomTypeRemovedMessagePayloadImpl(oldTypeId);
    }

    /**
     * builds PaymentMethodCustomTypeRemovedMessagePayload without checking for non-null required values
     * @return PaymentMethodCustomTypeRemovedMessagePayload
     */
    public PaymentMethodCustomTypeRemovedMessagePayload buildUnchecked() {
        return new PaymentMethodCustomTypeRemovedMessagePayloadImpl(oldTypeId);
    }

    /**
     * factory method for an instance of PaymentMethodCustomTypeRemovedMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodCustomTypeRemovedMessagePayloadBuilder of() {
        return new PaymentMethodCustomTypeRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodCustomTypeRemovedMessagePayloadBuilder of(
            final PaymentMethodCustomTypeRemovedMessagePayload template) {
        PaymentMethodCustomTypeRemovedMessagePayloadBuilder builder = new PaymentMethodCustomTypeRemovedMessagePayloadBuilder();
        builder.oldTypeId = template.getOldTypeId();
        return builder;
    }

}
