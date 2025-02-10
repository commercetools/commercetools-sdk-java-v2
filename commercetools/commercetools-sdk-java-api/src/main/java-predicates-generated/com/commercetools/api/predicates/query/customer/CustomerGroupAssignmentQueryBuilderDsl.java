
package com.commercetools.api.predicates.query.customer;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerGroupAssignmentQueryBuilderDsl {
    public CustomerGroupAssignmentQueryBuilderDsl() {
    }

    public static CustomerGroupAssignmentQueryBuilderDsl of() {
        return new CustomerGroupAssignmentQueryBuilderDsl();
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            CustomerGroupAssignmentQueryBuilderDsl::of);
    }

}
