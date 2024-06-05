
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.channel.ChannelExpansionBuilderDsl;

public interface ChannelExpansionMixin<T extends ExpandableRequest<T, ChannelExpansionBuilderDsl>>
        extends ExpandableRequest<T, ChannelExpansionBuilderDsl> {

    @Override
    default ChannelExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.channel();
    }

}
