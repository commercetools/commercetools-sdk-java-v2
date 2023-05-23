
package com.commercetools.api.client;

import com.commercetools.api.models.message.MessagePagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.message.MessageQueryBuilderDsl;

public interface ByProjectKeyMessagesGetMixin
        extends PagedQueryResourceRequest<ByProjectKeyMessagesGet, MessagePagedQueryResponse, MessageQueryBuilderDsl> {
    @Override
    default MessageQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.message();
    }
}
