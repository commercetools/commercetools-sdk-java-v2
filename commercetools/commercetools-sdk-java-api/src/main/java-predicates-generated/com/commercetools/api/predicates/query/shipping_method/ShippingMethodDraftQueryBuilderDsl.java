package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShippingMethodDraftQueryBuilderDsl  {
    public ShippingMethodDraftQueryBuilderDsl() {
    }

    public static ShippingMethodDraftQueryBuilderDsl of() {
        return new ShippingMethodDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ShippingMethodDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ShippingMethodDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, ShippingMethodDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ShippingMethodDraftQueryBuilderDsl> localizedName(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("localizedName"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShippingMethodDraftQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<ShippingMethodDraftQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
        p -> new CombinationQueryPredicate<>(p, ShippingMethodDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ShippingMethodDraftQueryBuilderDsl> localizedDescription(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("localizedDescription"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShippingMethodDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ShippingMethodDraftQueryBuilderDsl> taxCategory(
        Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("taxCategory"))
            .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl.of())),
            ShippingMethodDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ShippingMethodDraftQueryBuilderDsl> zoneRates(
        Function<com.commercetools.api.predicates.query.shipping_method.ZoneRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ZoneRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("zoneRates"))
            .inner(fn.apply(com.commercetools.api.predicates.query.shipping_method.ZoneRateDraftQueryBuilderDsl.of())),
            ShippingMethodDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ShippingMethodDraftQueryBuilderDsl> zoneRates() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("zoneRates")),
                p -> new CombinationQueryPredicate<>(p, ShippingMethodDraftQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ShippingMethodDraftQueryBuilderDsl> isDefault() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isDefault")),
        p -> new CombinationQueryPredicate<>(p, ShippingMethodDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ShippingMethodDraftQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
        p -> new CombinationQueryPredicate<>(p, ShippingMethodDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ShippingMethodDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            ShippingMethodDraftQueryBuilderDsl::of);
    }
    
    
}
