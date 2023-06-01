package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartAddLineItemActionQueryBuilderDsl  {
    public MyCartAddLineItemActionQueryBuilderDsl() {
    }

    public static MyCartAddLineItemActionQueryBuilderDsl of() {
        return new MyCartAddLineItemActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartAddLineItemActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartAddLineItemActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCartAddLineItemActionQueryBuilderDsl> productId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productId")),
        p -> new CombinationQueryPredicate<>(p, MyCartAddLineItemActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MyCartAddLineItemActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, MyCartAddLineItemActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCartAddLineItemActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, MyCartAddLineItemActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MyCartAddLineItemActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, MyCartAddLineItemActionQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<MyCartAddLineItemActionQueryBuilderDsl> addedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedAt")),
        p -> new CombinationQueryPredicate<>(p, MyCartAddLineItemActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyCartAddLineItemActionQueryBuilderDsl> distributionChannel(
        Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("distributionChannel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            MyCartAddLineItemActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<MyCartAddLineItemActionQueryBuilderDsl> supplyChannel(
        Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            MyCartAddLineItemActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<MyCartAddLineItemActionQueryBuilderDsl> shippingDetails(
        Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingDetails"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl.of())),
            MyCartAddLineItemActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<MyCartAddLineItemActionQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            MyCartAddLineItemActionQueryBuilderDsl::of);
    }
    
    
}
