
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyCartDraftQueryBuilderDsl {
    public MyCartDraftQueryBuilderDsl() {
    }

    public static MyCartDraftQueryBuilderDsl of() {
        return new MyCartDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartDraftQueryBuilderDsl> currency() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currency")),
            p -> new CombinationQueryPredicate<>(p, MyCartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartDraftQueryBuilderDsl> customerEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerEmail")),
            p -> new CombinationQueryPredicate<>(p, MyCartDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCartDraftQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            MyCartDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartDraftQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            MyCartDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartDraftQueryBuilderDsl> lineItems(
            Function<com.commercetools.api.predicates.query.me.MyLineItemDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyLineItemDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lineItems"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.me.MyLineItemDraftQueryBuilderDsl.of())),
            MyCartDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyCartDraftQueryBuilderDsl> lineItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItems")),
            p -> new CombinationQueryPredicate<>(p, MyCartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartDraftQueryBuilderDsl> taxMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxMode")),
            p -> new CombinationQueryPredicate<>(p, MyCartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartDraftQueryBuilderDsl> inventoryMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inventoryMode")),
            p -> new CombinationQueryPredicate<>(p, MyCartDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCartDraftQueryBuilderDsl> billingAddress(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("billingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            MyCartDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartDraftQueryBuilderDsl> shippingAddress(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            MyCartDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartDraftQueryBuilderDsl> shippingMethod(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("shippingMethod"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl
                            .of())),
            MyCartDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCartDraftQueryBuilderDsl> itemShippingAddresses(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("itemShippingAddresses"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            MyCartDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyCartDraftQueryBuilderDsl> itemShippingAddresses() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("itemShippingAddresses")),
            p -> new CombinationQueryPredicate<>(p, MyCartDraftQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<MyCartDraftQueryBuilderDsl> discountCodes() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountCodes")),
            p -> new CombinationQueryPredicate<>(p, MyCartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartDraftQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, MyCartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartDraftQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
            p -> new CombinationQueryPredicate<>(p, MyCartDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyCartDraftQueryBuilderDsl> deleteDaysAfterLastModification() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteDaysAfterLastModification")),
            p -> new CombinationQueryPredicate<>(p, MyCartDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCartDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            MyCartDraftQueryBuilderDsl::of);
    }

}
