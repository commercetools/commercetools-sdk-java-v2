
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ShipmentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Change ShipmentState on Orders.</li>
 *   <li>Change ShipmentState on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeShipmentStateChange changeShipmentStateChange = ChangeShipmentStateChange.builder()
 *             .change("{change}")
 *             .previousValue(ShipmentState.SHIPPED)
 *             .nextValue(ShipmentState.SHIPPED)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeShipmentStateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeShipmentStateChangeImpl.class)
public interface ChangeShipmentStateChange extends Change {

    /**
     * discriminator value for ChangeShipmentStateChange
     */
    String CHANGE_SHIPMENT_STATE_CHANGE = "ChangeShipmentStateChange";

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
    @JsonProperty("previousValue")
    public ShipmentState getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public ShipmentState getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ShipmentState previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ShipmentState nextValue);

    /**
     * factory method
     * @return instance of ChangeShipmentStateChange
     */
    public static ChangeShipmentStateChange of() {
        return new ChangeShipmentStateChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeShipmentStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeShipmentStateChange of(final ChangeShipmentStateChange template) {
        ChangeShipmentStateChangeImpl instance = new ChangeShipmentStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeShipmentStateChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeShipmentStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeShipmentStateChange deepCopy(@Nullable final ChangeShipmentStateChange template) {
        if (template == null) {
            return null;
        }
        ChangeShipmentStateChangeImpl instance = new ChangeShipmentStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeShipmentStateChange
     * @return builder
     */
    public static ChangeShipmentStateChangeBuilder builder() {
        return ChangeShipmentStateChangeBuilder.of();
    }

    /**
     * create builder for ChangeShipmentStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeShipmentStateChangeBuilder builder(final ChangeShipmentStateChange template) {
        return ChangeShipmentStateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeShipmentStateChange(Function<ChangeShipmentStateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeShipmentStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeShipmentStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeShipmentStateChange>";
            }
        };
    }
}
