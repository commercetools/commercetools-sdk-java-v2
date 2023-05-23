
package com.commercetools.api.predicates.query.standalone_price;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceResourceIdentifierQueryBuilderDsl {
    public StandalonePriceResourceIdentifierQueryBuilderDsl() {
    }

    public static StandalonePriceResourceIdentifierQueryBuilderDsl of() {
        return new StandalonePriceResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StandalonePriceResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StandalonePriceResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceResourceIdentifierQueryBuilderDsl::of));
    }

}
