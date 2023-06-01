package com.commercetools.ml.models.common;


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
 * Money
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MoneyImpl implements Money, ModelBase {

    
    private Long centAmount;
    
    
    private String currencyCode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MoneyImpl(@JsonProperty("centAmount") final Long centAmount, @JsonProperty("currencyCode") final String currencyCode) {
        this.centAmount = centAmount;
        this.currencyCode = currencyCode;
    }
    /**
     * create empty instance
     */
    public MoneyImpl() {
    }

    /**
     *
     */
    
    public Long getCentAmount(){
        return this.centAmount;
    }
    
    /**
     *  <p>The currency code compliant to ISO 4217.</p>
     */
    
    public String getCurrencyCode(){
        return this.currencyCode;
    }

    
    public void setCentAmount(final Long centAmount){
        this.centAmount = centAmount;
    }
    
    
    public void setCurrencyCode(final String currencyCode){
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MoneyImpl that = (MoneyImpl) o;
    
        return new EqualsBuilder()
                .append(centAmount, that.centAmount)
                .append(currencyCode, that.currencyCode)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(centAmount)
            .append(currencyCode)
            .toHashCode();
    }

}
