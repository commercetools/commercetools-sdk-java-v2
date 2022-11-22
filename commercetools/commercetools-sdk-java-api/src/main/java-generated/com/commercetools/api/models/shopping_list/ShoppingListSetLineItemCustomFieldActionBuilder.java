
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetLineItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetLineItemCustomFieldAction shoppingListSetLineItemCustomFieldAction = ShoppingListSetLineItemCustomFieldAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetLineItemCustomFieldActionBuilder
        implements Builder<ShoppingListSetLineItemCustomFieldAction> {

    private String lineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>The <code>id</code> of the ShoppingListLineItem to update.</p>
     */

    public ShoppingListSetLineItemCustomFieldActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public ShoppingListSetLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public ShoppingListSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public ShoppingListSetLineItemCustomFieldAction build() {
        Objects.requireNonNull(lineItemId, ShoppingListSetLineItemCustomFieldAction.class + ": lineItemId is missing");
        Objects.requireNonNull(name, ShoppingListSetLineItemCustomFieldAction.class + ": name is missing");
        return new ShoppingListSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    /**
     * builds ShoppingListSetLineItemCustomFieldAction without checking for non null required values
     */
    public ShoppingListSetLineItemCustomFieldAction buildUnchecked() {
        return new ShoppingListSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    public static ShoppingListSetLineItemCustomFieldActionBuilder of() {
        return new ShoppingListSetLineItemCustomFieldActionBuilder();
    }

    public static ShoppingListSetLineItemCustomFieldActionBuilder of(
            final ShoppingListSetLineItemCustomFieldAction template) {
        ShoppingListSetLineItemCustomFieldActionBuilder builder = new ShoppingListSetLineItemCustomFieldActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
