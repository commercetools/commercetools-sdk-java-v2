package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartRemoveItemShippingAddressActionImpl;

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
 *  <p>An address can only be removed if it is not referenced in any ItemShippingTarget of the Cart.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartRemoveItemShippingAddressAction myCartRemoveItemShippingAddressAction = MyCartRemoveItemShippingAddressAction.builder()
 *             .addressKey("{addressKey}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = MyCartRemoveItemShippingAddressActionImpl.class)
public interface MyCartRemoveItemShippingAddressAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartRemoveItemShippingAddressAction
     */
    String REMOVE_ITEM_SHIPPING_ADDRESS = "removeItemShippingAddress";

    /**
     *  <p><code>key</code> of the Address to remove from <code>itemShippingAddresses</code>.</p>
     * @return addressKey
     */
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p><code>key</code> of the Address to remove from <code>itemShippingAddresses</code>.</p>
     * @param addressKey value to be set
     */
    
    public void setAddressKey(final String addressKey);
    

    /**
     * factory method
     * @return instance of MyCartRemoveItemShippingAddressAction
     */
    public static MyCartRemoveItemShippingAddressAction of(){
        return new MyCartRemoveItemShippingAddressActionImpl();
    }
    

    /**
     * factory method to create a shallow copy MyCartRemoveItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartRemoveItemShippingAddressAction of(final MyCartRemoveItemShippingAddressAction template) {
        MyCartRemoveItemShippingAddressActionImpl instance = new MyCartRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCartRemoveItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartRemoveItemShippingAddressAction deepCopy(@Nullable final MyCartRemoveItemShippingAddressAction template) {
        if (template == null) {
            return null;
        }
        MyCartRemoveItemShippingAddressActionImpl instance = new MyCartRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for MyCartRemoveItemShippingAddressAction
     * @return builder
     */
    public static MyCartRemoveItemShippingAddressActionBuilder builder() {
        return MyCartRemoveItemShippingAddressActionBuilder.of();
    }
    
    /**
     * create builder for MyCartRemoveItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartRemoveItemShippingAddressActionBuilder builder(final MyCartRemoveItemShippingAddressAction template) {
        return MyCartRemoveItemShippingAddressActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartRemoveItemShippingAddressAction(Function<MyCartRemoveItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartRemoveItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartRemoveItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartRemoveItemShippingAddressAction>";
            }
        };
    }
}
