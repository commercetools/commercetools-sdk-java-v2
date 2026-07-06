
package com.commercetools.api.models.customer_group;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupSetCustomFieldAction customerGroupSetCustomFieldAction = CustomerGroupSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupSetCustomFieldActionBuilder implements Builder<CustomerGroupSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomerGroupSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public CustomerGroupSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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
     * builds CustomerGroupSetCustomFieldAction with checking for non-null required values
     * @return CustomerGroupSetCustomFieldAction
     */
    public CustomerGroupSetCustomFieldAction build() {
        Objects.requireNonNull(name, CustomerGroupSetCustomFieldAction.class + ": name is missing");
        return new CustomerGroupSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds CustomerGroupSetCustomFieldAction without checking for non-null required values
     * @return CustomerGroupSetCustomFieldAction
     */
    public CustomerGroupSetCustomFieldAction buildUnchecked() {
        return new CustomerGroupSetCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of CustomerGroupSetCustomFieldActionBuilder
     * @return builder
     */
    public static CustomerGroupSetCustomFieldActionBuilder of() {
        return new CustomerGroupSetCustomFieldActionBuilder();
    }

    /**
     * create builder for CustomerGroupSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupSetCustomFieldActionBuilder of(final CustomerGroupSetCustomFieldAction template) {
        CustomerGroupSetCustomFieldActionBuilder builder = new CustomerGroupSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
