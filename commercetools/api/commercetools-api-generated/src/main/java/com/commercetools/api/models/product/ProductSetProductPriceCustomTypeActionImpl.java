package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
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
public final class ProductSetProductPriceCustomTypeActionImpl implements ProductSetProductPriceCustomTypeAction {

    private String action;
    
    private String priceId;
    
    private Boolean staged;
    
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    private com.commercetools.api.models.type.FieldContainer fields;

    @JsonCreator
    ProductSetProductPriceCustomTypeActionImpl(@JsonProperty("priceId") final String priceId, @JsonProperty("staged") final Boolean staged, @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type, @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.priceId = priceId;
        this.staged = staged;
        this.type = type;
        this.fields = fields;
        this.action = "setProductPriceCustomType";
    }
    public ProductSetProductPriceCustomTypeActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getPriceId(){
        return this.priceId;
    }
    
    
    public Boolean getStaged(){
        return this.staged;
    }
    
    
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    public void setPriceId(final String priceId){
        this.priceId = priceId;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }
    
    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type){
        this.type = type;
    }
    
    public void setFields(final com.commercetools.api.models.type.FieldContainer fields){
        this.fields = fields;
    }

}
