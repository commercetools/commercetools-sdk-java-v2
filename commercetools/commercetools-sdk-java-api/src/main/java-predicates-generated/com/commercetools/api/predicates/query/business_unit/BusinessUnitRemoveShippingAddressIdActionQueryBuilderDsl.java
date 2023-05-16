
package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl {
    public BusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl() {
    }

    public static BusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl of() {
        return new BusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl::of));
    }

}
