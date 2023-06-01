package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantExclusion;
import com.commercetools.api.models.product_selection.ProductVariantSelection;
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
 * AssignedProductReference
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssignedProductReferenceImpl implements AssignedProductReference, ModelBase {

    
    private com.commercetools.api.models.product.ProductReference product;
    
    
    private com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection;
    
    
    private com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssignedProductReferenceImpl(@JsonProperty("product") final com.commercetools.api.models.product.ProductReference product, @JsonProperty("variantSelection") final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection, @JsonProperty("variantExclusion") final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion) {
        this.product = product;
        this.variantSelection = variantSelection;
        this.variantExclusion = variantExclusion;
    }
    /**
     * create empty instance
     */
    public AssignedProductReferenceImpl() {
    }

    /**
     *  <p>Reference to a Product that is assigned to the Product Selection.</p>
     */
    
    public com.commercetools.api.models.product.ProductReference getProduct(){
        return this.product;
    }
    
    /**
     *  <p>The Variants of the Product that are included from the Product Selection.</p>
     *  <p>This field may exist only in Product Selections with <code>Individual</code> ProductSelectionMode. In absence of this field, all Variants are deemed to be included.</p>
     */
    
    public com.commercetools.api.models.product_selection.ProductVariantSelection getVariantSelection(){
        return this.variantSelection;
    }
    
    /**
     *  <p>The Variants of the Product that are excluded from the Product Selection.</p>
     *  <p>This field may exist only in Product Selections with <code>IndividualExclusion</code> ProductSelectionMode. In absence of this field, all Variants are deemed to be excluded.</p>
     */
    
    public com.commercetools.api.models.product_selection.ProductVariantExclusion getVariantExclusion(){
        return this.variantExclusion;
    }

    
    public void setProduct(final com.commercetools.api.models.product.ProductReference product){
        this.product = product;
    }
    
    
    public void setVariantSelection(final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection){
        this.variantSelection = variantSelection;
    }
    
    
    public void setVariantExclusion(final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion){
        this.variantExclusion = variantExclusion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AssignedProductReferenceImpl that = (AssignedProductReferenceImpl) o;
    
        return new EqualsBuilder()
                .append(product, that.product)
                .append(variantSelection, that.variantSelection)
                .append(variantExclusion, that.variantExclusion)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(product)
            .append(variantSelection)
            .append(variantExclusion)
            .toHashCode();
    }

}
