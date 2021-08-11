
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchIndexingInProgressErrorBuilder implements Builder<SearchIndexingInProgressError> {

    private String message;

    public SearchIndexingInProgressErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public SearchIndexingInProgressError build() {
        Objects.requireNonNull(message, SearchIndexingInProgressError.class + ": message is missing");
        return new SearchIndexingInProgressErrorImpl(message);
    }

    /**
     * builds SearchIndexingInProgressError without checking for non null required values
     */
    public SearchIndexingInProgressError buildUnchecked() {
        return new SearchIndexingInProgressErrorImpl(message);
    }

    public static SearchIndexingInProgressErrorBuilder of() {
        return new SearchIndexingInProgressErrorBuilder();
    }

    public static SearchIndexingInProgressErrorBuilder of(final SearchIndexingInProgressError template) {
        SearchIndexingInProgressErrorBuilder builder = new SearchIndexingInProgressErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
