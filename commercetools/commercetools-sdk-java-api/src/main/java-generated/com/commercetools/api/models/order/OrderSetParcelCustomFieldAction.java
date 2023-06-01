package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order.OrderSetParcelCustomFieldActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * OrderSetParcelCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetParcelCustomFieldAction orderSetParcelCustomFieldAction = OrderSetParcelCustomFieldAction.builder()
 *             .parcelId("{parcelId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderSetParcelCustomFieldActionImpl.class)
public interface OrderSetParcelCustomFieldAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetParcelCustomFieldAction
     */
    String SET_PARCEL_CUSTOM_FIELD = "setParcelCustomField";

    /**
     *
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();
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
     * set parcelId
     * @param parcelId value to be set
     */
    
    public void setParcelId(final String parcelId);
    
    
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
    public static OrderSetParcelCustomFieldAction of(){
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
