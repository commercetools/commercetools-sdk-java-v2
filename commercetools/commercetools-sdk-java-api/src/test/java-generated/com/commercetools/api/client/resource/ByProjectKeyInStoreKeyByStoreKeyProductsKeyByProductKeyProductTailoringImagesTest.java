
package com.commercetools.api.client.resource;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ApiRoot;
import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.error.ApiClientException;
import io.vrap.rmf.base.client.error.ApiServerException;
import io.vrap.rmf.base.client.utils.Generated;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesTest {
    private final VrapHttpClient httpClientMock = Mockito.mock(VrapHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final static ApiRoot apiRoot = ApiRoot.of();
    private final ApiHttpClient client = ClientBuilder.of(httpClientMock).defaultClient("").build();

    @TestTemplate
    @UseDataProvider("requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assertions.assertThat(httpMethod).isEqualTo(request.getMethod().name().toLowerCase());
        Assertions.assertThat(uri).isEqualTo(request.getUri().toString());
    }

    @TestTemplate
    @UseDataProvider("executeMethodParameters")
    public void executeServerException(HttpRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(500, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiServerException.class);
    }

    @TestTemplate
    @UseDataProvider("executeMethodParameters")
    public void executeClientException(HttpRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(400, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiClientException.class);
    }

    @DataProvider
    public static Object[][] requestWithMethodParameters() {
        return new Object[][] { new Object[] {
                apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .products()
                        .withProductKey("test_productKey")
                        .productTailoring()
                        .images()
                        .post(FileTestUtils.testFileFor(
                            ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesTest.class))
                        .withFilename("filename")
                        .createHttpRequest(),
                "post",
                "test_projectKey/in-store/key=test_storeKey/products/key=test_productKey/product-tailoring/images?filename=filename", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .products()
                        .withProductKey("test_productKey")
                        .productTailoring()
                        .images()
                        .post(FileTestUtils.testFileFor(
                            ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesTest.class))
                        .withVariant(7)
                        .createHttpRequest(), "post",
                        "test_projectKey/in-store/key=test_storeKey/products/key=test_productKey/product-tailoring/images?variant=7", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .products()
                        .withProductKey("test_productKey")
                        .productTailoring()
                        .images()
                        .post(FileTestUtils.testFileFor(
                            ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesTest.class))
                        .withSku("sku")
                        .createHttpRequest(), "post",
                        "test_projectKey/in-store/key=test_storeKey/products/key=test_productKey/product-tailoring/images?sku=sku", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .products()
                        .withProductKey("test_productKey")
                        .productTailoring()
                        .images()
                        .post(FileTestUtils.testFileFor(
                            ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesTest.class))
                        .withStaged(true)
                        .createHttpRequest(), "post",
                        "test_projectKey/in-store/key=test_storeKey/products/key=test_productKey/product-tailoring/images?staged=true", },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .products()
                        .withProductKey("test_productKey")
                        .productTailoring()
                        .images()
                        .post(FileTestUtils.testFileFor(
                            ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesTest.class))
                        .createHttpRequest(), "post",
                        "test_projectKey/in-store/key=test_storeKey/products/key=test_productKey/product-tailoring/images", } };
    }

    @DataProvider
    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .products()
                        .withProductKey("test_productKey")
                        .productTailoring()
                        .images()
                        .post(FileTestUtils.testFileFor(
                            ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesTest.class))
                        .withFilename("filename"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .products()
                        .withProductKey("test_productKey")
                        .productTailoring()
                        .images()
                        .post(FileTestUtils.testFileFor(
                            ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesTest.class))
                        .withVariant(7), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .products()
                        .withProductKey("test_productKey")
                        .productTailoring()
                        .images()
                        .post(FileTestUtils.testFileFor(
                            ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesTest.class))
                        .withSku("sku"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .products()
                        .withProductKey("test_productKey")
                        .productTailoring()
                        .images()
                        .post(FileTestUtils.testFileFor(
                            ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesTest.class))
                        .withStaged(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .products()
                        .withProductKey("test_productKey")
                        .productTailoring()
                        .images()
                        .post(FileTestUtils.testFileFor(
                            ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesTest.class)), } };
    }
}
