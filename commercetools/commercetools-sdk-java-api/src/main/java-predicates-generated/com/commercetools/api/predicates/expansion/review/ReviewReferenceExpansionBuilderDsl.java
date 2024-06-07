
package com.commercetools.api.predicates.expansion.review;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ReviewReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ReviewReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ReviewReferenceExpansionBuilderDsl of() {
        return new ReviewReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static ReviewReferenceExpansionBuilderDsl of(final List<String> path) {
        return new ReviewReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.review.ReviewExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.review.ReviewExpansionBuilderDsl.of(appendOne(path, "obj"));
    }
}
