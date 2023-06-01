package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl  {
    public BusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl() {
    }

    public static BusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl of() {
        return new BusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl::of));
    }
    
}
