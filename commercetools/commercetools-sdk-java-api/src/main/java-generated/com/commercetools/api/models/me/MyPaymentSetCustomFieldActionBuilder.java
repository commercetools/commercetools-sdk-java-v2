
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetCustomFieldAction myPaymentSetCustomFieldAction = MyPaymentSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentSetCustomFieldActionBuilder implements Builder<MyPaymentSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public MyPaymentSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public MyPaymentSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds MyPaymentSetCustomFieldAction with checking for non-null required values
     * @return MyPaymentSetCustomFieldAction
     */
    public MyPaymentSetCustomFieldAction build() {
        Objects.requireNonNull(name, MyPaymentSetCustomFieldAction.class + ": name is missing");
        return new MyPaymentSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds MyPaymentSetCustomFieldAction without checking for non-null required values
     * @return MyPaymentSetCustomFieldAction
     */
    public MyPaymentSetCustomFieldAction buildUnchecked() {
        return new MyPaymentSetCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of MyPaymentSetCustomFieldActionBuilder
     * @return builder
     */
    public static MyPaymentSetCustomFieldActionBuilder of() {
        return new MyPaymentSetCustomFieldActionBuilder();
    }

    /**
     * create builder for MyPaymentSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentSetCustomFieldActionBuilder of(final MyPaymentSetCustomFieldAction template) {
        MyPaymentSetCustomFieldActionBuilder builder = new MyPaymentSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
