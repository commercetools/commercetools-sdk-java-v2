
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetCustomFieldAction myCustomerSetCustomFieldAction = MyCustomerSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetCustomFieldActionBuilder implements Builder<MyCustomerSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public MyCustomerSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an InvalidOperation error.</p>
     * @param value value to be set
     * @return Builder
     */

    public MyCustomerSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    /**
     * builds MyCustomerSetCustomFieldAction with checking for non-null required values
     * @return MyCustomerSetCustomFieldAction
     */
    public MyCustomerSetCustomFieldAction build() {
        Objects.requireNonNull(name, MyCustomerSetCustomFieldAction.class + ": name is missing");
        return new MyCustomerSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds MyCustomerSetCustomFieldAction without checking for non-null required values
     * @return MyCustomerSetCustomFieldAction
     */
    public MyCustomerSetCustomFieldAction buildUnchecked() {
        return new MyCustomerSetCustomFieldActionImpl(name, value);
    }

    public static MyCustomerSetCustomFieldActionBuilder of() {
        return new MyCustomerSetCustomFieldActionBuilder();
    }

    public static MyCustomerSetCustomFieldActionBuilder of(final MyCustomerSetCustomFieldAction template) {
        MyCustomerSetCustomFieldActionBuilder builder = new MyCustomerSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
