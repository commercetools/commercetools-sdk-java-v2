package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitUpdateQueryBuilderDsl  {
    public BusinessUnitUpdateQueryBuilderDsl() {
    }

    public static BusinessUnitUpdateQueryBuilderDsl of() {
        return new BusinessUnitUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<BusinessUnitUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitUpdateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitUpdateQueryBuilderDsl> actions(
        Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("actions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitUpdateActionQueryBuilderDsl.of())),
            BusinessUnitUpdateQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<BusinessUnitUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
                p -> new CombinationQueryPredicate<>(p, BusinessUnitUpdateQueryBuilderDsl::of));
    }
    
}
