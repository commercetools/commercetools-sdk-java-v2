package com.commercetools.api.predicates.query.zone;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ZoneResourceIdentifierQueryBuilderDsl  {
    public ZoneResourceIdentifierQueryBuilderDsl() {
    }

    public static ZoneResourceIdentifierQueryBuilderDsl of() {
        return new ZoneResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ZoneResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, ZoneResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ZoneResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ZoneResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ZoneResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ZoneResourceIdentifierQueryBuilderDsl::of));
    }
    
}
