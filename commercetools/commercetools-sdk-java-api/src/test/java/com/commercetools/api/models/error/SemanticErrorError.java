package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.SemanticErrorErrorImpl;

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
@JsonDeserialize(as = SemanticErrorErrorImpl.class)
public interface SemanticErrorError extends ErrorObject {

    String SEMANTIC_ERROR = "SemanticError";



    public static SemanticErrorError of(){
        return new SemanticErrorErrorImpl();
    }
    

    public static SemanticErrorError of(final SemanticErrorError template) {
        SemanticErrorErrorImpl instance = new SemanticErrorErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static SemanticErrorErrorBuilder builder(){
        return SemanticErrorErrorBuilder.of();
    }
    
    public static SemanticErrorErrorBuilder builder(final SemanticErrorError template){
        return SemanticErrorErrorBuilder.of(template);
    }
    

    default <T> T withSemanticErrorError(Function<SemanticErrorError, T> helper) {
        return helper.apply(this);
    }
}
