package com.commercetools.history.models.change_value;


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
 *  <p>Shape of the cart score shipping input rate value.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetCartScoreShippingRateInputValueImpl implements SetCartScoreShippingRateInputValue, ModelBase {

    
    private String type;
    
    
    private Integer score;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetCartScoreShippingRateInputValueImpl(@JsonProperty("type") final String type, @JsonProperty("score") final Integer score) {
        this.type = type;
        this.score = score;
    }
    /**
     * create empty instance
     */
    public SetCartScoreShippingRateInputValueImpl() {
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
    
    public Integer getScore(){
        return this.score;
    }

    
    public void setType(final String type){
        this.type = type;
    }
    
    
    public void setScore(final Integer score){
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SetCartScoreShippingRateInputValueImpl that = (SetCartScoreShippingRateInputValueImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(score, that.score)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(score)
            .toHashCode();
    }

}
