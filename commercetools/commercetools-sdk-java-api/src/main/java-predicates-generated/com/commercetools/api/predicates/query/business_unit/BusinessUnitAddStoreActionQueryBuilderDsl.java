package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitAddStoreActionQueryBuilderDsl  {
    public BusinessUnitAddStoreActionQueryBuilderDsl() {
    }

    public static BusinessUnitAddStoreActionQueryBuilderDsl of() {
        return new BusinessUnitAddStoreActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddStoreActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitAddStoreActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitAddStoreActionQueryBuilderDsl> store(
        Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("store"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            BusinessUnitAddStoreActionQueryBuilderDsl::of);
    }
    
    
}
