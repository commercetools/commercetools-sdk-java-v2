package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.QueryComplexityLimitExceededErrorImpl;

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
@JsonDeserialize(as = QueryComplexityLimitExceededErrorImpl.class)
public interface QueryComplexityLimitExceededError extends ErrorObject {



    public static QueryComplexityLimitExceededError of(){
        return new QueryComplexityLimitExceededErrorImpl();
    }
    

    public static QueryComplexityLimitExceededError of(final QueryComplexityLimitExceededError template) {
        QueryComplexityLimitExceededErrorImpl instance = new QueryComplexityLimitExceededErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static QueryComplexityLimitExceededErrorBuilder builder(){
        return QueryComplexityLimitExceededErrorBuilder.of();
    }
    
    public static QueryComplexityLimitExceededErrorBuilder builder(final QueryComplexityLimitExceededError template){
        return QueryComplexityLimitExceededErrorBuilder.of(template);
    }
    

    default <T> T withQueryComplexityLimitExceededError(Function<QueryComplexityLimitExceededError, T> helper) {
        return helper.apply(this);
    }
}
