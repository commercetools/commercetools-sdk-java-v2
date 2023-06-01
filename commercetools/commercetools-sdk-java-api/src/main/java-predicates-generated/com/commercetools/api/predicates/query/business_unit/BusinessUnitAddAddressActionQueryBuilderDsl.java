package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitAddAddressActionQueryBuilderDsl  {
    public BusinessUnitAddAddressActionQueryBuilderDsl() {
    }

    public static BusinessUnitAddAddressActionQueryBuilderDsl of() {
        return new BusinessUnitAddAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitAddAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitAddAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            BusinessUnitAddAddressActionQueryBuilderDsl::of);
    }
    
    
}
