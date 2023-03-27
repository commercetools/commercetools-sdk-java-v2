
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetCustomLineItemCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomLineItemCustomTypeAction orderSetCustomLineItemCustomTypeAction = OrderSetCustomLineItemCustomTypeAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetCustomLineItemCustomTypeActionImpl.class)
public interface OrderSetCustomLineItemCustomTypeAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetCustomLineItemCustomTypeAction
     */
    String SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE = "setCustomLineItemCustomType";

    /**
     *
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>Defines the Type that extends the CustomLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomLineItem.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the CustomLineItem.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     * set customLineItemId
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>Defines the Type that extends the CustomLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomLineItem.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the CustomLineItem.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of OrderSetCustomLineItemCustomTypeAction
     */
    public static OrderSetCustomLineItemCustomTypeAction of() {
        return new OrderSetCustomLineItemCustomTypeActionImpl();
    }

    /**
     * factory method to copy an instance of OrderSetCustomLineItemCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetCustomLineItemCustomTypeAction of(final OrderSetCustomLineItemCustomTypeAction template) {
        OrderSetCustomLineItemCustomTypeActionImpl instance = new OrderSetCustomLineItemCustomTypeActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * builder factory method for OrderSetCustomLineItemCustomTypeAction
     * @return builder
     */
    public static OrderSetCustomLineItemCustomTypeActionBuilder builder() {
        return OrderSetCustomLineItemCustomTypeActionBuilder.of();
    }

    /**
     * create builder for OrderSetCustomLineItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetCustomLineItemCustomTypeActionBuilder builder(
            final OrderSetCustomLineItemCustomTypeAction template) {
        return OrderSetCustomLineItemCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetCustomLineItemCustomTypeAction(
            Function<OrderSetCustomLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomLineItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomLineItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetCustomLineItemCustomTypeAction>";
            }
        };
    }
}
