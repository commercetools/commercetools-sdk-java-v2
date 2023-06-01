package com.commercetools.api.predicates.query.channel;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ChannelSetAddressCustomTypeActionQueryBuilderDsl  {
    public ChannelSetAddressCustomTypeActionQueryBuilderDsl() {
    }

    public static ChannelSetAddressCustomTypeActionQueryBuilderDsl of() {
        return new ChannelSetAddressCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelSetAddressCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ChannelSetAddressCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ChannelSetAddressCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            ChannelSetAddressCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ChannelSetAddressCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            ChannelSetAddressCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}
