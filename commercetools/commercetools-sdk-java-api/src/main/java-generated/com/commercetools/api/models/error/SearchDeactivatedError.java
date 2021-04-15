
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SearchDeactivatedErrorImpl.class)
public interface SearchDeactivatedError extends ErrorObject {

    String SEARCH_DEACTIVATED = "SearchDeactivated";

    public static SearchDeactivatedError of() {
        return new SearchDeactivatedErrorImpl();
    }

    public static SearchDeactivatedError of(final SearchDeactivatedError template) {
        SearchDeactivatedErrorImpl instance = new SearchDeactivatedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static SearchDeactivatedErrorBuilder builder() {
        return SearchDeactivatedErrorBuilder.of();
    }

    public static SearchDeactivatedErrorBuilder builder(final SearchDeactivatedError template) {
        return SearchDeactivatedErrorBuilder.of(template);
    }

    default <T> T withSearchDeactivatedError(Function<SearchDeactivatedError, T> helper) {
        return helper.apply(this);
    }
}
