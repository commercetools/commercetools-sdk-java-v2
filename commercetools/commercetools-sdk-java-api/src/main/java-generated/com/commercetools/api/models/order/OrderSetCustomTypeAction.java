
package com.commercetools.api.models.order;

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
 * OrderSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomTypeAction orderSetCustomTypeAction = OrderSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetCustomTypeActionImpl.class)
public interface OrderSetCustomTypeAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the Order with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Order.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Order.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the Order with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Order.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the Order.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of OrderSetCustomTypeAction
     */
    public static OrderSetCustomTypeAction of() {
        return new OrderSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetCustomTypeAction of(final OrderSetCustomTypeAction template) {
        OrderSetCustomTypeActionImpl instance = new OrderSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public OrderSetCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of OrderSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetCustomTypeAction deepCopy(@Nullable final OrderSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        OrderSetCustomTypeActionImpl instance = new OrderSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for OrderSetCustomTypeAction
     * @return builder
     */
    public static OrderSetCustomTypeActionBuilder builder() {
        return OrderSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for OrderSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetCustomTypeActionBuilder builder(final OrderSetCustomTypeAction template) {
        return OrderSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetCustomTypeAction(Function<OrderSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetCustomTypeAction>";
            }
        };
    }
}
