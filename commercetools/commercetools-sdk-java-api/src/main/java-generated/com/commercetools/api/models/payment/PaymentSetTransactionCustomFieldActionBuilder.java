
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetTransactionCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetTransactionCustomFieldAction paymentSetTransactionCustomFieldAction = PaymentSetTransactionCustomFieldAction.builder()
 *             .transactionId("{transactionId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetTransactionCustomFieldActionBuilder implements Builder<PaymentSetTransactionCustomFieldAction> {

    private String transactionId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @param transactionId value to be set
     * @return Builder
     */

    public PaymentSetTransactionCustomFieldActionBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentSetTransactionCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public PaymentSetTransactionCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @return transactionId
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds PaymentSetTransactionCustomFieldAction with checking for non-null required values
     * @return PaymentSetTransactionCustomFieldAction
     */
    public PaymentSetTransactionCustomFieldAction build() {
        Objects.requireNonNull(transactionId,
            PaymentSetTransactionCustomFieldAction.class + ": transactionId is missing");
        Objects.requireNonNull(name, PaymentSetTransactionCustomFieldAction.class + ": name is missing");
        return new PaymentSetTransactionCustomFieldActionImpl(transactionId, name, value);
    }

    /**
     * builds PaymentSetTransactionCustomFieldAction without checking for non-null required values
     * @return PaymentSetTransactionCustomFieldAction
     */
    public PaymentSetTransactionCustomFieldAction buildUnchecked() {
        return new PaymentSetTransactionCustomFieldActionImpl(transactionId, name, value);
    }

    /**
     * factory method for an instance of PaymentSetTransactionCustomFieldActionBuilder
     * @return builder
     */
    public static PaymentSetTransactionCustomFieldActionBuilder of() {
        return new PaymentSetTransactionCustomFieldActionBuilder();
    }

    /**
     * create builder for PaymentSetTransactionCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetTransactionCustomFieldActionBuilder of(
            final PaymentSetTransactionCustomFieldAction template) {
        PaymentSetTransactionCustomFieldActionBuilder builder = new PaymentSetTransactionCustomFieldActionBuilder();
        builder.transactionId = template.getTransactionId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
