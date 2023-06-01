package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.product_selection.ProductVariantSelection;
import com.commercetools.api.models.product_selection.ProductVariantSelectionTypeEnum;
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
 *  <p>All Product Variants except the explicitly stated SKUs are part of the Product Selection.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@Deprecated
public class ProductVariantSelectionExclusionImpl implements ProductVariantSelectionExclusion, ModelBase {

    
    private com.commercetools.api.models.product_selection.ProductVariantSelectionTypeEnum type;
    
    
    private java.util.List<String> skus;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantSelectionExclusionImpl(@JsonProperty("skus") final java.util.List<String> skus) {
        this.skus = skus;
        this.type = ProductVariantSelectionTypeEnum.findEnum("exclusion");
    }
    /**
     * create empty instance
     */
    public ProductVariantSelectionExclusionImpl() {
        this.type = ProductVariantSelectionTypeEnum.findEnum("exclusion");
    }

    /**
     *
     */
    
    public com.commercetools.api.models.product_selection.ProductVariantSelectionTypeEnum getType(){
        return this.type;
    }
    
    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     */
    
    public java.util.List<String> getSkus(){
        return this.skus;
    }

    
    public void setSkus(final String ...skus){
       this.skus = new ArrayList<>(Arrays.asList(skus));
    }
    
    
    public void setSkus(final java.util.List<String> skus){
       this.skus = skus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductVariantSelectionExclusionImpl that = (ProductVariantSelectionExclusionImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(skus, that.skus)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(skus)
            .toHashCode();
    }

}
