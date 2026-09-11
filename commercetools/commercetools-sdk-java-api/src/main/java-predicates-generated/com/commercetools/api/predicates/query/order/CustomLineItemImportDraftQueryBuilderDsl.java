
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomLineItemImportDraftQueryBuilderDsl {
    public CustomLineItemImportDraftQueryBuilderDsl() {
    }

    public static CustomLineItemImportDraftQueryBuilderDsl of() {
        return new CustomLineItemImportDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<CustomLineItemImportDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CustomLineItemImportDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CustomLineItemImportDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemImportDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomLineItemImportDraftQueryBuilderDsl> slug() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("slug")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemImportDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomLineItemImportDraftQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemImportDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomLineItemImportDraftQueryBuilderDsl> money(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("money"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            CustomLineItemImportDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomLineItemImportDraftQueryBuilderDsl> taxRate(
            Function<com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxRate"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl.of())),
            CustomLineItemImportDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomLineItemImportDraftQueryBuilderDsl> taxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("taxCategory"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl
                            .of())),
            CustomLineItemImportDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CustomLineItemImportDraftQueryBuilderDsl> priceMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceMode")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemImportDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomLineItemImportDraftQueryBuilderDsl> shippingDetails(
            Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingDetails"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl.of())),
            CustomLineItemImportDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomLineItemImportDraftQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl.of())),
            CustomLineItemImportDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomLineItemImportDraftQueryBuilderDsl> state() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemImportDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomLineItemImportDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            CustomLineItemImportDraftQueryBuilderDsl::of);
    }

}
