package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
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
 * ChangeAssetOrderChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeAssetOrderChangeImpl implements ChangeAssetOrderChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private java.util.List<com.commercetools.history.models.common.LocalizedString> previousValue;
    
    
    private java.util.List<com.commercetools.history.models.common.LocalizedString> nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeAssetOrderChangeImpl(@JsonProperty("change") final String change, @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.LocalizedString> previousValue, @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.LocalizedString> nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type =  CHANGE_ASSET_ORDER_CHANGE;
    }
    /**
     * create empty instance
     */
    public ChangeAssetOrderChangeImpl() {
        this.type =  CHANGE_ASSET_ORDER_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.history.models.common.LocalizedString> getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.history.models.common.LocalizedString> getNextValue(){
        return this.nextValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setPreviousValue(final com.commercetools.history.models.common.LocalizedString ...previousValue){
       this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }
    
    
    public void setPreviousValue(final java.util.List<com.commercetools.history.models.common.LocalizedString> previousValue){
       this.previousValue = previousValue;
    }
    
    
    public void setNextValue(final com.commercetools.history.models.common.LocalizedString ...nextValue){
       this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }
    
    
    public void setNextValue(final java.util.List<com.commercetools.history.models.common.LocalizedString> nextValue){
       this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ChangeAssetOrderChangeImpl that = (ChangeAssetOrderChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(change)
            .append(previousValue)
            .append(nextValue)
            .toHashCode();
    }

}
