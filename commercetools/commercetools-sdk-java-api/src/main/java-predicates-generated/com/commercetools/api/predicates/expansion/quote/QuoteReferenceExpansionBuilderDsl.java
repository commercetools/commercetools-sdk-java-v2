
package com.commercetools.api.predicates.expansion.quote;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class QuoteReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private QuoteReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static QuoteReferenceExpansionBuilderDsl of() {
        return new QuoteReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static QuoteReferenceExpansionBuilderDsl of(final List<String> path) {
        return new QuoteReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.quote.QuoteExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.quote.QuoteExpansionBuilderDsl.of(appendOne(path, "obj"));
    }
}
