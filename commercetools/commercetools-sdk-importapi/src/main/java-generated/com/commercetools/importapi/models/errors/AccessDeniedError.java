package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.AccessDeniedErrorImpl;

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
@JsonDeserialize(as = AccessDeniedErrorImpl.class)
public interface AccessDeniedError extends ErrorObject {



    public static AccessDeniedErrorImpl of(){
        return new AccessDeniedErrorImpl();
    }


    public static AccessDeniedErrorImpl of(final AccessDeniedError template) {
        AccessDeniedErrorImpl instance = new AccessDeniedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

}
