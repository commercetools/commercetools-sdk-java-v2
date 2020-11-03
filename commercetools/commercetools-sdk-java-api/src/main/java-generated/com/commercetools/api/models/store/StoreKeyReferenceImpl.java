package com.commercetools.api.models.store;

import com.commercetools.api.models.common.KeyReference;
import com.commercetools.api.models.common.ReferenceTypeId;
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
public final class StoreKeyReferenceImpl implements StoreKeyReference {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;
    
    private String key;

    @JsonCreator
    StoreKeyReferenceImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.typeId = ReferenceTypeId.findEnumViaJsonName("store").get();
    }
    public StoreKeyReferenceImpl() {
       
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
