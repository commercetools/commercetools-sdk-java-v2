
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedQuoteSellerCommentSetMessageQueryBuilderDsl {
    public StagedQuoteSellerCommentSetMessageQueryBuilderDsl() {
    }

    public static StagedQuoteSellerCommentSetMessageQueryBuilderDsl of() {
        return new StagedQuoteSellerCommentSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteSellerCommentSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteSellerCommentSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StagedQuoteSellerCommentSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteSellerCommentSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StagedQuoteSellerCommentSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteSellerCommentSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StagedQuoteSellerCommentSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteSellerCommentSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedQuoteSellerCommentSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StagedQuoteSellerCommentSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedQuoteSellerCommentSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StagedQuoteSellerCommentSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StagedQuoteSellerCommentSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteSellerCommentSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedQuoteSellerCommentSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StagedQuoteSellerCommentSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StagedQuoteSellerCommentSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteSellerCommentSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedQuoteSellerCommentSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteSellerCommentSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedQuoteSellerCommentSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StagedQuoteSellerCommentSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StagedQuoteSellerCommentSetMessageQueryBuilderDsl> sellerComment() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sellerComment")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteSellerCommentSetMessageQueryBuilderDsl::of));
    }

}
