
package com.commercetools.api.predicates.expansion.business_unit;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class BusinessUnitReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private BusinessUnitReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static BusinessUnitReferenceExpansionBuilderDsl of() {
        return new BusinessUnitReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static BusinessUnitReferenceExpansionBuilderDsl of(final List<String> path) {
        return new BusinessUnitReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.business_unit.BusinessUnitExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.business_unit.BusinessUnitExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
