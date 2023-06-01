package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ExternalTaxRateDraftQueryBuilderDsl  {
    public ExternalTaxRateDraftQueryBuilderDsl() {
    }

    public static ExternalTaxRateDraftQueryBuilderDsl of() {
        return new ExternalTaxRateDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExternalTaxRateDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, ExternalTaxRateDraftQueryBuilderDsl::of));
    }
    public DoubleComparisonPredicateBuilder<ExternalTaxRateDraftQueryBuilderDsl> amount() {
        return new DoubleComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("amount")),
        p -> new CombinationQueryPredicate<>(p, ExternalTaxRateDraftQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ExternalTaxRateDraftQueryBuilderDsl> includedInPrice() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("includedInPrice")),
        p -> new CombinationQueryPredicate<>(p, ExternalTaxRateDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ExternalTaxRateDraftQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
        p -> new CombinationQueryPredicate<>(p, ExternalTaxRateDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ExternalTaxRateDraftQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
        p -> new CombinationQueryPredicate<>(p, ExternalTaxRateDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ExternalTaxRateDraftQueryBuilderDsl> subRates(
        Function<com.commercetools.api.predicates.query.tax_category.SubRateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.SubRateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("subRates"))
            .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.SubRateQueryBuilderDsl.of())),
            ExternalTaxRateDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ExternalTaxRateDraftQueryBuilderDsl> subRates() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("subRates")),
                p -> new CombinationQueryPredicate<>(p, ExternalTaxRateDraftQueryBuilderDsl::of));
    }
    
}
