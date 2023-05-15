
package com.commercetools.api.predicates.query.channel;

import com.commercetools.api.predicates.query.*;

public class ChannelResourceIdentifierQueryBuilderDsl {
    public ChannelResourceIdentifierQueryBuilderDsl() {
    }

    public static ChannelResourceIdentifierQueryBuilderDsl of() {
        return new ChannelResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ChannelResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ChannelResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ChannelResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ChannelResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ChannelResourceIdentifierQueryBuilderDsl::of));
    }
}
