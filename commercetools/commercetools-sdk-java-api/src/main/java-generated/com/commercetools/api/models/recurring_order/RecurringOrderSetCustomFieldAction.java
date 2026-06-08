
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adding a Custom Field to a Recurring Order generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderCustomFieldAddedMessage" rel="nofollow">RecurringOrderCustomFieldAdded</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderCustomFieldRemovedMessage" rel="nofollow">RecurringOrderCustomFieldRemoved</a> Message, and updating an existing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderCustomFieldChangedMessage" rel="nofollow">RecurringOrderCustomFieldChanged</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetCustomFieldAction recurringOrderSetCustomFieldAction = RecurringOrderSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderSetCustomFieldActionImpl.class)
public interface RecurringOrderSetCustomFieldAction extends RecurringOrderUpdateAction {

    /**
     * discriminator value for RecurringOrderSetCustomFieldAction
     */
    String SET_CUSTOM_FIELD = "setCustomField";

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of RecurringOrderSetCustomFieldAction
     */
    public static RecurringOrderSetCustomFieldAction of() {
        return new RecurringOrderSetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderSetCustomFieldAction of(final RecurringOrderSetCustomFieldAction template) {
        RecurringOrderSetCustomFieldActionImpl instance = new RecurringOrderSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public RecurringOrderSetCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderSetCustomFieldAction deepCopy(
            @Nullable final RecurringOrderSetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        RecurringOrderSetCustomFieldActionImpl instance = new RecurringOrderSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderSetCustomFieldAction
     * @return builder
     */
    public static RecurringOrderSetCustomFieldActionBuilder builder() {
        return RecurringOrderSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for RecurringOrderSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetCustomFieldActionBuilder builder(final RecurringOrderSetCustomFieldAction template) {
        return RecurringOrderSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderSetCustomFieldAction(Function<RecurringOrderSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderSetCustomFieldAction>";
            }
        };
    }
}
