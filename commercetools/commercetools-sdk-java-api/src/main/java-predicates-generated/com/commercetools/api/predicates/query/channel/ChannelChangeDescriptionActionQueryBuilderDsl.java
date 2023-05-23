
package com.commercetools.api.predicates.query.channel;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ChannelChangeDescriptionActionQueryBuilderDsl {
    public ChannelChangeDescriptionActionQueryBuilderDsl() {
    }

    public static ChannelChangeDescriptionActionQueryBuilderDsl of() {
        return new ChannelChangeDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelChangeDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ChannelChangeDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ChannelChangeDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ChannelChangeDescriptionActionQueryBuilderDsl::of);
    }

}
