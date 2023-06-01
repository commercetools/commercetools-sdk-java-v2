package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.message.MessagePayload;
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
 *  <p>Generated after a successful Set Embedded Prices update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductPricesSetMessagePayloadImpl implements ProductPricesSetMessagePayload, ModelBase {

    
    private String type;
    
    
    private Long variantId;
    
    
    private java.util.List<com.commercetools.api.models.common.Price> prices;
    
    
    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPricesSetMessagePayloadImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("prices") final java.util.List<com.commercetools.api.models.common.Price> prices, @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.prices = prices;
        this.staged = staged;
        this.type =  PRODUCT_PRICES_SET;
    }
    /**
     * create empty instance
     */
    public ProductPricesSetMessagePayloadImpl() {
        this.type =  PRODUCT_PRICES_SET;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was set.</p>
     */
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     */
    
    public java.util.List<com.commercetools.api.models.common.Price> getPrices(){
        return this.prices;
    }
    
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     */
    
    public Boolean getStaged(){
        return this.staged;
    }

    
    public void setVariantId(final Long variantId){
        this.variantId = variantId;
    }
    
    
    public void setPrices(final com.commercetools.api.models.common.Price ...prices){
       this.prices = new ArrayList<>(Arrays.asList(prices));
    }
    
    
    public void setPrices(final java.util.List<com.commercetools.api.models.common.Price> prices){
       this.prices = prices;
    }
    
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductPricesSetMessagePayloadImpl that = (ProductPricesSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(variantId, that.variantId)
                .append(prices, that.prices)
                .append(staged, that.staged)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(variantId)
            .append(prices)
            .append(staged)
            .toHashCode();
    }

}
