
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reservation;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetReservationsChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetReservationsChange setReservationsChange = SetReservationsChange.builder()
 *             .change("{change}")
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetReservationsChangeImpl.class)
public interface SetReservationsChange extends Change {

    /**
     * discriminator value for SetReservationsChange
     */
    String SET_RESERVATIONS_CHANGE = "SetReservationsChange";

    /**
     *  <p>Update action for <code>setReservations</code> on inventories</p>
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
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Reservation> getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<Reservation> getPreviousValue();

    /**
     *  <p>Update action for <code>setReservations</code> on inventories</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final Reservation... nextValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    public void setNextValue(final List<Reservation> nextValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final Reservation... previousValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<Reservation> previousValue);

    /**
     * factory method
     * @return instance of SetReservationsChange
     */
    public static SetReservationsChange of() {
        return new SetReservationsChangeImpl();
    }

    /**
     * factory method to copy an instance of SetReservationsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetReservationsChange of(final SetReservationsChange template) {
        SetReservationsChangeImpl instance = new SetReservationsChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
