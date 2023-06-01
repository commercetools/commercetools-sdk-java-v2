package com.commercetools.api.models.cart;

import com.commercetools.api.models.tax_category.TaxRate;
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
 * MethodTaxRate
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MethodTaxRateImpl implements MethodTaxRate, ModelBase {

    
    private String shippingMethodKey;
    
    
    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MethodTaxRateImpl(@JsonProperty("shippingMethodKey") final String shippingMethodKey, @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.shippingMethodKey = shippingMethodKey;
        this.taxRate = taxRate;
    }
    /**
     * create empty instance
     */
    public MethodTaxRateImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     */
    
    public String getShippingMethodKey(){
        return this.shippingMethodKey;
    }
    
    /**
     *  <p>Tax Rate for the Shipping Method.</p>
     */
    
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate(){
        return this.taxRate;
    }

    
    public void setShippingMethodKey(final String shippingMethodKey){
        this.shippingMethodKey = shippingMethodKey;
    }
    
    
    public void setTaxRate(final com.commercetools.api.models.tax_category.TaxRate taxRate){
        this.taxRate = taxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MethodTaxRateImpl that = (MethodTaxRateImpl) o;
    
        return new EqualsBuilder()
                .append(shippingMethodKey, that.shippingMethodKey)
                .append(taxRate, that.taxRate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(shippingMethodKey)
            .append(taxRate)
            .toHashCode();
    }

}
