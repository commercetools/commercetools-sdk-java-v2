
package com.commercetools.api.models.product_search;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchErrorResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchErrorResponseBuilder builder) {
        ProductSearchErrorResponse productSearchErrorResponse = builder.buildUnchecked();
        Assertions.assertThat(productSearchErrorResponse).isInstanceOf(ProductSearchErrorResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "statusCode", ProductSearchErrorResponse.builder().statusCode(8) },
                new Object[] { "message", ProductSearchErrorResponse.builder().message("message") },
                new Object[] { "errors", ProductSearchErrorResponse.builder()
                        .errors(
                            Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl())) } };
    }

    @Test
    public void statusCode() {
        ProductSearchErrorResponse value = ProductSearchErrorResponse.of();
        value.setStatusCode(8);
        Assertions.assertThat(value.getStatusCode()).isEqualTo(8);
    }

    @Test
    public void message() {
        ProductSearchErrorResponse value = ProductSearchErrorResponse.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void errors() {
        ProductSearchErrorResponse value = ProductSearchErrorResponse.of();
        value.setErrors(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl()));
    }
}
