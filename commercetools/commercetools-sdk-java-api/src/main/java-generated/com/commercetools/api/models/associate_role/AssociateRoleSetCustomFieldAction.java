
package com.commercetools.api.models.associate_role;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * AssociateRoleSetCustomFieldAction
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("setCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleSetCustomFieldActionImpl.class)
public interface AssociateRoleSetCustomFieldAction extends AssociateRoleUpdateAction {

    /**
     * discriminator value for AssociateRoleSetCustomFieldAction
     */
    String SET_CUSTOM_FIELD = "setCustomField";

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperationError error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperationError error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of AssociateRoleSetCustomFieldAction
     */
    public static AssociateRoleSetCustomFieldAction of() {
        return new AssociateRoleSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleSetCustomFieldAction of(final AssociateRoleSetCustomFieldAction template) {
        AssociateRoleSetCustomFieldActionImpl instance = new AssociateRoleSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public AssociateRoleSetCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of AssociateRoleSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleSetCustomFieldAction deepCopy(
            @Nullable final AssociateRoleSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        AssociateRoleSetCustomFieldActionImpl instance = new AssociateRoleSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for AssociateRoleSetCustomFieldAction
     * @return builder
     */
    public static AssociateRoleSetCustomFieldActionBuilder builder() {
        return AssociateRoleSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for AssociateRoleSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleSetCustomFieldActionBuilder builder(final AssociateRoleSetCustomFieldAction template) {
        return AssociateRoleSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleSetCustomFieldAction(Function<AssociateRoleSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleSetCustomFieldAction>";
            }
        };
    }
}
