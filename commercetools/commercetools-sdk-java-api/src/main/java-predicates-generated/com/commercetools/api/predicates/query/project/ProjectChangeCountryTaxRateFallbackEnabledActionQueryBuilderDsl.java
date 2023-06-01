package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProjectChangeCountryTaxRateFallbackEnabledActionQueryBuilderDsl  {
    public ProjectChangeCountryTaxRateFallbackEnabledActionQueryBuilderDsl() {
    }

    public static ProjectChangeCountryTaxRateFallbackEnabledActionQueryBuilderDsl of() {
        return new ProjectChangeCountryTaxRateFallbackEnabledActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangeCountryTaxRateFallbackEnabledActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProjectChangeCountryTaxRateFallbackEnabledActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProjectChangeCountryTaxRateFallbackEnabledActionQueryBuilderDsl> countryTaxRateFallbackEnabled() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("countryTaxRateFallbackEnabled")),
        p -> new CombinationQueryPredicate<>(p, ProjectChangeCountryTaxRateFallbackEnabledActionQueryBuilderDsl::of));
    }
    
}
