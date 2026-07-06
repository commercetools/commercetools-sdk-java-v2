
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectSetProductCatalogModelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectSetProductCatalogModelActionBuilder builder) {
        ProjectSetProductCatalogModelAction projectSetProductCatalogModelAction = builder.buildUnchecked();
        Assertions.assertThat(projectSetProductCatalogModelAction)
                .isInstanceOf(ProjectSetProductCatalogModelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "productCatalogModel", ProjectSetProductCatalogModelAction.builder()
                .productCatalogModel(com.commercetools.api.models.project.ProductCatalogModel.findEnum("Classic")) } };
    }

    @Test
    public void productCatalogModel() {
        ProjectSetProductCatalogModelAction value = ProjectSetProductCatalogModelAction.of();
        value.setProductCatalogModel(com.commercetools.api.models.project.ProductCatalogModel.findEnum("Classic"));
        Assertions.assertThat(value.getProductCatalogModel())
                .isEqualTo(com.commercetools.api.models.project.ProductCatalogModel.findEnum("Classic"));
    }
}
