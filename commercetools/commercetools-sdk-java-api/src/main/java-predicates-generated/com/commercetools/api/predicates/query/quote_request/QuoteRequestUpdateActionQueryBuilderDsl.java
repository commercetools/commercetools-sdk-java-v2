
package com.commercetools.api.predicates.query.quote_request;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestUpdateActionQueryBuilderDsl {
    public QuoteRequestUpdateActionQueryBuilderDsl() {
    }

    public static QuoteRequestUpdateActionQueryBuilderDsl of() {
        return new QuoteRequestUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestUpdateActionQueryBuilderDsl> asChangeCustomer(
            Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestChangeCustomerActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestChangeCustomerActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.quote_request.QuoteRequestChangeCustomerActionQueryBuilderDsl.of()),
            QuoteRequestUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestUpdateActionQueryBuilderDsl> asChangeQuoteRequestState(
            Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestChangeQuoteRequestStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestChangeQuoteRequestStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.quote_request.QuoteRequestChangeQuoteRequestStateActionQueryBuilderDsl
                    .of()),
            QuoteRequestUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.quote_request.QuoteRequestSetCustomFieldActionQueryBuilderDsl.of()),
            QuoteRequestUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.quote_request.QuoteRequestSetCustomTypeActionQueryBuilderDsl.of()),
            QuoteRequestUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestUpdateActionQueryBuilderDsl> asTransitionState(
            Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestTransitionStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestTransitionStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.quote_request.QuoteRequestTransitionStateActionQueryBuilderDsl.of()),
            QuoteRequestUpdateActionQueryBuilderDsl::of);
    }
}
