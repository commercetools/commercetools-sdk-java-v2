
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class AttributeNameDoesNotExistErrorQueryBuilderDsl {
    public AttributeNameDoesNotExistErrorQueryBuilderDsl() {
    }

    public static AttributeNameDoesNotExistErrorQueryBuilderDsl of() {
        return new AttributeNameDoesNotExistErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeNameDoesNotExistErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AttributeNameDoesNotExistErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeNameDoesNotExistErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AttributeNameDoesNotExistErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeNameDoesNotExistErrorQueryBuilderDsl> invalidAttributeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("invalidAttributeName")),
            p -> new CombinationQueryPredicate<>(p, AttributeNameDoesNotExistErrorQueryBuilderDsl::of));
    }

}
