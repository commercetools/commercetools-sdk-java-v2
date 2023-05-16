
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ExternalTaxAmountDraftQueryBuilderDsl {
    public ExternalTaxAmountDraftQueryBuilderDsl() {
    }

    public static ExternalTaxAmountDraftQueryBuilderDsl of() {
        return new ExternalTaxAmountDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ExternalTaxAmountDraftQueryBuilderDsl> totalGross(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("totalGross"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            ExternalTaxAmountDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ExternalTaxAmountDraftQueryBuilderDsl> taxRate(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("taxRate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            ExternalTaxAmountDraftQueryBuilderDsl::of);
    }

}
