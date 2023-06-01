package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl  {
    public GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl() {
    }

    public static GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl of() {
        return new GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl> discountCode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountCode")),
        p -> new CombinationQueryPredicate<>(p, GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl> reason() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reason")),
        p -> new CombinationQueryPredicate<>(p, GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl> discountCodeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountCodeId")),
        p -> new CombinationQueryPredicate<>(p, GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
        p -> new CombinationQueryPredicate<>(p, GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
        p -> new CombinationQueryPredicate<>(p, GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl> validityCheckTime() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validityCheckTime")),
        p -> new CombinationQueryPredicate<>(p, GraphQLDiscountCodeNonApplicableErrorQueryBuilderDsl::of));
    }
    
}
