
package com.commercetools.api.predicates.expansion.quote_request;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class QuoteRequestReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private QuoteRequestReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static QuoteRequestReferenceExpansionBuilderDsl of() {
        return new QuoteRequestReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static QuoteRequestReferenceExpansionBuilderDsl of(final List<String> path) {
        return new QuoteRequestReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.quote_request.QuoteRequestExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.quote_request.QuoteRequestExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
