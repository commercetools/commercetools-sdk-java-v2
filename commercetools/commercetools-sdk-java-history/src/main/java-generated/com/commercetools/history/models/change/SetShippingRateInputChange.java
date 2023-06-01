package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.SetCartClassificationShippingRateInputValue;
import com.commercetools.history.models.change_value.SetCartScoreShippingRateInputValue;
import java.lang.Object;
import com.commercetools.history.models.change.SetShippingRateInputChangeImpl;

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
 * SetShippingRateInputChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingRateInputChange setShippingRateInputChange = SetShippingRateInputChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SetShippingRateInputChangeImpl.class)
public interface SetShippingRateInputChange extends Change {

    /**
     * discriminator value for SetShippingRateInputChange
     */
    String SET_SHIPPING_RATE_INPUT_CHANGE = "SetShippingRateInputChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>setShippingRateInput</code></p>
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
    public Object getNextValue();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Update action for <code>setShippingRateInput</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final SetCartClassificationShippingRateInputValue nextValue);
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final SetCartScoreShippingRateInputValue nextValue);
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final Object nextValue);
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final SetCartClassificationShippingRateInputValue previousValue);
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final SetCartScoreShippingRateInputValue previousValue);
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final Object previousValue);

    /**
     * factory method
     * @return instance of SetShippingRateInputChange
     */
    public static SetShippingRateInputChange of(){
        return new SetShippingRateInputChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetShippingRateInputChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShippingRateInputChange of(final SetShippingRateInputChange template) {
        SetShippingRateInputChangeImpl instance = new SetShippingRateInputChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetShippingRateInputChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShippingRateInputChange deepCopy(@Nullable final SetShippingRateInputChange template) {
        if (template == null) {
            return null;
        }
        SetShippingRateInputChangeImpl instance = new SetShippingRateInputChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetShippingRateInputChange
     * @return builder
     */
    public static SetShippingRateInputChangeBuilder builder() {
        return SetShippingRateInputChangeBuilder.of();
    }
    
    /**
     * create builder for SetShippingRateInputChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingRateInputChangeBuilder builder(final SetShippingRateInputChange template) {
        return SetShippingRateInputChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShippingRateInputChange(Function<SetShippingRateInputChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingRateInputChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingRateInputChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingRateInputChange>";
            }
        };
    }
}
