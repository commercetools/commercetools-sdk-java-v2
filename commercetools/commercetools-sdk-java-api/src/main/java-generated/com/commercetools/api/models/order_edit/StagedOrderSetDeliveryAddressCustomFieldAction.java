package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressCustomFieldActionImpl;

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
 * StagedOrderSetDeliveryAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryAddressCustomFieldAction stagedOrderSetDeliveryAddressCustomFieldAction = StagedOrderSetDeliveryAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetDeliveryAddressCustomFieldActionImpl.class)
public interface StagedOrderSetDeliveryAddressCustomFieldAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetDeliveryAddressCustomFieldAction
     */
    String SET_DELIVERY_ADDRESS_CUSTOM_FIELD = "setDeliveryAddressCustomField";

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryId
     */
    
    @JsonProperty("deliveryId")
    public String getDeliveryId();
    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryKey
     */
    
    @JsonProperty("deliveryKey")
    public String getDeliveryKey();
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
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryId value to be set
     */
    
    public void setDeliveryId(final String deliveryId);
    
    
    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryKey value to be set
     */
    
    public void setDeliveryKey(final String deliveryKey);
    
    
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
     * @return instance of StagedOrderSetDeliveryAddressCustomFieldAction
     */
    public static StagedOrderSetDeliveryAddressCustomFieldAction of(){
        return new StagedOrderSetDeliveryAddressCustomFieldActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedOrderSetDeliveryAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetDeliveryAddressCustomFieldAction of(final StagedOrderSetDeliveryAddressCustomFieldAction template) {
        StagedOrderSetDeliveryAddressCustomFieldActionImpl instance = new StagedOrderSetDeliveryAddressCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetDeliveryAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetDeliveryAddressCustomFieldAction deepCopy(@Nullable final StagedOrderSetDeliveryAddressCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetDeliveryAddressCustomFieldActionImpl instance = new StagedOrderSetDeliveryAddressCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetDeliveryAddressCustomFieldAction
     * @return builder
     */
    public static StagedOrderSetDeliveryAddressCustomFieldActionBuilder builder() {
        return StagedOrderSetDeliveryAddressCustomFieldActionBuilder.of();
    }
    
    /**
     * create builder for StagedOrderSetDeliveryAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetDeliveryAddressCustomFieldActionBuilder builder(final StagedOrderSetDeliveryAddressCustomFieldAction template) {
        return StagedOrderSetDeliveryAddressCustomFieldActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetDeliveryAddressCustomFieldAction(Function<StagedOrderSetDeliveryAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
    public static StagedOrderSetDeliveryAddressCustomFieldAction ofUnset(final String name, final String deliveryId) {
        return StagedOrderSetDeliveryAddressCustomFieldActionBuilder.of().name(name).deliveryId(deliveryId).build();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetDeliveryAddressCustomFieldAction>";
            }
        };
    }
}
