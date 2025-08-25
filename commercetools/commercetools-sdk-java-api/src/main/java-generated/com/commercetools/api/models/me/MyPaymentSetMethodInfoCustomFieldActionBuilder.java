
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentSetMethodInfoCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetMethodInfoCustomFieldAction myPaymentSetMethodInfoCustomFieldAction = MyPaymentSetMethodInfoCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentSetMethodInfoCustomFieldActionBuilder
        implements Builder<MyPaymentSetMethodInfoCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public MyPaymentSetMethodInfoCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param value value to be set
     * @return Builder
     */

    public MyPaymentSetMethodInfoCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds MyPaymentSetMethodInfoCustomFieldAction with checking for non-null required values
     * @return MyPaymentSetMethodInfoCustomFieldAction
     */
    public MyPaymentSetMethodInfoCustomFieldAction build() {
        Objects.requireNonNull(name, MyPaymentSetMethodInfoCustomFieldAction.class + ": name is missing");
        return new MyPaymentSetMethodInfoCustomFieldActionImpl(name, value);
    }

    /**
     * builds MyPaymentSetMethodInfoCustomFieldAction without checking for non-null required values
     * @return MyPaymentSetMethodInfoCustomFieldAction
     */
    public MyPaymentSetMethodInfoCustomFieldAction buildUnchecked() {
        return new MyPaymentSetMethodInfoCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of MyPaymentSetMethodInfoCustomFieldActionBuilder
     * @return builder
     */
    public static MyPaymentSetMethodInfoCustomFieldActionBuilder of() {
        return new MyPaymentSetMethodInfoCustomFieldActionBuilder();
    }

    /**
     * create builder for MyPaymentSetMethodInfoCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentSetMethodInfoCustomFieldActionBuilder of(
            final MyPaymentSetMethodInfoCustomFieldAction template) {
        MyPaymentSetMethodInfoCustomFieldActionBuilder builder = new MyPaymentSetMethodInfoCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
