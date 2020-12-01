package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.common.ProductVariantKeyReference;
import com.commercetools.importapi.models.productvariants.Attributes;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>Import representation for an update to a product variant. Use this type for importing updates to existing
*  product variants into a commercetools project.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantPatchImpl implements ProductVariantPatch {

    private com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant;
    
    private com.commercetools.importapi.models.productvariants.Attributes attributes;

    @JsonCreator
    ProductVariantPatchImpl(@JsonProperty("productVariant") final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant, @JsonProperty("attributes") final com.commercetools.importapi.models.productvariants.Attributes attributes) {
        this.productVariant = productVariant;
        this.attributes = attributes;
    }
    public ProductVariantPatchImpl() {
    }

    /**
    *  <p>The product variant to which this patch is applied.</p>
    *  <p>The product variant referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    public com.commercetools.importapi.models.common.ProductVariantKeyReference getProductVariant(){
        return this.productVariant;
    }
    
    /**
    *  <p>Maps to <code>ProductVariant.attributes</code>.</p>
    *  <p>Each attribute referenced must be defined
    *  in an already existing product type in the commercetools project, or the import
    *  operation state is set to <code>ValidationFailed</code>.</p>
    */
    public com.commercetools.importapi.models.productvariants.Attributes getAttributes(){
        return this.attributes;
    }

    public void setProductVariant(final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant){
        this.productVariant = productVariant;
    }
    
    public void setAttributes(final com.commercetools.importapi.models.productvariants.Attributes attributes){
        this.attributes = attributes;
    }

}
