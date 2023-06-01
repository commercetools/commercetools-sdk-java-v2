package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl  {
    public BusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl() {
    }

    public static BusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl of() {
        return new BusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl::of));
    }
    
}
