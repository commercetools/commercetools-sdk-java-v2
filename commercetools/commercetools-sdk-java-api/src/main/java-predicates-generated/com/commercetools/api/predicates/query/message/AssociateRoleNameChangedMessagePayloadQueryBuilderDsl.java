
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class AssociateRoleNameChangedMessagePayloadQueryBuilderDsl {
    public AssociateRoleNameChangedMessagePayloadQueryBuilderDsl() {
    }

    public static AssociateRoleNameChangedMessagePayloadQueryBuilderDsl of() {
        return new AssociateRoleNameChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleNameChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleNameChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AssociateRoleNameChangedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleNameChangedMessagePayloadQueryBuilderDsl::of));
    }

}
