
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class EditPreviewFailedErrorQueryBuilderDsl {
    public EditPreviewFailedErrorQueryBuilderDsl() {
    }

    public static EditPreviewFailedErrorQueryBuilderDsl of() {
        return new EditPreviewFailedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<EditPreviewFailedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, EditPreviewFailedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<EditPreviewFailedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, EditPreviewFailedErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<EditPreviewFailedErrorQueryBuilderDsl> result(
            Function<com.commercetools.api.predicates.query.order_edit.OrderEditPreviewFailureQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditPreviewFailureQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("result"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.order_edit.OrderEditPreviewFailureQueryBuilderDsl.of())),
            EditPreviewFailedErrorQueryBuilderDsl::of);
    }

}
