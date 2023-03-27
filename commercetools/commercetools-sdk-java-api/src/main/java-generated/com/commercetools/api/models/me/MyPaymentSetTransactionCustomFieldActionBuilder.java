
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
     * @param name value to be set
     * @return Builder
     */

    public MyPaymentSetTransactionCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public MyPaymentSetTransactionCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds MyPaymentSetTransactionCustomFieldAction with checking for non-null required values
     * @return MyPaymentSetTransactionCustomFieldAction
     */
    public MyPaymentSetTransactionCustomFieldAction build() {
        Objects.requireNonNull(name, MyPaymentSetTransactionCustomFieldAction.class + ": name is missing");
        return new MyPaymentSetTransactionCustomFieldActionImpl(name, value);
    }

    /**
     * builds MyPaymentSetTransactionCustomFieldAction without checking for non-null required values
     * @return MyPaymentSetTransactionCustomFieldAction
     */
    public MyPaymentSetTransactionCustomFieldAction buildUnchecked() {
        return new MyPaymentSetTransactionCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of MyPaymentSetTransactionCustomFieldActionBuilder
     * @return builder
     */
    public static MyPaymentSetTransactionCustomFieldActionBuilder of() {
        return new MyPaymentSetTransactionCustomFieldActionBuilder();
    }

    /**
     * create builder for MyPaymentSetTransactionCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentSetTransactionCustomFieldActionBuilder of(
            final MyPaymentSetTransactionCustomFieldAction template) {
        MyPaymentSetTransactionCustomFieldActionBuilder builder = new MyPaymentSetTransactionCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
