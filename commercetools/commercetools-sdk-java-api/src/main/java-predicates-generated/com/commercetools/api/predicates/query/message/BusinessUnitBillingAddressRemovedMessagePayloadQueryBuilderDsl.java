package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitBillingAddressRemovedMessagePayloadQueryBuilderDsl  {
    public BusinessUnitBillingAddressRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitBillingAddressRemovedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitBillingAddressRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitBillingAddressRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitBillingAddressRemovedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitBillingAddressRemovedMessagePayloadQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            BusinessUnitBillingAddressRemovedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
