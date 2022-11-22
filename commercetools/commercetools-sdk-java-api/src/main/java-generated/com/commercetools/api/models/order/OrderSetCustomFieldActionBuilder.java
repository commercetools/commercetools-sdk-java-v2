
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomFieldAction orderSetCustomFieldAction = OrderSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetCustomFieldActionBuilder implements Builder<OrderSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public OrderSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public OrderSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public OrderSetCustomFieldAction build() {
        Objects.requireNonNull(name, OrderSetCustomFieldAction.class + ": name is missing");
        return new OrderSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds OrderSetCustomFieldAction without checking for non null required values
     */
    public OrderSetCustomFieldAction buildUnchecked() {
        return new OrderSetCustomFieldActionImpl(name, value);
    }

    public static OrderSetCustomFieldActionBuilder of() {
        return new OrderSetCustomFieldActionBuilder();
    }

    public static OrderSetCustomFieldActionBuilder of(final OrderSetCustomFieldAction template) {
        OrderSetCustomFieldActionBuilder builder = new OrderSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
