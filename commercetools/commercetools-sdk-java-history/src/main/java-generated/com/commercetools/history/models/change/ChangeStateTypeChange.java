package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.StateType;
import com.commercetools.history.models.change.ChangeStateTypeChangeImpl;

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
 * ChangeStateTypeChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeStateTypeChange changeStateTypeChange = ChangeStateTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(StateType.ORDER_STATE)
 *             .nextValue(StateType.ORDER_STATE)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ChangeStateTypeChangeImpl.class)
public interface ChangeStateTypeChange extends Change {

    /**
     * discriminator value for ChangeStateTypeChange
     */
    String CHANGE_STATE_TYPE_CHANGE = "ChangeStateTypeChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>changeType</code> on state</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public StateType getPreviousValue();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public StateType getNextValue();

    /**
     *  <p>Update action for <code>changeType</code> on state</p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final StateType previousValue);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final StateType nextValue);
    

    /**
     * factory method
     * @return instance of ChangeStateTypeChange
     */
    public static ChangeStateTypeChange of(){
        return new ChangeStateTypeChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy ChangeStateTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeStateTypeChange of(final ChangeStateTypeChange template) {
        ChangeStateTypeChangeImpl instance = new ChangeStateTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeStateTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeStateTypeChange deepCopy(@Nullable final ChangeStateTypeChange template) {
        if (template == null) {
            return null;
        }
        ChangeStateTypeChangeImpl instance = new ChangeStateTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeStateTypeChange
     * @return builder
     */
    public static ChangeStateTypeChangeBuilder builder() {
        return ChangeStateTypeChangeBuilder.of();
    }
    
    /**
     * create builder for ChangeStateTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeStateTypeChangeBuilder builder(final ChangeStateTypeChange template) {
        return ChangeStateTypeChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeStateTypeChange(Function<ChangeStateTypeChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeStateTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeStateTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeStateTypeChange>";
            }
        };
    }
}
