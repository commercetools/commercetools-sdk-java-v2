
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.CustomLineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the Remove CustomLineItem update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveCustomLineItemChange removeCustomLineItemChange = RemoveCustomLineItemChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveCustomLineItemChangeImpl.class)
public interface RemoveCustomLineItemChange extends Change {

    /**
     * discriminator value for RemoveCustomLineItemChange
     */
    String REMOVE_CUSTOM_LINE_ITEM_CHANGE = "RemoveCustomLineItemChange";

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
    public CustomLineItem getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomLineItem getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomLineItem previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomLineItem nextValue);

    /**
     * factory method
     * @return instance of RemoveCustomLineItemChange
     */
    public static RemoveCustomLineItemChange of() {
        return new RemoveCustomLineItemChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveCustomLineItemChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveCustomLineItemChange of(final RemoveCustomLineItemChange template) {
        RemoveCustomLineItemChangeImpl instance = new RemoveCustomLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveCustomLineItemChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveCustomLineItemChange deepCopy(@Nullable final RemoveCustomLineItemChange template) {
        if (template == null) {
            return null;
        }
        RemoveCustomLineItemChangeImpl instance = new RemoveCustomLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomLineItem.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomLineItem.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveCustomLineItemChange
     * @return builder
     */
    public static RemoveCustomLineItemChangeBuilder builder() {
        return RemoveCustomLineItemChangeBuilder.of();
    }

    /**
     * create builder for RemoveCustomLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveCustomLineItemChangeBuilder builder(final RemoveCustomLineItemChange template) {
        return RemoveCustomLineItemChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveCustomLineItemChange(Function<RemoveCustomLineItemChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveCustomLineItemChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveCustomLineItemChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveCustomLineItemChange>";
            }
        };
    }
}
