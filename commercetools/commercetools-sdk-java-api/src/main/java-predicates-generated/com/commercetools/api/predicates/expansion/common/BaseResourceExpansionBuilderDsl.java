
package com.commercetools.api.predicates.expansion.common;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class BaseResourceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private BaseResourceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static BaseResourceExpansionBuilderDsl of() {
        return new BaseResourceExpansionBuilderDsl(Collections.emptyList());
    }

    public static BaseResourceExpansionBuilderDsl of(final List<String> path) {
        return new BaseResourceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

}
