
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   MyShoppingListSetCustomFieldAction myShoppingListSetCustomFieldAction = MyShoppingListSetCustomFieldAction.builder()
           .name("{name}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListSetCustomFieldActionBuilder implements Builder<MyShoppingListSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public MyShoppingListSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public MyShoppingListSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public MyShoppingListSetCustomFieldAction build() {
        Objects.requireNonNull(name, MyShoppingListSetCustomFieldAction.class + ": name is missing");
        return new MyShoppingListSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds MyShoppingListSetCustomFieldAction without checking for non null required values
     */
    public MyShoppingListSetCustomFieldAction buildUnchecked() {
        return new MyShoppingListSetCustomFieldActionImpl(name, value);
    }

    public static MyShoppingListSetCustomFieldActionBuilder of() {
        return new MyShoppingListSetCustomFieldActionBuilder();
    }

    public static MyShoppingListSetCustomFieldActionBuilder of(final MyShoppingListSetCustomFieldAction template) {
        MyShoppingListSetCustomFieldActionBuilder builder = new MyShoppingListSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
