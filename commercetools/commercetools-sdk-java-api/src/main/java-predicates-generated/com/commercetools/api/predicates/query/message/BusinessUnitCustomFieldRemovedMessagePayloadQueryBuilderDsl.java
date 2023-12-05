
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitCustomFieldRemovedMessagePayloadQueryBuilderDsl {
    public BusinessUnitCustomFieldRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitCustomFieldRemovedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitCustomFieldRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomFieldRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomFieldRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomFieldRemovedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomFieldRemovedMessagePayloadQueryBuilderDsl::of));
    }

}
