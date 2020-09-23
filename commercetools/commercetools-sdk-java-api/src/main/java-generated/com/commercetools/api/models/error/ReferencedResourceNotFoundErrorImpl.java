package com.commercetools.api.models.error;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.error.ErrorObject;
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
public final class ReferencedResourceNotFoundErrorImpl implements ReferencedResourceNotFoundError {

    private String code;
    
    private String message;
    
    private com.commercetools.api.models.common.ReferenceTypeId typeId;
    
    private String id;
    
    private String key;

    @JsonCreator
    ReferencedResourceNotFoundErrorImpl(@JsonProperty("message") final String message, @JsonProperty("typeId") final com.commercetools.api.models.common.ReferenceTypeId typeId, @JsonProperty("id") final String id, @JsonProperty("key") final String key) {
        this.message = message;
        this.typeId = typeId;
        this.id = id;
        this.key = key;
        this.code = "ReferencedResourceNotFound";
    }
    public ReferencedResourceNotFoundErrorImpl() {
       
    }

    
    public String getCode(){
        return this.code;
    }
    
    
    public String getMessage(){
        return this.message;
    }
    
    
    public com.commercetools.api.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }
    
    
    public String getId(){
        return this.id;
    }
    
    
    public String getKey(){
        return this.key;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setTypeId(final com.commercetools.api.models.common.ReferenceTypeId typeId){
        this.typeId = typeId;
    }
    
    public void setId(final String id){
        this.id = id;
    }
    
    public void setKey(final String key){
        this.key = key;
    }

}
