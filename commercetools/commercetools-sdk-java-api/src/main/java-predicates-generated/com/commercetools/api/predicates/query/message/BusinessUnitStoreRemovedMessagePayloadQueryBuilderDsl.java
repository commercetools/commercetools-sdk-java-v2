package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitStoreRemovedMessagePayloadQueryBuilderDsl  {
    public BusinessUnitStoreRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitStoreRemovedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitStoreRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitStoreRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitStoreRemovedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitStoreRemovedMessagePayloadQueryBuilderDsl> store(
        Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("store"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            BusinessUnitStoreRemovedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
