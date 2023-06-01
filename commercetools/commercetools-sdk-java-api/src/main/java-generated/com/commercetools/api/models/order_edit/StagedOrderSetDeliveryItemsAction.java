package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetDeliveryItemsActionImpl;

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
 * StagedOrderSetDeliveryItemsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryItemsAction stagedOrderSetDeliveryItemsAction = StagedOrderSetDeliveryItemsAction.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetDeliveryItemsActionImpl.class)
public interface StagedOrderSetDeliveryItemsAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetDeliveryItemsAction
     */
    String SET_DELIVERY_ITEMS = "setDeliveryItems";

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
     *
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

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
     * set items
     * @param items values to be set
     */
    
    @JsonIgnore
    public void setItems(final DeliveryItem ...items);
    /**
     * set items
     * @param items values to be set
     */
    
    public void setItems(final List<DeliveryItem> items);

    /**
     * factory method
     * @return instance of StagedOrderSetDeliveryItemsAction
     */
    public static StagedOrderSetDeliveryItemsAction of(){
        return new StagedOrderSetDeliveryItemsActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedOrderSetDeliveryItemsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetDeliveryItemsAction of(final StagedOrderSetDeliveryItemsAction template) {
        StagedOrderSetDeliveryItemsActionImpl instance = new StagedOrderSetDeliveryItemsActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setItems(template.getItems());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetDeliveryItemsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetDeliveryItemsAction deepCopy(@Nullable final StagedOrderSetDeliveryItemsAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetDeliveryItemsActionImpl instance = new StagedOrderSetDeliveryItemsActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream().map(com.commercetools.api.models.order.DeliveryItem::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetDeliveryItemsAction
     * @return builder
     */
    public static StagedOrderSetDeliveryItemsActionBuilder builder() {
        return StagedOrderSetDeliveryItemsActionBuilder.of();
    }
    
    /**
     * create builder for StagedOrderSetDeliveryItemsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetDeliveryItemsActionBuilder builder(final StagedOrderSetDeliveryItemsAction template) {
        return StagedOrderSetDeliveryItemsActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetDeliveryItemsAction(Function<StagedOrderSetDeliveryItemsAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryItemsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryItemsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetDeliveryItemsAction>";
            }
        };
    }
}
