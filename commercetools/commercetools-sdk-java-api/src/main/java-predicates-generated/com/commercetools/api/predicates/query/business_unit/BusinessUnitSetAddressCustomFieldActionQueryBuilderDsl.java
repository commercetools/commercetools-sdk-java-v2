
package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitSetAddressCustomFieldActionQueryBuilderDsl {
    public BusinessUnitSetAddressCustomFieldActionQueryBuilderDsl() {
    }

    public static BusinessUnitSetAddressCustomFieldActionQueryBuilderDsl of() {
        return new BusinessUnitSetAddressCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetAddressCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetAddressCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetAddressCustomFieldActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetAddressCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetAddressCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetAddressCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetAddressCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetAddressCustomFieldActionQueryBuilderDsl::of));
    }

}
