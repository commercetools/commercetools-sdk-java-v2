
package com.commercetools.api.predicates.expansion.standalone_price;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class StandalonePriceReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private StandalonePriceReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static StandalonePriceReferenceExpansionBuilderDsl of() {
        return new StandalonePriceReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static StandalonePriceReferenceExpansionBuilderDsl of(final List<String> path) {
        return new StandalonePriceReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.standalone_price.StandalonePriceExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.standalone_price.StandalonePriceExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
