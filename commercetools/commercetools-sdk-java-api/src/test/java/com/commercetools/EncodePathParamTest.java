
package com.commercetools;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;

import io.vrap.rmf.base.client.ApiHttpRequest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class EncodePathParamTest {
    @Test
    public void testPathTraversal() {
        final ProjectApiRoot project = ApiRootBuilder.of().withApiBaseUrl("").build("test");

        final ApiHttpRequest httpRequest = project.carts().withId("../categories").get().createHttpRequest();
        Assertions.assertThat(httpRequest.getUri().toString()).isEqualTo("test/carts/..%2Fcategories");
    }

}
