
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * MyShoppingListSetTextLineItemDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetTextLineItemDescriptionAction myShoppingListSetTextLineItemDescriptionAction = MyShoppingListSetTextLineItemDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setTextLineItemDescription")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListSetTextLineItemDescriptionActionImpl.class)
public interface MyShoppingListSetTextLineItemDescriptionAction extends MyShoppingListUpdateAction {

    /**
     * discriminator value for MyShoppingListSetTextLineItemDescriptionAction
     */
    String SET_TEXT_LINE_ITEM_DESCRIPTION = "setTextLineItemDescription";

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return textLineItemId
     */

    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return textLineItemKey
     */

    @JsonProperty("textLineItemKey")
    public String getTextLineItemKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemId value to be set
     */

    public void setTextLineItemId(final String textLineItemId);

    /**
     *  <p>The <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TextLineItem" rel="nofollow">TextLineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param textLineItemKey value to be set
     */

    public void setTextLineItemKey(final String textLineItemKey);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * factory method
     * @return instance of MyShoppingListSetTextLineItemDescriptionAction
     */
    public static MyShoppingListSetTextLineItemDescriptionAction of() {
        return new MyShoppingListSetTextLineItemDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy MyShoppingListSetTextLineItemDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListSetTextLineItemDescriptionAction of(
            final MyShoppingListSetTextLineItemDescriptionAction template) {
        MyShoppingListSetTextLineItemDescriptionActionImpl instance = new MyShoppingListSetTextLineItemDescriptionActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setTextLineItemKey(template.getTextLineItemKey());
        instance.setDescription(template.getDescription());
        return instance;
    }

    public MyShoppingListSetTextLineItemDescriptionAction copyDeep();

    /**
     * factory method to create a deep copy of MyShoppingListSetTextLineItemDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListSetTextLineItemDescriptionAction deepCopy(
            @Nullable final MyShoppingListSetTextLineItemDescriptionAction template) {
        if (template == null) {
            return null;
        }
        MyShoppingListSetTextLineItemDescriptionActionImpl instance = new MyShoppingListSetTextLineItemDescriptionActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setTextLineItemKey(template.getTextLineItemKey());
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for MyShoppingListSetTextLineItemDescriptionAction
     * @return builder
     */
    public static MyShoppingListSetTextLineItemDescriptionActionBuilder builder() {
        return MyShoppingListSetTextLineItemDescriptionActionBuilder.of();
    }

    /**
     * create builder for MyShoppingListSetTextLineItemDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListSetTextLineItemDescriptionActionBuilder builder(
            final MyShoppingListSetTextLineItemDescriptionAction template) {
        return MyShoppingListSetTextLineItemDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListSetTextLineItemDescriptionAction(
            Function<MyShoppingListSetTextLineItemDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetTextLineItemDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetTextLineItemDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListSetTextLineItemDescriptionAction>";
            }
        };
    }
}
