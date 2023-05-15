
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl {
    public AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl() {
    }

    public static AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl of() {
        return new AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl> conflictingProductTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingProductTypeId")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl> conflictingProductTypeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingProductTypeName")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl> conflictingAttributeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingAttributeName")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionAlreadyExistsErrorQueryBuilderDsl::of));
    }
}
