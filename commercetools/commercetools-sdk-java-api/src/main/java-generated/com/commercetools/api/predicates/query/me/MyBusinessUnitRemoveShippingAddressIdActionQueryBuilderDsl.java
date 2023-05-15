
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyBusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl {
    public MyBusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl of() {
        return new MyBusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl::of));
    }
}
