package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryAddQuantityAction;
import com.commercetools.api.models.inventory.InventoryEntryChangeQuantityAction;
import com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityAction;
import com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldAction;
import com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeAction;
import com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryAction;
import com.commercetools.api.models.inventory.InventoryEntrySetKeyAction;
import com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysAction;
import com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelAction;


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
 * InventoryEntryUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryUpdateAction inventoryEntryUpdateAction = InventoryEntryUpdateAction.addQuantityBuilder()
 *             quantity(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntryAddQuantityActionImpl.class, name = InventoryEntryAddQuantityAction.ADD_QUANTITY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntryChangeQuantityActionImpl.class, name = InventoryEntryChangeQuantityAction.CHANGE_QUANTITY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityActionImpl.class, name = InventoryEntryRemoveQuantityAction.REMOVE_QUANTITY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldActionImpl.class, name = InventoryEntrySetCustomFieldAction.SET_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeActionImpl.class, name = InventoryEntrySetCustomTypeAction.SET_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryActionImpl.class, name = InventoryEntrySetExpectedDeliveryAction.SET_EXPECTED_DELIVERY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetKeyActionImpl.class, name = InventoryEntrySetKeyAction.SET_KEY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysActionImpl.class, name = InventoryEntrySetRestockableInDaysAction.SET_RESTOCKABLE_IN_DAYS),
   @JsonSubTypes.Type(value = com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelActionImpl.class, name = InventoryEntrySetSupplyChannelAction.SET_SUPPLY_CHANNEL)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = InventoryEntryUpdateActionImpl.class,
    visible = true
)
@JsonDeserialize(as = InventoryEntryUpdateActionImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface InventoryEntryUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<InventoryEntryUpdateAction> {


    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();




    /**
     * factory method to create a deep copy of InventoryEntryUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryUpdateAction deepCopy(@Nullable final InventoryEntryUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.inventory.InventoryEntryAddQuantityAction) {
            return com.commercetools.api.models.inventory.InventoryEntryAddQuantityAction.deepCopy((com.commercetools.api.models.inventory.InventoryEntryAddQuantityAction)template);
        }
        if (template instanceof com.commercetools.api.models.inventory.InventoryEntryChangeQuantityAction) {
            return com.commercetools.api.models.inventory.InventoryEntryChangeQuantityAction.deepCopy((com.commercetools.api.models.inventory.InventoryEntryChangeQuantityAction)template);
        }
        if (template instanceof com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityAction) {
            return com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityAction.deepCopy((com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityAction)template);
        }
        if (template instanceof com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldAction) {
            return com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldAction.deepCopy((com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeAction) {
            return com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeAction.deepCopy((com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryAction) {
            return com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryAction.deepCopy((com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryAction)template);
        }
        if (template instanceof com.commercetools.api.models.inventory.InventoryEntrySetKeyAction) {
            return com.commercetools.api.models.inventory.InventoryEntrySetKeyAction.deepCopy((com.commercetools.api.models.inventory.InventoryEntrySetKeyAction)template);
        }
        if (template instanceof com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysAction) {
            return com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysAction.deepCopy((com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysAction)template);
        }
        if (template instanceof com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelAction) {
            return com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelAction.deepCopy((com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelAction)template);
        }
        InventoryEntryUpdateActionImpl instance = new InventoryEntryUpdateActionImpl();
        return instance;
    }


    /**
     * builder for addQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntryAddQuantityActionBuilder addQuantityBuilder() {
       return com.commercetools.api.models.inventory.InventoryEntryAddQuantityActionBuilder.of();
    }
    /**
     * builder for changeQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntryChangeQuantityActionBuilder changeQuantityBuilder() {
       return com.commercetools.api.models.inventory.InventoryEntryChangeQuantityActionBuilder.of();
    }
    /**
     * builder for removeQuantity subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityActionBuilder removeQuantityBuilder() {
       return com.commercetools.api.models.inventory.InventoryEntryRemoveQuantityActionBuilder.of();
    }
    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldActionBuilder.of();
    }
    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.inventory.InventoryEntrySetCustomTypeActionBuilder.of();
    }
    /**
     * builder for setExpectedDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryActionBuilder setExpectedDeliveryBuilder() {
       return com.commercetools.api.models.inventory.InventoryEntrySetExpectedDeliveryActionBuilder.of();
    }
    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntrySetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.inventory.InventoryEntrySetKeyActionBuilder.of();
    }
    /**
     * builder for setRestockableInDays subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysActionBuilder setRestockableInDaysBuilder() {
       return com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysActionBuilder.of();
    }
    /**
     * builder for setSupplyChannel subtype
     * @return builder
     */
    public static com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelActionBuilder setSupplyChannelBuilder() {
       return com.commercetools.api.models.inventory.InventoryEntrySetSupplyChannelActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryUpdateAction(Function<InventoryEntryUpdateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryUpdateAction>";
            }
        };
    }
}
