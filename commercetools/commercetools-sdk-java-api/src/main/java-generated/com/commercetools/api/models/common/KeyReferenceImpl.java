package com.commercetools.api.models.common;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.store.StoreKeyReference;
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
public final class KeyReferenceImpl implements KeyReference {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;
    
    private String key;

    @JsonCreator
    KeyReferenceImpl(@JsonProperty("typeId") final com.commercetools.api.models.common.ReferenceTypeId typeId, @JsonProperty("key") final String key) {
        this.typeId = typeId;
        this.key = key;
    }
    public KeyReferenceImpl() {
    }

    
    public com.commercetools.api.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }
    
    
    public String getKey(){
        return this.key;
    }

    public void setKey(final String key){
        this.key = key;
    }

}
