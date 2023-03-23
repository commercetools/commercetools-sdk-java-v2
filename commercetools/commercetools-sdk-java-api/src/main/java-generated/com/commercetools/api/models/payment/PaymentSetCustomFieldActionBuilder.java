
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetCustomFieldAction paymentSetCustomFieldAction = PaymentSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetCustomFieldActionBuilder implements Builder<PaymentSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name
     * @return Builder
     */

    public PaymentSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value
     * @return Builder
     */

    public PaymentSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public PaymentSetCustomFieldAction build() {
        Objects.requireNonNull(name, PaymentSetCustomFieldAction.class + ": name is missing");
        return new PaymentSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds PaymentSetCustomFieldAction without checking for non null required values
     */
    public PaymentSetCustomFieldAction buildUnchecked() {
        return new PaymentSetCustomFieldActionImpl(name, value);
    }

    public static PaymentSetCustomFieldActionBuilder of() {
        return new PaymentSetCustomFieldActionBuilder();
    }

    public static PaymentSetCustomFieldActionBuilder of(final PaymentSetCustomFieldAction template) {
        PaymentSetCustomFieldActionBuilder builder = new PaymentSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
