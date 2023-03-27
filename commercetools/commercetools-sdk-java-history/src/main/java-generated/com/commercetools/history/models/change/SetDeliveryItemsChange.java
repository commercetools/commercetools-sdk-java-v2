
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.DeliveryItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDeliveryItemsChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeliveryItemsChange setDeliveryItemsChange = SetDeliveryItemsChange.builder()
 *             .change("{change}")
 *             .deliveryId("{deliveryId}")
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDeliveryItemsChangeImpl.class)
public interface SetDeliveryItemsChange extends Change {

    /**
     * discriminator value for SetDeliveryItemsChange
     */
    String SET_DELIVERY_ITEMS_CHANGE = "SetDeliveryItemsChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setDeliveryItems</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<DeliveryItem> getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<DeliveryItem> getPreviousValue();

    /**
     *  <p>Update action for <code>setDeliveryItems</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set deliveryId
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final DeliveryItem... nextValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    public void setNextValue(final List<DeliveryItem> nextValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final DeliveryItem... previousValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<DeliveryItem> previousValue);

    /**
     * factory method
     * @return instance of SetDeliveryItemsChange
     */
    public static SetDeliveryItemsChange of() {
        return new SetDeliveryItemsChangeImpl();
    }

    /**
     * factory method to copy an instance of SetDeliveryItemsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDeliveryItemsChange of(final SetDeliveryItemsChange template) {
        SetDeliveryItemsChangeImpl instance = new SetDeliveryItemsChangeImpl();
        instance.setChange(template.getChange());
        instance.setDeliveryId(template.getDeliveryId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetDeliveryItemsChange
     * @return builder
     */
    public static SetDeliveryItemsChangeBuilder builder() {
        return SetDeliveryItemsChangeBuilder.of();
    }

    /**
     * create builder for SetDeliveryItemsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDeliveryItemsChangeBuilder builder(final SetDeliveryItemsChange template) {
        return SetDeliveryItemsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDeliveryItemsChange(Function<SetDeliveryItemsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDeliveryItemsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDeliveryItemsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDeliveryItemsChange>";
            }
        };
    }
}
