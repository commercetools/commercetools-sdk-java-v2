
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adding a Custom Field to a Business Unit generates the BusinessUnitCustomFieldAdded Message, removing one generates the BusinessUnitCustomFieldRemoved Message, and updating an existing one generates the BusinessUnitCustomFieldChanged Message.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("setCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetCustomFieldActionImpl.class)
public interface BusinessUnitSetCustomFieldAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitSetCustomFieldAction
     */
    String SET_CUSTOM_FIELD = "setCustomField";

    /**
     *  <p>Name of the Custom Field to add, update, or remove.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field to add, update, or remove.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of BusinessUnitSetCustomFieldAction
     */
    public static BusinessUnitSetCustomFieldAction of() {
        return new BusinessUnitSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitSetCustomFieldAction of(final BusinessUnitSetCustomFieldAction template) {
        BusinessUnitSetCustomFieldActionImpl instance = new BusinessUnitSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public BusinessUnitSetCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitSetCustomFieldAction deepCopy(@Nullable final BusinessUnitSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitSetCustomFieldActionImpl instance = new BusinessUnitSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitSetCustomFieldAction
     * @return builder
     */
    public static BusinessUnitSetCustomFieldActionBuilder builder() {
        return BusinessUnitSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetCustomFieldActionBuilder builder(final BusinessUnitSetCustomFieldAction template) {
        return BusinessUnitSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitSetCustomFieldAction(Function<BusinessUnitSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static BusinessUnitSetCustomFieldAction ofUnset(final String name) {
        return BusinessUnitSetCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetCustomFieldAction>";
            }
        };
    }
}
