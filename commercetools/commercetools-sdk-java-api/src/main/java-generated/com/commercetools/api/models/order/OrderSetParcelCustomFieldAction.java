
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * OrderSetParcelCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetParcelCustomFieldAction orderSetParcelCustomFieldAction = OrderSetParcelCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetParcelCustomFieldActionImpl.class)
public interface OrderSetParcelCustomFieldAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetParcelCustomFieldAction
     */
    String SET_PARCEL_CUSTOM_FIELD = "setParcelCustomField";

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelId
     */

    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelKey
     */

    @JsonProperty("parcelKey")
    public String getParcelKey();

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelKey value to be set
     */

    public void setParcelKey(final String parcelKey);

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of OrderSetParcelCustomFieldAction
     */
    public static OrderSetParcelCustomFieldAction of() {
        return new OrderSetParcelCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetParcelCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetParcelCustomFieldAction of(final OrderSetParcelCustomFieldAction template) {
        OrderSetParcelCustomFieldActionImpl instance = new OrderSetParcelCustomFieldActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setParcelKey(template.getParcelKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetParcelCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetParcelCustomFieldAction deepCopy(@Nullable final OrderSetParcelCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        OrderSetParcelCustomFieldActionImpl instance = new OrderSetParcelCustomFieldActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setParcelKey(template.getParcelKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for OrderSetParcelCustomFieldAction
     * @return builder
     */
    public static OrderSetParcelCustomFieldActionBuilder builder() {
        return OrderSetParcelCustomFieldActionBuilder.of();
    }

    /**
     * create builder for OrderSetParcelCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetParcelCustomFieldActionBuilder builder(final OrderSetParcelCustomFieldAction template) {
        return OrderSetParcelCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetParcelCustomFieldAction(Function<OrderSetParcelCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static OrderSetParcelCustomFieldAction ofUnset(final String name, final String parcelId) {
        return OrderSetParcelCustomFieldActionBuilder.of().name(name).parcelId(parcelId).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetParcelCustomFieldAction>";
            }
        };
    }
}
