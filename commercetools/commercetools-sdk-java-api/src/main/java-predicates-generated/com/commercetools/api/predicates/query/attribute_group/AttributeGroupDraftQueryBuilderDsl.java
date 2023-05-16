
package com.commercetools.api.predicates.query.attribute_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AttributeGroupDraftQueryBuilderDsl {
    public AttributeGroupDraftQueryBuilderDsl() {
    }

    public static AttributeGroupDraftQueryBuilderDsl of() {
        return new AttributeGroupDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<AttributeGroupDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            AttributeGroupDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeGroupDraftQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            AttributeGroupDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeGroupDraftQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.attribute_group.AttributeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.attribute_group.AttributeReferenceQueryBuilderDsl.of())),
            AttributeGroupDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<AttributeGroupDraftQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeGroupDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupDraftQueryBuilderDsl::of));
    }

}
