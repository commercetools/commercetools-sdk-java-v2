
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerGroupCustomFieldChangedMessageQueryBuilderDsl {
    public CustomerGroupCustomFieldChangedMessageQueryBuilderDsl() {
    }

    public static CustomerGroupCustomFieldChangedMessageQueryBuilderDsl of() {
        return new CustomerGroupCustomFieldChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupCustomFieldChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerGroupCustomFieldChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerGroupCustomFieldChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerGroupCustomFieldChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerGroupCustomFieldChangedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CustomerGroupCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerGroupCustomFieldChangedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CustomerGroupCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerGroupCustomFieldChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerGroupCustomFieldChangedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            CustomerGroupCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerGroupCustomFieldChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerGroupCustomFieldChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerGroupCustomFieldChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            CustomerGroupCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CustomerGroupCustomFieldChangedMessageQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerGroupCustomFieldChangedMessageQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerGroupCustomFieldChangedMessageQueryBuilderDsl> oldValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldValue")),
            p -> new CombinationQueryPredicate<>(p, CustomerGroupCustomFieldChangedMessageQueryBuilderDsl::of));
    }

}
