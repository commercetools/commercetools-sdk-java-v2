
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetMethodInfoCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoCustomFieldAction paymentSetMethodInfoCustomFieldAction = PaymentSetMethodInfoCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetMethodInfoCustomFieldActionBuilder implements Builder<PaymentSetMethodInfoCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentSetMethodInfoCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an InvalidOperation error.</p>
     * @param value value to be set
     * @return Builder
     */

    public PaymentSetMethodInfoCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an InvalidOperation error.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds PaymentSetMethodInfoCustomFieldAction with checking for non-null required values
     * @return PaymentSetMethodInfoCustomFieldAction
     */
    public PaymentSetMethodInfoCustomFieldAction build() {
        Objects.requireNonNull(name, PaymentSetMethodInfoCustomFieldAction.class + ": name is missing");
        return new PaymentSetMethodInfoCustomFieldActionImpl(name, value);
    }

    /**
     * builds PaymentSetMethodInfoCustomFieldAction without checking for non-null required values
     * @return PaymentSetMethodInfoCustomFieldAction
     */
    public PaymentSetMethodInfoCustomFieldAction buildUnchecked() {
        return new PaymentSetMethodInfoCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of PaymentSetMethodInfoCustomFieldActionBuilder
     * @return builder
     */
    public static PaymentSetMethodInfoCustomFieldActionBuilder of() {
        return new PaymentSetMethodInfoCustomFieldActionBuilder();
    }

    /**
     * create builder for PaymentSetMethodInfoCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetMethodInfoCustomFieldActionBuilder of(
            final PaymentSetMethodInfoCustomFieldAction template) {
        PaymentSetMethodInfoCustomFieldActionBuilder builder = new PaymentSetMethodInfoCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
