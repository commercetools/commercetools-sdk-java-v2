
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitRemoveStoreActionQueryBuilderDsl {
    public BusinessUnitRemoveStoreActionQueryBuilderDsl() {
    }

    public static BusinessUnitRemoveStoreActionQueryBuilderDsl of() {
        return new BusinessUnitRemoveStoreActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitRemoveStoreActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitRemoveStoreActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitRemoveStoreActionQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            BusinessUnitRemoveStoreActionQueryBuilderDsl::of);
    }

}
