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
 *  <p>Generated after a successful Exclude Product update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSelectionProductExcludedMessagePayloadImpl implements ProductSelectionProductExcludedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.product.ProductReference product;
    
    
    private com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionProductExcludedMessagePayloadImpl(@JsonProperty("product") final com.commercetools.api.models.product.ProductReference product, @JsonProperty("variantExclusion") final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion) {
        this.product = product;
        this.variantExclusion = variantExclusion;
        this.type =  PRODUCT_SELECTION_PRODUCT_EXCLUDED;
    }
    /**
     * create empty instance
     */
    public ProductSelectionProductExcludedMessagePayloadImpl() {
        this.type =  PRODUCT_SELECTION_PRODUCT_EXCLUDED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Product that was excluded from the Product Selection.</p>
     */
    
    public com.commercetools.api.models.product.ProductReference getProduct(){
        return this.product;
    }
    
    /**
     *  <p>Product Variant Exclusion after the Exclude Product update action.</p>
     */
    
    public com.commercetools.api.models.product_selection.ProductVariantExclusion getVariantExclusion(){
        return this.variantExclusion;
    }

    
    public void setProduct(final com.commercetools.api.models.product.ProductReference product){
        this.product = product;
    }
    
    
    public void setVariantExclusion(final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion){
        this.variantExclusion = variantExclusion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductSelectionProductExcludedMessagePayloadImpl that = (ProductSelectionProductExcludedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(product, that.product)
                .append(variantExclusion, that.variantExclusion)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(product)
            .append(variantExclusion)
            .toHashCode();
    }

}
