package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitResourceIdentifierQueryBuilderDsl  {
    public BusinessUnitResourceIdentifierQueryBuilderDsl() {
    }

    public static BusinessUnitResourceIdentifierQueryBuilderDsl of() {
        return new BusinessUnitResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitResourceIdentifierQueryBuilderDsl::of));
    }
    
}
