package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveParcelFromDeliveryActionImpl;

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
 * StagedOrderRemoveParcelFromDeliveryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveParcelFromDeliveryAction stagedOrderRemoveParcelFromDeliveryAction = StagedOrderRemoveParcelFromDeliveryAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderRemoveParcelFromDeliveryActionImpl.class)
public interface StagedOrderRemoveParcelFromDeliveryAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderRemoveParcelFromDeliveryAction
     */
    String REMOVE_PARCEL_FROM_DELIVERY = "removeParcelFromDelivery";

    /**
     *
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     * set parcelId
     * @param parcelId value to be set
     */
    
    public void setParcelId(final String parcelId);
    

    /**
     * factory method
     * @return instance of StagedOrderRemoveParcelFromDeliveryAction
     */
    public static StagedOrderRemoveParcelFromDeliveryAction of(){
        return new StagedOrderRemoveParcelFromDeliveryActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedOrderRemoveParcelFromDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderRemoveParcelFromDeliveryAction of(final StagedOrderRemoveParcelFromDeliveryAction template) {
        StagedOrderRemoveParcelFromDeliveryActionImpl instance = new StagedOrderRemoveParcelFromDeliveryActionImpl();
        instance.setParcelId(template.getParcelId());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderRemoveParcelFromDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderRemoveParcelFromDeliveryAction deepCopy(@Nullable final StagedOrderRemoveParcelFromDeliveryAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderRemoveParcelFromDeliveryActionImpl instance = new StagedOrderRemoveParcelFromDeliveryActionImpl();
        instance.setParcelId(template.getParcelId());
        return instance;
    }

    /**
     * builder factory method for StagedOrderRemoveParcelFromDeliveryAction
     * @return builder
     */
    public static StagedOrderRemoveParcelFromDeliveryActionBuilder builder() {
        return StagedOrderRemoveParcelFromDeliveryActionBuilder.of();
    }
    
    /**
     * create builder for StagedOrderRemoveParcelFromDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderRemoveParcelFromDeliveryActionBuilder builder(final StagedOrderRemoveParcelFromDeliveryAction template) {
        return StagedOrderRemoveParcelFromDeliveryActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderRemoveParcelFromDeliveryAction(Function<StagedOrderRemoveParcelFromDeliveryAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveParcelFromDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveParcelFromDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderRemoveParcelFromDeliveryAction>";
            }
        };
    }
}
