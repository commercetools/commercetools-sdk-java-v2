package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitChangeParentUnitActionQueryBuilderDsl  {
    public BusinessUnitChangeParentUnitActionQueryBuilderDsl() {
    }

    public static BusinessUnitChangeParentUnitActionQueryBuilderDsl of() {
        return new BusinessUnitChangeParentUnitActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitChangeParentUnitActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitChangeParentUnitActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitChangeParentUnitActionQueryBuilderDsl> parentUnit(
        Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("parentUnit"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl.of())),
            BusinessUnitChangeParentUnitActionQueryBuilderDsl::of);
    }
    
    
}
