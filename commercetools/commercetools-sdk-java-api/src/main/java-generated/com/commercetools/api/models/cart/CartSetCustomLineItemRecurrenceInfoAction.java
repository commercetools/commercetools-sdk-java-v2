
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Sets the recurrence information on the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>. If the Cart is already associated with a Recurring Order, this action will fail.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomLineItemRecurrenceInfoAction cartSetCustomLineItemRecurrenceInfoAction = CartSetCustomLineItemRecurrenceInfoAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomLineItemRecurrenceInfo")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetCustomLineItemRecurrenceInfoActionImpl.class)
public interface CartSetCustomLineItemRecurrenceInfoAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetCustomLineItemRecurrenceInfoAction
     */
    String SET_CUSTOM_LINE_ITEM_RECURRENCE_INFO = "setCustomLineItemRecurrenceInfo";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @JsonProperty("customLineItemKey")
    public String getCustomLineItemKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return recurrenceInfo
     */
    @Valid
    @JsonProperty("recurrenceInfo")
    public CustomLineItemRecurrenceInfoDraft getRecurrenceInfo();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     */

    public void setCustomLineItemKey(final String customLineItemKey);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param recurrenceInfo value to be set
     */

    public void setRecurrenceInfo(final CustomLineItemRecurrenceInfoDraft recurrenceInfo);

    /**
     * factory method
     * @return instance of CartSetCustomLineItemRecurrenceInfoAction
     */
    public static CartSetCustomLineItemRecurrenceInfoAction of() {
        return new CartSetCustomLineItemRecurrenceInfoActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetCustomLineItemRecurrenceInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetCustomLineItemRecurrenceInfoAction of(
            final CartSetCustomLineItemRecurrenceInfoAction template) {
        CartSetCustomLineItemRecurrenceInfoActionImpl instance = new CartSetCustomLineItemRecurrenceInfoActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setRecurrenceInfo(template.getRecurrenceInfo());
        return instance;
    }

    public CartSetCustomLineItemRecurrenceInfoAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetCustomLineItemRecurrenceInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetCustomLineItemRecurrenceInfoAction deepCopy(
            @Nullable final CartSetCustomLineItemRecurrenceInfoAction template) {
        if (template == null) {
            return null;
        }
        CartSetCustomLineItemRecurrenceInfoActionImpl instance = new CartSetCustomLineItemRecurrenceInfoActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setRecurrenceInfo(com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraft
                .deepCopy(template.getRecurrenceInfo()));
        return instance;
    }

    /**
     * builder factory method for CartSetCustomLineItemRecurrenceInfoAction
     * @return builder
     */
    public static CartSetCustomLineItemRecurrenceInfoActionBuilder builder() {
        return CartSetCustomLineItemRecurrenceInfoActionBuilder.of();
    }

    /**
     * create builder for CartSetCustomLineItemRecurrenceInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomLineItemRecurrenceInfoActionBuilder builder(
            final CartSetCustomLineItemRecurrenceInfoAction template) {
        return CartSetCustomLineItemRecurrenceInfoActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetCustomLineItemRecurrenceInfoAction(
            Function<CartSetCustomLineItemRecurrenceInfoAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomLineItemRecurrenceInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomLineItemRecurrenceInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomLineItemRecurrenceInfoAction>";
            }
        };
    }
}
