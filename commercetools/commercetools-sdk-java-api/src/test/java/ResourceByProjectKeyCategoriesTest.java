

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
    private final String projectKey = "test-projectkey";
    private final ApiRoot apiRoot = createClient();

    public  final ApiRoot createClient() {
        return ApiFactory.create(
                ClientCredentials.of().withClientId("your-client-id").withClientSecret("your-client-secret").withScopes(
                        "your-scopes").build(),
                ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());
    }

    @Test
    @Parameters(method = "requestParameters")
    public void createHttpRequest(ApiHttpRequest apiHttpRequest) {



        ByProjectKeyCategoriesGet byProjectKeyCategoriesGet = new ByProjectKeyCategoriesGet(apiHttpClientMock, projectKey);

        Assert.assertEquals(apiHttpRequest.getMethod().toString(), byProjectKeyCategoriesGet.createHttpRequest().getMethod().toString());
    }

    private Object[] requestParameters() {
        return new Object[] {
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/test_projectKey/categories?expand=expand"), new ApiHttpHeaders(), null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/test_projectKey/categories?sort=sort"), new ApiHttpHeaders(), null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/test_projectKey/categories?limit=10"), new ApiHttpHeaders(), null) }
        };
    }

    @Test
    @Parameters(method = "requestWithParameters")
    public void withMethods(ApiHttpRequest request) {
//        ApiHttpRequest request = apiRoot.withProjectKey("test_projectKey").categories().get().withExpand("expand").createHttpRequest();

        Assert.assertEquals("GET", request.getMethod().toString());
        Assert.assertEquals("/test_projectKey/categories?expand=expand", request.getUri().toString());

//        ApiHttpRequest request1 = apiRoot.withProjectKey("test_projectKey").categories().get().withSort("sort").createHttpRequest();

//        Assert.assertEquals("GET", request1.getMethod().toString());
        Assert.assertEquals("/test_projectKey/categories?sort=sort", request.getUri().toString());

//        ApiHttpRequest request2 = apiRoot.withProjectKey("test_projectKey").categories().get().withLimit(10).createHttpRequest();

//        Assert.assertEquals("GET", request2.getMethod().toString());
        Assert.assertEquals("/test_projectKey/categories?limit=10", request.getUri().toString());
    }

    private Object[] requestWithParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").categories().get().withExpand("expand").createHttpRequest() },
                new Object[] { apiRoot.withProjectKey("test_projectKey").categories().get().withSort("sort").createHttpRequest() },
                new Object[] { apiRoot.withProjectKey("test_projectKey").categories().get().withLimit(10).createHttpRequest() }
        };
    }

    @Test
    @Parameters(method = "resourcesParameters")
    public void resources(ApiHttpRequest request) {
//        ApiHttpRequest request = apiRoot.withProjectKey("test_projectKey").categories().withKey("test-key").get().createHttpRequest();
        Assert.assertEquals("/test_projectKey/categories/key=test-key", request.getUri().toString());

//        ApiHttpRequest request1 = apiRoot.withProjectKey("test_projectKey").categories().withId("test-id").get().createHttpRequest();
        Assert.assertEquals("/test_projectKey/categories/test-id", request.getUri().toString());
    }

    private Object[] resourcesParameters() {
        return new Object[] {
                new Object[] { apiRoot.withProjectKey("test_projectKey").categories().withKey("test-key").get().createHttpRequest() },
                new Object[] { apiRoot.withProjectKey("test_projectKey").categories().withId("test-id").get().createHttpRequest() }
        };
    }

    @Test
    @Parameters(method = "executeMethodParameters")
    public void executeWithNullPointerException(ApiHttpRequest httpRequest) throws Exception{
//        ApiHttpClient apiHttpClientMock = Mockito.mock(ApiHttpClient.class);
//        String projectKey = "test-projectkey";

//        ByProjectKeyCategoriesGet byProjectKeyCategoriesGet = new ByProjectKeyCategoriesGet(apiHttpClientMock, projectKey);

//        ApiHttpRequest httpRequest1 = new ApiHttpRequest(ApiHttpMethod.GET, byProjectKeyCategoriesGet.createHttpRequest().getUri(), new ApiHttpHeaders(), null);
        Mockito.when(apiHttpClientMock.execute(httpRequest)).thenThrow(NullPointerException.class);

//        ByProjectKeyCategoriesPost byProjectKeyCategoriesPost = new ByProjectKeyCategoriesPost(apiHttpClientMock, projectKey, CategoryDraft.of());

//        ApiHttpRequest httpRequest2 = new ApiHttpRequest(ApiHttpMethod.POST, byProjectKeyCategoriesPost.createHttpRequest().getUri(), new ApiHttpHeaders(), null);
//        Mockito.when(apiHttpClientMock.execute(httpRequest2)).thenThrow(NullPointerException.class);
    }

    private Object[] executeMethodParameters() {
        return new Object[] {
                new Object[] { new ApiHttpRequest(ApiHttpMethod.GET, new ByProjectKeyCategoriesGet(apiHttpClientMock, projectKey).createHttpRequest().getUri(), new ApiHttpHeaders(), null) },
                new Object[] { new ApiHttpRequest(ApiHttpMethod.POST, new ByProjectKeyCategoriesPost(apiHttpClientMock, projectKey, CategoryDraft.of()).createHttpRequest().getUri(), new ApiHttpHeaders(), null) }
        };
    }
}
