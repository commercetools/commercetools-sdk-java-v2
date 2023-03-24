
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditSetCustomFieldAction orderEditSetCustomFieldAction = OrderEditSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditSetCustomFieldActionBuilder implements Builder<OrderEditSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public OrderEditSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public OrderEditSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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
     * builds OrderEditSetCustomFieldAction with checking for non-null required values
     * @return OrderEditSetCustomFieldAction
     */
    public OrderEditSetCustomFieldAction build() {
        Objects.requireNonNull(name, OrderEditSetCustomFieldAction.class + ": name is missing");
        return new OrderEditSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds OrderEditSetCustomFieldAction without checking for non-null required values
     * @return OrderEditSetCustomFieldAction
     */
    public OrderEditSetCustomFieldAction buildUnchecked() {
        return new OrderEditSetCustomFieldActionImpl(name, value);
    }

    public static OrderEditSetCustomFieldActionBuilder of() {
        return new OrderEditSetCustomFieldActionBuilder();
    }

    public static OrderEditSetCustomFieldActionBuilder of(final OrderEditSetCustomFieldAction template) {
        OrderEditSetCustomFieldActionBuilder builder = new OrderEditSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
