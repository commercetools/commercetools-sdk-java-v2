
package com.commercetools.api.client;

import com.commercetools.api.models.PagedQueryResourceRequest;
import com.commercetools.api.models.review.ReviewPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.review.ReviewQueryBuilderDsl;

public interface ByProjectKeyReviewsGetMixin
        extends PagedQueryResourceRequest<ByProjectKeyReviewsGet, ReviewPagedQueryResponse, ReviewQueryBuilderDsl> {
    @Override
    default ReviewQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.review();
    }
}
