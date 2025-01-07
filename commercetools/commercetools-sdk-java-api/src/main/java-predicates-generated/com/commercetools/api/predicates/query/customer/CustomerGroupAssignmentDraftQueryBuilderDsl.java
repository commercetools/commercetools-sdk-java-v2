
package com.commercetools.api.predicates.query.customer;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerGroupAssignmentDraftQueryBuilderDsl {
    public CustomerGroupAssignmentDraftQueryBuilderDsl() {
    }

    public static CustomerGroupAssignmentDraftQueryBuilderDsl of() {
        return new CustomerGroupAssignmentDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<CustomerGroupAssignmentDraftQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            CustomerGroupAssignmentDraftQueryBuilderDsl::of);
    }

}
