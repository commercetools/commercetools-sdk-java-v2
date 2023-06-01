package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.TypedMoney;
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
 * CustomLineItemTaxedPrice
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomLineItemTaxedPriceImpl implements CustomLineItemTaxedPrice, ModelBase {

    
    private com.commercetools.importapi.models.common.TypedMoney totalNet;
    
    
    private com.commercetools.importapi.models.common.TypedMoney totalGross;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomLineItemTaxedPriceImpl(@JsonProperty("totalNet") final com.commercetools.importapi.models.common.TypedMoney totalNet, @JsonProperty("totalGross") final com.commercetools.importapi.models.common.TypedMoney totalGross) {
        this.totalNet = totalNet;
        this.totalGross = totalGross;
    }
    /**
     * create empty instance
     */
    public CustomLineItemTaxedPriceImpl() {
    }

    /**
     *
     */
    
    public com.commercetools.importapi.models.common.TypedMoney getTotalNet(){
        return this.totalNet;
    }
    
    /**
     *
     */
    
    public com.commercetools.importapi.models.common.TypedMoney getTotalGross(){
        return this.totalGross;
    }

    
    public void setTotalNet(final com.commercetools.importapi.models.common.TypedMoney totalNet){
        this.totalNet = totalNet;
    }
    
    
    public void setTotalGross(final com.commercetools.importapi.models.common.TypedMoney totalGross){
        this.totalGross = totalGross;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomLineItemTaxedPriceImpl that = (CustomLineItemTaxedPriceImpl) o;
    
        return new EqualsBuilder()
                .append(totalNet, that.totalNet)
                .append(totalGross, that.totalGross)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(totalNet)
            .append(totalGross)
            .toHashCode();
    }

}
