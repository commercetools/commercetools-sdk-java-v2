
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchFacetPathNotFoundErrorBuilder implements Builder<SearchFacetPathNotFoundError> {

    private String message;

    public SearchFacetPathNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public SearchFacetPathNotFoundError build() {
        Objects.requireNonNull(message, SearchFacetPathNotFoundError.class + ": message is missing");
        return new SearchFacetPathNotFoundErrorImpl(message);
    }

    /**
     * builds SearchFacetPathNotFoundError without checking for non null required values
     */
    public SearchFacetPathNotFoundError buildUnchecked() {
        return new SearchFacetPathNotFoundErrorImpl(message);
    }

    public static SearchFacetPathNotFoundErrorBuilder of() {
        return new SearchFacetPathNotFoundErrorBuilder();
    }

    public static SearchFacetPathNotFoundErrorBuilder of(final SearchFacetPathNotFoundError template) {
        SearchFacetPathNotFoundErrorBuilder builder = new SearchFacetPathNotFoundErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
