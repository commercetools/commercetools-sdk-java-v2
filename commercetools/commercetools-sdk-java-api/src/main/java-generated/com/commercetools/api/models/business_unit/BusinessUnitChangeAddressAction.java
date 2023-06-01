package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.BusinessUnitUpdateAction;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.business_unit.BusinessUnitChangeAddressActionImpl;

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
 *  <p>Changing the address on a Business Unit generates the BusinessUnitAddressChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeAddressAction businessUnitChangeAddressAction = BusinessUnitChangeAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = BusinessUnitChangeAddressActionImpl.class)
public interface BusinessUnitChangeAddressAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitChangeAddressAction
     */
    String CHANGE_ADDRESS = "changeAddress";

    /**
     *  <p>ID of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */
    
    @JsonProperty("addressId")
    public String getAddressId();
    /**
     *  <p>Key of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */
    
    @JsonProperty("addressKey")
    public String getAddressKey();
    /**
     *  <p>New address to set.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>ID of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     */
    
    public void setAddressId(final String addressId);
    
    
    /**
     *  <p>Key of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     */
    
    public void setAddressKey(final String addressKey);
    
    
    /**
     *  <p>New address to set.</p>
     * @param address value to be set
     */
    
    public void setAddress(final BaseAddress address);
    

    /**
     * factory method
     * @return instance of BusinessUnitChangeAddressAction
     */
    public static BusinessUnitChangeAddressAction of(){
        return new BusinessUnitChangeAddressActionImpl();
    }
    

    /**
     * factory method to create a shallow copy BusinessUnitChangeAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitChangeAddressAction of(final BusinessUnitChangeAddressAction template) {
        BusinessUnitChangeAddressActionImpl instance = new BusinessUnitChangeAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitChangeAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitChangeAddressAction deepCopy(@Nullable final BusinessUnitChangeAddressAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitChangeAddressActionImpl instance = new BusinessUnitChangeAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitChangeAddressAction
     * @return builder
     */
    public static BusinessUnitChangeAddressActionBuilder builder() {
        return BusinessUnitChangeAddressActionBuilder.of();
    }
    
    /**
     * create builder for BusinessUnitChangeAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitChangeAddressActionBuilder builder(final BusinessUnitChangeAddressAction template) {
        return BusinessUnitChangeAddressActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitChangeAddressAction(Function<BusinessUnitChangeAddressAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitChangeAddressAction>";
            }
        };
    }
}
