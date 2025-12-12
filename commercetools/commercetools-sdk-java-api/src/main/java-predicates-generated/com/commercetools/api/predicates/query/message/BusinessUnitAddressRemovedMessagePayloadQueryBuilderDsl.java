
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAddressRemovedMessagePayloadQueryBuilderDsl {
    public BusinessUnitAddressRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitAddressRemovedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitAddressRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAddressRemovedMessagePayloadQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            BusinessUnitAddressRemovedMessagePayloadQueryBuilderDsl::of);
    }

    public StringCollectionPredicateBuilder<BusinessUnitAddressRemovedMessagePayloadQueryBuilderDsl> addressRoles() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressRoles")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressRemovedMessagePayloadQueryBuilderDsl::of));
    }

}
