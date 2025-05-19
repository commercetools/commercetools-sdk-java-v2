
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Change LineItem Quantity update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLineItemQuantityChange changeLineItemQuantityChange = ChangeLineItemQuantityChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeLineItemQuantityChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeLineItemQuantityChangeImpl.class)
public interface ChangeLineItemQuantityChange extends Change {

    /**
     * discriminator value for ChangeLineItemQuantityChange
     */
    String CHANGE_LINE_ITEM_QUANTITY_CHANGE = "ChangeLineItemQuantityChange";

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
    public Integer getPreviousValue();

    /**
     *  <p>Value after the change</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    /**
     *  <p>Name of the Product the updated Line Item is based on.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    /**
     *  <p><code>id</code> of the updated LineItem.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Integer previousValue);

    /**
     *  <p>Value after the change</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Integer nextValue);

    /**
     *  <p>Name of the Product the updated Line Item is based on.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     *  <p><code>id</code> of the updated LineItem.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     * factory method
     * @return instance of ChangeLineItemQuantityChange
     */
    public static ChangeLineItemQuantityChange of() {
        return new ChangeLineItemQuantityChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeLineItemQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeLineItemQuantityChange of(final ChangeLineItemQuantityChange template) {
        ChangeLineItemQuantityChangeImpl instance = new ChangeLineItemQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(template.getLineItem());
        instance.setLineItemId(template.getLineItemId());
        return instance;
    }

    public ChangeLineItemQuantityChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeLineItemQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeLineItemQuantityChange deepCopy(@Nullable final ChangeLineItemQuantityChange template) {
        if (template == null) {
            return null;
        }
        ChangeLineItemQuantityChangeImpl instance = new ChangeLineItemQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItem(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getLineItem()));
        instance.setLineItemId(template.getLineItemId());
        return instance;
    }

    /**
     * builder factory method for ChangeLineItemQuantityChange
     * @return builder
     */
    public static ChangeLineItemQuantityChangeBuilder builder() {
        return ChangeLineItemQuantityChangeBuilder.of();
    }

    /**
     * create builder for ChangeLineItemQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLineItemQuantityChangeBuilder builder(final ChangeLineItemQuantityChange template) {
        return ChangeLineItemQuantityChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeLineItemQuantityChange(Function<ChangeLineItemQuantityChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLineItemQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLineItemQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLineItemQuantityChange>";
            }
        };
    }
}
