package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.commercetools.api.models.product_selection.ProductSelectionUpdateAction;
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
 *  <p>Updates the Product Variant Exclusion of an existing Product Selection Assignment. A ProductVariantExclusion can only be set if the Product has already been excluded from the Product Selection with <code>IndividualExclusion</code> ProductSelectionMode.</p>
 *  <p>If the specified Product is not assigned to the Product Selection, a ProductAssignmentMissing error is returned.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSelectionSetVariantExclusionActionImpl implements ProductSelectionSetVariantExclusionAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.product.ProductResourceIdentifier product;
    
    
    private com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionSetVariantExclusionActionImpl(@JsonProperty("product") final com.commercetools.api.models.product.ProductResourceIdentifier product, @JsonProperty("variantExclusion") final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion) {
        this.product = product;
        this.variantExclusion = variantExclusion;
        this.action =  SET_VARIANT_EXCLUSION;
    }
    /**
     * create empty instance
     */
    public ProductSelectionSetVariantExclusionActionImpl() {
        this.action =  SET_VARIANT_EXCLUSION;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>ResourceIdentifier of the Product</p>
     */
    
    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct(){
        return this.product;
    }
    
    /**
     *  <p>Determines which Variants of the previously excluded Product are to be included in the Product Selection with <code>IndividualExclusion</code> ProductSelectionMode. Leave it empty to unset an existing Variant Exclusion.</p>
     */
    
    public com.commercetools.api.models.product_selection.ProductVariantExclusion getVariantExclusion(){
        return this.variantExclusion;
    }

    
    public void setProduct(final com.commercetools.api.models.product.ProductResourceIdentifier product){
        this.product = product;
    }
    
    
    public void setVariantExclusion(final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion){
        this.variantExclusion = variantExclusion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductSelectionSetVariantExclusionActionImpl that = (ProductSelectionSetVariantExclusionActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(product, that.product)
                .append(variantExclusion, that.variantExclusion)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(product)
            .append(variantExclusion)
            .toHashCode();
    }

}
