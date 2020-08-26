package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingAttributesDetails;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingAttributesMetaImpl implements MissingAttributesMeta {

    private com.commercetools.ml.models.missing_data.MissingAttributesDetails productLevel;
    
    private com.commercetools.ml.models.missing_data.MissingAttributesDetails variantLevel;
    
    private java.util.List<String> productTypeIds;

    @JsonCreator
    MissingAttributesMetaImpl(@JsonProperty("productLevel") final com.commercetools.ml.models.missing_data.MissingAttributesDetails productLevel, @JsonProperty("variantLevel") final com.commercetools.ml.models.missing_data.MissingAttributesDetails variantLevel, @JsonProperty("productTypeIds") final java.util.List<String> productTypeIds) {
        this.productLevel = productLevel;
        this.variantLevel = variantLevel;
        this.productTypeIds = productTypeIds;
    }
    public MissingAttributesMetaImpl() {
       
    }

    
    public com.commercetools.ml.models.missing_data.MissingAttributesDetails getProductLevel(){
        return this.productLevel;
    }
    
    
    public com.commercetools.ml.models.missing_data.MissingAttributesDetails getVariantLevel(){
        return this.variantLevel;
    }
    
    /**
    *  <p>The IDs of the product types containing the requested <code>attributeName</code>.</p>
    */
    public java.util.List<String> getProductTypeIds(){
        return this.productTypeIds;
    }

    public void setProductLevel(final com.commercetools.ml.models.missing_data.MissingAttributesDetails productLevel){
        this.productLevel = productLevel;
    }
    
    public void setVariantLevel(final com.commercetools.ml.models.missing_data.MissingAttributesDetails variantLevel){
        this.variantLevel = variantLevel;
    }
    
    public void setProductTypeIds(final java.util.List<String> productTypeIds){
        this.productTypeIds = productTypeIds;
    }

}
