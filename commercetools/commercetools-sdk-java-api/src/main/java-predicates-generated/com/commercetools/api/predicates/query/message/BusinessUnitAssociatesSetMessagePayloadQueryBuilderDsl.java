package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitAssociatesSetMessagePayloadQueryBuilderDsl  {
    public BusinessUnitAssociatesSetMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitAssociatesSetMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitAssociatesSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAssociatesSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociatesSetMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitAssociatesSetMessagePayloadQueryBuilderDsl> associates(
        Function<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("associates"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl.of())),
            BusinessUnitAssociatesSetMessagePayloadQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<BusinessUnitAssociatesSetMessagePayloadQueryBuilderDsl> associates() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associates")),
                p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociatesSetMessagePayloadQueryBuilderDsl::of));
    }
    
}
