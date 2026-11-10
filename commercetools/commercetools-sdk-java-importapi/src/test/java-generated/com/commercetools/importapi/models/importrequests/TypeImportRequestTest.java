
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeImportRequestBuilder builder) {
        TypeImportRequest typeImportRequest = builder.buildUnchecked();
        Assertions.assertThat(typeImportRequest).isInstanceOf(TypeImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources", TypeImportRequest.builder()
                .resources(
                    Collections.singletonList(new com.commercetools.importapi.models.types.TypeImportImpl())) } };
    }

    @Test
    public void resources() {
        TypeImportRequest value = TypeImportRequest.of();
        value.setResources(Collections.singletonList(new com.commercetools.importapi.models.types.TypeImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.types.TypeImportImpl()));
    }
}
