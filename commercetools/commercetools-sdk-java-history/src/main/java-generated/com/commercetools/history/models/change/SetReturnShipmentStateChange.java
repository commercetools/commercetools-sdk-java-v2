package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.ReturnShipmentState;
import com.commercetools.history.models.change.SetReturnShipmentStateChangeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * SetReturnShipmentStateChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetReturnShipmentStateChange setReturnShipmentStateChange = SetReturnShipmentStateChange.builder()
 *             .change("{change}")
 *             .nextValue(ReturnShipmentState.ADVISED)
 *             .previousValue(ReturnShipmentState.ADVISED)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
     *  <p>Update action for <code>setReturnShipmentState</code></p>
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
    public ReturnShipmentState getNextValue();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public ReturnShipmentState getPreviousValue();

    /**
     *  <p>Update action for <code>setReturnShipmentState</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final ReturnShipmentState nextValue);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final ReturnShipmentState previousValue);
    

    /**
     * factory method
     * @return instance of SetReturnShipmentStateChange
     */
    public static SetReturnShipmentStateChange of(){
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
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
