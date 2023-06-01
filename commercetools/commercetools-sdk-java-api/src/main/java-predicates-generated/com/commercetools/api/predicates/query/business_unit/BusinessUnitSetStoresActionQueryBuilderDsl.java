package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitSetStoresActionQueryBuilderDsl  {
    public BusinessUnitSetStoresActionQueryBuilderDsl() {
    }

    public static BusinessUnitSetStoresActionQueryBuilderDsl of() {
        return new BusinessUnitSetStoresActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetStoresActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitSetStoresActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitSetStoresActionQueryBuilderDsl> stores(
        Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("stores"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            BusinessUnitSetStoresActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<BusinessUnitSetStoresActionQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
                p -> new CombinationQueryPredicate<>(p, BusinessUnitSetStoresActionQueryBuilderDsl::of));
    }
    
}
