package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Money;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * SetCustomLineItemTaxedPriceChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetCustomLineItemTaxedPriceChangeImpl implements SetCustomLineItemTaxedPriceChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private com.commercetools.history.models.common.LocalizedString customLineItem;
    
    
    private String customLineItemId;
    
    
    private com.commercetools.history.models.common.Money nextValue;
    
    
    private com.commercetools.history.models.common.Money previousValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetCustomLineItemTaxedPriceChangeImpl(@JsonProperty("change") final String change, @JsonProperty("customLineItem") final com.commercetools.history.models.common.LocalizedString customLineItem, @JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("nextValue") final com.commercetools.history.models.common.Money nextValue, @JsonProperty("previousValue") final com.commercetools.history.models.common.Money previousValue) {
        this.change = change;
        this.customLineItem = customLineItem;
        this.customLineItemId = customLineItemId;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type =  SET_CUSTOM_LINE_ITEM_TAXED_PRICE_CHANGE;
    }
    /**
     * create empty instance
     */
    public SetCustomLineItemTaxedPriceChangeImpl() {
        this.type =  SET_CUSTOM_LINE_ITEM_TAXED_PRICE_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Update action for <code>setCustomLineItemTaxedPrice</code></p>
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.LocalizedString getCustomLineItem(){
        return this.customLineItem;
    }
    
    /**
     *
     */
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.Money getNextValue(){
        return this.nextValue;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.Money getPreviousValue(){
        return this.previousValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setCustomLineItem(final com.commercetools.history.models.common.LocalizedString customLineItem){
        this.customLineItem = customLineItem;
    }
    
    
    public void setCustomLineItemId(final String customLineItemId){
        this.customLineItemId = customLineItemId;
    }
    
    
    public void setNextValue(final com.commercetools.history.models.common.Money nextValue){
        this.nextValue = nextValue;
    }
    
    
    public void setPreviousValue(final com.commercetools.history.models.common.Money previousValue){
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SetCustomLineItemTaxedPriceChangeImpl that = (SetCustomLineItemTaxedPriceChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .append(customLineItem, that.customLineItem)
                .append(customLineItemId, that.customLineItemId)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(change)
            .append(customLineItem)
            .append(customLineItemId)
            .append(nextValue)
            .append(previousValue)
            .toHashCode();
    }

}
