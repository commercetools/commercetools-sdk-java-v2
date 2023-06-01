package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.productvariants.ProductVariantPatch;
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
 *  <p>The request body to import ProductVariantPatches. The data to be imported are represented by ProductVariantPatch.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductVariantPatchRequestImpl implements ProductVariantPatchRequest, ModelBase {

    
    private com.commercetools.importapi.models.common.ImportResourceType type;
    
    
    private java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> patches;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantPatchRequestImpl(@JsonProperty("patches") final java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> patches) {
        this.patches = patches;
        this.type = ImportResourceType.findEnum("product-variant-patch");
    }
    /**
     * create empty instance
     */
    public ProductVariantPatchRequestImpl() {
        this.type = ImportResourceType.findEnum("product-variant-patch");
    }

    /**
     *  <p>The resource types that can be imported.</p>
     */
    
    public com.commercetools.importapi.models.common.ImportResourceType getType(){
        return this.type;
    }
    
    /**
     *  <p>The product variant patches of this request.</p>
     */
    
    public java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> getPatches(){
        return this.patches;
    }

    
    public void setPatches(final com.commercetools.importapi.models.productvariants.ProductVariantPatch ...patches){
       this.patches = new ArrayList<>(Arrays.asList(patches));
    }
    
    
    public void setPatches(final java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> patches){
       this.patches = patches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductVariantPatchRequestImpl that = (ProductVariantPatchRequestImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(patches, that.patches)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(patches)
            .toHashCode();
    }

}
