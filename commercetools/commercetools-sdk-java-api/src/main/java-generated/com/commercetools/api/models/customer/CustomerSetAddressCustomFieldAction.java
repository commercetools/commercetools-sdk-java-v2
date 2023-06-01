package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.customer.CustomerSetAddressCustomFieldActionImpl;

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
 * CustomerSetAddressCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetAddressCustomFieldAction customerSetAddressCustomFieldAction = CustomerSetAddressCustomFieldAction.builder()
 *             .addressId("{addressId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomerSetAddressCustomFieldActionImpl.class)
public interface CustomerSetAddressCustomFieldAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetAddressCustomFieldAction
     */
    String SET_ADDRESS_CUSTOM_FIELD = "setAddressCustomField";

    /**
     *  <p>User-defined unique identifier of the Address to be updated.</p>
     * @return addressId
     */
    @NotNull
    @JsonProperty("addressId")
    public String getAddressId();
    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an InvalidOperation error.</p>
     * @return value
     */
    
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>User-defined unique identifier of the Address to be updated.</p>
     * @param addressId value to be set
     */
    
    public void setAddressId(final String addressId);
    
    
    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */
    
    public void setName(final String name);
    
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an InvalidOperation error.</p>
     * @param value value to be set
     */
    
    public void setValue(final Object value);
    

    /**
     * factory method
     * @return instance of CustomerSetAddressCustomFieldAction
     */
    public static CustomerSetAddressCustomFieldAction of(){
        return new CustomerSetAddressCustomFieldActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomerSetAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetAddressCustomFieldAction of(final CustomerSetAddressCustomFieldAction template) {
        CustomerSetAddressCustomFieldActionImpl instance = new CustomerSetAddressCustomFieldActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerSetAddressCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetAddressCustomFieldAction deepCopy(@Nullable final CustomerSetAddressCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetAddressCustomFieldActionImpl instance = new CustomerSetAddressCustomFieldActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CustomerSetAddressCustomFieldAction
     * @return builder
     */
    public static CustomerSetAddressCustomFieldActionBuilder builder() {
        return CustomerSetAddressCustomFieldActionBuilder.of();
    }
    
    /**
     * create builder for CustomerSetAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetAddressCustomFieldActionBuilder builder(final CustomerSetAddressCustomFieldAction template) {
        return CustomerSetAddressCustomFieldActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetAddressCustomFieldAction(Function<CustomerSetAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
    public static CustomerSetAddressCustomFieldAction ofUnset(final String name) {
        return CustomerSetAddressCustomFieldActionBuilder.of().name(name).build();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetAddressCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetAddressCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetAddressCustomFieldAction>";
            }
        };
    }
}
