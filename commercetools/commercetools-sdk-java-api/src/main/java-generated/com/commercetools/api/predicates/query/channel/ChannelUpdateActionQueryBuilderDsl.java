
package com.commercetools.api.predicates.query.channel;

import com.commercetools.api.predicates.query.*;

public class ChannelUpdateActionQueryBuilderDsl {
    public ChannelUpdateActionQueryBuilderDsl() {
    }

    public static ChannelUpdateActionQueryBuilderDsl of() {
        return new ChannelUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ChannelUpdateActionQueryBuilderDsl::of));
    }
}
