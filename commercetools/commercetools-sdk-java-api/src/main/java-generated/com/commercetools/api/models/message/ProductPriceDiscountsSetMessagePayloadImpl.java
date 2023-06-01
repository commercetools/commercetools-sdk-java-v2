package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice;
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
 *  <p>Generated after a Price is updated due to a Product Discount.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductPriceDiscountsSetMessagePayloadImpl implements ProductPriceDiscountsSetMessagePayload, ModelBase {

    
    private String type;
    
    
    private java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPriceDiscountsSetMessagePayloadImpl(@JsonProperty("updatedPrices") final java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices) {
        this.updatedPrices = updatedPrices;
        this.type =  PRODUCT_PRICE_DISCOUNTS_SET;
    }
    /**
     * create empty instance
     */
    public ProductPriceDiscountsSetMessagePayloadImpl() {
        this.type =  PRODUCT_PRICE_DISCOUNTS_SET;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Array containing details about the Embedded Prices that were updated.</p>
     */
    
    public java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices(){
        return this.updatedPrices;
    }

    
    public void setUpdatedPrices(final com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice ...updatedPrices){
       this.updatedPrices = new ArrayList<>(Arrays.asList(updatedPrices));
    }
    
    
    public void setUpdatedPrices(final java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices){
       this.updatedPrices = updatedPrices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductPriceDiscountsSetMessagePayloadImpl that = (ProductPriceDiscountsSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(updatedPrices, that.updatedPrices)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(updatedPrices)
            .toHashCode();
    }

}
