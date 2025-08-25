
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Adding or updating a Custom Type on a Recurring Order generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderCustomTypeSetMessage" rel="nofollow">RecurringOrderCustomTypeSet</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderCustomTypeRemovedMessage" rel="nofollow">RecurringOrderCustomTypeRemoved</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetCustomTypeAction recurringOrderSetCustomTypeAction = RecurringOrderSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderSetCustomTypeActionImpl.class)
public interface RecurringOrderSetCustomTypeAction extends RecurringOrderUpdateAction {

    /**
     * discriminator value for RecurringOrderSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the RecurringOrder with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the RecurringOrder.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the RecurringOrder.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the RecurringOrder with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the RecurringOrder.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the RecurringOrder.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of RecurringOrderSetCustomTypeAction
     */
    public static RecurringOrderSetCustomTypeAction of() {
        return new RecurringOrderSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderSetCustomTypeAction of(final RecurringOrderSetCustomTypeAction template) {
        RecurringOrderSetCustomTypeActionImpl instance = new RecurringOrderSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public RecurringOrderSetCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderSetCustomTypeAction deepCopy(
            @Nullable final RecurringOrderSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        RecurringOrderSetCustomTypeActionImpl instance = new RecurringOrderSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for RecurringOrderSetCustomTypeAction
     * @return builder
     */
    public static RecurringOrderSetCustomTypeActionBuilder builder() {
        return RecurringOrderSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for RecurringOrderSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetCustomTypeActionBuilder builder(final RecurringOrderSetCustomTypeAction template) {
        return RecurringOrderSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderSetCustomTypeAction(Function<RecurringOrderSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderSetCustomTypeAction>";
            }
        };
    }
}
