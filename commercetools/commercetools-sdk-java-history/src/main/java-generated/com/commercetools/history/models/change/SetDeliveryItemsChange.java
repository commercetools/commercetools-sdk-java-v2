
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.DeliveryItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryItemsAction" rel="nofollow">Set Delivery Items</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetDeliveryItemsAction" rel="nofollow">Set Delivery Items</a> on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeliveryItemsChange setDeliveryItemsChange = SetDeliveryItemsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetDeliveryItemsChange")
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
    public List<DeliveryItem> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<DeliveryItem> getNextValue();

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final DeliveryItem... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<DeliveryItem> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final DeliveryItem... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<DeliveryItem> nextValue);

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * factory method
     * @return instance of SetDeliveryItemsChange
     */
    public static SetDeliveryItemsChange of() {
        return new SetDeliveryItemsChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetDeliveryItemsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDeliveryItemsChange of(final SetDeliveryItemsChange template) {
        SetDeliveryItemsChangeImpl instance = new SetDeliveryItemsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    public SetDeliveryItemsChange copyDeep();

    /**
     * factory method to create a deep copy of SetDeliveryItemsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDeliveryItemsChange deepCopy(@Nullable final SetDeliveryItemsChange template) {
        if (template == null) {
            return null;
        }
        SetDeliveryItemsChangeImpl instance = new SetDeliveryItemsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDeliveryId(template.getDeliveryId());
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
