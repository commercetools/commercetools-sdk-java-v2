
package com.commercetools.compat;

import com.commercetools.api.client.ProjectApiRoot;

public class CompatBuilder {
    private final ProjectApiRoot apiRoot;

    public CompatBuilder(ProjectApiRoot apiRoot) {
        this.apiRoot = apiRoot;
    }

    public static CompatBuilder of(ProjectApiRoot apiRoot) {
        return new CompatBuilder(apiRoot);
    }

    public QueryBuilder query() {
        return query(apiRoot);
    }

    public static QueryBuilder query(ProjectApiRoot apiRoot) {
        return QueryBuilder.of(apiRoot);
    }
}
