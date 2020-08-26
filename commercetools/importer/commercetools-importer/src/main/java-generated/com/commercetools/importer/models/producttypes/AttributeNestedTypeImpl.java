package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.common.ProductTypeKeyReference;
import com.commercetools.importer.models.producttypes.AttributeType;
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
    
    private com.commercetools.importer.models.common.ProductTypeKeyReference typeReference;

    @JsonCreator
    AttributeNestedTypeImpl(@JsonProperty("typeReference") final com.commercetools.importer.models.common.ProductTypeKeyReference typeReference) {
        this.typeReference = typeReference;
        this.name = "nested";
    }
    public AttributeNestedTypeImpl() {
       
    }

    
    public String getName(){
        return this.name;
    }
    
    /**
    *  <p>References a product type by its key.</p>
    */
    public com.commercetools.importer.models.common.ProductTypeKeyReference getTypeReference(){
        return this.typeReference;
    }

    public void setTypeReference(final com.commercetools.importer.models.common.ProductTypeKeyReference typeReference){
        this.typeReference = typeReference;
    }

}
