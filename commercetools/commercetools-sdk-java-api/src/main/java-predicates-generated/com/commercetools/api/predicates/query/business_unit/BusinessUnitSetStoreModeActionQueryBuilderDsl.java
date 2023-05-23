
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitSetStoreModeActionQueryBuilderDsl {
    public BusinessUnitSetStoreModeActionQueryBuilderDsl() {
    }

    public static BusinessUnitSetStoreModeActionQueryBuilderDsl of() {
        return new BusinessUnitSetStoreModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetStoreModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetStoreModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetStoreModeActionQueryBuilderDsl> storeMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("storeMode")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetStoreModeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitSetStoreModeActionQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("stores"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            BusinessUnitSetStoreModeActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitSetStoreModeActionQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetStoreModeActionQueryBuilderDsl::of));
    }

}
