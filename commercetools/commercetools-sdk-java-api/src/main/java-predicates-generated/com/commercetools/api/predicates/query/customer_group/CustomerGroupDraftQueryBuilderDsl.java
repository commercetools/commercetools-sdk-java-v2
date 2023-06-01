package com.commercetools.api.predicates.query.customer_group;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerGroupDraftQueryBuilderDsl  {
    public CustomerGroupDraftQueryBuilderDsl() {
    }

    public static CustomerGroupDraftQueryBuilderDsl of() {
        return new CustomerGroupDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, CustomerGroupDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerGroupDraftQueryBuilderDsl> groupName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("groupName")),
        p -> new CombinationQueryPredicate<>(p, CustomerGroupDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CustomerGroupDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            CustomerGroupDraftQueryBuilderDsl::of);
    }
    
    
}
