package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.AttributeDefinitionAlreadyExistsErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AttributeDefinitionAlreadyExistsErrorImpl.class)
public interface AttributeDefinitionAlreadyExistsError extends ErrorObject {

    
    @NotNull
    @JsonProperty("conflictingProductTypeId")
    public String getConflictingProductTypeId();
    
    @NotNull
    @JsonProperty("conflictingProductTypeName")
    public String getConflictingProductTypeName();
    
    @NotNull
    @JsonProperty("conflictingAttributeName")
    public String getConflictingAttributeName();

    public void setConflictingProductTypeId(final String conflictingProductTypeId);
    
    public void setConflictingProductTypeName(final String conflictingProductTypeName);
    
    public void setConflictingAttributeName(final String conflictingAttributeName);

    public static AttributeDefinitionAlreadyExistsErrorImpl of(){
        return new AttributeDefinitionAlreadyExistsErrorImpl();
    }
    

    public static AttributeDefinitionAlreadyExistsErrorImpl of(final AttributeDefinitionAlreadyExistsError template) {
        AttributeDefinitionAlreadyExistsErrorImpl instance = new AttributeDefinitionAlreadyExistsErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setConflictingProductTypeId(template.getConflictingProductTypeId());
        instance.setConflictingProductTypeName(template.getConflictingProductTypeName());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    default <T> T withAttributeDefinitionAlreadyExistsError(Function<AttributeDefinitionAlreadyExistsError, T> helper) {
        return helper.apply(this);
    }
}
