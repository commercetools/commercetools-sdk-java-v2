package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategorySetCustomTypeActionImpl implements CategorySetCustomTypeAction {

    private String action;
    
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    private com.commercetools.api.models.type.FieldContainer fields;

    @JsonCreator
    CategorySetCustomTypeActionImpl(@JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type, @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.type = type;
        this.fields = fields;
        this.action = "setCustomType";
    }
    public CategorySetCustomTypeActionImpl() {
        this.action = "setCustomType";
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If absent, the custom type and any existing CustomFields are removed.</p>
    */
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    /**
    *  <p>A valid JSON object, based on the FieldDefinitions of the Type. Sets the custom fields to this value.</p>
    */
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type){
        this.type = type;
    }
    
    public void setFields(final com.commercetools.api.models.type.FieldContainer fields){
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CategorySetCustomTypeActionImpl that = (CategorySetCustomTypeActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(type)
            .append(fields)
            .toHashCode();
    }

}
