package com.commercetools.api.predicates.query.quote;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QuoteQueryBuilderDsl  {
    public QuoteQueryBuilderDsl() {
    }

    public static QuoteQueryBuilderDsl of() {
        return new QuoteQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<QuoteQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<QuoteQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<QuoteQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> quoteRequest(
        Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("quoteRequest"))
            .inner(fn.apply(com.commercetools.api.predicates.query.quote_request.QuoteRequestReferenceQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> stagedQuote(
        Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("stagedQuote"))
            .inner(fn.apply(com.commercetools.api.predicates.query.staged_quote.StagedQuoteReferenceQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> customer(
        Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customer"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> customerGroup(
        Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customerGroup"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public DateTimeComparisonPredicateBuilder<QuoteQueryBuilderDsl> validTo() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validTo")),
        p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteQueryBuilderDsl> sellerComment() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sellerComment")),
        p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteQueryBuilderDsl> buyerComment() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("buyerComment")),
        p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> store(
        Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("store"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> lineItems(
        Function<com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lineItems"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<QuoteQueryBuilderDsl> lineItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItems")),
                p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> customLineItems(
        Function<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customLineItems"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<QuoteQueryBuilderDsl> customLineItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItems")),
                p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> totalPrice(
        Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("totalPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> taxedPrice(
        Function<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("taxedPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedPriceQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> shippingAddress(
        Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingAddress"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> billingAddress(
        Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("billingAddress"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<QuoteQueryBuilderDsl> inventoryMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inventoryMode")),
        p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteQueryBuilderDsl> taxMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxMode")),
        p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteQueryBuilderDsl> taxRoundingMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxRoundingMode")),
        p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteQueryBuilderDsl> taxCalculationMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxCalculationMode")),
        p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
        p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> shippingInfo(
        Function<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingInfo"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> paymentInfo(
        Function<com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("paymentInfo"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.PaymentInfoQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> shippingRateInput(
        Function<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingRateInput"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> itemShippingAddresses(
        Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("itemShippingAddresses"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<QuoteQueryBuilderDsl> itemShippingAddresses() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("itemShippingAddresses")),
                p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> directDiscounts(
        Function<com.commercetools.api.predicates.query.cart.DirectDiscountQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DirectDiscountQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("directDiscounts"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.DirectDiscountQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<QuoteQueryBuilderDsl> directDiscounts() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("directDiscounts")),
                p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<QuoteQueryBuilderDsl> quoteState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quoteState")),
        p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<QuoteQueryBuilderDsl> purchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("purchaseOrderNumber")),
        p -> new CombinationQueryPredicate<>(p, QuoteQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteQueryBuilderDsl> businessUnit(
        Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("businessUnit"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            QuoteQueryBuilderDsl::of);
    }
    
    
}
