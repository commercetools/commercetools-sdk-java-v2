
package com.commercetools.api.models.associate_role;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleSetCustomFieldAction associateRoleSetCustomFieldAction = AssociateRoleSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleSetCustomFieldActionBuilder implements Builder<AssociateRoleSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Field</a>.</p>
     * @param name value to be set
     * @return Builder
     */

    public AssociateRoleSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperationError</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public AssociateRoleSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Field</a>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperationError</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds AssociateRoleSetCustomFieldAction with checking for non-null required values
     * @return AssociateRoleSetCustomFieldAction
     */
    public AssociateRoleSetCustomFieldAction build() {
        Objects.requireNonNull(name, AssociateRoleSetCustomFieldAction.class + ": name is missing");
        return new AssociateRoleSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds AssociateRoleSetCustomFieldAction without checking for non-null required values
     * @return AssociateRoleSetCustomFieldAction
     */
    public AssociateRoleSetCustomFieldAction buildUnchecked() {
        return new AssociateRoleSetCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of AssociateRoleSetCustomFieldActionBuilder
     * @return builder
     */
    public static AssociateRoleSetCustomFieldActionBuilder of() {
        return new AssociateRoleSetCustomFieldActionBuilder();
    }

    /**
     * create builder for AssociateRoleSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleSetCustomFieldActionBuilder of(final AssociateRoleSetCustomFieldAction template) {
        AssociateRoleSetCustomFieldActionBuilder builder = new AssociateRoleSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
