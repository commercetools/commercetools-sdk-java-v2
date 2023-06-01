package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitChangeStatusActionQueryBuilderDsl  {
    public BusinessUnitChangeStatusActionQueryBuilderDsl() {
    }

    public static BusinessUnitChangeStatusActionQueryBuilderDsl of() {
        return new BusinessUnitChangeStatusActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitChangeStatusActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitChangeStatusActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitChangeStatusActionQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitChangeStatusActionQueryBuilderDsl::of));
    }
    
}
