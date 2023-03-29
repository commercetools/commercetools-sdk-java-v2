
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.TextLineItemValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTextLineItemsOrderChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTextLineItemsOrderChange changeTextLineItemsOrderChange = ChangeTextLineItemsOrderChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTextLineItemsOrderChangeImpl.class)
public interface ChangeTextLineItemsOrderChange extends Change {

    /**
     * discriminator value for ChangeTextLineItemsOrderChange
     */
    String CHANGE_TEXT_LINE_ITEMS_ORDER_CHANGE = "ChangeTextLineItemsOrderChange";

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
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<TextLineItemValue> getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<TextLineItemValue> getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final TextLineItemValue... previousValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<TextLineItemValue> previousValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final TextLineItemValue... nextValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    public void setNextValue(final List<TextLineItemValue> nextValue);

    /**
     * factory method
     * @return instance of ChangeTextLineItemsOrderChange
     */
    public static ChangeTextLineItemsOrderChange of() {
        return new ChangeTextLineItemsOrderChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeTextLineItemsOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTextLineItemsOrderChange of(final ChangeTextLineItemsOrderChange template) {
        ChangeTextLineItemsOrderChangeImpl instance = new ChangeTextLineItemsOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeTextLineItemsOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTextLineItemsOrderChange deepCopy(@Nullable final ChangeTextLineItemsOrderChange template) {
        if (template == null) {
            return null;
        }
        ChangeTextLineItemsOrderChangeImpl instance = new ChangeTextLineItemsOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.TextLineItemValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.TextLineItemValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChangeTextLineItemsOrderChange
     * @return builder
     */
    public static ChangeTextLineItemsOrderChangeBuilder builder() {
        return ChangeTextLineItemsOrderChangeBuilder.of();
    }

    /**
     * create builder for ChangeTextLineItemsOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTextLineItemsOrderChangeBuilder builder(final ChangeTextLineItemsOrderChange template) {
        return ChangeTextLineItemsOrderChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTextLineItemsOrderChange(Function<ChangeTextLineItemsOrderChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTextLineItemsOrderChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTextLineItemsOrderChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTextLineItemsOrderChange>";
            }
        };
    }
}
