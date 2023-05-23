
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyCompanyDraftQueryBuilderDsl {
    public MyCompanyDraftQueryBuilderDsl() {
    }

    public static MyCompanyDraftQueryBuilderDsl of() {
        return new MyCompanyDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCompanyDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, MyCompanyDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCompanyDraftQueryBuilderDsl> unitType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("unitType")),
            p -> new CombinationQueryPredicate<>(p, MyCompanyDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCompanyDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, MyCompanyDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCompanyDraftQueryBuilderDsl> contactEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactEmail")),
            p -> new CombinationQueryPredicate<>(p, MyCompanyDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCompanyDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            MyCompanyDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyCompanyDraftQueryBuilderDsl> addresses(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("addresses"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            MyCompanyDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyCompanyDraftQueryBuilderDsl> addresses() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addresses")),
            p -> new CombinationQueryPredicate<>(p, MyCompanyDraftQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<MyCompanyDraftQueryBuilderDsl> shippingAddresses() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingAddresses")),
            p -> new CombinationQueryPredicate<>(p, MyCompanyDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyCompanyDraftQueryBuilderDsl> defaultShippingAddress() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultShippingAddress")),
            p -> new CombinationQueryPredicate<>(p, MyCompanyDraftQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<MyCompanyDraftQueryBuilderDsl> billingAddresses() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("billingAddresses")),
            p -> new CombinationQueryPredicate<>(p, MyCompanyDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyCompanyDraftQueryBuilderDsl> defaultBillingAddress() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultBillingAddress")),
            p -> new CombinationQueryPredicate<>(p, MyCompanyDraftQueryBuilderDsl::of));
    }

}
