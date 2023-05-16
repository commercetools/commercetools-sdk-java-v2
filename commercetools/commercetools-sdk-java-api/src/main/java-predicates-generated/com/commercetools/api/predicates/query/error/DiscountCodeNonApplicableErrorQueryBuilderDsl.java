
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeNonApplicableErrorQueryBuilderDsl {
    public DiscountCodeNonApplicableErrorQueryBuilderDsl() {
    }

    public static DiscountCodeNonApplicableErrorQueryBuilderDsl of() {
        return new DiscountCodeNonApplicableErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeNonApplicableErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeNonApplicableErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeNonApplicableErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeNonApplicableErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeNonApplicableErrorQueryBuilderDsl> discountCode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountCode")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeNonApplicableErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeNonApplicableErrorQueryBuilderDsl> reason() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reason")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeNonApplicableErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeNonApplicableErrorQueryBuilderDsl> discountCodeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountCodeId")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeNonApplicableErrorQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountCodeNonApplicableErrorQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeNonApplicableErrorQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountCodeNonApplicableErrorQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeNonApplicableErrorQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountCodeNonApplicableErrorQueryBuilderDsl> validityCheckTime() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validityCheckTime")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeNonApplicableErrorQueryBuilderDsl::of));
    }

}
