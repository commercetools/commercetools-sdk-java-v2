package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantExclusion;
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
 *  <p>Generated after a successful Set Variant Exclusion update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSelectionVariantExclusionChangedMessagePayloadImpl implements ProductSelectionVariantExclusionChangedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.product.ProductReference product;
    
    
    private com.commercetools.api.models.product_selection.ProductVariantExclusion oldVariantExclusion;
    
    
    private com.commercetools.api.models.product_selection.ProductVariantExclusion newVariantExclusion;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionVariantExclusionChangedMessagePayloadImpl(@JsonProperty("product") final com.commercetools.api.models.product.ProductReference product, @JsonProperty("oldVariantExclusion") final com.commercetools.api.models.product_selection.ProductVariantExclusion oldVariantExclusion, @JsonProperty("newVariantExclusion") final com.commercetools.api.models.product_selection.ProductVariantExclusion newVariantExclusion) {
        this.product = product;
        this.oldVariantExclusion = oldVariantExclusion;
        this.newVariantExclusion = newVariantExclusion;
        this.type =  PRODUCT_SELECTION_VARIANT_EXCLUSION_CHANGED;
    }
    /**
     * create empty instance
     */
    public ProductSelectionVariantExclusionChangedMessagePayloadImpl() {
        this.type =  PRODUCT_SELECTION_VARIANT_EXCLUSION_CHANGED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Product for which the Product Variant Exclusion changed.</p>
     */
    
    public com.commercetools.api.models.product.ProductReference getProduct(){
        return this.product;
    }
    
    /**
     *  <p>Product Variant Exclusion before the Set Variant Exclusion update action.</p>
     */
    
    public com.commercetools.api.models.product_selection.ProductVariantExclusion getOldVariantExclusion(){
        return this.oldVariantExclusion;
    }
    
    /**
     *  <p>Product Variant Exclusion after the Set Variant Exclusion update action.</p>
     */
    
    public com.commercetools.api.models.product_selection.ProductVariantExclusion getNewVariantExclusion(){
        return this.newVariantExclusion;
    }

    
    public void setProduct(final com.commercetools.api.models.product.ProductReference product){
        this.product = product;
    }
    
    
    public void setOldVariantExclusion(final com.commercetools.api.models.product_selection.ProductVariantExclusion oldVariantExclusion){
        this.oldVariantExclusion = oldVariantExclusion;
    }
    
    
    public void setNewVariantExclusion(final com.commercetools.api.models.product_selection.ProductVariantExclusion newVariantExclusion){
        this.newVariantExclusion = newVariantExclusion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductSelectionVariantExclusionChangedMessagePayloadImpl that = (ProductSelectionVariantExclusionChangedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(product, that.product)
                .append(oldVariantExclusion, that.oldVariantExclusion)
                .append(newVariantExclusion, that.newVariantExclusion)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(product)
            .append(oldVariantExclusion)
            .append(newVariantExclusion)
            .toHashCode();
    }

}
