
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.ShoppingListLineItemValue;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>This change is initiated by background processes after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListChangeNameAction" rel="nofollow">Change Name</a> update action is performed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLineItemNameChange changeLineItemNameChange = ChangeLineItemNameChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeLineItemNameChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeLineItemNameChangeImpl.class)
public interface ChangeLineItemNameChange extends Change {

    /**
     * discriminator value for ChangeLineItemNameChange
     */
    String CHANGE_LINE_ITEM_NAME_CHANGE = "ChangeLineItemNameChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public ShoppingListLineItemValue getLineItem();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final ShoppingListLineItemValue lineItem);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LocalizedString previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final LocalizedString nextValue);

    /**
     * factory method
     * @return instance of ChangeLineItemNameChange
     */
    public static ChangeLineItemNameChange of() {
        return new ChangeLineItemNameChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeLineItemNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeLineItemNameChange of(final ChangeLineItemNameChange template) {
        ChangeLineItemNameChangeImpl instance = new ChangeLineItemNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeLineItemNameChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeLineItemNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeLineItemNameChange deepCopy(@Nullable final ChangeLineItemNameChange template) {
        if (template == null) {
            return null;
        }
        ChangeLineItemNameChangeImpl instance = new ChangeLineItemNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(
            com.commercetools.history.models.change_value.ShoppingListLineItemValue.deepCopy(template.getLineItem()));
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangeLineItemNameChange
     * @return builder
     */
    public static ChangeLineItemNameChangeBuilder builder() {
        return ChangeLineItemNameChangeBuilder.of();
    }

    /**
     * create builder for ChangeLineItemNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLineItemNameChangeBuilder builder(final ChangeLineItemNameChange template) {
        return ChangeLineItemNameChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeLineItemNameChange(Function<ChangeLineItemNameChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLineItemNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLineItemNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLineItemNameChange>";
            }
        };
    }
}
