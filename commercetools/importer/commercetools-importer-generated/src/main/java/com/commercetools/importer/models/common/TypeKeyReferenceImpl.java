package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.KeyReference;
import com.commercetools.importer.models.common.ReferenceType;
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


/**
*  <p>References a type by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypeKeyReferenceImpl implements TypeKeyReference {

    private String key;
    
    private com.commercetools.importer.models.common.ReferenceType typeId;

    @JsonCreator
    TypeKeyReferenceImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.typeId = ReferenceType.findEnumViaJsonName("type").get();
    }
    public TypeKeyReferenceImpl() {
       
    }

    
    public String getKey(){
        return this.key;
    }
    
    /**
    *  <p>The type of the referenced resource.</p>
    */
    public com.commercetools.importer.models.common.ReferenceType getTypeId(){
        return this.typeId;
    }

    public void setKey(final String key){
        this.key = key;
    }

}
