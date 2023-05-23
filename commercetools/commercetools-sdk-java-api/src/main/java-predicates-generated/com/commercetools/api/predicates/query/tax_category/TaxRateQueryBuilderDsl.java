
package com.commercetools.api.predicates.query.tax_category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TaxRateQueryBuilderDsl {
    public TaxRateQueryBuilderDsl() {
    }

    public static TaxRateQueryBuilderDsl of() {
        return new TaxRateQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TaxRateQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, TaxRateQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxRateQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, TaxRateQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxRateQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, TaxRateQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<TaxRateQueryBuilderDsl> amount() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("amount")),
            p -> new CombinationQueryPredicate<>(p, TaxRateQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<TaxRateQueryBuilderDsl> includedInPrice() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("includedInPrice")),
            p -> new CombinationQueryPredicate<>(p, TaxRateQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxRateQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, TaxRateQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TaxRateQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, TaxRateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TaxRateQueryBuilderDsl> subRates(
            Function<com.commercetools.api.predicates.query.tax_category.SubRateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.SubRateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("subRates"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.SubRateQueryBuilderDsl.of())),
            TaxRateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<TaxRateQueryBuilderDsl> subRates() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("subRates")),
            p -> new CombinationQueryPredicate<>(p, TaxRateQueryBuilderDsl::of));
    }

}
