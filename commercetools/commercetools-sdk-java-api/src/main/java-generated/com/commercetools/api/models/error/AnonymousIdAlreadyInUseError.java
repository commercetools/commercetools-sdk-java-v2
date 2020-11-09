package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.AnonymousIdAlreadyInUseErrorImpl;

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
@JsonDeserialize(as = AnonymousIdAlreadyInUseErrorImpl.class)
public interface AnonymousIdAlreadyInUseError extends ErrorObject {



    public static AnonymousIdAlreadyInUseErrorImpl of(){
        return new AnonymousIdAlreadyInUseErrorImpl();
    }
    

    public static AnonymousIdAlreadyInUseErrorImpl of(final AnonymousIdAlreadyInUseError template) {
        AnonymousIdAlreadyInUseErrorImpl instance = new AnonymousIdAlreadyInUseErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    default <T> T withAnonymousIdAlreadyInUseError(Function<AnonymousIdAlreadyInUseError, T> helper) {
        return helper.apply(this);
    }
}
