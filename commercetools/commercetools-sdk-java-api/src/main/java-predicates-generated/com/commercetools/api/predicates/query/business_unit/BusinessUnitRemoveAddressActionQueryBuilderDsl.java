package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitRemoveAddressActionQueryBuilderDsl  {
    public BusinessUnitRemoveAddressActionQueryBuilderDsl() {
    }

    public static BusinessUnitRemoveAddressActionQueryBuilderDsl of() {
        return new BusinessUnitRemoveAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitRemoveAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitRemoveAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitRemoveAddressActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitRemoveAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitRemoveAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitRemoveAddressActionQueryBuilderDsl::of));
    }
    
}
