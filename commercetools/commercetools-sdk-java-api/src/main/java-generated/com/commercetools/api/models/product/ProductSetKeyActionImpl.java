package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetKeyActionImpl implements ProductSetKeyAction {

    private String action;
    
    private String key;

    @JsonCreator
    ProductSetKeyActionImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.action = "setKey";
    }
    public ProductSetKeyActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>User-specific unique identifier for the product.
    *  If left blank or set to <code>null</code>, the product key is unset/removed.</p>
    */
    public String getKey(){
        return this.key;
    }

    public void setKey(final String key){
        this.key = key;
    }

}
