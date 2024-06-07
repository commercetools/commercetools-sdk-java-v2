
package com.commercetools.api.predicates.expansion.shipping_method;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ZoneRateExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ZoneRateExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ZoneRateExpansionBuilderDsl of() {
        return new ZoneRateExpansionBuilderDsl(Collections.emptyList());
    }

    public static ZoneRateExpansionBuilderDsl of(final List<String> path) {
        return new ZoneRateExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.zone.ZoneReferenceExpansionBuilderDsl zone() {
        return com.commercetools.api.predicates.expansion.zone.ZoneReferenceExpansionBuilderDsl
                .of(appendOne(path, "zone"));
    }
}
