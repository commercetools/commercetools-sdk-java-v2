
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoCustomFieldAddedMessagePayload paymentMethodInfoCustomFieldAddedMessagePayload = PaymentMethodInfoCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder
        implements Builder<PaymentMethodInfoCustomFieldAddedMessagePayload> {

    private String name;

    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The added <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a>.</p>
     * @param value value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder value(final java.lang.Object value) {
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
     * builds PaymentMethodInfoCustomFieldAddedMessagePayload with checking for non-null required values
     * @return PaymentMethodInfoCustomFieldAddedMessagePayload
     */
    public PaymentMethodInfoCustomFieldAddedMessagePayload build() {
        Objects.requireNonNull(name, PaymentMethodInfoCustomFieldAddedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, PaymentMethodInfoCustomFieldAddedMessagePayload.class + ": value is missing");
        return new PaymentMethodInfoCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * builds PaymentMethodInfoCustomFieldAddedMessagePayload without checking for non-null required values
     * @return PaymentMethodInfoCustomFieldAddedMessagePayload
     */
    public PaymentMethodInfoCustomFieldAddedMessagePayload buildUnchecked() {
        return new PaymentMethodInfoCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * factory method for an instance of PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder of() {
        return new PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodInfoCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder of(
            final PaymentMethodInfoCustomFieldAddedMessagePayload template) {
        PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder builder = new PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
