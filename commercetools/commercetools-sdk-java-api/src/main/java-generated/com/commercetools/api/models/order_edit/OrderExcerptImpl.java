package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.TaxedPrice;
import com.commercetools.api.models.common.TypedMoney;
import io.vrap.rmf.base.client.utils.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderExcerptImpl implements OrderExcerpt {

    
    private com.commercetools.api.models.common.TypedMoney totalPrice;
    
    
    private com.commercetools.api.models.cart.TaxedPrice taxedPrice;
    
    
    private Integer version;

    @JsonCreator
    OrderExcerptImpl(@JsonProperty("totalPrice") final com.commercetools.api.models.common.TypedMoney totalPrice, @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedPrice taxedPrice, @JsonProperty("version") final Integer version) {
        this.totalPrice = totalPrice;
        this.taxedPrice = taxedPrice;
        this.version = version;
    }
    public OrderExcerptImpl() {
    }

    
    public com.commercetools.api.models.common.TypedMoney getTotalPrice(){
        return this.totalPrice;
    }
    
    
    public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice(){
        return this.taxedPrice;
    }
    
    
    public Integer getVersion(){
        return this.version;
    }

    
    public void setTotalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice){
        this.totalPrice = totalPrice;
    }
    
    
    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedPrice taxedPrice){
        this.taxedPrice = taxedPrice;
    }
    
    
    public void setVersion(final Integer version){
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderExcerptImpl that = (OrderExcerptImpl) o;
    
        return new EqualsBuilder()
                .append(totalPrice, that.totalPrice)
                .append(taxedPrice, that.taxedPrice)
                .append(version, that.version)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(totalPrice)
            .append(taxedPrice)
            .append(version)
            .toHashCode();
    }

}
