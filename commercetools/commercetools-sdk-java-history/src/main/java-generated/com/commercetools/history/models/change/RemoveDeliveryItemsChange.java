
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Delivery;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Remove Delivery update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveDeliveryItemsChange removeDeliveryItemsChange = RemoveDeliveryItemsChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveDeliveryItemsChangeImpl.class)
public interface RemoveDeliveryItemsChange extends Change {

    /**
     * discriminator value for RemoveDeliveryItemsChange
     */
    String REMOVE_DELIVERY_ITEMS_CHANGE = "RemoveDeliveryItemsChange";

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
    public Delivery getPreviousValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Delivery previousValue);

    /**
     * factory method
     * @return instance of RemoveDeliveryItemsChange
     */
    public static RemoveDeliveryItemsChange of() {
        return new RemoveDeliveryItemsChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveDeliveryItemsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveDeliveryItemsChange of(final RemoveDeliveryItemsChange template) {
        RemoveDeliveryItemsChangeImpl instance = new RemoveDeliveryItemsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveDeliveryItemsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveDeliveryItemsChange deepCopy(@Nullable final RemoveDeliveryItemsChange template) {
        if (template == null) {
            return null;
        }
        RemoveDeliveryItemsChangeImpl instance = new RemoveDeliveryItemsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Delivery.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveDeliveryItemsChange
     * @return builder
     */
    public static RemoveDeliveryItemsChangeBuilder builder() {
        return RemoveDeliveryItemsChangeBuilder.of();
    }

    /**
     * create builder for RemoveDeliveryItemsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveDeliveryItemsChangeBuilder builder(final RemoveDeliveryItemsChange template) {
        return RemoveDeliveryItemsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveDeliveryItemsChange(Function<RemoveDeliveryItemsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveDeliveryItemsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveDeliveryItemsChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveDeliveryItemsChange>";
            }
        };
    }
}
