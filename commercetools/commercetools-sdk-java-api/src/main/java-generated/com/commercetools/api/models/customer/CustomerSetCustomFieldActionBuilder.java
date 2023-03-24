
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetCustomFieldAction customerSetCustomFieldAction = CustomerSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetCustomFieldActionBuilder implements Builder<CustomerSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public CustomerSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an InvalidOperation error.</p>
     * @param value value to be set
     * @return Builder
     */

    public CustomerSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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
     * builds CustomerSetCustomFieldAction with checking for non-null required values
     * @return CustomerSetCustomFieldAction
     */
    public CustomerSetCustomFieldAction build() {
        Objects.requireNonNull(name, CustomerSetCustomFieldAction.class + ": name is missing");
        return new CustomerSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds CustomerSetCustomFieldAction without checking for non-null required values
     * @return CustomerSetCustomFieldAction
     */
    public CustomerSetCustomFieldAction buildUnchecked() {
        return new CustomerSetCustomFieldActionImpl(name, value);
    }

    public static CustomerSetCustomFieldActionBuilder of() {
        return new CustomerSetCustomFieldActionBuilder();
    }

    public static CustomerSetCustomFieldActionBuilder of(final CustomerSetCustomFieldAction template) {
        CustomerSetCustomFieldActionBuilder builder = new CustomerSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
