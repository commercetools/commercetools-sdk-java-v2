package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitAddBillingAddressIdActionQueryBuilderDsl  {
    public BusinessUnitAddBillingAddressIdActionQueryBuilderDsl() {
    }

    public static BusinessUnitAddBillingAddressIdActionQueryBuilderDsl of() {
        return new BusinessUnitAddBillingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddBillingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitAddBillingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitAddBillingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitAddBillingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitAddBillingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitAddBillingAddressIdActionQueryBuilderDsl::of));
    }
    
}
