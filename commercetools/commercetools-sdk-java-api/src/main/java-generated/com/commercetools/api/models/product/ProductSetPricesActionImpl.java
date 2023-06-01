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
 *  <p>Either <code>variantId</code> or <code>sku</code> is required.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSetPricesActionImpl implements ProductSetPricesAction, ModelBase {

    
    private String action;
    
    
    private Long variantId;
    
    
    private String sku;
    
    
    private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;
    
    
    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSetPricesActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("prices") final java.util.List<com.commercetools.api.models.common.PriceDraft> prices, @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.sku = sku;
        this.prices = prices;
        this.staged = staged;
        this.action =  SET_PRICES;
    }
    /**
     * create empty instance
     */
    public ProductSetPricesActionImpl() {
        this.action =  SET_PRICES;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     */
    
    public String getSku(){
        return this.sku;
    }
    
    /**
     *  <p>The Embedded Prices to set. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     */
    
    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices(){
        return this.prices;
    }
    
    /**
     *  <p>If <code>true</code>, only the staged ProductVariant is updated. If <code>false</code>, both the current and staged ProductVariant are updated.</p>
     */
    
    public Boolean getStaged(){
        return this.staged;
    }

    
    public void setVariantId(final Long variantId){
        this.variantId = variantId;
    }
    
    
    public void setSku(final String sku){
        this.sku = sku;
    }
    
    
    public void setPrices(final com.commercetools.api.models.common.PriceDraft ...prices){
       this.prices = new ArrayList<>(Arrays.asList(prices));
    }
    
    
    public void setPrices(final java.util.List<com.commercetools.api.models.common.PriceDraft> prices){
       this.prices = prices;
    }
    
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductSetPricesActionImpl that = (ProductSetPricesActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(prices, that.prices)
                .append(staged, that.staged)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(variantId)
            .append(sku)
            .append(prices)
            .append(staged)
            .toHashCode();
    }

}
