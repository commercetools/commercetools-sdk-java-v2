
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryImportRequestBuilder builder) {
        CategoryImportRequest categoryImportRequest = builder.buildUnchecked();
        Assertions.assertThat(categoryImportRequest).isInstanceOf(CategoryImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources",
                CategoryImportRequest.builder()
                        .resources(Collections.singletonList(
                            new com.commercetools.importapi.models.categories.CategoryImportImpl())) } };
    }

    @Test
    public void resources() {
        CategoryImportRequest value = CategoryImportRequest.of();
        value.setResources(
            Collections.singletonList(new com.commercetools.importapi.models.categories.CategoryImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.categories.CategoryImportImpl()));
    }
}
