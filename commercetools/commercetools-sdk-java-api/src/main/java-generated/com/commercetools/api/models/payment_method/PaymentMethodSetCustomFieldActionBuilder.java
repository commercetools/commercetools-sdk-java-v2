
package com.commercetools.api.models.payment_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetCustomFieldAction paymentMethodSetCustomFieldAction = PaymentMethodSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodSetCustomFieldActionBuilder implements Builder<PaymentMethodSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field to add, update, or remove.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentMethodSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public PaymentMethodSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the Custom Field to add, update, or remove.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds PaymentMethodSetCustomFieldAction with checking for non-null required values
     * @return PaymentMethodSetCustomFieldAction
     */
    public PaymentMethodSetCustomFieldAction build() {
        Objects.requireNonNull(name, PaymentMethodSetCustomFieldAction.class + ": name is missing");
        return new PaymentMethodSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds PaymentMethodSetCustomFieldAction without checking for non-null required values
     * @return PaymentMethodSetCustomFieldAction
     */
    public PaymentMethodSetCustomFieldAction buildUnchecked() {
        return new PaymentMethodSetCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of PaymentMethodSetCustomFieldActionBuilder
     * @return builder
     */
    public static PaymentMethodSetCustomFieldActionBuilder of() {
        return new PaymentMethodSetCustomFieldActionBuilder();
    }

    /**
     * create builder for PaymentMethodSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetCustomFieldActionBuilder of(final PaymentMethodSetCustomFieldAction template) {
        PaymentMethodSetCustomFieldActionBuilder builder = new PaymentMethodSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
