package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitParentUnitChangedMessagePayloadQueryBuilderDsl  {
    public BusinessUnitParentUnitChangedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitParentUnitChangedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitParentUnitChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitParentUnitChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitParentUnitChangedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitParentUnitChangedMessagePayloadQueryBuilderDsl> oldParentUnit(
        Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("oldParentUnit"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            BusinessUnitParentUnitChangedMessagePayloadQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<BusinessUnitParentUnitChangedMessagePayloadQueryBuilderDsl> newParentUnit(
        Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("newParentUnit"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            BusinessUnitParentUnitChangedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
