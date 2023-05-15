
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderAddCustomLineItemActionQueryBuilderDsl {
    public StagedOrderAddCustomLineItemActionQueryBuilderDsl() {
    }

    public static StagedOrderAddCustomLineItemActionQueryBuilderDsl of() {
        return new StagedOrderAddCustomLineItemActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderAddCustomLineItemActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderAddCustomLineItemActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderAddCustomLineItemActionQueryBuilderDsl> money(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("money"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            StagedOrderAddCustomLineItemActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderAddCustomLineItemActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            StagedOrderAddCustomLineItemActionQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StagedOrderAddCustomLineItemActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderAddCustomLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderAddCustomLineItemActionQueryBuilderDsl> slug() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("slug")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderAddCustomLineItemActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderAddCustomLineItemActionQueryBuilderDsl> taxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("taxCategory"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl
                            .of())),
            StagedOrderAddCustomLineItemActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderAddCustomLineItemActionQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            StagedOrderAddCustomLineItemActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderAddCustomLineItemActionQueryBuilderDsl> externalTaxRate(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            StagedOrderAddCustomLineItemActionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StagedOrderAddCustomLineItemActionQueryBuilderDsl> priceMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceMode")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderAddCustomLineItemActionQueryBuilderDsl::of));
    }
}
