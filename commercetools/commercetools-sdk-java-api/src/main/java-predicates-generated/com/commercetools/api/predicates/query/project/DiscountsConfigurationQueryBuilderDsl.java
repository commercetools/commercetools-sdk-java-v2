
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class DiscountsConfigurationQueryBuilderDsl {
    public DiscountsConfigurationQueryBuilderDsl() {
    }

    public static DiscountsConfigurationQueryBuilderDsl of() {
        return new DiscountsConfigurationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountsConfigurationQueryBuilderDsl> discountCombinationMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountCombinationMode")),
            p -> new CombinationQueryPredicate<>(p, DiscountsConfigurationQueryBuilderDsl::of));
    }

}
