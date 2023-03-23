
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetLineItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetLineItemCustomFieldAction myCartSetLineItemCustomFieldAction = MyCartSetLineItemCustomFieldAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetLineItemCustomFieldActionBuilder implements Builder<MyCartSetLineItemCustomFieldAction> {

    private String lineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @param lineItemId
     * @return Builder
     */

    public MyCartSetLineItemCustomFieldActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name
     * @return Builder
     */

    public MyCartSetLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value
     * @return Builder
     */

    public MyCartSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public MyCartSetLineItemCustomFieldAction build() {
        Objects.requireNonNull(lineItemId, MyCartSetLineItemCustomFieldAction.class + ": lineItemId is missing");
        Objects.requireNonNull(name, MyCartSetLineItemCustomFieldAction.class + ": name is missing");
        return new MyCartSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    /**
     * builds MyCartSetLineItemCustomFieldAction without checking for non null required values
     */
    public MyCartSetLineItemCustomFieldAction buildUnchecked() {
        return new MyCartSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    public static MyCartSetLineItemCustomFieldActionBuilder of() {
        return new MyCartSetLineItemCustomFieldActionBuilder();
    }

    public static MyCartSetLineItemCustomFieldActionBuilder of(final MyCartSetLineItemCustomFieldAction template) {
        MyCartSetLineItemCustomFieldActionBuilder builder = new MyCartSetLineItemCustomFieldActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
