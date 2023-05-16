
package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

public class TypeChangeInputHintActionQueryBuilderDsl {
    public TypeChangeInputHintActionQueryBuilderDsl() {
    }

    public static TypeChangeInputHintActionQueryBuilderDsl of() {
        return new TypeChangeInputHintActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeChangeInputHintActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TypeChangeInputHintActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TypeChangeInputHintActionQueryBuilderDsl> fieldName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldName")),
            p -> new CombinationQueryPredicate<>(p, TypeChangeInputHintActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TypeChangeInputHintActionQueryBuilderDsl> inputHint() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inputHint")),
            p -> new CombinationQueryPredicate<>(p, TypeChangeInputHintActionQueryBuilderDsl::of));
    }

}
