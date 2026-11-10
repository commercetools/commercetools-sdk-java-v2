
package com.commercetools.api.predicates.query.warning;

import com.commercetools.api.predicates.query.*;

public class ImageProcessingOngoingWarningQueryBuilderDsl {
    public ImageProcessingOngoingWarningQueryBuilderDsl() {
    }

    public static ImageProcessingOngoingWarningQueryBuilderDsl of() {
        return new ImageProcessingOngoingWarningQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ImageProcessingOngoingWarningQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ImageProcessingOngoingWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImageProcessingOngoingWarningQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ImageProcessingOngoingWarningQueryBuilderDsl::of));
    }

}
