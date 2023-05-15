
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class ContainerAndKeyQueryBuilderDsl {
    public ContainerAndKeyQueryBuilderDsl() {
    }

    public static ContainerAndKeyQueryBuilderDsl of() {
        return new ContainerAndKeyQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ContainerAndKeyQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ContainerAndKeyQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ContainerAndKeyQueryBuilderDsl> container() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("container")),
            p -> new CombinationQueryPredicate<>(p, ContainerAndKeyQueryBuilderDsl::of));
    }
}
