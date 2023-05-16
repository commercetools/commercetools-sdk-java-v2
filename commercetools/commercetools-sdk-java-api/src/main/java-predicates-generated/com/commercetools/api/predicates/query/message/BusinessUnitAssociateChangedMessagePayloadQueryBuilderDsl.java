
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAssociateChangedMessagePayloadQueryBuilderDsl {
    public BusinessUnitAssociateChangedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitAssociateChangedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitAssociateChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAssociateChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociateChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAssociateChangedMessagePayloadQueryBuilderDsl> associate(
            Function<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl.of())),
            BusinessUnitAssociateChangedMessagePayloadQueryBuilderDsl::of);
    }

}
