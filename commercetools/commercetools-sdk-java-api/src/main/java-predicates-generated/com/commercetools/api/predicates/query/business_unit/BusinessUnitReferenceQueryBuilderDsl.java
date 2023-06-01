package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitReferenceQueryBuilderDsl  {
    public BusinessUnitReferenceQueryBuilderDsl() {
    }

    public static BusinessUnitReferenceQueryBuilderDsl of() {
        return new BusinessUnitReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitReferenceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitReferenceQueryBuilderDsl> obj(
        Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("obj"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitQueryBuilderDsl.of())),
            BusinessUnitReferenceQueryBuilderDsl::of);
    }
    
    
}
