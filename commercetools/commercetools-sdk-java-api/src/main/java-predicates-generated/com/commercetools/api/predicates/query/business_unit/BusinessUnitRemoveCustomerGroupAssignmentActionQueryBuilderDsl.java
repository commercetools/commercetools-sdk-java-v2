
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitRemoveCustomerGroupAssignmentActionQueryBuilderDsl {
    public BusinessUnitRemoveCustomerGroupAssignmentActionQueryBuilderDsl() {
    }

    public static BusinessUnitRemoveCustomerGroupAssignmentActionQueryBuilderDsl of() {
        return new BusinessUnitRemoveCustomerGroupAssignmentActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitRemoveCustomerGroupAssignmentActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitRemoveCustomerGroupAssignmentActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitRemoveCustomerGroupAssignmentActionQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            BusinessUnitRemoveCustomerGroupAssignmentActionQueryBuilderDsl::of);
    }

}
