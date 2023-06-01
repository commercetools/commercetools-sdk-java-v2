package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitKeyReferenceQueryBuilderDsl  {
    public BusinessUnitKeyReferenceQueryBuilderDsl() {
    }

    public static BusinessUnitKeyReferenceQueryBuilderDsl of() {
        return new BusinessUnitKeyReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitKeyReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitKeyReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitKeyReferenceQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitKeyReferenceQueryBuilderDsl::of));
    }
    
}
