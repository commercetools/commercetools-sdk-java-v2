package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyBusinessUnitSetAddressCustomFieldActionQueryBuilderDsl  {
    public MyBusinessUnitSetAddressCustomFieldActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitSetAddressCustomFieldActionQueryBuilderDsl of() {
        return new MyBusinessUnitSetAddressCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitSetAddressCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitSetAddressCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitSetAddressCustomFieldActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitSetAddressCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitSetAddressCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitSetAddressCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitSetAddressCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitSetAddressCustomFieldActionQueryBuilderDsl::of));
    }
    
}
