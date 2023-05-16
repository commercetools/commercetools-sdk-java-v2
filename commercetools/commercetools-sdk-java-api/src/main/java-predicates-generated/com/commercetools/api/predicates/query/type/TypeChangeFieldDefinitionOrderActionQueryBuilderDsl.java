
package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

public class TypeChangeFieldDefinitionOrderActionQueryBuilderDsl {
    public TypeChangeFieldDefinitionOrderActionQueryBuilderDsl() {
    }

    public static TypeChangeFieldDefinitionOrderActionQueryBuilderDsl of() {
        return new TypeChangeFieldDefinitionOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeChangeFieldDefinitionOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TypeChangeFieldDefinitionOrderActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<TypeChangeFieldDefinitionOrderActionQueryBuilderDsl> fieldNames() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldNames")),
            p -> new CombinationQueryPredicate<>(p, TypeChangeFieldDefinitionOrderActionQueryBuilderDsl::of));
    }

}
