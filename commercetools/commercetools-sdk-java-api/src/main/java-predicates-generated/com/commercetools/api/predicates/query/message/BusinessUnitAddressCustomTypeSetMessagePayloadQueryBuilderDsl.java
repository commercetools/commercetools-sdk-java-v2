
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAddressCustomTypeSetMessagePayloadQueryBuilderDsl {
    public BusinessUnitAddressCustomTypeSetMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitAddressCustomTypeSetMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitAddressCustomTypeSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomTypeSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomTypeSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAddressCustomTypeSetMessagePayloadQueryBuilderDsl> customFields(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customFields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            BusinessUnitAddressCustomTypeSetMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomTypeSetMessagePayloadQueryBuilderDsl> oldTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldTypeId")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomTypeSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomTypeSetMessagePayloadQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomTypeSetMessagePayloadQueryBuilderDsl::of));
    }

}
