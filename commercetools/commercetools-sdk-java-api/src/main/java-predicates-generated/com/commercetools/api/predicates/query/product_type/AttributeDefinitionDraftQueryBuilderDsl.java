
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AttributeDefinitionDraftQueryBuilderDsl {
    public AttributeDefinitionDraftQueryBuilderDsl() {
    }

    public static AttributeDefinitionDraftQueryBuilderDsl of() {
        return new AttributeDefinitionDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<AttributeDefinitionDraftQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.product_type.AttributeTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_type.AttributeTypeQueryBuilderDsl.of())),
            AttributeDefinitionDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AttributeDefinitionDraftQueryBuilderDsl> label(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("label"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            AttributeDefinitionDraftQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<AttributeDefinitionDraftQueryBuilderDsl> isRequired() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isRequired")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionDraftQueryBuilderDsl> attributeConstraint() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeConstraint")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AttributeDefinitionDraftQueryBuilderDsl> inputTip(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("inputTip"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            AttributeDefinitionDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionDraftQueryBuilderDsl> inputHint() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inputHint")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionDraftQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<AttributeDefinitionDraftQueryBuilderDsl> isSearchable() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isSearchable")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionDraftQueryBuilderDsl::of));
    }

}
