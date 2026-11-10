
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodCustomFieldAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodCustomFieldAddedMessagePayload paymentMethodCustomFieldAddedMessagePayload = PaymentMethodCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodCustomFieldAddedMessagePayloadBuilder
        implements Builder<PaymentMethodCustomFieldAddedMessagePayload> {

    private String name;

    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentMethodCustomFieldAddedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The added <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a>.</p>
     * @param value value to be set
     * @return Builder
     */

    public PaymentMethodCustomFieldAddedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>The added <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a>.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds PaymentMethodCustomFieldAddedMessagePayload with checking for non-null required values
     * @return PaymentMethodCustomFieldAddedMessagePayload
     */
    public PaymentMethodCustomFieldAddedMessagePayload build() {
        Objects.requireNonNull(name, PaymentMethodCustomFieldAddedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, PaymentMethodCustomFieldAddedMessagePayload.class + ": value is missing");
        return new PaymentMethodCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * builds PaymentMethodCustomFieldAddedMessagePayload without checking for non-null required values
     * @return PaymentMethodCustomFieldAddedMessagePayload
     */
    public PaymentMethodCustomFieldAddedMessagePayload buildUnchecked() {
        return new PaymentMethodCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * factory method for an instance of PaymentMethodCustomFieldAddedMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodCustomFieldAddedMessagePayloadBuilder of() {
        return new PaymentMethodCustomFieldAddedMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodCustomFieldAddedMessagePayloadBuilder of(
            final PaymentMethodCustomFieldAddedMessagePayload template) {
        PaymentMethodCustomFieldAddedMessagePayloadBuilder builder = new PaymentMethodCustomFieldAddedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
