package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.SearchIndexingInProgressErrorImpl;

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
@JsonDeserialize(as = SearchIndexingInProgressErrorImpl.class)
public interface SearchIndexingInProgressError extends ErrorObject {

    String SEARCH_INDEXING_IN_PROGRESS = "SearchIndexingInProgress";



    public static SearchIndexingInProgressError of(){
        return new SearchIndexingInProgressErrorImpl();
    }
    

    public static SearchIndexingInProgressError of(final SearchIndexingInProgressError template) {
        SearchIndexingInProgressErrorImpl instance = new SearchIndexingInProgressErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static SearchIndexingInProgressErrorBuilder builder(){
        return SearchIndexingInProgressErrorBuilder.of();
    }
    
    public static SearchIndexingInProgressErrorBuilder builder(final SearchIndexingInProgressError template){
        return SearchIndexingInProgressErrorBuilder.of(template);
    }
    

    default <T> T withSearchIndexingInProgressError(Function<SearchIndexingInProgressError, T> helper) {
        return helper.apply(this);
    }
}
