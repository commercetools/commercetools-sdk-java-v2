
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitChangeAddressActionQueryBuilderDsl {
    public BusinessUnitChangeAddressActionQueryBuilderDsl() {
    }

    public static BusinessUnitChangeAddressActionQueryBuilderDsl of() {
        return new BusinessUnitChangeAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitChangeAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitChangeAddressActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitChangeAddressActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitChangeAddressActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitChangeAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitChangeAddressActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitChangeAddressActionQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            BusinessUnitChangeAddressActionQueryBuilderDsl::of);
    }

}
