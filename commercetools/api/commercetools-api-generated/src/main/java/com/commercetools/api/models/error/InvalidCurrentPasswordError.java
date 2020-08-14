package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.InvalidCurrentPasswordErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = InvalidCurrentPasswordErrorImpl.class)
public interface InvalidCurrentPasswordError extends ErrorObject {



    public static InvalidCurrentPasswordErrorImpl of(){
        return new InvalidCurrentPasswordErrorImpl();
    }
    

    public static InvalidCurrentPasswordErrorImpl of(final InvalidCurrentPasswordError template) {
        InvalidCurrentPasswordErrorImpl instance = new InvalidCurrentPasswordErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

}
