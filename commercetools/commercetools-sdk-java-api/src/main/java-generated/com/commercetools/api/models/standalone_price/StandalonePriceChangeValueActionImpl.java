package com.commercetools.api.models.standalone_price;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction;
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
 *  <p>Updating the value of a StandalonePrice produces the StandalonePriceValueChangedMessage.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StandalonePriceChangeValueActionImpl implements StandalonePriceChangeValueAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.common.Money value;
    
    
    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceChangeValueActionImpl(@JsonProperty("value") final com.commercetools.api.models.common.Money value, @JsonProperty("staged") final Boolean staged) {
        this.value = value;
        this.staged = staged;
        this.action =  CHANGE_VALUE;
    }
    /**
     * create empty instance
     */
    public StandalonePriceChangeValueActionImpl() {
        this.action =  CHANGE_VALUE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New value to set. Must not be empty.</p>
     */
    
    public com.commercetools.api.models.common.Money getValue(){
        return this.value;
    }
    
    /**
     *  <p>If set to <code>true</code> the update action applies to the StagedStandalonePrice. If set to <code>false</code>, the update action applies to the current StandalonePrice.</p>
     */
    
    public Boolean getStaged(){
        return this.staged;
    }

    
    public void setValue(final com.commercetools.api.models.common.Money value){
        this.value = value;
    }
    
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StandalonePriceChangeValueActionImpl that = (StandalonePriceChangeValueActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(value, that.value)
                .append(staged, that.staged)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(value)
            .append(staged)
            .toHashCode();
    }

}
