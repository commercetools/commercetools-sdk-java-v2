
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAddressChangedMessagePayloadQueryBuilderDsl {
    public BusinessUnitAddressChangedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitAddressChangedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitAddressChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAddressChangedMessagePayloadQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            BusinessUnitAddressChangedMessagePayloadQueryBuilderDsl::of);
    }

    public StringCollectionPredicateBuilder<BusinessUnitAddressChangedMessagePayloadQueryBuilderDsl> addressRoles() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressRoles")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressChangedMessagePayloadQueryBuilderDsl::of));
    }

}
