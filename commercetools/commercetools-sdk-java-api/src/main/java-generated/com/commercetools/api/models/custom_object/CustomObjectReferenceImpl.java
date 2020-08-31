package com.commercetools.api.models.custom_object;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.custom_object.CustomObject;
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
public final class CustomObjectReferenceImpl implements CustomObjectReference {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;
    
    private String id;
    
    private com.commercetools.api.models.custom_object.CustomObject obj;

    @JsonCreator
    CustomObjectReferenceImpl(@JsonProperty("id") final String id, @JsonProperty("obj") final com.commercetools.api.models.custom_object.CustomObject obj) {
        this.id = id;
        this.obj = obj;
        this.typeId = ReferenceTypeId.findEnumViaJsonName("key-value-document").get();
    }
    public CustomObjectReferenceImpl() {
       
    }

    
    public com.commercetools.api.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }
    
    
    public String getId(){
        return this.id;
    }
    
    
    public com.commercetools.api.models.custom_object.CustomObject getObj(){
        return this.obj;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setObj(final com.commercetools.api.models.custom_object.CustomObject obj){
        this.obj = obj;
    }

}
