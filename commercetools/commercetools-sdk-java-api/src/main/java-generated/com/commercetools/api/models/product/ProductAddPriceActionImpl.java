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
 *  <p>Adds the given Price to the <code>prices</code> array of the ProductVariant. Either <code>variantId</code> or <code>sku</code> is required.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductAddPriceActionImpl implements ProductAddPriceAction, ModelBase {

    
    private String action;
    
    
    private Long variantId;
    
    
    private String sku;
    
    
    private com.commercetools.api.models.common.PriceDraft price;
    
    
    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductAddPriceActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("price") final com.commercetools.api.models.common.PriceDraft price, @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.sku = sku;
        this.price = price;
        this.staged = staged;
        this.action =  ADD_PRICE;
    }
    /**
     * create empty instance
     */
    public ProductAddPriceActionImpl() {
        this.action =  ADD_PRICE;
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
     *  <p>Embedded Price to add to the Product Variant.</p>
     */
    
    public com.commercetools.api.models.common.PriceDraft getPrice(){
        return this.price;
    }
    
    /**
     *  <p>If <code>true</code>, only the staged <code>prices</code> is updated. If <code>false</code>, both the current and staged <code>prices</code> are updated.</p>
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
    
        ProductAddPriceActionImpl that = (ProductAddPriceActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(price, that.price)
                .append(staged, that.staged)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(variantId)
            .append(sku)
            .append(price)
            .append(staged)
            .toHashCode();
    }

}
