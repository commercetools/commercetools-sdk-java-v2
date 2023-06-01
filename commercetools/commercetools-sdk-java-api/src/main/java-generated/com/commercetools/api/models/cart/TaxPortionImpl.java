package com.commercetools.api.models.cart;

import com.commercetools.api.models.common.CentPrecisionMoney;
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
 *  <p>The tax portions are calculated from the TaxRates. If a Tax Rate has SubRates, they are used and can be identified by name. Tax portions from Line Items with the same <code>rate</code> and <code>name</code> are accumulated to the same tax portion.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TaxPortionImpl implements TaxPortion, ModelBase {

    
    private String name;
    
    
    private Double rate;
    
    
    private com.commercetools.api.models.common.CentPrecisionMoney amount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TaxPortionImpl(@JsonProperty("name") final String name, @JsonProperty("rate") final Double rate, @JsonProperty("amount") final com.commercetools.api.models.common.CentPrecisionMoney amount) {
        this.name = name;
        this.rate = rate;
        this.amount = amount;
    }
    /**
     * create empty instance
     */
    public TaxPortionImpl() {
    }

    /**
     *  <p>Name of the tax portion.</p>
     */
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>A number in the range 0-1.</p>
     */
    
    public Double getRate(){
        return this.rate;
    }
    
    /**
     *  <p>Money value of the tax portion.</p>
     */
    
    public com.commercetools.api.models.common.CentPrecisionMoney getAmount(){
        return this.amount;
    }

    
    public void setName(final String name){
        this.name = name;
    }
    
    
    public void setRate(final Double rate){
        this.rate = rate;
    }
    
    
    public void setAmount(final com.commercetools.api.models.common.CentPrecisionMoney amount){
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        TaxPortionImpl that = (TaxPortionImpl) o;
    
        return new EqualsBuilder()
                .append(name, that.name)
                .append(rate, that.rate)
                .append(amount, that.amount)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(name)
            .append(rate)
            .append(amount)
            .toHashCode();
    }

}
