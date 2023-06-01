package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Price;
import com.commercetools.history.models.change.ChangePriceChangeImpl;

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
 * ChangePriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangePriceChange changePriceChange = ChangePriceChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .priceId("{priceId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ChangePriceChangeImpl.class)
public interface ChangePriceChange extends Change {

    /**
     * discriminator value for ChangePriceChange
     */
    String CHANGE_PRICE_CHANGE = "ChangePriceChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update action for changing prices</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *
     * @return catalogData
     */
    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();
    /**
     *
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Price getPreviousValue();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Price getNextValue();

    /**
     *  <p>Update action for changing prices</p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set catalogData
     * @param catalogData value to be set
     */
    
    public void setCatalogData(final String catalogData);
    
    
    /**
     * set priceId
     * @param priceId value to be set
     */
    
    public void setPriceId(final String priceId);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final Price previousValue);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final Price nextValue);
    

    /**
     * factory method
     * @return instance of ChangePriceChange
     */
    public static ChangePriceChange of(){
        return new ChangePriceChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy ChangePriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangePriceChange of(final ChangePriceChange template) {
        ChangePriceChangeImpl instance = new ChangePriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPriceId(template.getPriceId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangePriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangePriceChange deepCopy(@Nullable final ChangePriceChange template) {
        if (template == null) {
            return null;
        }
        ChangePriceChangeImpl instance = new ChangePriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPriceId(template.getPriceId());
        instance.setPreviousValue(com.commercetools.history.models.common.Price.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Price.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangePriceChange
     * @return builder
     */
    public static ChangePriceChangeBuilder builder() {
        return ChangePriceChangeBuilder.of();
    }
    
    /**
     * create builder for ChangePriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangePriceChangeBuilder builder(final ChangePriceChange template) {
        return ChangePriceChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangePriceChange(Function<ChangePriceChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangePriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangePriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangePriceChange>";
            }
        };
    }
}
