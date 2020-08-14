package com.commercetools.api.models.product;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductUpdateAction;
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
public final class ProductChangeNameActionImpl implements ProductChangeNameAction {

    private String action;
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    private Boolean staged;

    @JsonCreator
    ProductChangeNameActionImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("staged") final Boolean staged) {
        this.name = name;
        this.staged = staged;
        this.action = "changeName";
    }
    public ProductChangeNameActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    
    public Boolean getStaged(){
        return this.staged;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

}
