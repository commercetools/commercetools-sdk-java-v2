
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class AttributeDefinitionTypeConflictErrorQueryBuilderDsl {
    public AttributeDefinitionTypeConflictErrorQueryBuilderDsl() {
    }

    public static AttributeDefinitionTypeConflictErrorQueryBuilderDsl of() {
        return new AttributeDefinitionTypeConflictErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionTypeConflictErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionTypeConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionTypeConflictErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionTypeConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionTypeConflictErrorQueryBuilderDsl> conflictingProductTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingProductTypeId")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionTypeConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionTypeConflictErrorQueryBuilderDsl> conflictingProductTypeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingProductTypeName")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionTypeConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionTypeConflictErrorQueryBuilderDsl> conflictingAttributeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingAttributeName")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionTypeConflictErrorQueryBuilderDsl::of));
    }
}
