
package com.commercetools.api.predicates.query.channel;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ChannelSetCustomTypeActionQueryBuilderDsl {
    public ChannelSetCustomTypeActionQueryBuilderDsl() {
    }

    public static ChannelSetCustomTypeActionQueryBuilderDsl of() {
        return new ChannelSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ChannelSetCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ChannelSetCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            ChannelSetCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelSetCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            ChannelSetCustomTypeActionQueryBuilderDsl::of);
    }

}
