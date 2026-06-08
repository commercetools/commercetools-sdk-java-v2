
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.TextLineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListRemoveTextLineItemAction" rel="nofollow">Remove TextLineItem</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveTextLineItemChange removeTextLineItemChange = RemoveTextLineItemChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RemoveTextLineItemChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveTextLineItemChangeImpl.class)
public interface RemoveTextLineItemChange extends Change {

    /**
     * discriminator value for RemoveTextLineItemChange
     */
    String REMOVE_TEXT_LINE_ITEM_CHANGE = "RemoveTextLineItemChange";

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
    @Valid
    @JsonProperty("previousValue")
    public TextLineItem getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TextLineItem getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final TextLineItem previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final TextLineItem nextValue);

    /**
     * factory method
     * @return instance of RemoveTextLineItemChange
     */
    public static RemoveTextLineItemChange of() {
        return new RemoveTextLineItemChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveTextLineItemChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveTextLineItemChange of(final RemoveTextLineItemChange template) {
        RemoveTextLineItemChangeImpl instance = new RemoveTextLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public RemoveTextLineItemChange copyDeep();

    /**
     * factory method to create a deep copy of RemoveTextLineItemChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveTextLineItemChange deepCopy(@Nullable final RemoveTextLineItemChange template) {
        if (template == null) {
            return null;
        }
        RemoveTextLineItemChangeImpl instance = new RemoveTextLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.TextLineItem.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.TextLineItem.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveTextLineItemChange
     * @return builder
     */
    public static RemoveTextLineItemChangeBuilder builder() {
        return RemoveTextLineItemChangeBuilder.of();
    }

    /**
     * create builder for RemoveTextLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveTextLineItemChangeBuilder builder(final RemoveTextLineItemChange template) {
        return RemoveTextLineItemChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveTextLineItemChange(Function<RemoveTextLineItemChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveTextLineItemChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveTextLineItemChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveTextLineItemChange>";
            }
        };
    }
}
