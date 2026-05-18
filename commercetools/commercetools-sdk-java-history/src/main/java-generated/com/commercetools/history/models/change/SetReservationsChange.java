
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Reservation;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>This change is initiated by background processes after the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryAddQuantityAction" rel="nofollow">Add Quantity</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryRemoveQuantityAction" rel="nofollow">Remove Quantity</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryChangeQuantityAction" rel="nofollow">Change Quantity</a> update action is performed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetReservationsChange setReservationsChange = SetReservationsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusAddedItems(addedItemsBuilder -> addedItemsBuilder)
 *             .plusRemovedItems(removedItemsBuilder -> removedItemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetReservationsChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetReservationsChangeImpl.class)
public interface SetReservationsChange extends Change {

    /**
     * discriminator value for SetReservationsChange
     */
    String SET_RESERVATIONS_CHANGE = "SetReservationsChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<Reservation> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Reservation> getNextValue();

    /**
     *  <p>Elements added to the array.</p>
     * @return addedItems
     */
    @NotNull
    @Valid
    @JsonProperty("addedItems")
    public List<Reservation> getAddedItems();

    /**
     *  <p>Elements removed from the array.</p>
     * @return removedItems
     */
    @NotNull
    @Valid
    @JsonProperty("removedItems")
    public List<Reservation> getRemovedItems();

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
    public void setPreviousValue(final Reservation... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<Reservation> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final Reservation... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<Reservation> nextValue);

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems values to be set
     */

    @JsonIgnore
    public void setAddedItems(final Reservation... addedItems);

    /**
     *  <p>Elements added to the array.</p>
     * @param addedItems values to be set
     */

    public void setAddedItems(final List<Reservation> addedItems);

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems values to be set
     */

    @JsonIgnore
    public void setRemovedItems(final Reservation... removedItems);

    /**
     *  <p>Elements removed from the array.</p>
     * @param removedItems values to be set
     */

    public void setRemovedItems(final List<Reservation> removedItems);

    /**
     * factory method
     * @return instance of SetReservationsChange
     */
    public static SetReservationsChange of() {
        return new SetReservationsChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetReservationsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetReservationsChange of(final SetReservationsChange template) {
        SetReservationsChangeImpl instance = new SetReservationsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setAddedItems(template.getAddedItems());
        instance.setRemovedItems(template.getRemovedItems());
        return instance;
    }

    public SetReservationsChange copyDeep();

    /**
     * factory method to create a deep copy of SetReservationsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetReservationsChange deepCopy(@Nullable final SetReservationsChange template) {
        if (template == null) {
            return null;
        }
        SetReservationsChangeImpl instance = new SetReservationsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.Reservation::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.Reservation::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAddedItems(Optional.ofNullable(template.getAddedItems())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.Reservation::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setRemovedItems(Optional.ofNullable(template.getRemovedItems())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.Reservation::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetReservationsChange
     * @return builder
     */
    public static SetReservationsChangeBuilder builder() {
        return SetReservationsChangeBuilder.of();
    }

    /**
     * create builder for SetReservationsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetReservationsChangeBuilder builder(final SetReservationsChange template) {
        return SetReservationsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetReservationsChange(Function<SetReservationsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetReservationsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetReservationsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetReservationsChange>";
            }
        };
    }
}
