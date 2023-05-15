
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyBusinessUnitRemoveAddressActionQueryBuilderDsl {
    public MyBusinessUnitRemoveAddressActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitRemoveAddressActionQueryBuilderDsl of() {
        return new MyBusinessUnitRemoveAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitRemoveAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitRemoveAddressActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitRemoveAddressActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitRemoveAddressActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitRemoveAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitRemoveAddressActionQueryBuilderDsl::of));
    }
}
