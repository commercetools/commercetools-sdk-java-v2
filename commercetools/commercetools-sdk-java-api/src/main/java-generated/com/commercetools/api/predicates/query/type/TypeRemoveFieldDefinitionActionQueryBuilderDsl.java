
package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

public class TypeRemoveFieldDefinitionActionQueryBuilderDsl {
    public TypeRemoveFieldDefinitionActionQueryBuilderDsl() {
    }

    public static TypeRemoveFieldDefinitionActionQueryBuilderDsl of() {
        return new TypeRemoveFieldDefinitionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeRemoveFieldDefinitionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TypeRemoveFieldDefinitionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TypeRemoveFieldDefinitionActionQueryBuilderDsl> fieldName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldName")),
            p -> new CombinationQueryPredicate<>(p, TypeRemoveFieldDefinitionActionQueryBuilderDsl::of));
    }
}
