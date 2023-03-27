
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.TextLineItemValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTextLineItemQuantityChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTextLineItemQuantityChange changeTextLineItemQuantityChange = ChangeTextLineItemQuantityChange.builder()
 *             .change("{change}")
 *             .textLineItem(textLineItemBuilder -> textLineItemBuilder)
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTextLineItemQuantityChangeImpl.class)
public interface ChangeTextLineItemQuantityChange extends Change {

    /**
     * discriminator value for ChangeTextLineItemQuantityChange
     */
    String CHANGE_TEXT_LINE_ITEM_QUANTITY_CHANGE = "ChangeTextLineItemQuantityChange";

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
     *
     * @return textLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("textLineItem")
    public TextLineItemValue getTextLineItem();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set textLineItem
     * @param textLineItem value to be set
     */

    public void setTextLineItem(final TextLineItemValue textLineItem);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Integer previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Integer nextValue);

    /**
     * factory method
     * @return instance of ChangeTextLineItemQuantityChange
     */
    public static ChangeTextLineItemQuantityChange of() {
        return new ChangeTextLineItemQuantityChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeTextLineItemQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTextLineItemQuantityChange of(final ChangeTextLineItemQuantityChange template) {
        ChangeTextLineItemQuantityChangeImpl instance = new ChangeTextLineItemQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setTextLineItem(template.getTextLineItem());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeTextLineItemQuantityChange
     * @return builder
     */
    public static ChangeTextLineItemQuantityChangeBuilder builder() {
        return ChangeTextLineItemQuantityChangeBuilder.of();
    }

    /**
     * create builder for ChangeTextLineItemQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTextLineItemQuantityChangeBuilder builder(final ChangeTextLineItemQuantityChange template) {
        return ChangeTextLineItemQuantityChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTextLineItemQuantityChange(Function<ChangeTextLineItemQuantityChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTextLineItemQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTextLineItemQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTextLineItemQuantityChange>";
            }
        };
    }
}
