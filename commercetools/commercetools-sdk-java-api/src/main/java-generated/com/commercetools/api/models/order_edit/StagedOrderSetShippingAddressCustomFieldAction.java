package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressCustomFieldActionImpl;

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
 * StagedOrderSetShippingAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingAddressCustomFieldAction stagedOrderSetShippingAddressCustomFieldAction = StagedOrderSetShippingAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetShippingAddressCustomFieldActionImpl.class)
public interface StagedOrderSetShippingAddressCustomFieldAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetShippingAddressCustomFieldAction
     */
    String SET_SHIPPING_ADDRESS_CUSTOM_FIELD = "setShippingAddressCustomField";

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
     * @return instance of StagedOrderSetShippingAddressCustomFieldAction
     */
    public static StagedOrderSetShippingAddressCustomFieldAction of(){
        return new StagedOrderSetShippingAddressCustomFieldActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedOrderSetShippingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetShippingAddressCustomFieldAction of(final StagedOrderSetShippingAddressCustomFieldAction template) {
        StagedOrderSetShippingAddressCustomFieldActionImpl instance = new StagedOrderSetShippingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetShippingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetShippingAddressCustomFieldAction deepCopy(@Nullable final StagedOrderSetShippingAddressCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetShippingAddressCustomFieldActionImpl instance = new StagedOrderSetShippingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetShippingAddressCustomFieldAction
     * @return builder
     */
    public static StagedOrderSetShippingAddressCustomFieldActionBuilder builder() {
        return StagedOrderSetShippingAddressCustomFieldActionBuilder.of();
    }
    
    /**
     * create builder for StagedOrderSetShippingAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingAddressCustomFieldActionBuilder builder(final StagedOrderSetShippingAddressCustomFieldAction template) {
        return StagedOrderSetShippingAddressCustomFieldActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetShippingAddressCustomFieldAction(Function<StagedOrderSetShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
    public static StagedOrderSetShippingAddressCustomFieldAction ofUnset(final String name) {
        return StagedOrderSetShippingAddressCustomFieldActionBuilder.of().name(name).build();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingAddressCustomFieldAction>";
            }
        };
    }
}
