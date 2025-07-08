
package com.commercetools.api.models.me;

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
 *  <p>Sets the recurrence information on the CustomLineItem. If the Cart is already associated with a Recurring Order, this action will fail.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetCustomLineItemRecurrenceInfoAction myCartSetCustomLineItemRecurrenceInfoAction = MyCartSetCustomLineItemRecurrenceInfoAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomLineItemRecurrenceInfo")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetCustomLineItemRecurrenceInfoActionImpl.class)
public interface MyCartSetCustomLineItemRecurrenceInfoAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartSetCustomLineItemRecurrenceInfoAction
     */
    String SET_CUSTOM_LINE_ITEM_RECURRENCE_INFO = "setCustomLineItemRecurrenceInfo";

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
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
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
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
     * @return instance of MyCartSetCustomLineItemRecurrenceInfoAction
     */
    public static MyCartSetCustomLineItemRecurrenceInfoAction of() {
        return new MyCartSetCustomLineItemRecurrenceInfoActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartSetCustomLineItemRecurrenceInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartSetCustomLineItemRecurrenceInfoAction of(
            final MyCartSetCustomLineItemRecurrenceInfoAction template) {
        MyCartSetCustomLineItemRecurrenceInfoActionImpl instance = new MyCartSetCustomLineItemRecurrenceInfoActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setRecurrenceInfo(template.getRecurrenceInfo());
        return instance;
    }

    public MyCartSetCustomLineItemRecurrenceInfoAction copyDeep();

    /**
     * factory method to create a deep copy of MyCartSetCustomLineItemRecurrenceInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartSetCustomLineItemRecurrenceInfoAction deepCopy(
            @Nullable final MyCartSetCustomLineItemRecurrenceInfoAction template) {
        if (template == null) {
            return null;
        }
        MyCartSetCustomLineItemRecurrenceInfoActionImpl instance = new MyCartSetCustomLineItemRecurrenceInfoActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setRecurrenceInfo(com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraft
                .deepCopy(template.getRecurrenceInfo()));
        return instance;
    }

    /**
     * builder factory method for MyCartSetCustomLineItemRecurrenceInfoAction
     * @return builder
     */
    public static MyCartSetCustomLineItemRecurrenceInfoActionBuilder builder() {
        return MyCartSetCustomLineItemRecurrenceInfoActionBuilder.of();
    }

    /**
     * create builder for MyCartSetCustomLineItemRecurrenceInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetCustomLineItemRecurrenceInfoActionBuilder builder(
            final MyCartSetCustomLineItemRecurrenceInfoAction template) {
        return MyCartSetCustomLineItemRecurrenceInfoActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartSetCustomLineItemRecurrenceInfoAction(
            Function<MyCartSetCustomLineItemRecurrenceInfoAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetCustomLineItemRecurrenceInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetCustomLineItemRecurrenceInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetCustomLineItemRecurrenceInfoAction>";
            }
        };
    }
}
