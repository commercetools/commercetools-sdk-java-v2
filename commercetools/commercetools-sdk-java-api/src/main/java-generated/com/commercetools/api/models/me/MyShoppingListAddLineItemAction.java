package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.models.me.MyShoppingListAddLineItemActionImpl;

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
 * MyShoppingListAddLineItemAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListAddLineItemAction myShoppingListAddLineItemAction = MyShoppingListAddLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = MyShoppingListAddLineItemActionImpl.class)
public interface MyShoppingListAddLineItemAction extends MyShoppingListUpdateAction, com.commercetools.api.models.CustomizableDraft<MyShoppingListAddLineItemAction> {

    /**
     * discriminator value for MyShoppingListAddLineItemAction
     */
    String ADD_LINE_ITEM = "addLineItem";

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     * @return sku
     */
    
    @JsonProperty("sku")
    public String getSku();
    /**
     *  <p>Unique identifier of a Product.</p>
     * @return productId
     */
    
    @JsonProperty("productId")
    public String getProductId();
    /**
     *  <p><code>id</code> of the ProductVariant. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @return variantId
     */
    
    @JsonProperty("variantId")
    public Long getVariantId();
    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
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
     *  <p>Custom Fields defined for the ShoppingListLineItem.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     * @param sku value to be set
     */
    
    public void setSku(final String sku);
    
    
    /**
     *  <p>Unique identifier of a Product.</p>
     * @param productId value to be set
     */
    
    public void setProductId(final String productId);
    
    
    /**
     *  <p><code>id</code> of the ProductVariant. If not set, the ShoppingListLineItem refers to the Master Variant.</p>
     * @param variantId value to be set
     */
    
    public void setVariantId(final Long variantId);
    
    
    /**
     *  <p>Number of Products in the ShoppingListLineItem.</p>
     * @param quantity value to be set
     */
    
    public void setQuantity(final Long quantity);
    
    
    /**
     *  <p>Date and time the TextLineItem is added to the ShoppingList. If not set, the current date and time (UTC) is used.</p>
     * @param addedAt value to be set
     */
    
    public void setAddedAt(final ZonedDateTime addedAt);
    
    
    /**
     *  <p>Custom Fields defined for the ShoppingListLineItem.</p>
     * @param custom value to be set
     */
    
    public void setCustom(final CustomFieldsDraft custom);
    

    /**
     * factory method
     * @return instance of MyShoppingListAddLineItemAction
     */
    public static MyShoppingListAddLineItemAction of(){
        return new MyShoppingListAddLineItemActionImpl();
    }
    

    /**
     * factory method to create a shallow copy MyShoppingListAddLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListAddLineItemAction of(final MyShoppingListAddLineItemAction template) {
        MyShoppingListAddLineItemActionImpl instance = new MyShoppingListAddLineItemActionImpl();
        instance.setSku(template.getSku());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyShoppingListAddLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListAddLineItemAction deepCopy(@Nullable final MyShoppingListAddLineItemAction template) {
        if (template == null) {
            return null;
        }
        MyShoppingListAddLineItemActionImpl instance = new MyShoppingListAddLineItemActionImpl();
        instance.setSku(template.getSku());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for MyShoppingListAddLineItemAction
     * @return builder
     */
    public static MyShoppingListAddLineItemActionBuilder builder() {
        return MyShoppingListAddLineItemActionBuilder.of();
    }
    
    /**
     * create builder for MyShoppingListAddLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListAddLineItemActionBuilder builder(final MyShoppingListAddLineItemAction template) {
        return MyShoppingListAddLineItemActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListAddLineItemAction(Function<MyShoppingListAddLineItemAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListAddLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListAddLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListAddLineItemAction>";
            }
        };
    }
}
