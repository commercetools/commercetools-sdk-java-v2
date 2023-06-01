package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Variant;
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
 * ChangeMasterVariantChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeMasterVariantChangeImpl implements ChangeMasterVariantChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private String catalogData;
    
    
    private com.commercetools.history.models.common.Variant previousValue;
    
    
    private com.commercetools.history.models.common.Variant nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeMasterVariantChangeImpl(@JsonProperty("change") final String change, @JsonProperty("catalogData") final String catalogData, @JsonProperty("previousValue") final com.commercetools.history.models.common.Variant previousValue, @JsonProperty("nextValue") final com.commercetools.history.models.common.Variant nextValue) {
        this.change = change;
        this.catalogData = catalogData;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type =  CHANGE_MASTER_VARIANT_CHANGE;
    }
    /**
     * create empty instance
     */
    public ChangeMasterVariantChangeImpl() {
        this.type =  CHANGE_MASTER_VARIANT_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Update action for <code>changeMasterVariant</code></p>
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *
     */
    
    public String getCatalogData(){
        return this.catalogData;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.Variant getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.Variant getNextValue(){
        return this.nextValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setCatalogData(final String catalogData){
        this.catalogData = catalogData;
    }
    
    
    public void setPreviousValue(final com.commercetools.history.models.common.Variant previousValue){
        this.previousValue = previousValue;
    }
    
    
    public void setNextValue(final com.commercetools.history.models.common.Variant nextValue){
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ChangeMasterVariantChangeImpl that = (ChangeMasterVariantChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .append(catalogData, that.catalogData)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(change)
            .append(catalogData)
            .append(previousValue)
            .append(nextValue)
            .toHashCode();
    }

}
