package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.AssetChangeValue;
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
 * SetAssetTagsChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetAssetTagsChangeImpl implements SetAssetTagsChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private com.commercetools.history.models.change_value.AssetChangeValue asset;
    
    
    private java.util.List<String> nextValue;
    
    
    private java.util.List<String> previousValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetAssetTagsChangeImpl(@JsonProperty("change") final String change, @JsonProperty("asset") final com.commercetools.history.models.change_value.AssetChangeValue asset, @JsonProperty("nextValue") final java.util.List<String> nextValue, @JsonProperty("previousValue") final java.util.List<String> previousValue) {
        this.change = change;
        this.asset = asset;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type =  SET_ASSET_TAGS_CHANGE;
    }
    /**
     * create empty instance
     */
    public SetAssetTagsChangeImpl() {
        this.type =  SET_ASSET_TAGS_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Update action for <code>setAssetTags</code></p>
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.change_value.AssetChangeValue getAsset(){
        return this.asset;
    }
    
    /**
     *
     */
    
    public java.util.List<String> getNextValue(){
        return this.nextValue;
    }
    
    /**
     *
     */
    
    public java.util.List<String> getPreviousValue(){
        return this.previousValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setAsset(final com.commercetools.history.models.change_value.AssetChangeValue asset){
        this.asset = asset;
    }
    
    
    public void setNextValue(final String ...nextValue){
       this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }
    
    
    public void setNextValue(final java.util.List<String> nextValue){
       this.nextValue = nextValue;
    }
    
    
    public void setPreviousValue(final String ...previousValue){
       this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }
    
    
    public void setPreviousValue(final java.util.List<String> previousValue){
       this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SetAssetTagsChangeImpl that = (SetAssetTagsChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .append(asset, that.asset)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(change)
            .append(asset)
            .append(nextValue)
            .append(previousValue)
            .toHashCode();
    }

}
