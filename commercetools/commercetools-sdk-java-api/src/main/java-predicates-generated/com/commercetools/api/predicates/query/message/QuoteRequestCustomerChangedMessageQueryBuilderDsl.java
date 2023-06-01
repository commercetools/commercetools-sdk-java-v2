package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QuoteRequestCustomerChangedMessageQueryBuilderDsl  {
    public QuoteRequestCustomerChangedMessageQueryBuilderDsl() {
    }

    public static QuoteRequestCustomerChangedMessageQueryBuilderDsl of() {
        return new QuoteRequestCustomerChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestCustomerChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestCustomerChangedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<QuoteRequestCustomerChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestCustomerChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<QuoteRequestCustomerChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestCustomerChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<QuoteRequestCustomerChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestCustomerChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteRequestCustomerChangedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            QuoteRequestCustomerChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteRequestCustomerChangedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            QuoteRequestCustomerChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<QuoteRequestCustomerChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestCustomerChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteRequestCustomerChangedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            QuoteRequestCustomerChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<QuoteRequestCustomerChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestCustomerChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteRequestCustomerChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestCustomerChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteRequestCustomerChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            QuoteRequestCustomerChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteRequestCustomerChangedMessageQueryBuilderDsl> customer(
        Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customer"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            QuoteRequestCustomerChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteRequestCustomerChangedMessageQueryBuilderDsl> previousCustomer(
        Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("previousCustomer"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            QuoteRequestCustomerChangedMessageQueryBuilderDsl::of);
    }
    
    
}
