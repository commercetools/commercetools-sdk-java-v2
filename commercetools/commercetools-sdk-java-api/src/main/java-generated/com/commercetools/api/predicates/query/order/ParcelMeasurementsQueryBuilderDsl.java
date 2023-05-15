
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class ParcelMeasurementsQueryBuilderDsl {
    public ParcelMeasurementsQueryBuilderDsl() {
    }

    public static ParcelMeasurementsQueryBuilderDsl of() {
        return new ParcelMeasurementsQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ParcelMeasurementsQueryBuilderDsl> heightInMillimeter() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("heightInMillimeter")),
            p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ParcelMeasurementsQueryBuilderDsl> lengthInMillimeter() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lengthInMillimeter")),
            p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ParcelMeasurementsQueryBuilderDsl> widthInMillimeter() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("widthInMillimeter")),
            p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ParcelMeasurementsQueryBuilderDsl> weightInGram() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("weightInGram")),
            p -> new CombinationQueryPredicate<>(p, ParcelMeasurementsQueryBuilderDsl::of));
    }
}
