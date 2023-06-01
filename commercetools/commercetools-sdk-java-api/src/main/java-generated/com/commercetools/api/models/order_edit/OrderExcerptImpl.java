package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.TaxedPrice;
import com.commercetools.api.models.common.TypedMoney;
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
 * OrderExcerpt
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderExcerptImpl implements OrderExcerpt, ModelBase {

    
    private com.commercetools.api.models.common.TypedMoney totalPrice;
    
    
    private com.commercetools.api.models.cart.TaxedPrice taxedPrice;
    
    
    private Long version;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderExcerptImpl(@JsonProperty("totalPrice") final com.commercetools.api.models.common.TypedMoney totalPrice, @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedPrice taxedPrice, @JsonProperty("version") final Long version) {
        this.totalPrice = totalPrice;
        this.taxedPrice = taxedPrice;
        this.version = version;
    }
    /**
     * create empty instance
     */
    public OrderExcerptImpl() {
    }

    /**
     *
     */
    
    public com.commercetools.api.models.common.TypedMoney getTotalPrice(){
        return this.totalPrice;
    }
    
    /**
     *
     */
    
    public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice(){
        return this.taxedPrice;
    }
    
    /**
     *
     */
    
    public Long getVersion(){
        return this.version;
    }

    
    public void setTotalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice){
        this.totalPrice = totalPrice;
    }
    
    
    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedPrice taxedPrice){
        this.taxedPrice = taxedPrice;
    }
    
    
    public void setVersion(final Long version){
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
