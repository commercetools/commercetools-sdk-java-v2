package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.ContentionErrorImpl;

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
@JsonDeserialize(as = ContentionErrorImpl.class)
public interface ContentionError extends ErrorObject {



    public static ContentionErrorImpl of(){
        return new ContentionErrorImpl();
    }
    

    public static ContentionErrorImpl of(final ContentionError template) {
        ContentionErrorImpl instance = new ContentionErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

}
