
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class MessagePayloadQueryBuilderDsl {
    public MessagePayloadQueryBuilderDsl() {
    }

    public static MessagePayloadQueryBuilderDsl of() {
        return new MessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, MessagePayloadQueryBuilderDsl::of));
    }
}
