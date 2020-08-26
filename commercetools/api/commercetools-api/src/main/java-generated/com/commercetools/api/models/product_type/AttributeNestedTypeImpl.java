package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.ProductTypeReference;
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
public final class AttributeNestedTypeImpl implements AttributeNestedType {

    private String name;
    
    private com.commercetools.api.models.product_type.ProductTypeReference typeReference;

    @JsonCreator
    AttributeNestedTypeImpl(@JsonProperty("typeReference") final com.commercetools.api.models.product_type.ProductTypeReference typeReference) {
        this.typeReference = typeReference;
        this.name = "nested";
    }
    public AttributeNestedTypeImpl() {
       
    }

    
    public String getName(){
        return this.name;
    }
    
    
    public com.commercetools.api.models.product_type.ProductTypeReference getTypeReference(){
        return this.typeReference;
    }

    public void setTypeReference(final com.commercetools.api.models.product_type.ProductTypeReference typeReference){
        this.typeReference = typeReference;
    }

}
