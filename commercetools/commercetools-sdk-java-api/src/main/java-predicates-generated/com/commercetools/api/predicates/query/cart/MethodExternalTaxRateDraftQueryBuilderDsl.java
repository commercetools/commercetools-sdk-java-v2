
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MethodExternalTaxRateDraftQueryBuilderDsl {
    public MethodExternalTaxRateDraftQueryBuilderDsl() {
    }

    public static MethodExternalTaxRateDraftQueryBuilderDsl of() {
        return new MethodExternalTaxRateDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MethodExternalTaxRateDraftQueryBuilderDsl> shippingMethodKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMethodKey")),
            p -> new CombinationQueryPredicate<>(p, MethodExternalTaxRateDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MethodExternalTaxRateDraftQueryBuilderDsl> taxRate(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("taxRate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            MethodExternalTaxRateDraftQueryBuilderDsl::of);
    }

}
