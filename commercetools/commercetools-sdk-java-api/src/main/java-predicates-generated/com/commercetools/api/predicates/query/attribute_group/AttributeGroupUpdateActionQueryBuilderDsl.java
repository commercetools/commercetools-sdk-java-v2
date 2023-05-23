
package com.commercetools.api.predicates.query.attribute_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AttributeGroupUpdateActionQueryBuilderDsl {
    public AttributeGroupUpdateActionQueryBuilderDsl() {
    }

    public static AttributeGroupUpdateActionQueryBuilderDsl of() {
        return new AttributeGroupUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeGroupUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AttributeGroupUpdateActionQueryBuilderDsl> asAddAttribute(
            Function<com.commercetools.api.predicates.query.attribute_group.AttributeGroupAddAttributeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeGroupAddAttributeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.attribute_group.AttributeGroupAddAttributeActionQueryBuilderDsl
                    .of()),
            AttributeGroupUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeGroupUpdateActionQueryBuilderDsl> asChangeName(
            Function<com.commercetools.api.predicates.query.attribute_group.AttributeGroupChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeGroupChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.attribute_group.AttributeGroupChangeNameActionQueryBuilderDsl.of()),
            AttributeGroupUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeGroupUpdateActionQueryBuilderDsl> asRemoveAttribute(
            Function<com.commercetools.api.predicates.query.attribute_group.AttributeGroupRemoveAttributeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeGroupRemoveAttributeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.attribute_group.AttributeGroupRemoveAttributeActionQueryBuilderDsl
                    .of()),
            AttributeGroupUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeGroupUpdateActionQueryBuilderDsl> asSetAttributes(
            Function<com.commercetools.api.predicates.query.attribute_group.AttributeGroupSetAttributesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeGroupSetAttributesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.attribute_group.AttributeGroupSetAttributesActionQueryBuilderDsl
                    .of()),
            AttributeGroupUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeGroupUpdateActionQueryBuilderDsl> asSetDescription(
            Function<com.commercetools.api.predicates.query.attribute_group.AttributeGroupSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeGroupSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.attribute_group.AttributeGroupSetDescriptionActionQueryBuilderDsl
                    .of()),
            AttributeGroupUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeGroupUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.attribute_group.AttributeGroupSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeGroupSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.attribute_group.AttributeGroupSetKeyActionQueryBuilderDsl.of()),
            AttributeGroupUpdateActionQueryBuilderDsl::of);
    }
}
