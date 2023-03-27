
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ShipmentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeShipmentStateChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeShipmentStateChange changeShipmentStateChange = ChangeShipmentStateChange.builder()
 *             .change("{change}")
 *             .nextValue(ShipmentState.SHIPPED)
 *             .previousValue(ShipmentState.SHIPPED)
 *             .build()
 * </code></pre>
 * </div>
 */
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
     *  <p>Update action for <code>changeShipmentState</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public ShipmentState getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public ShipmentState getPreviousValue();

    /**
     *  <p>Update action for <code>changeShipmentState</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final ShipmentState nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ShipmentState previousValue);

    /**
     * factory method
     * @return instance of ChangeShipmentStateChange
     */
    public static ChangeShipmentStateChange of() {
        return new ChangeShipmentStateChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeShipmentStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeShipmentStateChange of(final ChangeShipmentStateChange template) {
        ChangeShipmentStateChangeImpl instance = new ChangeShipmentStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
