package com.commercetools.ml.models.common;

import com.commercetools.ml.models.common.Reference;
import com.commercetools.ml.models.common.ReferenceTypeId;
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
public final class ProductTypeReferenceImpl implements ProductTypeReference {

    private com.commercetools.ml.models.common.ReferenceTypeId typeId;
    
    private String id;

    @JsonCreator
    ProductTypeReferenceImpl(@JsonProperty("id") final String id) {
        this.id = id;
        this.typeId = ReferenceTypeId.findEnumViaJsonName("product-type").get();
    }
    public ProductTypeReferenceImpl() {
       
    }

    
    public com.commercetools.ml.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }
    
    
    public String getId(){
        return this.id;
    }

    public void setId(final String id){
        this.id = id;
    }

}
