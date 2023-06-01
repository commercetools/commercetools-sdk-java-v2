package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveDeliveryActionImpl;

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
 * StagedOrderRemoveDeliveryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveDeliveryAction stagedOrderRemoveDeliveryAction = StagedOrderRemoveDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderRemoveDeliveryActionImpl.class)
public interface StagedOrderRemoveDeliveryAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderRemoveDeliveryAction
     */
    String REMOVE_DELIVERY = "removeDelivery";

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
     * factory method
     * @return instance of StagedOrderRemoveDeliveryAction
     */
    public static StagedOrderRemoveDeliveryAction of(){
        return new StagedOrderRemoveDeliveryActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedOrderRemoveDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderRemoveDeliveryAction of(final StagedOrderRemoveDeliveryAction template) {
        StagedOrderRemoveDeliveryActionImpl instance = new StagedOrderRemoveDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderRemoveDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderRemoveDeliveryAction deepCopy(@Nullable final StagedOrderRemoveDeliveryAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderRemoveDeliveryActionImpl instance = new StagedOrderRemoveDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        return instance;
    }

    /**
     * builder factory method for StagedOrderRemoveDeliveryAction
     * @return builder
     */
    public static StagedOrderRemoveDeliveryActionBuilder builder() {
        return StagedOrderRemoveDeliveryActionBuilder.of();
    }
    
    /**
     * create builder for StagedOrderRemoveDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderRemoveDeliveryActionBuilder builder(final StagedOrderRemoveDeliveryAction template) {
        return StagedOrderRemoveDeliveryActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderRemoveDeliveryAction(Function<StagedOrderRemoveDeliveryAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderRemoveDeliveryAction>";
            }
        };
    }
}
