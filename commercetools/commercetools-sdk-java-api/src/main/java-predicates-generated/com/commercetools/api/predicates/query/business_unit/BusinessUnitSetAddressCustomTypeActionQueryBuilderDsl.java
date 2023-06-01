package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitSetAddressCustomTypeActionQueryBuilderDsl  {
    public BusinessUnitSetAddressCustomTypeActionQueryBuilderDsl() {
    }

    public static BusinessUnitSetAddressCustomTypeActionQueryBuilderDsl of() {
        return new BusinessUnitSetAddressCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetAddressCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitSetAddressCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitSetAddressCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            BusinessUnitSetAddressCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<BusinessUnitSetAddressCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            BusinessUnitSetAddressCustomTypeActionQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<BusinessUnitSetAddressCustomTypeActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitSetAddressCustomTypeActionQueryBuilderDsl::of));
    }
    
}
