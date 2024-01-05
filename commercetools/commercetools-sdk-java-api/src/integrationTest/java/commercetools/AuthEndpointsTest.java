
package commercetools;

import static java.lang.String.format;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.ExecutionException;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.product.ProductPagedQueryResponse;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.HttpStatusCode;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthEndpointsTest {
    @Test
    public void introspection() throws ExecutionException, InterruptedException {
        // retrieve a token

        ClientCredentials credentials = ClientCredentials.of()
                .withClientId(CommercetoolsTestUtils.getClientId())
                .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                .build();
        ClientCredentialsTokenSupplier tokenSupplier = new ClientCredentialsTokenSupplier(credentials.getClientId(),
            credentials.getClientSecret(), "", ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
            HttpClientSupplier.of().get());
        final AuthenticationToken token = tokenSupplier.getToken().get();

        // client to be used for calling introspection endpoint
        ApiHttpClient client = ClientBuilder.of().defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getAuthUrl()).build();

        // build the introspection request
        final String auth = Base64.getEncoder()
                .encodeToString(
                    (credentials.getClientId() + ":" + credentials.getClientSecret()).getBytes(StandardCharsets.UTF_8));

        final ApiHttpHeaders headers = new ApiHttpHeaders()
                .withHeader(ApiHttpHeaders.AUTHORIZATION, format("Basic %s", auth))
                .withHeader(ApiHttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
        final String body = "token=" + token.getAccessToken();

        final ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.POST,
            URI.create(ServiceRegion.GCP_EUROPE_WEST1.getAuthUrl() + "/oauth/introspect"), headers,
            body.getBytes(StandardCharsets.UTF_8));

        // call the introspection endpoint and map to the TokenIntrospection class
        final ApiHttpResponse<TokenIntrospection> tokenIntrospection = client.execute(request)
                .thenApply(apiHttpResponse -> client.getSerializerService()
                        .convertResponse(apiHttpResponse, TokenIntrospection.class))
                .get();

        Assertions.assertTrue(tokenIntrospection.getBody().isActive());
    }

    @Test
    public void revoke() throws ExecutionException, InterruptedException {
        // retrieve a token
        ClientCredentials credentials = ClientCredentials.of()
                .withClientId(CommercetoolsTestUtils.getClientId())
                .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                .build();
        ClientCredentialsTokenSupplier tokenSupplier = new ClientCredentialsTokenSupplier(credentials.getClientId(),
            credentials.getClientSecret(), "", ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
            HttpClientSupplier.of().get());
        final AuthenticationToken token = tokenSupplier.getToken().get();

        // client to be used for calling introspection endpoint
        ApiHttpClient client = ClientBuilder.of().defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getAuthUrl()).build();

        final String auth = Base64.getEncoder()
                .encodeToString(
                    (credentials.getClientId() + ":" + credentials.getClientSecret()).getBytes(StandardCharsets.UTF_8));
        final ApiHttpHeaders headers = new ApiHttpHeaders()
                .withHeader(ApiHttpHeaders.AUTHORIZATION, format("Basic %s", auth))
                .withHeader(ApiHttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");

        // build the revoke request
        final String revokeBody = "token=" + token.getAccessToken() + "&token_type_hint=access_token";
        final ApiHttpRequest revokeRequest = new ApiHttpRequest(ApiHttpMethod.POST,
            URI.create(ServiceRegion.GCP_EUROPE_WEST1.getAuthUrl() + "/oauth/token/revoke"), headers,
            revokeBody.getBytes(StandardCharsets.UTF_8));

        // call the revoke endpoint
        final ApiHttpResponse<byte[]> revokeToken = client.execute(revokeRequest).get();
        Assertions.assertEquals(HttpStatusCode.OK_200, revokeToken.getStatusCode());

        // build the introspection request
        final String introspectBody = "token=" + token.getAccessToken();
        final ApiHttpRequest introspectRequest = new ApiHttpRequest(ApiHttpMethod.POST,
            URI.create(ServiceRegion.GCP_EUROPE_WEST1.getAuthUrl() + "/oauth/introspect"), headers,
            introspectBody.getBytes(StandardCharsets.UTF_8));

        // call the introspection endpoint and map to the TokenIntrospection class
        final ApiHttpResponse<TokenIntrospection> tokenIntrospection = client.execute(introspectRequest)
                .thenApply(apiHttpResponse -> client.getSerializerService()
                        .convertResponse(apiHttpResponse, TokenIntrospection.class))
                .get();

        Assertions.assertFalse(tokenIntrospection.getBody().isActive());
    }

    @Test
    public void apiRootWithStaticAuthToken() throws ExecutionException, InterruptedException {
        final ClientCredentials credentials = ClientCredentials.of()
                .withClientId(CommercetoolsTestUtils.getClientId())
                .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                .build();
        final ClientCredentialsTokenSupplier tokenSupplier = new ClientCredentialsTokenSupplier(
            credentials.getClientId(), credentials.getClientSecret(), "",
            ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), HttpClientSupplier.of().get());
        final AuthenticationToken token = tokenSupplier.getToken().get();

        final ApiRootBuilder builder = ApiRootBuilder.of()
                .withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .withApiBaseUrl(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withStaticTokenFlow(token);
        final ProjectApiRoot projectApiRoot = builder.buildProjectRoot();
        final ApiHttpResponse<ProductPagedQueryResponse> productPagedQueryResponseApiHttpResponse = projectApiRoot
                .products()
                .get()
                .executeBlocking();

        Assertions.assertEquals(productPagedQueryResponseApiHttpResponse.getStatusCode(), 200);
    }
}
