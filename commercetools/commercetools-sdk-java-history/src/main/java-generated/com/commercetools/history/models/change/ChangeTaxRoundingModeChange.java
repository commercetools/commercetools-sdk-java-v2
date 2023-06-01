package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.RoundingMode;
import com.commercetools.history.models.change.ChangeTaxRoundingModeChangeImpl;

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
 * ChangeTaxRoundingModeChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTaxRoundingModeChange changeTaxRoundingModeChange = ChangeTaxRoundingModeChange.builder()
 *             .change("{change}")
 *             .previousValue(RoundingMode.HALF_EVEN)
 *             .nextValue(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ChangeTaxRoundingModeChangeImpl.class)
public interface ChangeTaxRoundingModeChange extends Change {

    /**
     * discriminator value for ChangeTaxRoundingModeChange
     */
    String CHANGE_TAX_ROUNDING_MODE_CHANGE = "ChangeTaxRoundingModeChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Shape of the action for <code>changeTaxRoundingMode</code></p>
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
    public RoundingMode getPreviousValue();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public RoundingMode getNextValue();

    /**
     *  <p>Shape of the action for <code>changeTaxRoundingMode</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final RoundingMode previousValue);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final RoundingMode nextValue);
    

    /**
     * factory method
     * @return instance of ChangeTaxRoundingModeChange
     */
    public static ChangeTaxRoundingModeChange of(){
        return new ChangeTaxRoundingModeChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy ChangeTaxRoundingModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTaxRoundingModeChange of(final ChangeTaxRoundingModeChange template) {
        ChangeTaxRoundingModeChangeImpl instance = new ChangeTaxRoundingModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeTaxRoundingModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeTaxRoundingModeChange deepCopy(@Nullable final ChangeTaxRoundingModeChange template) {
        if (template == null) {
            return null;
        }
        ChangeTaxRoundingModeChangeImpl instance = new ChangeTaxRoundingModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeTaxRoundingModeChange
     * @return builder
     */
    public static ChangeTaxRoundingModeChangeBuilder builder() {
        return ChangeTaxRoundingModeChangeBuilder.of();
    }
    
    /**
     * create builder for ChangeTaxRoundingModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTaxRoundingModeChangeBuilder builder(final ChangeTaxRoundingModeChange template) {
        return ChangeTaxRoundingModeChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTaxRoundingModeChange(Function<ChangeTaxRoundingModeChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTaxRoundingModeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTaxRoundingModeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTaxRoundingModeChange>";
            }
        };
    }
}
