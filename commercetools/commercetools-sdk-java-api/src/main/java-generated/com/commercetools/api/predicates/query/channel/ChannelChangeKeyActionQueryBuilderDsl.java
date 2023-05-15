
package com.commercetools.api.predicates.query.channel;

import com.commercetools.api.predicates.query.*;

public class ChannelChangeKeyActionQueryBuilderDsl {
    public ChannelChangeKeyActionQueryBuilderDsl() {
    }

    public static ChannelChangeKeyActionQueryBuilderDsl of() {
        return new ChannelChangeKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelChangeKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ChannelChangeKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ChannelChangeKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ChannelChangeKeyActionQueryBuilderDsl::of));
    }
}
