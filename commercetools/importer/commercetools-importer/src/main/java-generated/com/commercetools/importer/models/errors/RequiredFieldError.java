package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.errors.RequiredFieldErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>A required field is missing a value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = RequiredFieldErrorImpl.class)
public interface RequiredFieldError extends ErrorObject {

    /**
    *  <p>The name of the field.</p>
    */
    @NotNull
    @JsonProperty("field")
    public String getField();

    public void setField(final String field);

    public static RequiredFieldErrorImpl of(){
        return new RequiredFieldErrorImpl();
    }
    

    public static RequiredFieldErrorImpl of(final RequiredFieldError template) {
        RequiredFieldErrorImpl instance = new RequiredFieldErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setField(template.getField());
        return instance;
    }

}
