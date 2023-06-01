package com.commercetools.api.models.product;

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
 *  <p>Assigns the specified Product Variant to the <code>masterVariant</code> and removes the same from <code>variants</code> at the same time. The current Master Variant becomes part of the <code>variants</code> array. Either <code>variantId</code> or <code>sku</code> is required.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductChangeMasterVariantActionImpl implements ProductChangeMasterVariantAction, ModelBase {

    
    private String action;
    
    
    private Long variantId;
    
    
    private String sku;
    
    
    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductChangeMasterVariantActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.sku = sku;
        this.staged = staged;
        this.action =  CHANGE_MASTER_VARIANT;
    }
    /**
     * create empty instance
     */
    public ProductChangeMasterVariantActionImpl() {
        this.action =  CHANGE_MASTER_VARIANT;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>The <code>id</code> of the ProductVariant to become the Master Variant.</p>
     */
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant to become the Master Variant.</p>
     */
    
    public String getSku(){
        return this.sku;
    }
    
    /**
     *  <p>If <code>true</code>, only the staged Master Variant is changed. If <code>false</code>, both the current and staged Master Variant are changed.</p>
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
    
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductChangeMasterVariantActionImpl that = (ProductChangeMasterVariantActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(staged, that.staged)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(variantId)
            .append(sku)
            .append(staged)
            .toHashCode();
    }

}
