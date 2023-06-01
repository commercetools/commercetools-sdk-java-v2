package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order_edit.StagedOrderSetItemShippingAddressCustomFieldActionImpl;

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
 * StagedOrderSetItemShippingAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetItemShippingAddressCustomFieldAction stagedOrderSetItemShippingAddressCustomFieldAction = StagedOrderSetItemShippingAddressCustomFieldAction.builder()
 *             .addressKey("{addressKey}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetItemShippingAddressCustomFieldActionImpl.class)
public interface StagedOrderSetItemShippingAddressCustomFieldAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetItemShippingAddressCustomFieldAction
     */
    String SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD = "setItemShippingAddressCustomField";

    /**
     *
     * @return addressKey
     */
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();
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
     * set addressKey
     * @param addressKey value to be set
     */
    
    public void setAddressKey(final String addressKey);
    
    
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
     * @return instance of StagedOrderSetItemShippingAddressCustomFieldAction
     */
    public static StagedOrderSetItemShippingAddressCustomFieldAction of(){
        return new StagedOrderSetItemShippingAddressCustomFieldActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedOrderSetItemShippingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetItemShippingAddressCustomFieldAction of(final StagedOrderSetItemShippingAddressCustomFieldAction template) {
        StagedOrderSetItemShippingAddressCustomFieldActionImpl instance = new StagedOrderSetItemShippingAddressCustomFieldActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetItemShippingAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetItemShippingAddressCustomFieldAction deepCopy(@Nullable final StagedOrderSetItemShippingAddressCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetItemShippingAddressCustomFieldActionImpl instance = new StagedOrderSetItemShippingAddressCustomFieldActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetItemShippingAddressCustomFieldAction
     * @return builder
     */
    public static StagedOrderSetItemShippingAddressCustomFieldActionBuilder builder() {
        return StagedOrderSetItemShippingAddressCustomFieldActionBuilder.of();
    }
    
    /**
     * create builder for StagedOrderSetItemShippingAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetItemShippingAddressCustomFieldActionBuilder builder(final StagedOrderSetItemShippingAddressCustomFieldAction template) {
        return StagedOrderSetItemShippingAddressCustomFieldActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetItemShippingAddressCustomFieldAction(Function<StagedOrderSetItemShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
    public static StagedOrderSetItemShippingAddressCustomFieldAction ofUnset(final String name, final String addressKey) {
        return StagedOrderSetItemShippingAddressCustomFieldActionBuilder.of().name(name).addressKey(addressKey).build();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetItemShippingAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetItemShippingAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetItemShippingAddressCustomFieldAction>";
            }
        };
    }
}
