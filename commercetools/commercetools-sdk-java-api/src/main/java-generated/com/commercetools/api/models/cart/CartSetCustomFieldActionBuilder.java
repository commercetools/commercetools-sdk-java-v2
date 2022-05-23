
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomFieldAction cartSetCustomFieldAction = CartSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomFieldActionBuilder implements Builder<CartSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     <*  <p>Name of the Custom Field.</p>>
     */

    public CartSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     <*  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>>
     */

    public CartSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public CartSetCustomFieldAction build() {
        Objects.requireNonNull(name, CartSetCustomFieldAction.class + ": name is missing");
        return new CartSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds CartSetCustomFieldAction without checking for non null required values
     */
    public CartSetCustomFieldAction buildUnchecked() {
        return new CartSetCustomFieldActionImpl(name, value);
    }

    public static CartSetCustomFieldActionBuilder of() {
        return new CartSetCustomFieldActionBuilder();
    }

    public static CartSetCustomFieldActionBuilder of(final CartSetCustomFieldAction template) {
        CartSetCustomFieldActionBuilder builder = new CartSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
