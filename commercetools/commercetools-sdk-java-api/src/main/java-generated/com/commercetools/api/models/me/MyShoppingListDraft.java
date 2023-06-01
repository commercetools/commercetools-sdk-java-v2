package com.commercetools.api.models.me;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft;
import com.commercetools.api.models.shopping_list.TextLineItemDraft;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.me.MyShoppingListDraftImpl;

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
 *  <p>A MyShoppingListDraft is the object submitted as payload to the Create MyShoppingList request. The <code>customer</code> field of ShoppingList is automatically set with a password flow token. The <code>anonymousId</code> is automatically set with a token for an anonymous session. The <code>key</code> and <code>slug</code> fields can not be set.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListDraft myShoppingListDraft = MyShoppingListDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = MyShoppingListDraftImpl.class)
public interface MyShoppingListDraft extends com.commercetools.api.models.CustomizableDraft<MyShoppingListDraft>, io.vrap.rmf.base.client.Draft<MyShoppingListDraft> {


    /**
     *  <p>Name of the ShoppingList.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();
    /**
     *  <p>Description of the ShoppingList.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();
    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @return lineItems
     */
    @Valid
    @JsonProperty("lineItems")
    public List<ShoppingListLineItemDraft> getLineItems();
    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @return textLineItems
     */
    @Valid
    @JsonProperty("textLineItems")
    public List<TextLineItemDraft> getTextLineItems();
    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();
    /**
     *  <p>Number of days after which the ShoppingList will be automatically deleted if it has not been modified. If not set, the default value configured in the Project is used.</p>
     * @return deleteDaysAfterLastModification
     */
    
    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();
    /**
     *  <p>Assigns the new ShoppingList to the Store. The Store assignment can not be modified.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>Name of the ShoppingList.</p>
     * @param name value to be set
     */
    
    public void setName(final LocalizedString name);
    
    
    /**
     *  <p>Description of the ShoppingList.</p>
     * @param description value to be set
     */
    
    public void setDescription(final LocalizedString description);
    
    
    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @param lineItems values to be set
     */
    
    @JsonIgnore
    public void setLineItems(final ShoppingListLineItemDraft ...lineItems);
    /**
     *  <p>Line Items (containing Products) to add to the ShoppingList.</p>
     * @param lineItems values to be set
     */
    
    public void setLineItems(final List<ShoppingListLineItemDraft> lineItems);
    
    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @param textLineItems values to be set
     */
    
    @JsonIgnore
    public void setTextLineItems(final TextLineItemDraft ...textLineItems);
    /**
     *  <p>Line Items (containing text values) to add to the ShoppingList.</p>
     * @param textLineItems values to be set
     */
    
    public void setTextLineItems(final List<TextLineItemDraft> textLineItems);
    
    /**
     *  <p>Custom Fields defined for the ShoppingList.</p>
     * @param custom value to be set
     */
    
    public void setCustom(final CustomFieldsDraft custom);
    
    
    /**
     *  <p>Number of days after which the ShoppingList will be automatically deleted if it has not been modified. If not set, the default value configured in the Project is used.</p>
     * @param deleteDaysAfterLastModification value to be set
     */
    
    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);
    
    
    /**
     *  <p>Assigns the new ShoppingList to the Store. The Store assignment can not be modified.</p>
     * @param store value to be set
     */
    
    public void setStore(final StoreResourceIdentifier store);
    

    /**
     * factory method
     * @return instance of MyShoppingListDraft
     */
    public static MyShoppingListDraft of(){
        return new MyShoppingListDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy MyShoppingListDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListDraft of(final MyShoppingListDraft template) {
        MyShoppingListDraftImpl instance = new MyShoppingListDraftImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setLineItems(template.getLineItems());
        instance.setTextLineItems(template.getTextLineItems());
        instance.setCustom(template.getCustom());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setStore(template.getStore());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyShoppingListDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListDraft deepCopy(@Nullable final MyShoppingListDraft template) {
        if (template == null) {
            return null;
        }
        MyShoppingListDraftImpl instance = new MyShoppingListDraftImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setLineItems(Optional.ofNullable(template.getLineItems())
                .map(t -> t.stream().map(com.commercetools.api.models.shopping_list.ShoppingListLineItemDraft::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setTextLineItems(Optional.ofNullable(template.getTextLineItems())
                .map(t -> t.stream().map(com.commercetools.api.models.shopping_list.TextLineItemDraft::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for MyShoppingListDraft
     * @return builder
     */
    public static MyShoppingListDraftBuilder builder() {
        return MyShoppingListDraftBuilder.of();
    }
    
    /**
     * create builder for MyShoppingListDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListDraftBuilder builder(final MyShoppingListDraft template) {
        return MyShoppingListDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListDraft(Function<MyShoppingListDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListDraft>";
            }
        };
    }
}
