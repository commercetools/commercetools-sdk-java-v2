package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitContactEmailSetMessagePayloadQueryBuilderDsl  {
    public BusinessUnitContactEmailSetMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitContactEmailSetMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitContactEmailSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitContactEmailSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitContactEmailSetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitContactEmailSetMessagePayloadQueryBuilderDsl> contactEmail() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactEmail")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitContactEmailSetMessagePayloadQueryBuilderDsl::of));
    }
    
}
