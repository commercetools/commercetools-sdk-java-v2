package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class LanguageUsedInStoresErrorQueryBuilderDsl  {
    public LanguageUsedInStoresErrorQueryBuilderDsl() {
    }

    public static LanguageUsedInStoresErrorQueryBuilderDsl of() {
        return new LanguageUsedInStoresErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<LanguageUsedInStoresErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, LanguageUsedInStoresErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<LanguageUsedInStoresErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, LanguageUsedInStoresErrorQueryBuilderDsl::of));
    }
    
}
