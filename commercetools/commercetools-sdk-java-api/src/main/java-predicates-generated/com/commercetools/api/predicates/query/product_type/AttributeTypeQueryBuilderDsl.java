
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AttributeTypeQueryBuilderDsl {
    public AttributeTypeQueryBuilderDsl() {
    }

    public static AttributeTypeQueryBuilderDsl of() {
        return new AttributeTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AttributeTypeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AttributeTypeQueryBuilderDsl> asBoolean(
            Function<com.commercetools.api.predicates.query.product_type.AttributeBooleanTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeBooleanTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_type.AttributeBooleanTypeQueryBuilderDsl.of()),
            AttributeTypeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeTypeQueryBuilderDsl> asDatetime(
            Function<com.commercetools.api.predicates.query.product_type.AttributeDateTimeTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeDateTimeTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_type.AttributeDateTimeTypeQueryBuilderDsl.of()),
            AttributeTypeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeTypeQueryBuilderDsl> asDate(
            Function<com.commercetools.api.predicates.query.product_type.AttributeDateTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeDateTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_type.AttributeDateTypeQueryBuilderDsl.of()),
            AttributeTypeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeTypeQueryBuilderDsl> asEnum(
            Function<com.commercetools.api.predicates.query.product_type.AttributeEnumTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeEnumTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_type.AttributeEnumTypeQueryBuilderDsl.of()),
            AttributeTypeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeTypeQueryBuilderDsl> asLtext(
            Function<com.commercetools.api.predicates.query.product_type.AttributeLocalizableTextTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeLocalizableTextTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_type.AttributeLocalizableTextTypeQueryBuilderDsl.of()),
            AttributeTypeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeTypeQueryBuilderDsl> asLenum(
            Function<com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumTypeQueryBuilderDsl.of()),
            AttributeTypeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeTypeQueryBuilderDsl> asMoney(
            Function<com.commercetools.api.predicates.query.product_type.AttributeMoneyTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeMoneyTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_type.AttributeMoneyTypeQueryBuilderDsl.of()),
            AttributeTypeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeTypeQueryBuilderDsl> asNested(
            Function<com.commercetools.api.predicates.query.product_type.AttributeNestedTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeNestedTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_type.AttributeNestedTypeQueryBuilderDsl.of()),
            AttributeTypeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeTypeQueryBuilderDsl> asNumber(
            Function<com.commercetools.api.predicates.query.product_type.AttributeNumberTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeNumberTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_type.AttributeNumberTypeQueryBuilderDsl.of()),
            AttributeTypeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeTypeQueryBuilderDsl> asReference(
            Function<com.commercetools.api.predicates.query.product_type.AttributeReferenceTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeReferenceTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_type.AttributeReferenceTypeQueryBuilderDsl.of()),
            AttributeTypeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeTypeQueryBuilderDsl> asSet(
            Function<com.commercetools.api.predicates.query.product_type.AttributeSetTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeSetTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_type.AttributeSetTypeQueryBuilderDsl.of()),
            AttributeTypeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeTypeQueryBuilderDsl> asText(
            Function<com.commercetools.api.predicates.query.product_type.AttributeTextTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeTextTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_type.AttributeTextTypeQueryBuilderDsl.of()),
            AttributeTypeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AttributeTypeQueryBuilderDsl> asTime(
            Function<com.commercetools.api.predicates.query.product_type.AttributeTimeTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeTimeTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product_type.AttributeTimeTypeQueryBuilderDsl.of()),
            AttributeTypeQueryBuilderDsl::of);
    }
}
