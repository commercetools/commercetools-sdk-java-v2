
package com.commercetools.api.predicates.expansion.staged_quote;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class StagedQuoteReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private StagedQuoteReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static StagedQuoteReferenceExpansionBuilderDsl of() {
        return new StagedQuoteReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static StagedQuoteReferenceExpansionBuilderDsl of(final List<String> path) {
        return new StagedQuoteReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.staged_quote.StagedQuoteExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.staged_quote.StagedQuoteExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
