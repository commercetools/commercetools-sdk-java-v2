
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodCustomFieldChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodCustomFieldChangedMessagePayload paymentMethodCustomFieldChangedMessagePayload = PaymentMethodCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodCustomFieldChangedMessagePayloadBuilder
        implements Builder<PaymentMethodCustomFieldChangedMessagePayload> {

    private String name;

    private java.lang.Object value;

    @Nullable
    private java.lang.Object oldValue;

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentMethodCustomFieldChangedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @param value value to be set
     * @return Builder
     */

    public PaymentMethodCustomFieldChangedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action.</p>
     * @param oldValue value to be set
     * @return Builder
     */

    public PaymentMethodCustomFieldChangedMessagePayloadBuilder oldValue(@Nullable final java.lang.Object oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action.</p>
     * @return oldValue
     */

    @Nullable
    public java.lang.Object getOldValue() {
        return this.oldValue;
    }

    /**
     * builds PaymentMethodCustomFieldChangedMessagePayload with checking for non-null required values
     * @return PaymentMethodCustomFieldChangedMessagePayload
     */
    public PaymentMethodCustomFieldChangedMessagePayload build() {
        Objects.requireNonNull(name, PaymentMethodCustomFieldChangedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, PaymentMethodCustomFieldChangedMessagePayload.class + ": value is missing");
        return new PaymentMethodCustomFieldChangedMessagePayloadImpl(name, value, oldValue);
    }

    /**
     * builds PaymentMethodCustomFieldChangedMessagePayload without checking for non-null required values
     * @return PaymentMethodCustomFieldChangedMessagePayload
     */
    public PaymentMethodCustomFieldChangedMessagePayload buildUnchecked() {
        return new PaymentMethodCustomFieldChangedMessagePayloadImpl(name, value, oldValue);
    }

    /**
     * factory method for an instance of PaymentMethodCustomFieldChangedMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodCustomFieldChangedMessagePayloadBuilder of() {
        return new PaymentMethodCustomFieldChangedMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodCustomFieldChangedMessagePayloadBuilder of(
            final PaymentMethodCustomFieldChangedMessagePayload template) {
        PaymentMethodCustomFieldChangedMessagePayloadBuilder builder = new PaymentMethodCustomFieldChangedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.oldValue = template.getOldValue();
        return builder;
    }

}
