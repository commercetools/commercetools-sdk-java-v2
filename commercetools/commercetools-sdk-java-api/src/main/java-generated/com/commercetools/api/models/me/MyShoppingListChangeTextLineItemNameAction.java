package com.commercetools.api.models.me;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListChangeTextLineItemNameActionImpl;

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
 * MyShoppingListChangeTextLineItemNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListChangeTextLineItemNameAction myShoppingListChangeTextLineItemNameAction = MyShoppingListChangeTextLineItemNameAction.builder()
 *             .textLineItemId("{textLineItemId}")
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = MyShoppingListChangeTextLineItemNameActionImpl.class)
public interface MyShoppingListChangeTextLineItemNameAction extends MyShoppingListUpdateAction {

    /**
     * discriminator value for MyShoppingListChangeTextLineItemNameAction
     */
    String CHANGE_TEXT_LINE_ITEM_NAME = "changeTextLineItemName";

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @return textLineItemId
     */
    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @param textLineItemId value to be set
     */
    
    public void setTextLineItemId(final String textLineItemId);
    
    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     */
    
    public void setName(final LocalizedString name);
    

    /**
     * factory method
     * @return instance of MyShoppingListChangeTextLineItemNameAction
     */
    public static MyShoppingListChangeTextLineItemNameAction of(){
        return new MyShoppingListChangeTextLineItemNameActionImpl();
    }
    

    /**
     * factory method to create a shallow copy MyShoppingListChangeTextLineItemNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListChangeTextLineItemNameAction of(final MyShoppingListChangeTextLineItemNameAction template) {
        MyShoppingListChangeTextLineItemNameActionImpl instance = new MyShoppingListChangeTextLineItemNameActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyShoppingListChangeTextLineItemNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListChangeTextLineItemNameAction deepCopy(@Nullable final MyShoppingListChangeTextLineItemNameAction template) {
        if (template == null) {
            return null;
        }
        MyShoppingListChangeTextLineItemNameActionImpl instance = new MyShoppingListChangeTextLineItemNameActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for MyShoppingListChangeTextLineItemNameAction
     * @return builder
     */
    public static MyShoppingListChangeTextLineItemNameActionBuilder builder() {
        return MyShoppingListChangeTextLineItemNameActionBuilder.of();
    }
    
    /**
     * create builder for MyShoppingListChangeTextLineItemNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListChangeTextLineItemNameActionBuilder builder(final MyShoppingListChangeTextLineItemNameAction template) {
        return MyShoppingListChangeTextLineItemNameActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListChangeTextLineItemNameAction(Function<MyShoppingListChangeTextLineItemNameAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeTextLineItemNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeTextLineItemNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListChangeTextLineItemNameAction>";
            }
        };
    }
}
