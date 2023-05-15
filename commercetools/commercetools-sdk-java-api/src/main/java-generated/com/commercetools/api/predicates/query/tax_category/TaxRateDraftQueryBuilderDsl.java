
package com.commercetools.api.predicates.query.tax_category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TaxRateDraftQueryBuilderDsl {
    public TaxRateDraftQueryBuilderDsl() {
    }

    public static TaxRateDraftQueryBuilderDsl of() {
        return new TaxRateDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TaxRateDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, TaxRateDraftQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<TaxRateDraftQueryBuilderDsl> amount() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("amount")),
            p -> new CombinationQueryPredicate<>(p, TaxRateDraftQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<TaxRateDraftQueryBuilderDsl> includedInPrice() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("includedInPrice")),
            p -> new CombinationQueryPredicate<>(p, TaxRateDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxRateDraftQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, TaxRateDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxRateDraftQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, TaxRateDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TaxRateDraftQueryBuilderDsl> subRates(
            Function<com.commercetools.api.predicates.query.tax_category.SubRateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.SubRateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("subRates"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.SubRateQueryBuilderDsl.of())),
            TaxRateDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<TaxRateDraftQueryBuilderDsl> subRates() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("subRates")),
            p -> new CombinationQueryPredicate<>(p, TaxRateDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxRateDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, TaxRateDraftQueryBuilderDsl::of));
    }
}
