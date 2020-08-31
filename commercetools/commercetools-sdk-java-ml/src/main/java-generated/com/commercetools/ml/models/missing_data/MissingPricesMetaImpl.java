package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingPricesProductLevel;
import com.commercetools.ml.models.missing_data.MissingPricesVariantLevel;
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
public final class MissingPricesMetaImpl implements MissingPricesMeta {

    private com.commercetools.ml.models.missing_data.MissingPricesProductLevel productLevel;
    
    private com.commercetools.ml.models.missing_data.MissingPricesVariantLevel variantLevel;

    @JsonCreator
    MissingPricesMetaImpl(@JsonProperty("productLevel") final com.commercetools.ml.models.missing_data.MissingPricesProductLevel productLevel, @JsonProperty("variantLevel") final com.commercetools.ml.models.missing_data.MissingPricesVariantLevel variantLevel) {
        this.productLevel = productLevel;
        this.variantLevel = variantLevel;
    }
    public MissingPricesMetaImpl() {
       
    }

    
    public com.commercetools.ml.models.missing_data.MissingPricesProductLevel getProductLevel(){
        return this.productLevel;
    }
    
    
    public com.commercetools.ml.models.missing_data.MissingPricesVariantLevel getVariantLevel(){
        return this.variantLevel;
    }

    public void setProductLevel(final com.commercetools.ml.models.missing_data.MissingPricesProductLevel productLevel){
        this.productLevel = productLevel;
    }
    
    public void setVariantLevel(final com.commercetools.ml.models.missing_data.MissingPricesVariantLevel variantLevel){
        this.variantLevel = variantLevel;
    }

}
