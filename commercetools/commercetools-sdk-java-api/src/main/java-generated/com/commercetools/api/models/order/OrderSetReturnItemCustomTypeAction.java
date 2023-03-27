
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
 * OrderSetReturnItemCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetReturnItemCustomTypeAction orderSetReturnItemCustomTypeAction = OrderSetReturnItemCustomTypeAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetReturnItemCustomTypeActionImpl.class)
public interface OrderSetReturnItemCustomTypeAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetReturnItemCustomTypeAction
     */
    String SET_RETURN_ITEM_CUSTOM_TYPE = "setReturnItemCustomType";

    /**
     *
     * @return returnItemId
     */
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

    /**
     *  <p>Defines the Type that extends the ReturnItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ReturnItem.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the ReturnItem.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     * set returnItemId
     * @param returnItemId value to be set
     */

    public void setReturnItemId(final String returnItemId);

    /**
     *  <p>Defines the Type that extends the ReturnItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ReturnItem.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the ReturnItem.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of OrderSetReturnItemCustomTypeAction
     */
    public static OrderSetReturnItemCustomTypeAction of() {
        return new OrderSetReturnItemCustomTypeActionImpl();
    }

    /**
     * factory method to copy an instance of OrderSetReturnItemCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetReturnItemCustomTypeAction of(final OrderSetReturnItemCustomTypeAction template) {
        OrderSetReturnItemCustomTypeActionImpl instance = new OrderSetReturnItemCustomTypeActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * builder factory method for OrderSetReturnItemCustomTypeAction
     * @return builder
     */
    public static OrderSetReturnItemCustomTypeActionBuilder builder() {
        return OrderSetReturnItemCustomTypeActionBuilder.of();
    }

    /**
     * create builder for OrderSetReturnItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetReturnItemCustomTypeActionBuilder builder(final OrderSetReturnItemCustomTypeAction template) {
        return OrderSetReturnItemCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetReturnItemCustomTypeAction(Function<OrderSetReturnItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetReturnItemCustomTypeAction>";
            }
        };
    }
}
