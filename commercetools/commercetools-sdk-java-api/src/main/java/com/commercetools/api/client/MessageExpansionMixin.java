
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.message.MessageExpansionBuilderDsl;

public interface MessageExpansionMixin<T extends ExpandableRequest<T, MessageExpansionBuilderDsl>>
        extends ExpandableRequest<T, MessageExpansionBuilderDsl> {
    @Override
    default MessageExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.message();
    }
}
