
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchIndexingInProgressErrorBuilder {

    private String message;

    public SearchIndexingInProgressErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public SearchIndexingInProgressError build() {
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
