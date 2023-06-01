package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitAssociateAddedMessagePayloadQueryBuilderDsl  {
    public BusinessUnitAssociateAddedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitAssociateAddedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitAssociateAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAssociateAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociateAddedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitAssociateAddedMessagePayloadQueryBuilderDsl> associate(
        Function<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("associate"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl.of())),
            BusinessUnitAssociateAddedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
