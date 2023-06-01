package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.message.MessagePayload;
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
 *  <p>Generated after a successful Change Value update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StandalonePriceValueChangedMessagePayloadImpl implements StandalonePriceValueChangedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.common.Money value;
    
    
    private Boolean staged;
    
    
    private com.commercetools.api.models.common.Money oldValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceValueChangedMessagePayloadImpl(@JsonProperty("value") final com.commercetools.api.models.common.Money value, @JsonProperty("staged") final Boolean staged, @JsonProperty("oldValue") final com.commercetools.api.models.common.Money oldValue) {
        this.value = value;
        this.staged = staged;
        this.oldValue = oldValue;
        this.type =  STANDALONE_PRICE_VALUE_CHANGED;
    }
    /**
     * create empty instance
     */
    public StandalonePriceValueChangedMessagePayloadImpl() {
        this.type =  STANDALONE_PRICE_VALUE_CHANGED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     */
    
    public com.commercetools.api.models.common.Money getValue(){
        return this.value;
    }
    
    /**
     *  <p>Whether the new value was applied to the current or the staged representation of the StandalonePrice. Staged changes are stored on the StagedStandalonePrice.</p>
     */
    
    public Boolean getStaged(){
        return this.staged;
    }
    
    /**
     *  <p>The old value of the updated StandalonePrice. Present on Messages created after 3 February 2023. Optional for backwards compatibility.</p>
     */
    
    public com.commercetools.api.models.common.Money getOldValue(){
        return this.oldValue;
    }

    
    public void setValue(final com.commercetools.api.models.common.Money value){
        this.value = value;
    }
    
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }
    
    
    public void setOldValue(final com.commercetools.api.models.common.Money oldValue){
        this.oldValue = oldValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StandalonePriceValueChangedMessagePayloadImpl that = (StandalonePriceValueChangedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(value, that.value)
                .append(staged, that.staged)
                .append(oldValue, that.oldValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(value)
            .append(staged)
            .append(oldValue)
            .toHashCode();
    }

}
