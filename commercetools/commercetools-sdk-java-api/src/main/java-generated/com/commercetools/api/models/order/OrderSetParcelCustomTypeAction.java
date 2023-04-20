
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetParcelCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetParcelCustomTypeAction orderSetParcelCustomTypeAction = OrderSetParcelCustomTypeAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetParcelCustomTypeActionImpl.class)
public interface OrderSetParcelCustomTypeAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetParcelCustomTypeAction
     */
    String SET_PARCEL_CUSTOM_TYPE = "setParcelCustomType";

    /**
     *
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p>Defines the Type that extends the Parcel with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Parcel.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Parcel.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     * set parcelId
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     *  <p>Defines the Type that extends the Parcel with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Parcel.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the Parcel.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of OrderSetParcelCustomTypeAction
     */
    public static OrderSetParcelCustomTypeAction of() {
        return new OrderSetParcelCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetParcelCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetParcelCustomTypeAction of(final OrderSetParcelCustomTypeAction template) {
        OrderSetParcelCustomTypeActionImpl instance = new OrderSetParcelCustomTypeActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetParcelCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetParcelCustomTypeAction deepCopy(@Nullable final OrderSetParcelCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        OrderSetParcelCustomTypeActionImpl instance = new OrderSetParcelCustomTypeActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for OrderSetParcelCustomTypeAction
     * @return builder
     */
    public static OrderSetParcelCustomTypeActionBuilder builder() {
        return OrderSetParcelCustomTypeActionBuilder.of();
    }

    /**
     * create builder for OrderSetParcelCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetParcelCustomTypeActionBuilder builder(final OrderSetParcelCustomTypeAction template) {
        return OrderSetParcelCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetParcelCustomTypeAction(Function<OrderSetParcelCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetParcelCustomTypeAction>";
            }
        };
    }
}
