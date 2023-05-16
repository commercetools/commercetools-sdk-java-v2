
package com.commercetools.api.predicates.query.associate_role;

import com.commercetools.api.predicates.query.*;

public class AssociateRoleKeyReferenceQueryBuilderDsl {
    public AssociateRoleKeyReferenceQueryBuilderDsl() {
    }

    public static AssociateRoleKeyReferenceQueryBuilderDsl of() {
        return new AssociateRoleKeyReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleKeyReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleKeyReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AssociateRoleKeyReferenceQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, AssociateRoleKeyReferenceQueryBuilderDsl::of));
    }

}
