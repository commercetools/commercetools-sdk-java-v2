
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
 *  <p>Change triggered by the Add TextLineItem update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddTextLineItemChange addTextLineItemChange = AddTextLineItemChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddTextLineItemChangeImpl.class)
public interface AddTextLineItemChange extends Change {

    /**
     * discriminator value for AddTextLineItemChange
     */
    String ADD_TEXT_LINE_ITEM_CHANGE = "AddTextLineItemChange";

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
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final TextLineItem nextValue);

    /**
     * factory method
     * @return instance of AddTextLineItemChange
     */
    public static AddTextLineItemChange of() {
        return new AddTextLineItemChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddTextLineItemChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddTextLineItemChange of(final AddTextLineItemChange template) {
        AddTextLineItemChangeImpl instance = new AddTextLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddTextLineItemChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddTextLineItemChange deepCopy(@Nullable final AddTextLineItemChange template) {
        if (template == null) {
            return null;
        }
        AddTextLineItemChangeImpl instance = new AddTextLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(com.commercetools.history.models.common.TextLineItem.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddTextLineItemChange
     * @return builder
     */
    public static AddTextLineItemChangeBuilder builder() {
        return AddTextLineItemChangeBuilder.of();
    }

    /**
     * create builder for AddTextLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddTextLineItemChangeBuilder builder(final AddTextLineItemChange template) {
        return AddTextLineItemChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddTextLineItemChange(Function<AddTextLineItemChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddTextLineItemChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddTextLineItemChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddTextLineItemChange>";
            }
        };
    }
}
