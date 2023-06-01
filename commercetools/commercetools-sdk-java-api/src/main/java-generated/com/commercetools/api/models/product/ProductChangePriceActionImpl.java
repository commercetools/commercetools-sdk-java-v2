package com.commercetools.api.models.product;

import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.ProductUpdateAction;
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
 * ProductChangePriceAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductChangePriceActionImpl implements ProductChangePriceAction, ModelBase {

    
    private String action;
    
    
    private String priceId;
    
    
    private com.commercetools.api.models.common.PriceDraft price;
    
    
    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductChangePriceActionImpl(@JsonProperty("priceId") final String priceId, @JsonProperty("price") final com.commercetools.api.models.common.PriceDraft price, @JsonProperty("staged") final Boolean staged) {
        this.priceId = priceId;
        this.price = price;
        this.staged = staged;
        this.action =  CHANGE_PRICE;
    }
    /**
     * create empty instance
     */
    public ProductChangePriceActionImpl() {
        this.action =  CHANGE_PRICE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>The <code>id</code> of the Embedded Price to update.</p>
     */
    
    public String getPriceId(){
        return this.priceId;
    }
    
    /**
     *  <p>Value to set.</p>
     */
    
    public com.commercetools.api.models.common.PriceDraft getPrice(){
        return this.price;
    }
    
    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     */
    
    public Boolean getStaged(){
        return this.staged;
    }

    
    public void setPriceId(final String priceId){
        this.priceId = priceId;
    }
    
    
    public void setPrice(final com.commercetools.api.models.common.PriceDraft price){
        this.price = price;
    }
    
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductChangePriceActionImpl that = (ProductChangePriceActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(priceId, that.priceId)
                .append(price, that.price)
                .append(staged, that.staged)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(priceId)
            .append(price)
            .append(staged)
            .toHashCode();
    }

}
