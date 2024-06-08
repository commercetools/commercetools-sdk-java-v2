
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Remove Parcel From Delivery update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveOrderLineItemChange removeOrderLineItemChange = RemoveOrderLineItemChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveOrderLineItemChangeImpl.class)
public interface RemoveOrderLineItemChange extends Change {

    /**
     * discriminator value for RemoveOrderLineItemChange
     */
    String REMOVE_ORDER_LINE_ITEM_CHANGE = "RemoveOrderLineItemChange";

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
    public LineItem getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LineItem getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LineItem previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final LineItem nextValue);

    /**
     * factory method
     * @return instance of RemoveOrderLineItemChange
     */
    public static RemoveOrderLineItemChange of() {
        return new RemoveOrderLineItemChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveOrderLineItemChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveOrderLineItemChange of(final RemoveOrderLineItemChange template) {
        RemoveOrderLineItemChangeImpl instance = new RemoveOrderLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveOrderLineItemChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveOrderLineItemChange deepCopy(@Nullable final RemoveOrderLineItemChange template) {
        if (template == null) {
            return null;
        }
        RemoveOrderLineItemChangeImpl instance = new RemoveOrderLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LineItem.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.LineItem.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveOrderLineItemChange
     * @return builder
     */
    public static RemoveOrderLineItemChangeBuilder builder() {
        return RemoveOrderLineItemChangeBuilder.of();
    }

    /**
     * create builder for RemoveOrderLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveOrderLineItemChangeBuilder builder(final RemoveOrderLineItemChange template) {
        return RemoveOrderLineItemChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveOrderLineItemChange(Function<RemoveOrderLineItemChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveOrderLineItemChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveOrderLineItemChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveOrderLineItemChange>";
            }
        };
    }
}
