package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl  {
    public BusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl() {
    }

    public static BusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl of() {
        return new BusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl::of));
    }
    
}
