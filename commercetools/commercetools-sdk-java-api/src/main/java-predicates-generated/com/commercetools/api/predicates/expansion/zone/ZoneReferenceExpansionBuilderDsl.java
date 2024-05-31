
package com.commercetools.api.predicates.expansion.zone;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ZoneReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ZoneReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ZoneReferenceExpansionBuilderDsl of() {
        return new ZoneReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static ZoneReferenceExpansionBuilderDsl of(final List<String> path) {
        return new ZoneReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.zone.ZoneExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.zone.ZoneExpansionBuilderDsl.of(appendOne(path, "obj"));
    }
}
