
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetCustomFieldAction shoppingListSetCustomFieldAction = ShoppingListSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetCustomFieldActionBuilder implements Builder<ShoppingListSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public ShoppingListSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public ShoppingListSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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
     * builds ShoppingListSetCustomFieldAction with checking for non-null required values
     * @return ShoppingListSetCustomFieldAction
     */
    public ShoppingListSetCustomFieldAction build() {
        Objects.requireNonNull(name, ShoppingListSetCustomFieldAction.class + ": name is missing");
        return new ShoppingListSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds ShoppingListSetCustomFieldAction without checking for non-null required values
     * @return ShoppingListSetCustomFieldAction
     */
    public ShoppingListSetCustomFieldAction buildUnchecked() {
        return new ShoppingListSetCustomFieldActionImpl(name, value);
    }

    public static ShoppingListSetCustomFieldActionBuilder of() {
        return new ShoppingListSetCustomFieldActionBuilder();
    }

    public static ShoppingListSetCustomFieldActionBuilder of(final ShoppingListSetCustomFieldAction template) {
        ShoppingListSetCustomFieldActionBuilder builder = new ShoppingListSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
