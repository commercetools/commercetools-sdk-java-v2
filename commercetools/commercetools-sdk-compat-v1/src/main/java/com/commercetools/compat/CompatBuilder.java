
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

    public GetByIdBuilder getById() {
        return getById(apiRoot);
    }

    public static GetByIdBuilder getById(ProjectApiRoot apiRoot) {
        return GetByIdBuilder.of(apiRoot);
    }

    public GetByKeyBuilder getByKey() {
        return getByKey(apiRoot);
    }

    public static GetByKeyBuilder getByKey(ProjectApiRoot apiRoot) {
        return GetByKeyBuilder.of(apiRoot);
    }

    public DeleteBuilder delete() {
        return delete(apiRoot);
    }

    public static DeleteBuilder delete(ProjectApiRoot apiRoot) {
        return DeleteBuilder.of(apiRoot);
    }

}
