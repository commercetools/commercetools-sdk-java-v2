
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentSetTransactionCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetTransactionCustomFieldAction myPaymentSetTransactionCustomFieldAction = MyPaymentSetTransactionCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentSetTransactionCustomFieldActionBuilder
        implements Builder<MyPaymentSetTransactionCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public MyPaymentSetTransactionCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public MyPaymentSetTransactionCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public MyPaymentSetTransactionCustomFieldAction build() {
        Objects.requireNonNull(name, MyPaymentSetTransactionCustomFieldAction.class + ": name is missing");
        return new MyPaymentSetTransactionCustomFieldActionImpl(name, value);
    }

    /**
     * builds MyPaymentSetTransactionCustomFieldAction without checking for non null required values
     */
    public MyPaymentSetTransactionCustomFieldAction buildUnchecked() {
        return new MyPaymentSetTransactionCustomFieldActionImpl(name, value);
    }

    public static MyPaymentSetTransactionCustomFieldActionBuilder of() {
        return new MyPaymentSetTransactionCustomFieldActionBuilder();
    }

    public static MyPaymentSetTransactionCustomFieldActionBuilder of(
            final MyPaymentSetTransactionCustomFieldAction template) {
        MyPaymentSetTransactionCustomFieldActionBuilder builder = new MyPaymentSetTransactionCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
