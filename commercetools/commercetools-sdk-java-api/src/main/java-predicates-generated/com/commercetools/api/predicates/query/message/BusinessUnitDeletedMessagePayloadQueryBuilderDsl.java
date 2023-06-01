package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitDeletedMessagePayloadQueryBuilderDsl  {
    public BusinessUnitDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitDeletedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitDeletedMessagePayloadQueryBuilderDsl::of));
    }
    
}
