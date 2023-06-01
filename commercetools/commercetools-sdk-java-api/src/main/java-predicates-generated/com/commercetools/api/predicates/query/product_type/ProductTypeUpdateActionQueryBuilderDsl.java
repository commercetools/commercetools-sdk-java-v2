package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductTypeUpdateActionQueryBuilderDsl  {
    public ProductTypeUpdateActionQueryBuilderDsl() {
    }

    public static ProductTypeUpdateActionQueryBuilderDsl of() {
        return new ProductTypeUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asAddAttributeDefinition(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeAddAttributeDefinitionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeAddAttributeDefinitionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeAddAttributeDefinitionActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asAddLocalizedEnumValue(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeAddLocalizedEnumValueActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeAddLocalizedEnumValueActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeAddLocalizedEnumValueActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asAddPlainEnumValue(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeAddPlainEnumValueActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeAddPlainEnumValueActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeAddPlainEnumValueActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asChangeAttributeConstraint(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeChangeAttributeConstraintActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeChangeAttributeConstraintActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeChangeAttributeConstraintActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asChangeAttributeName(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeChangeAttributeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeChangeAttributeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeChangeAttributeNameActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asChangeAttributeOrderByName(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeChangeAttributeOrderByNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeChangeAttributeOrderByNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeChangeAttributeOrderByNameActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asChangeDescription(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeChangeDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeChangeDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeChangeDescriptionActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asChangeEnumKey(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeChangeEnumKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeChangeEnumKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeChangeEnumKeyActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asChangeInputHint(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeChangeInputHintActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeChangeInputHintActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeChangeInputHintActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asChangeIsSearchable(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeChangeIsSearchableActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeChangeIsSearchableActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeChangeIsSearchableActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asChangeLabel(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeChangeLabelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeChangeLabelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeChangeLabelActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asChangeLocalizedEnumValueLabel(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asChangeLocalizedEnumValueOrder(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asChangeName(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeChangeNameActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asChangePlainEnumValueLabel(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeChangePlainEnumValueLabelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeChangePlainEnumValueLabelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeChangePlainEnumValueLabelActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asChangePlainEnumValueOrder(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeChangePlainEnumValueOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeChangePlainEnumValueOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeChangePlainEnumValueOrderActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asRemoveAttributeDefinition(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeRemoveAttributeDefinitionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeRemoveAttributeDefinitionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeRemoveAttributeDefinitionActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asRemoveEnumValues(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeRemoveEnumValuesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeRemoveEnumValuesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeRemoveEnumValuesActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asSetInputTip(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeSetInputTipActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeSetInputTipActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeSetInputTipActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductTypeUpdateActionQueryBuilderDsl> asSetKey(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeSetKeyActionQueryBuilderDsl.of()),
            ProductTypeUpdateActionQueryBuilderDsl::of);
    }
}
