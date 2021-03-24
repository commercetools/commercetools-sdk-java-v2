

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.client.ByProjectKeyCategoriesGet;
import com.commercetools.api.client.ByProjectKeyCategoriesPost;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.category.CategoryDraft;
import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.net.URI;

/* cover ByProjectKeyCategoriesKeyByKeyGet
 * cover ByProjectKeyCategoriesByIDGet
 * cover ByProjectKeyCategoriesGet
 */
@RunWith(JUnitParamsRunner.class)
public class ResourceByProjectKeyCategoriesTest {

    private final ApiHttpClient apiHttpClientMock = Mockito.mock(ApiHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final ApiRoot apiRoot = createClient();

    public  final ApiRoot createClient() {
        return ApiFactory.create(
                ClientCredentials.of().withClientId("your-client-id").withClientSecret("your-client-secret").withScopes(
                        "your-scopes").build(),
                ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());
    }

    @Test
    @Parameters(method = "requestParameters")
    public void createHttpRequest(ApiHttpRequest request, String httpMethod, String uri) {
        Assert.assertEquals(httpMethod, request.getMethod().toString());
        Assert.assertEquals(uri, request.getUri().toString());
    }

    private Object[] requestParameters() {
        return new Object[] {
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/test_projectKey/categories?expand=expand"), new ApiHttpHeaders(), null), "GET", "/test_projectKey/categories?expand=expand" },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/test_projectKey/categories?sort=sort"), new ApiHttpHeaders(), null), "GET", "/test_projectKey/categories?sort=sort" },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/test_projectKey/categories?limit=10"), new ApiHttpHeaders(), null), "GET", "/test_projectKey/categories?limit=10" }
        };
    }

    @Test
    @Parameters(method = "requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {

        Assert.assertEquals(httpMethod, request.getMethod().toString());
        Assert.assertEquals(uri, request.getUri().toString());

    }

    private Object[] requestWithMethodParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey(projectKey).categories().get().withExpand("expand").createHttpRequest(), "GET", "/test_projectKey/categories?expand=expand"},
                new Object[] { apiRoot.withProjectKey(projectKey).categories().get().withSort("sort").createHttpRequest(), "GET", "/test_projectKey/categories?sort=sort"},
                new Object[] { apiRoot.withProjectKey(projectKey).categories().get().withLimit(10).createHttpRequest(), "GET", "/test_projectKey/categories?limit=10" }
        };
    }

    @Test
    @Parameters(method = "resourcesParameters")
    public void resources(ApiHttpRequest request, String uri) {

        Assert.assertEquals(uri, request.getUri().toString());
        Assert.assertEquals(uri, request.getUri().toString());
    }

    private Object[] resourcesParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey(projectKey).categories().withKey("test-key").get().createHttpRequest(), "/test_projectKey/categories/key=test-key" },
                new Object[] { apiRoot.withProjectKey(projectKey).categories().withId("test-id").get().createHttpRequest(), "/test_projectKey/categories/test-id"}
        };
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeWithNullPointerException(ApiHttpRequest httpRequest) throws Exception{
        Mockito.when(apiHttpClientMock.execute(httpRequest)).thenThrow(NullPointerException.class);
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET, new ByProjectKeyCategoriesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), new ApiHttpHeaders(), null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST, new ByProjectKeyCategoriesPost(apiHttpClientMock, projectKey, CategoryDraft.of()).createHttpRequest().getUri(), new ApiHttpHeaders(), null) }
        };
    }
}
