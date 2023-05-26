
package com.commercetools.graphql.api;

import java.util.Collections;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.graphql.CommercetoolsTestUtils;
import com.commercetools.graphql.api.types.CategoryQueryResult;
import com.commercetools.graphql.api.types.ProductQueryResult;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuery {

    @Test
    public void products() {
        final ProjectApiRoot projectRoot = CommercetoolsTestUtils.getProjectApiRoot();

        final ProductQueryResult productQueryResult = GraphQL.of(projectRoot)
                .queryProductsBlocking(query -> query.localeProjection(Collections.singletonList("en")),
                    root -> root.results().id().key().productType().key().getParent().createdAt().key());

        Assertions.assertThat(productQueryResult).isNotNull();

        final CategoryQueryResult categoriesQueryResult = GraphQL.of(projectRoot)
                .queryCategoriesBlocking(query -> query.queryName("t"),
                    root -> root.results().id().key().createdAt().key());
        Assertions.assertThat(categoriesQueryResult).isNotNull();

    }
}
