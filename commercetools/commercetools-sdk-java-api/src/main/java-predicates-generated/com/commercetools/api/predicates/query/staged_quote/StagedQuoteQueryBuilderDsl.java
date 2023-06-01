package com.commercetools.api.predicates.query.staged_quote;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedQuoteQueryBuilderDsl  {
    public StagedQuoteQueryBuilderDsl() {
    }

    public static StagedQuoteQueryBuilderDsl of() {
        return new StagedQuoteQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StagedQuoteQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StagedQuoteQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StagedQuoteQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedQuoteQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedQuoteQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StagedQuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedQuoteQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StagedQuoteQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<StagedQuoteQueryBuilderDsl> stagedQuoteState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stagedQuoteState")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedQuoteQueryBuilderDsl> customer(
        Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customer"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            StagedQuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedQuoteQueryBuilderDsl> quoteRequest(
        Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("quoteRequest"))
            .inner(fn.apply(com.commercetools.api.predicates.query.quote_request.QuoteRequestReferenceQueryBuilderDsl.of())),
            StagedQuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedQuoteQueryBuilderDsl> quotationCart(
        Function<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("quotationCart"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl.of())),
            StagedQuoteQueryBuilderDsl::of);
    }
    
    public DateTimeComparisonPredicateBuilder<StagedQuoteQueryBuilderDsl> validTo() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validTo")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedQuoteQueryBuilderDsl> sellerComment() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sellerComment")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedQuoteQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            StagedQuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedQuoteQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            StagedQuoteQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<StagedQuoteQueryBuilderDsl> purchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("purchaseOrderNumber")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedQuoteQueryBuilderDsl> businessUnit(
        Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("businessUnit"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            StagedQuoteQueryBuilderDsl::of);
    }
    
    
}
