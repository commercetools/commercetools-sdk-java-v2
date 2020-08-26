package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.InvalidTokenErrorImpl;

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
@JsonDeserialize(as = InvalidTokenErrorImpl.class)
public interface InvalidTokenError extends ErrorObject {



    public static InvalidTokenErrorImpl of(){
        return new InvalidTokenErrorImpl();
    }
    

    public static InvalidTokenErrorImpl of(final InvalidTokenError template) {
        InvalidTokenErrorImpl instance = new InvalidTokenErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

}
