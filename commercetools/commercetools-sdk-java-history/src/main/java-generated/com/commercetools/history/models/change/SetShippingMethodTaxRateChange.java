package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.TaxMode;
import com.commercetools.history.models.common.TaxRate;
import com.commercetools.history.models.change.SetShippingMethodTaxRateChangeImpl;

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
 * SetShippingMethodTaxRateChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingMethodTaxRateChange setShippingMethodTaxRateChange = SetShippingMethodTaxRateChange.builder()
 *             .change("{change}")
 *             .taxMode(TaxMode.PLATFORM)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SetShippingMethodTaxRateChangeImpl.class)
public interface SetShippingMethodTaxRateChange extends Change {

    /**
     * discriminator value for SetShippingMethodTaxRateChange
     */
    String SET_SHIPPING_METHOD_TAX_RATE_CHANGE = "SetShippingMethodTaxRateChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>setShippingMethodTaxRate</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *
     * @return taxMode
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxRate getNextValue();
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public TaxRate getPreviousValue();

    /**
     *  <p>Update action for <code>setShippingMethodTaxRate</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set taxMode
     * @param taxMode value to be set
     */
    
    public void setTaxMode(final TaxMode taxMode);
    
    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param nextValue value to be set
     */
    
    public void setNextValue(final TaxRate nextValue);
    
    
    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final TaxRate previousValue);
    

    /**
     * factory method
     * @return instance of SetShippingMethodTaxRateChange
     */
    public static SetShippingMethodTaxRateChange of(){
        return new SetShippingMethodTaxRateChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetShippingMethodTaxRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShippingMethodTaxRateChange of(final SetShippingMethodTaxRateChange template) {
        SetShippingMethodTaxRateChangeImpl instance = new SetShippingMethodTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetShippingMethodTaxRateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShippingMethodTaxRateChange deepCopy(@Nullable final SetShippingMethodTaxRateChange template) {
        if (template == null) {
            return null;
        }
        SetShippingMethodTaxRateChangeImpl instance = new SetShippingMethodTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setTaxMode(template.getTaxMode());
        instance.setNextValue(com.commercetools.history.models.common.TaxRate.deepCopy(template.getNextValue()));
        instance.setPreviousValue(com.commercetools.history.models.common.TaxRate.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for SetShippingMethodTaxRateChange
     * @return builder
     */
    public static SetShippingMethodTaxRateChangeBuilder builder() {
        return SetShippingMethodTaxRateChangeBuilder.of();
    }
    
    /**
     * create builder for SetShippingMethodTaxRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingMethodTaxRateChangeBuilder builder(final SetShippingMethodTaxRateChange template) {
        return SetShippingMethodTaxRateChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShippingMethodTaxRateChange(Function<SetShippingMethodTaxRateChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingMethodTaxRateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingMethodTaxRateChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingMethodTaxRateChange>";
            }
        };
    }
}
