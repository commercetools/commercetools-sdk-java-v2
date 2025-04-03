
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitTypeSetMessagePayloadQueryBuilderDsl {
    public BusinessUnitTypeSetMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitTypeSetMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitTypeSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitTypeSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitTypeSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitTypeSetMessagePayloadQueryBuilderDsl> parentUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("parentUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            BusinessUnitTypeSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitTypeSetMessagePayloadQueryBuilderDsl> oldParentUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("oldParentUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            BusinessUnitTypeSetMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<BusinessUnitTypeSetMessagePayloadQueryBuilderDsl> unitType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("unitType")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitTypeSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitTypeSetMessagePayloadQueryBuilderDsl> oldUnitType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldUnitType")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitTypeSetMessagePayloadQueryBuilderDsl::of));
    }

}
