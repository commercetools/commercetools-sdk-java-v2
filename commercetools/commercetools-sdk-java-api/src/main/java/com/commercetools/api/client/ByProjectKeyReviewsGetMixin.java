
package com.commercetools.api.client;

import com.commercetools.api.models.review.ReviewPagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.review.ReviewExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl;

public interface ByProjectKeyReviewsGetMixin
        extends PagedQueryResourceRequest<ByProjectKeyReviewsGet, ReviewPagedQueryResponse, ReviewQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyReviewsGet, ReviewExpansionBuilderDsl> {

    @Override
    default ReviewExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.review();
    }

    @Override
    default ReviewQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.review();
    }
}
