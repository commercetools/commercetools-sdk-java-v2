
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TextLineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveTextLineItemChange
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
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public TextLineItem getPreviousValue();

    /**
     *
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
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final TextLineItem previousValue);

    /**
     * set nextValue
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
     * factory method to copy an instance of RemoveTextLineItemChange
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
