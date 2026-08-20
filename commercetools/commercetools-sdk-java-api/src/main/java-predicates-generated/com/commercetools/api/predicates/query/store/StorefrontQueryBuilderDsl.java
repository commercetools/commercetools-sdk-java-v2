
package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

public class StorefrontQueryBuilderDsl {
    public StorefrontQueryBuilderDsl() {
    }

    public static StorefrontQueryBuilderDsl of() {
        return new StorefrontQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StorefrontQueryBuilderDsl> checkoutUrlTemplate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("checkoutUrlTemplate")),
            p -> new CombinationQueryPredicate<>(p, StorefrontQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StorefrontQueryBuilderDsl> orderUrlTemplate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderUrlTemplate")),
            p -> new CombinationQueryPredicate<>(p, StorefrontQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StorefrontQueryBuilderDsl> termsOfServiceUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("termsOfServiceUrl")),
            p -> new CombinationQueryPredicate<>(p, StorefrontQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StorefrontQueryBuilderDsl> privacyPolicyUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("privacyPolicyUrl")),
            p -> new CombinationQueryPredicate<>(p, StorefrontQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StorefrontQueryBuilderDsl> refundPolicyUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("refundPolicyUrl")),
            p -> new CombinationQueryPredicate<>(p, StorefrontQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StorefrontQueryBuilderDsl> shippingPolicyUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingPolicyUrl")),
            p -> new CombinationQueryPredicate<>(p, StorefrontQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StorefrontQueryBuilderDsl> cookiePolicyUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cookiePolicyUrl")),
            p -> new CombinationQueryPredicate<>(p, StorefrontQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StorefrontQueryBuilderDsl> imprintUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("imprintUrl")),
            p -> new CombinationQueryPredicate<>(p, StorefrontQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StorefrontQueryBuilderDsl> faqUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("faqUrl")),
            p -> new CombinationQueryPredicate<>(p, StorefrontQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StorefrontQueryBuilderDsl> contactUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactUrl")),
            p -> new CombinationQueryPredicate<>(p, StorefrontQueryBuilderDsl::of));
    }

}
