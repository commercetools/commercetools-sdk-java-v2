
package com.commercetools.api.client;

import com.commercetools.api.models.channel.ChannelPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.channel.ChannelQueryBuilderDsl;

public interface ByProjectKeyChannelsGetMixin
        extends PagedQueryResourceRequest<ByProjectKeyChannelsGet, ChannelPagedQueryResponse, ChannelQueryBuilderDsl> {

    @Override
    default ChannelQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.channel();
    }
}
