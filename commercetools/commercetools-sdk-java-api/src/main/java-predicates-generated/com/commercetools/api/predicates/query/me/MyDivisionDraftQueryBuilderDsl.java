
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyDivisionDraftQueryBuilderDsl {
    public MyDivisionDraftQueryBuilderDsl() {
    }

    public static MyDivisionDraftQueryBuilderDsl of() {
        return new MyDivisionDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyDivisionDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, MyDivisionDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyDivisionDraftQueryBuilderDsl> unitType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("unitType")),
            p -> new CombinationQueryPredicate<>(p, MyDivisionDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyDivisionDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, MyDivisionDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyDivisionDraftQueryBuilderDsl> contactEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactEmail")),
            p -> new CombinationQueryPredicate<>(p, MyDivisionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyDivisionDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            MyDivisionDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyDivisionDraftQueryBuilderDsl> addresses(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("addresses"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            MyDivisionDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyDivisionDraftQueryBuilderDsl> addresses() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addresses")),
            p -> new CombinationQueryPredicate<>(p, MyDivisionDraftQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<MyDivisionDraftQueryBuilderDsl> shippingAddresses() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingAddresses")),
            p -> new CombinationQueryPredicate<>(p, MyDivisionDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyDivisionDraftQueryBuilderDsl> defaultShippingAddress() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultShippingAddress")),
            p -> new CombinationQueryPredicate<>(p, MyDivisionDraftQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<MyDivisionDraftQueryBuilderDsl> billingAddresses() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("billingAddresses")),
            p -> new CombinationQueryPredicate<>(p, MyDivisionDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyDivisionDraftQueryBuilderDsl> defaultBillingAddress() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultBillingAddress")),
            p -> new CombinationQueryPredicate<>(p, MyDivisionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyDivisionDraftQueryBuilderDsl> parentUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("parentUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            MyDivisionDraftQueryBuilderDsl::of);
    }

}
