
package com.commercetools.api.models.business_unit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetCustomFieldAction businessUnitSetCustomFieldAction = BusinessUnitSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetCustomFieldActionBuilder implements Builder<BusinessUnitSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name
     * @return Builder
     */

    public BusinessUnitSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value
     * @return Builder
     */

    public BusinessUnitSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public BusinessUnitSetCustomFieldAction build() {
        Objects.requireNonNull(name, BusinessUnitSetCustomFieldAction.class + ": name is missing");
        return new BusinessUnitSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds BusinessUnitSetCustomFieldAction without checking for non null required values
     */
    public BusinessUnitSetCustomFieldAction buildUnchecked() {
        return new BusinessUnitSetCustomFieldActionImpl(name, value);
    }

    public static BusinessUnitSetCustomFieldActionBuilder of() {
        return new BusinessUnitSetCustomFieldActionBuilder();
    }

    public static BusinessUnitSetCustomFieldActionBuilder of(final BusinessUnitSetCustomFieldAction template) {
        BusinessUnitSetCustomFieldActionBuilder builder = new BusinessUnitSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
