
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoCustomFieldChangedMessagePayload paymentMethodInfoCustomFieldChangedMessagePayload = PaymentMethodInfoCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder
        implements Builder<PaymentMethodInfoCustomFieldChangedMessagePayload> {

    private String name;

    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @param value value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds PaymentMethodInfoCustomFieldChangedMessagePayload with checking for non-null required values
     * @return PaymentMethodInfoCustomFieldChangedMessagePayload
     */
    public PaymentMethodInfoCustomFieldChangedMessagePayload build() {
        Objects.requireNonNull(name, PaymentMethodInfoCustomFieldChangedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, PaymentMethodInfoCustomFieldChangedMessagePayload.class + ": value is missing");
        return new PaymentMethodInfoCustomFieldChangedMessagePayloadImpl(name, value);
    }

    /**
     * builds PaymentMethodInfoCustomFieldChangedMessagePayload without checking for non-null required values
     * @return PaymentMethodInfoCustomFieldChangedMessagePayload
     */
    public PaymentMethodInfoCustomFieldChangedMessagePayload buildUnchecked() {
        return new PaymentMethodInfoCustomFieldChangedMessagePayloadImpl(name, value);
    }

    /**
     * factory method for an instance of PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder of() {
        return new PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodInfoCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder of(
            final PaymentMethodInfoCustomFieldChangedMessagePayload template) {
        PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder builder = new PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
