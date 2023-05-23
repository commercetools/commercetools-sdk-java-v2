
package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

public class CategoryResourceIdentifierQueryBuilderDsl {
    public CategoryResourceIdentifierQueryBuilderDsl() {
    }

    public static CategoryResourceIdentifierQueryBuilderDsl of() {
        return new CategoryResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, CategoryResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategoryResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CategoryResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategoryResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CategoryResourceIdentifierQueryBuilderDsl::of));
    }

}
