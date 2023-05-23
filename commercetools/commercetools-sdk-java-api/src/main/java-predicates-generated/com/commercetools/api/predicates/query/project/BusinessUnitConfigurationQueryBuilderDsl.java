
package com.commercetools.api.predicates.query.project;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitConfigurationQueryBuilderDsl {
    public BusinessUnitConfigurationQueryBuilderDsl() {
    }

    public static BusinessUnitConfigurationQueryBuilderDsl of() {
        return new BusinessUnitConfigurationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitConfigurationQueryBuilderDsl> myBusinessUnitStatusOnCreation() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("myBusinessUnitStatusOnCreation")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitConfigurationQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitConfigurationQueryBuilderDsl> myBusinessUnitAssociateRoleOnCreation(
            Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("myBusinessUnitAssociateRoleOnCreation"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl
                            .of())),
            BusinessUnitConfigurationQueryBuilderDsl::of);
    }

}
