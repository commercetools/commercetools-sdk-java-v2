package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.customer.CustomerSetAddressCustomTypeActionImpl;

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
 * CustomerSetAddressCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetAddressCustomTypeAction customerSetAddressCustomTypeAction = CustomerSetAddressCustomTypeAction.builder()
 *             .addressId("{addressId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomerSetAddressCustomTypeActionImpl.class)
public interface CustomerSetAddressCustomTypeAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetAddressCustomTypeAction
     */
    String SET_ADDRESS_CUSTOM_TYPE = "setAddressCustomType";

    /**
     *  <p>User-defined unique identifier of the Address to be updated.</p>
     * @return addressId
     */
    @NotNull
    @JsonProperty("addressId")
    public String getAddressId();
    /**
     *  <p>Defines the Type that extends the <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code>.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>User-defined unique identifier of the Address to be updated.</p>
     * @param addressId value to be set
     */
    
    public void setAddressId(final String addressId);
    
    
    /**
     *  <p>Defines the Type that extends the <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     * @param type value to be set
     */
    
    public void setType(final TypeResourceIdentifier type);
    
    
    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code>.</p>
     * @param fields value to be set
     */
    
    public void setFields(final FieldContainer fields);
    

    /**
     * factory method
     * @return instance of CustomerSetAddressCustomTypeAction
     */
    public static CustomerSetAddressCustomTypeAction of(){
        return new CustomerSetAddressCustomTypeActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomerSetAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetAddressCustomTypeAction of(final CustomerSetAddressCustomTypeAction template) {
        CustomerSetAddressCustomTypeActionImpl instance = new CustomerSetAddressCustomTypeActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerSetAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetAddressCustomTypeAction deepCopy(@Nullable final CustomerSetAddressCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetAddressCustomTypeActionImpl instance = new CustomerSetAddressCustomTypeActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for CustomerSetAddressCustomTypeAction
     * @return builder
     */
    public static CustomerSetAddressCustomTypeActionBuilder builder() {
        return CustomerSetAddressCustomTypeActionBuilder.of();
    }
    
    /**
     * create builder for CustomerSetAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetAddressCustomTypeActionBuilder builder(final CustomerSetAddressCustomTypeAction template) {
        return CustomerSetAddressCustomTypeActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetAddressCustomTypeAction(Function<CustomerSetAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetAddressCustomTypeAction>";
            }
        };
    }
}
