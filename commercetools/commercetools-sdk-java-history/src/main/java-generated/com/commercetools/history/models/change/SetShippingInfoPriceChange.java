package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.change.SetShippingInfoPriceChangeImpl;

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
 * SetShippingInfoPriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingInfoPriceChange setShippingInfoPriceChange = SetShippingInfoPriceChange.builder()
 *             .change("{change}")
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
@JsonDeserialize(as = SetShippingInfoPriceChangeImpl.class)
public interface SetShippingInfoPriceChange extends Change {

    /**
     * discriminator value for SetShippingInfoPriceChange
     */
    String SET_SHIPPING_INFO_PRICE_CHANGE = "SetShippingInfoPriceChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for <code>setShippingInfoPrice</code></p>
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
    @Valid
    @JsonProperty("nextValue")
    public Money getNextValue();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Money getPreviousValue();

    /**
     *  <p>Update action for <code>setShippingInfoPrice</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final Money nextValue);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final Money previousValue);
    

    /**
     * factory method
     * @return instance of SetShippingInfoPriceChange
     */
    public static SetShippingInfoPriceChange of(){
        return new SetShippingInfoPriceChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetShippingInfoPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShippingInfoPriceChange of(final SetShippingInfoPriceChange template) {
        SetShippingInfoPriceChangeImpl instance = new SetShippingInfoPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetShippingInfoPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShippingInfoPriceChange deepCopy(@Nullable final SetShippingInfoPriceChange template) {
        if (template == null) {
            return null;
        }
        SetShippingInfoPriceChangeImpl instance = new SetShippingInfoPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(com.commercetools.history.models.common.Money.deepCopy(template.getNextValue()));
        instance.setPreviousValue(com.commercetools.history.models.common.Money.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for SetShippingInfoPriceChange
     * @return builder
     */
    public static SetShippingInfoPriceChangeBuilder builder() {
        return SetShippingInfoPriceChangeBuilder.of();
    }
    
    /**
     * create builder for SetShippingInfoPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingInfoPriceChangeBuilder builder(final SetShippingInfoPriceChange template) {
        return SetShippingInfoPriceChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShippingInfoPriceChange(Function<SetShippingInfoPriceChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingInfoPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingInfoPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingInfoPriceChange>";
            }
        };
    }
}
