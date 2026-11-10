
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class AssociateRoleNameSetMessagePayloadQueryBuilderDsl {
    public AssociateRoleNameSetMessagePayloadQueryBuilderDsl() {
    }

    public static AssociateRoleNameSetMessagePayloadQueryBuilderDsl of() {
        return new AssociateRoleNameSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleNameSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleNameSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AssociateRoleNameSetMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleNameSetMessagePayloadQueryBuilderDsl::of));
    }

}
