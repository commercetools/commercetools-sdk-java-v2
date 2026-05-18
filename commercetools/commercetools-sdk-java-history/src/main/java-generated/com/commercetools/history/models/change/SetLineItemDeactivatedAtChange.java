
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.ShoppingListLineItemValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>This change is initiated by background processes after the <span>Delete Product</span> request or <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductRemoveVariantAction" rel="nofollow">Remove ProductVariant</a> update action is performed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDeactivatedAtChange setLineItemDeactivatedAtChange = SetLineItemDeactivatedAtChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetLineItemDeactivatedAtChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLineItemDeactivatedAtChangeImpl.class)
public interface SetLineItemDeactivatedAtChange extends Change {

    /**
     * discriminator value for SetLineItemDeactivatedAtChange
     */
    String SET_LINE_ITEM_DEACTIVATED_AT_CHANGE = "SetLineItemDeactivatedAtChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public ShoppingListLineItemValue getLineItem();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final ShoppingListLineItemValue lineItem);

    /**
     * factory method
     * @return instance of SetLineItemDeactivatedAtChange
     */
    public static SetLineItemDeactivatedAtChange of() {
        return new SetLineItemDeactivatedAtChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetLineItemDeactivatedAtChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemDeactivatedAtChange of(final SetLineItemDeactivatedAtChange template) {
        SetLineItemDeactivatedAtChangeImpl instance = new SetLineItemDeactivatedAtChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(template.getLineItem());
        return instance;
    }

    public SetLineItemDeactivatedAtChange copyDeep();

    /**
     * factory method to create a deep copy of SetLineItemDeactivatedAtChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemDeactivatedAtChange deepCopy(@Nullable final SetLineItemDeactivatedAtChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemDeactivatedAtChangeImpl instance = new SetLineItemDeactivatedAtChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(
            com.commercetools.history.models.change_value.ShoppingListLineItemValue.deepCopy(template.getLineItem()));
        return instance;
    }

    /**
     * builder factory method for SetLineItemDeactivatedAtChange
     * @return builder
     */
    public static SetLineItemDeactivatedAtChangeBuilder builder() {
        return SetLineItemDeactivatedAtChangeBuilder.of();
    }

    /**
     * create builder for SetLineItemDeactivatedAtChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemDeactivatedAtChangeBuilder builder(final SetLineItemDeactivatedAtChange template) {
        return SetLineItemDeactivatedAtChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemDeactivatedAtChange(Function<SetLineItemDeactivatedAtChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemDeactivatedAtChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemDeactivatedAtChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemDeactivatedAtChange>";
            }
        };
    }
}
