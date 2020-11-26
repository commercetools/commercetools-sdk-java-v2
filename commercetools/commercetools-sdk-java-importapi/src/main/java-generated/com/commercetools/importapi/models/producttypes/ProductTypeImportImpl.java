package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.producttypes.AttributeDefinition;
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


/**
*  <p>Import representation for a product type.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeImportImpl implements ProductTypeImport {

    private String key;
    
    private String name;
    
    private String description;
    
    private java.util.List<com.commercetools.importapi.models.producttypes.AttributeDefinition> attributes;

    @JsonCreator
    ProductTypeImportImpl(@JsonProperty("key") final String key, @JsonProperty("name") final String name, @JsonProperty("description") final String description, @JsonProperty("attributes") final java.util.List<com.commercetools.importapi.models.producttypes.AttributeDefinition> attributes) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.attributes = attributes;
    }
    public ProductTypeImportImpl() {
    }

    
    public String getKey(){
        return this.key;
    }
    
    /**
    *  <p>Maps to <code>ProductType.name</code>.</p>
    */
    public String getName(){
        return this.name;
    }
    
    /**
    *  <p>Maps to <code>ProductType.description</code>.</p>
    */
    public String getDescription(){
        return this.description;
    }
    
    /**
    *  <p>The product type's attributes.</p>
    */
    public java.util.List<com.commercetools.importapi.models.producttypes.AttributeDefinition> getAttributes(){
        return this.attributes;
    }

    public void setKey(final String key){
        this.key = key;
    }
    
    public void setName(final String name){
        this.name = name;
    }
    
    public void setDescription(final String description){
        this.description = description;
    }
    
    public void setAttributes(final com.commercetools.importapi.models.producttypes.AttributeDefinition ...attributes){
       this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }
    
    public void setAttributes(final java.util.List<com.commercetools.importapi.models.producttypes.AttributeDefinition> attributes){
       this.attributes = attributes;
    }

}
