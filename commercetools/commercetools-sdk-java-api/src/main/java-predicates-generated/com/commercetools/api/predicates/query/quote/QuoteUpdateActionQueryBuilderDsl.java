
package com.commercetools.api.predicates.query.quote;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteUpdateActionQueryBuilderDsl {
    public QuoteUpdateActionQueryBuilderDsl() {
    }

    public static QuoteUpdateActionQueryBuilderDsl of() {
        return new QuoteUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, QuoteUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteUpdateActionQueryBuilderDsl> asChangeCustomer(
            Function<com.commercetools.api.predicates.query.quote.QuoteChangeCustomerActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteChangeCustomerActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.quote.QuoteChangeCustomerActionQueryBuilderDsl.of()),
            QuoteUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteUpdateActionQueryBuilderDsl> asChangeQuoteState(
            Function<com.commercetools.api.predicates.query.quote.QuoteChangeQuoteStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteChangeQuoteStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.quote.QuoteChangeQuoteStateActionQueryBuilderDsl.of()),
            QuoteUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteUpdateActionQueryBuilderDsl> asRequestQuoteRenegotiation(
            Function<com.commercetools.api.predicates.query.quote.QuoteRequestQuoteRenegotiationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteRequestQuoteRenegotiationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.quote.QuoteRequestQuoteRenegotiationActionQueryBuilderDsl.of()),
            QuoteUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.quote.QuoteSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.quote.QuoteSetCustomFieldActionQueryBuilderDsl.of()),
            QuoteUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.quote.QuoteSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.quote.QuoteSetCustomTypeActionQueryBuilderDsl.of()),
            QuoteUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteUpdateActionQueryBuilderDsl> asTransitionState(
            Function<com.commercetools.api.predicates.query.quote.QuoteTransitionStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteTransitionStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.quote.QuoteTransitionStateActionQueryBuilderDsl.of()),
            QuoteUpdateActionQueryBuilderDsl::of);
    }
}
