
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitSetCustomFieldAction myBusinessUnitSetCustomFieldAction = MyBusinessUnitSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitSetCustomFieldActionBuilder implements Builder<MyBusinessUnitSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public MyBusinessUnitSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public MyBusinessUnitSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public MyBusinessUnitSetCustomFieldAction build() {
        Objects.requireNonNull(name, MyBusinessUnitSetCustomFieldAction.class + ": name is missing");
        return new MyBusinessUnitSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds MyBusinessUnitSetCustomFieldAction without checking for non null required values
     */
    public MyBusinessUnitSetCustomFieldAction buildUnchecked() {
        return new MyBusinessUnitSetCustomFieldActionImpl(name, value);
    }

    public static MyBusinessUnitSetCustomFieldActionBuilder of() {
        return new MyBusinessUnitSetCustomFieldActionBuilder();
    }

    public static MyBusinessUnitSetCustomFieldActionBuilder of(final MyBusinessUnitSetCustomFieldAction template) {
        MyBusinessUnitSetCustomFieldActionBuilder builder = new MyBusinessUnitSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
