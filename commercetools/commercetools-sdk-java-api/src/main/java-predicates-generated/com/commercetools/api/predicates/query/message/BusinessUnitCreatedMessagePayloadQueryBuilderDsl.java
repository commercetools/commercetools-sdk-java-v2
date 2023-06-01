package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitCreatedMessagePayloadQueryBuilderDsl  {
    public BusinessUnitCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitCreatedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitCreatedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitCreatedMessagePayloadQueryBuilderDsl> businessUnit(
        Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("businessUnit"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitQueryBuilderDsl.of())),
            BusinessUnitCreatedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
