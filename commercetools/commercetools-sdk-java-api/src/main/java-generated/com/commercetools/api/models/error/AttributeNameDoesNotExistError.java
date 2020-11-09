package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.AttributeNameDoesNotExistErrorImpl;

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
@JsonDeserialize(as = AttributeNameDoesNotExistErrorImpl.class)
public interface AttributeNameDoesNotExistError extends ErrorObject {

    
    @NotNull
    @JsonProperty("invalidAttributeName")
    public String getInvalidAttributeName();

    public void setInvalidAttributeName(final String invalidAttributeName);

    public static AttributeNameDoesNotExistErrorImpl of(){
        return new AttributeNameDoesNotExistErrorImpl();
    }
    

    public static AttributeNameDoesNotExistErrorImpl of(final AttributeNameDoesNotExistError template) {
        AttributeNameDoesNotExistErrorImpl instance = new AttributeNameDoesNotExistErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setInvalidAttributeName(template.getInvalidAttributeName());
        return instance;
    }

    default <T> T withAttributeNameDoesNotExistError(Function<AttributeNameDoesNotExistError, T> helper) {
        return helper.apply(this);
    }
}
