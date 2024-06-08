
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ReturnShipmentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set ReturnShipmentState on Orders.</li>
 *   <li>Set ReturnShipmentState on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetReturnShipmentStateChange setReturnShipmentStateChange = SetReturnShipmentStateChange.builder()
 *             .change("{change}")
 *             .previousValue(ReturnShipmentState.ADVISED)
 *             .nextValue(ReturnShipmentState.ADVISED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetReturnShipmentStateChangeImpl.class)
public interface SetReturnShipmentStateChange extends Change {

    /**
     * discriminator value for SetReturnShipmentStateChange
     */
    String SET_RETURN_SHIPMENT_STATE_CHANGE = "SetReturnShipmentStateChange";

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
    public ReturnShipmentState getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public ReturnShipmentState getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ReturnShipmentState previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ReturnShipmentState nextValue);

    /**
     * factory method
     * @return instance of SetReturnShipmentStateChange
     */
    public static SetReturnShipmentStateChange of() {
        return new SetReturnShipmentStateChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetReturnShipmentStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetReturnShipmentStateChange of(final SetReturnShipmentStateChange template) {
        SetReturnShipmentStateChangeImpl instance = new SetReturnShipmentStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetReturnShipmentStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetReturnShipmentStateChange deepCopy(@Nullable final SetReturnShipmentStateChange template) {
        if (template == null) {
            return null;
        }
        SetReturnShipmentStateChangeImpl instance = new SetReturnShipmentStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetReturnShipmentStateChange
     * @return builder
     */
    public static SetReturnShipmentStateChangeBuilder builder() {
        return SetReturnShipmentStateChangeBuilder.of();
    }

    /**
     * create builder for SetReturnShipmentStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetReturnShipmentStateChangeBuilder builder(final SetReturnShipmentStateChange template) {
        return SetReturnShipmentStateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetReturnShipmentStateChange(Function<SetReturnShipmentStateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetReturnShipmentStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetReturnShipmentStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetReturnShipmentStateChange>";
            }
        };
    }
}
