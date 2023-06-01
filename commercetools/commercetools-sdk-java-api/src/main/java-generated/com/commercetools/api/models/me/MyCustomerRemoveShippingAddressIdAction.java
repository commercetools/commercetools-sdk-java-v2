package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerRemoveShippingAddressIdActionImpl;

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
 *  <p>Removes an existing shipping address from <code>shippingAddressesIds</code>. If the shipping address is the default shipping address, the <code>defaultShippingAddressId</code> is unset. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerRemoveShippingAddressIdAction myCustomerRemoveShippingAddressIdAction = MyCustomerRemoveShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = MyCustomerRemoveShippingAddressIdActionImpl.class)
public interface MyCustomerRemoveShippingAddressIdAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerRemoveShippingAddressIdAction
     */
    String REMOVE_SHIPPING_ADDRESS_ID = "removeShippingAddressId";

    /**
     *  <p><code>id</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @return addressId
     */
    
    @JsonProperty("addressId")
    public String getAddressId();
    /**
     *  <p><code>key</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @return addressKey
     */
    
    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p><code>id</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @param addressId value to be set
     */
    
    public void setAddressId(final String addressId);
    
    
    /**
     *  <p><code>key</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @param addressKey value to be set
     */
    
    public void setAddressKey(final String addressKey);
    

    /**
     * factory method
     * @return instance of MyCustomerRemoveShippingAddressIdAction
     */
    public static MyCustomerRemoveShippingAddressIdAction of(){
        return new MyCustomerRemoveShippingAddressIdActionImpl();
    }
    

    /**
     * factory method to create a shallow copy MyCustomerRemoveShippingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerRemoveShippingAddressIdAction of(final MyCustomerRemoveShippingAddressIdAction template) {
        MyCustomerRemoveShippingAddressIdActionImpl instance = new MyCustomerRemoveShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCustomerRemoveShippingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerRemoveShippingAddressIdAction deepCopy(@Nullable final MyCustomerRemoveShippingAddressIdAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerRemoveShippingAddressIdActionImpl instance = new MyCustomerRemoveShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for MyCustomerRemoveShippingAddressIdAction
     * @return builder
     */
    public static MyCustomerRemoveShippingAddressIdActionBuilder builder() {
        return MyCustomerRemoveShippingAddressIdActionBuilder.of();
    }
    
    /**
     * create builder for MyCustomerRemoveShippingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerRemoveShippingAddressIdActionBuilder builder(final MyCustomerRemoveShippingAddressIdAction template) {
        return MyCustomerRemoveShippingAddressIdActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerRemoveShippingAddressIdAction(Function<MyCustomerRemoveShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerRemoveShippingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerRemoveShippingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerRemoveShippingAddressIdAction>";
            }
        };
    }
}
