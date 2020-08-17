package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.common.TypeKeyReference;
import com.commercetools.importer.models.customfields.FieldContainer;
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
*  <p>The representation to be sent to the server when creating a resource with custom fields.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomImpl implements Custom {

    private com.commercetools.importer.models.common.TypeKeyReference type;
    
    private com.commercetools.importer.models.customfields.FieldContainer fields;

    @JsonCreator
    CustomImpl(@JsonProperty("type") final com.commercetools.importer.models.common.TypeKeyReference type, @JsonProperty("fields") final com.commercetools.importer.models.customfields.FieldContainer fields) {
        this.type = type;
        this.fields = fields;
    }
    public CustomImpl() {
       
    }

    /**
    *  <p>The type that provides the field definitions for this object.</p>
    */
    public com.commercetools.importer.models.common.TypeKeyReference getType(){
        return this.type;
    }
    
    /**
    *  <p>The custom fields of this object.</p>
    */
    public com.commercetools.importer.models.customfields.FieldContainer getFields(){
        return this.fields;
    }

    public void setType(final com.commercetools.importer.models.common.TypeKeyReference type){
        this.type = type;
    }
    
    public void setFields(final com.commercetools.importer.models.customfields.FieldContainer fields){
        this.fields = fields;
    }

}
