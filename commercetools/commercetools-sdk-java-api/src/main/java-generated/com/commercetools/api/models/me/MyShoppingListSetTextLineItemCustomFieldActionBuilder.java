
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListSetTextLineItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetTextLineItemCustomFieldAction myShoppingListSetTextLineItemCustomFieldAction = MyShoppingListSetTextLineItemCustomFieldAction.builder()
 *             .textLineItemId("{textLineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListSetTextLineItemCustomFieldActionBuilder
        implements Builder<MyShoppingListSetTextLineItemCustomFieldAction> {

    private String textLineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @param textLineItemId
     * @return Builder
     */

    public MyShoppingListSetTextLineItemCustomFieldActionBuilder textLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name
     * @return Builder
     */

    public MyShoppingListSetTextLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value
     * @return Builder
     */

    public MyShoppingListSetTextLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public MyShoppingListSetTextLineItemCustomFieldAction build() {
        Objects.requireNonNull(textLineItemId,
            MyShoppingListSetTextLineItemCustomFieldAction.class + ": textLineItemId is missing");
        Objects.requireNonNull(name, MyShoppingListSetTextLineItemCustomFieldAction.class + ": name is missing");
        return new MyShoppingListSetTextLineItemCustomFieldActionImpl(textLineItemId, name, value);
    }

    /**
     * builds MyShoppingListSetTextLineItemCustomFieldAction without checking for non null required values
     */
    public MyShoppingListSetTextLineItemCustomFieldAction buildUnchecked() {
        return new MyShoppingListSetTextLineItemCustomFieldActionImpl(textLineItemId, name, value);
    }

    public static MyShoppingListSetTextLineItemCustomFieldActionBuilder of() {
        return new MyShoppingListSetTextLineItemCustomFieldActionBuilder();
    }

    public static MyShoppingListSetTextLineItemCustomFieldActionBuilder of(
            final MyShoppingListSetTextLineItemCustomFieldAction template) {
        MyShoppingListSetTextLineItemCustomFieldActionBuilder builder = new MyShoppingListSetTextLineItemCustomFieldActionBuilder();
        builder.textLineItemId = template.getTextLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
