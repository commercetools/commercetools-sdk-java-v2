
package com.commercetools.api.predicates.query.staged_quote;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedQuoteUpdateActionQueryBuilderDsl {
    public StagedQuoteUpdateActionQueryBuilderDsl() {
    }

    public static StagedQuoteUpdateActionQueryBuilderDsl of() {
        return new StagedQuoteUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedQuoteUpdateActionQueryBuilderDsl> asChangeStagedQuoteState(
            Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteChangeStagedQuoteStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteChangeStagedQuoteStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.staged_quote.StagedQuoteChangeStagedQuoteStateActionQueryBuilderDsl
                    .of()),
            StagedQuoteUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedQuoteUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.staged_quote.StagedQuoteSetCustomFieldActionQueryBuilderDsl.of()),
            StagedQuoteUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedQuoteUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.staged_quote.StagedQuoteSetCustomTypeActionQueryBuilderDsl.of()),
            StagedQuoteUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedQuoteUpdateActionQueryBuilderDsl> asSetSellerComment(
            Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteSetSellerCommentActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteSetSellerCommentActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.staged_quote.StagedQuoteSetSellerCommentActionQueryBuilderDsl.of()),
            StagedQuoteUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedQuoteUpdateActionQueryBuilderDsl> asSetValidTo(
            Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteSetValidToActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteSetValidToActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.staged_quote.StagedQuoteSetValidToActionQueryBuilderDsl.of()),
            StagedQuoteUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedQuoteUpdateActionQueryBuilderDsl> asTransitionState(
            Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteTransitionStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteTransitionStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.staged_quote.StagedQuoteTransitionStateActionQueryBuilderDsl.of()),
            StagedQuoteUpdateActionQueryBuilderDsl::of);
    }
}
