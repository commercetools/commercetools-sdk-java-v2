
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SearchFacetPathNotFoundErrorImpl.class)
public interface SearchFacetPathNotFoundError extends ErrorObject {

    String SEARCH_FACET_PATH_NOT_FOUND = "SearchFacetPathNotFound";

    public static SearchFacetPathNotFoundError of() {
        return new SearchFacetPathNotFoundErrorImpl();
    }

    public static SearchFacetPathNotFoundError of(final SearchFacetPathNotFoundError template) {
        SearchFacetPathNotFoundErrorImpl instance = new SearchFacetPathNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static SearchFacetPathNotFoundErrorBuilder builder() {
        return SearchFacetPathNotFoundErrorBuilder.of();
    }

    public static SearchFacetPathNotFoundErrorBuilder builder(final SearchFacetPathNotFoundError template) {
        return SearchFacetPathNotFoundErrorBuilder.of(template);
    }

    default <T> T withSearchFacetPathNotFoundError(Function<SearchFacetPathNotFoundError, T> helper) {
        return helper.apply(this);
    }
}
