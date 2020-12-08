package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.databind.JsonNode;
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
public final class CategorySetAssetCustomTypeActionImpl implements CategorySetAssetCustomTypeAction {

    private String action;
    
    private String assetId;
    
    private String assetKey;
    
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    private com.fasterxml.jackson.databind.JsonNode fields;

    @JsonCreator
    CategorySetAssetCustomTypeActionImpl(@JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey, @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type, @JsonProperty("fields") final com.fasterxml.jackson.databind.JsonNode fields) {
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.type = type;
        this.fields = fields;
        this.action = "setAssetCustomType";
    }
    public CategorySetAssetCustomTypeActionImpl() {
        this.action = "setAssetCustomType";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getAssetId(){
        return this.assetId;
    }
    
    
    public String getAssetKey(){
        return this.assetKey;
    }
    
    /**
    *  <p>If set, the custom type is set to this new value.
    *  If absent, the custom type and any existing custom fields are removed.</p>
    */
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    /**
    *  <p>If set, the custom fields are set to this new value.</p>
    */
    public com.fasterxml.jackson.databind.JsonNode getFields(){
        return this.fields;
    }

    public void setAssetId(final String assetId){
        this.assetId = assetId;
    }
    
    public void setAssetKey(final String assetKey){
        this.assetKey = assetKey;
    }
    
    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type){
        this.type = type;
    }
    
    public void setFields(final com.fasterxml.jackson.databind.JsonNode fields){
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CategorySetAssetCustomTypeActionImpl that = (CategorySetAssetCustomTypeActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(assetId)
            .append(assetKey)
            .append(type)
            .append(fields)
            .toHashCode();
    }

}
