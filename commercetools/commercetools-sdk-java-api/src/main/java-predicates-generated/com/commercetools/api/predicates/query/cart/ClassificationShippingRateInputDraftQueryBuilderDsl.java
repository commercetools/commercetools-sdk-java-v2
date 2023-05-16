
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class ClassificationShippingRateInputDraftQueryBuilderDsl {
    public ClassificationShippingRateInputDraftQueryBuilderDsl() {
    }

    public static ClassificationShippingRateInputDraftQueryBuilderDsl of() {
        return new ClassificationShippingRateInputDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ClassificationShippingRateInputDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ClassificationShippingRateInputDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ClassificationShippingRateInputDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ClassificationShippingRateInputDraftQueryBuilderDsl::of));
    }

}
