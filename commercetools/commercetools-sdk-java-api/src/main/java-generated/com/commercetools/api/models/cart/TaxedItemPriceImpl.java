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
 * TaxedItemPrice
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TaxedItemPriceImpl implements TaxedItemPrice, ModelBase {

    
    private com.commercetools.api.models.common.CentPrecisionMoney totalNet;
    
    
    private com.commercetools.api.models.common.CentPrecisionMoney totalGross;
    
    
    private com.commercetools.api.models.common.CentPrecisionMoney totalTax;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TaxedItemPriceImpl(@JsonProperty("totalNet") final com.commercetools.api.models.common.CentPrecisionMoney totalNet, @JsonProperty("totalGross") final com.commercetools.api.models.common.CentPrecisionMoney totalGross, @JsonProperty("totalTax") final com.commercetools.api.models.common.CentPrecisionMoney totalTax) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
        this.totalTax = totalTax;
    }
    /**
     * create empty instance
     */
    public TaxedItemPriceImpl() {
    }

    /**
     *  <p>Total net amount of the Line Item or Custom Line Item.</p>
     */
    
    public com.commercetools.api.models.common.CentPrecisionMoney getTotalNet(){
        return this.totalNet;
    }
    
    /**
     *  <p>Total gross amount of the Line Item or Custom Line Item.</p>
     */
    
    public com.commercetools.api.models.common.CentPrecisionMoney getTotalGross(){
        return this.totalGross;
    }
    
    /**
     *  <p>Total tax applicable for the Line Item or Custom Line Item. Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     */
    
    public com.commercetools.api.models.common.CentPrecisionMoney getTotalTax(){
        return this.totalTax;
    }

    
    public void setTotalNet(final com.commercetools.api.models.common.CentPrecisionMoney totalNet){
        this.totalNet = totalNet;
    }
    
    
    public void setTotalGross(final com.commercetools.api.models.common.CentPrecisionMoney totalGross){
        this.totalGross = totalGross;
    }
    
    
    public void setTotalTax(final com.commercetools.api.models.common.CentPrecisionMoney totalTax){
        this.totalTax = totalTax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        TaxedItemPriceImpl that = (TaxedItemPriceImpl) o;
    
        return new EqualsBuilder()
                .append(totalNet, that.totalNet)
                .append(totalGross, that.totalGross)
                .append(totalTax, that.totalTax)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(totalNet)
            .append(totalGross)
            .append(totalTax)
            .toHashCode();
    }

}
