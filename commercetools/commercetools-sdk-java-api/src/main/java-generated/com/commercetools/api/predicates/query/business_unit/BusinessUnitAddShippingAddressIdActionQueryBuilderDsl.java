
package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAddShippingAddressIdActionQueryBuilderDsl {
    public BusinessUnitAddShippingAddressIdActionQueryBuilderDsl() {
    }

    public static BusinessUnitAddShippingAddressIdActionQueryBuilderDsl of() {
        return new BusinessUnitAddShippingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddShippingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddShippingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddShippingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddShippingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddShippingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddShippingAddressIdActionQueryBuilderDsl::of));
    }
}
