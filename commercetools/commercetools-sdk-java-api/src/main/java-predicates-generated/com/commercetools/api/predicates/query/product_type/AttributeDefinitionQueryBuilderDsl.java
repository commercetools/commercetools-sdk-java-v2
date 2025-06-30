
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AttributeDefinitionQueryBuilderDsl {
    public AttributeDefinitionQueryBuilderDsl() {
    }

    public static AttributeDefinitionQueryBuilderDsl of() {
        return new AttributeDefinitionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<AttributeDefinitionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.product_type.AttributeTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_type.AttributeTypeQueryBuilderDsl.of())),
            AttributeDefinitionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AttributeDefinitionQueryBuilderDsl> label(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("label"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            AttributeDefinitionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<AttributeDefinitionQueryBuilderDsl> isRequired() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isRequired")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionQueryBuilderDsl> level() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("level")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionQueryBuilderDsl> attributeConstraint() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeConstraint")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AttributeDefinitionQueryBuilderDsl> inputTip(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("inputTip"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            AttributeDefinitionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<AttributeDefinitionQueryBuilderDsl> inputHint() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inputHint")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<AttributeDefinitionQueryBuilderDsl> isSearchable() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isSearchable")),
            p -> new CombinationQueryPredicate<>(p, AttributeDefinitionQueryBuilderDsl::of));
    }

}
