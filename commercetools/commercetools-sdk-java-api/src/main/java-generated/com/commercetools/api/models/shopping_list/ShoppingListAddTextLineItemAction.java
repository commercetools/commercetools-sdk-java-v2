package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.models.shopping_list.ShoppingListAddTextLineItemActionImpl;

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
 * ShoppingListAddTextLineItemAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListAddTextLineItemAction shoppingListAddTextLineItemAction = ShoppingListAddTextLineItemAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ShoppingListAddTextLineItemActionImpl.class)
public interface ShoppingListAddTextLineItemAction extends ShoppingListUpdateAction, com.commercetools.api.models.CustomizableDraft<ShoppingListAddTextLineItemAction> {

    /**
     * discriminator value for ShoppingListAddTextLineItemAction
     */
    String ADD_TEXT_LINE_ITEM = "addTextLineItem";

    /**
     *  <p>Name of the TextLineItem.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();
    /**
     *  <p>Description of the TextLineItem.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();
    /**
     *  <p>Number of entries in the TextLineItem.</p>
     * @return quantity
     */
    
    @JsonProperty("quantity")
    public Long getQuantity();
    /**
     *  <p>Date and time the TextLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @return addedAt
     */
    
    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();
    /**
     *  <p>Custom Fields defined for the TextLineItem.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Name of the TextLineItem.</p>
     * @param name value to be set
     */
    
    public void setName(final LocalizedString name);
    
    
    /**
     *  <p>Description of the TextLineItem.</p>
     * @param description value to be set
     */
    
    public void setDescription(final LocalizedString description);
    
    
    /**
     *  <p>Number of entries in the TextLineItem.</p>
     * @param quantity value to be set
     */
    
    public void setQuantity(final Long quantity);
    
    
    /**
     *  <p>Date and time the TextLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @param addedAt value to be set
     */
    
    public void setAddedAt(final ZonedDateTime addedAt);
    
    
    /**
     *  <p>Custom Fields defined for the TextLineItem.</p>
     * @param custom value to be set
     */
    
    public void setCustom(final CustomFieldsDraft custom);
    

    /**
     * factory method
     * @return instance of ShoppingListAddTextLineItemAction
     */
    public static ShoppingListAddTextLineItemAction of(){
        return new ShoppingListAddTextLineItemActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ShoppingListAddTextLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListAddTextLineItemAction of(final ShoppingListAddTextLineItemAction template) {
        ShoppingListAddTextLineItemActionImpl instance = new ShoppingListAddTextLineItemActionImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShoppingListAddTextLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListAddTextLineItemAction deepCopy(@Nullable final ShoppingListAddTextLineItemAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListAddTextLineItemActionImpl instance = new ShoppingListAddTextLineItemActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListAddTextLineItemAction
     * @return builder
     */
    public static ShoppingListAddTextLineItemActionBuilder builder() {
        return ShoppingListAddTextLineItemActionBuilder.of();
    }
    
    /**
     * create builder for ShoppingListAddTextLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListAddTextLineItemActionBuilder builder(final ShoppingListAddTextLineItemAction template) {
        return ShoppingListAddTextLineItemActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListAddTextLineItemAction(Function<ShoppingListAddTextLineItemAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListAddTextLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListAddTextLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListAddTextLineItemAction>";
            }
        };
    }
}
