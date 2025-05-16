
package com.commercetools.api.models.me;

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
 *     MyBusinessUnitSetCustomFieldAction myBusinessUnitSetCustomFieldAction = MyBusinessUnitSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitSetCustomFieldActionImpl.class)
public interface MyBusinessUnitSetCustomFieldAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitSetCustomFieldAction
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
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
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
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of MyBusinessUnitSetCustomFieldAction
     */
    public static MyBusinessUnitSetCustomFieldAction of() {
        return new MyBusinessUnitSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitSetCustomFieldAction of(final MyBusinessUnitSetCustomFieldAction template) {
        MyBusinessUnitSetCustomFieldActionImpl instance = new MyBusinessUnitSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public MyBusinessUnitSetCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of MyBusinessUnitSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitSetCustomFieldAction deepCopy(
            @Nullable final MyBusinessUnitSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitSetCustomFieldActionImpl instance = new MyBusinessUnitSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitSetCustomFieldAction
     * @return builder
     */
    public static MyBusinessUnitSetCustomFieldActionBuilder builder() {
        return MyBusinessUnitSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitSetCustomFieldActionBuilder builder(final MyBusinessUnitSetCustomFieldAction template) {
        return MyBusinessUnitSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitSetCustomFieldAction(Function<MyBusinessUnitSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitSetCustomFieldAction>";
            }
        };
    }
}
