
package com.commercetools.api.predicates.query.custom_object;

import com.commercetools.api.predicates.query.*;

public class CustomObjectDraftQueryBuilderDsl {
    public CustomObjectDraftQueryBuilderDsl() {
    }

    public static CustomObjectDraftQueryBuilderDsl of() {
        return new CustomObjectDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomObjectDraftQueryBuilderDsl> container() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("container")),
            p -> new CombinationQueryPredicate<>(p, CustomObjectDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomObjectDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CustomObjectDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomObjectDraftQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CustomObjectDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomObjectDraftQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CustomObjectDraftQueryBuilderDsl::of));
    }

}
