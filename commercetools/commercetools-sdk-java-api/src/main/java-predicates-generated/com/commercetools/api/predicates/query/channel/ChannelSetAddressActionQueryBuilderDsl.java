
package com.commercetools.api.predicates.query.channel;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ChannelSetAddressActionQueryBuilderDsl {
    public ChannelSetAddressActionQueryBuilderDsl() {
    }

    public static ChannelSetAddressActionQueryBuilderDsl of() {
        return new ChannelSetAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelSetAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ChannelSetAddressActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ChannelSetAddressActionQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            ChannelSetAddressActionQueryBuilderDsl::of);
    }

}
