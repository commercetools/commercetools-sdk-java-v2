package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveItemShippingAddressActionImpl;

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
 * StagedOrderRemoveItemShippingAddressAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveItemShippingAddressAction stagedOrderRemoveItemShippingAddressAction = StagedOrderRemoveItemShippingAddressAction.builder()
 *             .addressKey("{addressKey}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderRemoveItemShippingAddressActionImpl.class)
public interface StagedOrderRemoveItemShippingAddressAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderRemoveItemShippingAddressAction
     */
    String REMOVE_ITEM_SHIPPING_ADDRESS = "removeItemShippingAddress";

    /**
     *
     * @return addressKey
     */
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     * set addressKey
     * @param addressKey value to be set
     */
    
    public void setAddressKey(final String addressKey);
    

    /**
     * factory method
     * @return instance of StagedOrderRemoveItemShippingAddressAction
     */
    public static StagedOrderRemoveItemShippingAddressAction of(){
        return new StagedOrderRemoveItemShippingAddressActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedOrderRemoveItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderRemoveItemShippingAddressAction of(final StagedOrderRemoveItemShippingAddressAction template) {
        StagedOrderRemoveItemShippingAddressActionImpl instance = new StagedOrderRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderRemoveItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderRemoveItemShippingAddressAction deepCopy(@Nullable final StagedOrderRemoveItemShippingAddressAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderRemoveItemShippingAddressActionImpl instance = new StagedOrderRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for StagedOrderRemoveItemShippingAddressAction
     * @return builder
     */
    public static StagedOrderRemoveItemShippingAddressActionBuilder builder() {
        return StagedOrderRemoveItemShippingAddressActionBuilder.of();
    }
    
    /**
     * create builder for StagedOrderRemoveItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderRemoveItemShippingAddressActionBuilder builder(final StagedOrderRemoveItemShippingAddressAction template) {
        return StagedOrderRemoveItemShippingAddressActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderRemoveItemShippingAddressAction(Function<StagedOrderRemoveItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderRemoveItemShippingAddressAction>";
            }
        };
    }
}
