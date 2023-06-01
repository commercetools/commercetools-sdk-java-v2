package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PayloadNotIncludedQueryBuilderDsl  {
    public PayloadNotIncludedQueryBuilderDsl() {
    }

    public static PayloadNotIncludedQueryBuilderDsl of() {
        return new PayloadNotIncludedQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PayloadNotIncludedQueryBuilderDsl> reason() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reason")),
        p -> new CombinationQueryPredicate<>(p, PayloadNotIncludedQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PayloadNotIncludedQueryBuilderDsl> payloadType() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("payloadType")),
        p -> new CombinationQueryPredicate<>(p, PayloadNotIncludedQueryBuilderDsl::of));
    }
    
}
