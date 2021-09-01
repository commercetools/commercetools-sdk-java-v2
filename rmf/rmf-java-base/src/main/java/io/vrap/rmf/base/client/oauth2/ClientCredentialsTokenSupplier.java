
package io.vrap.rmf.base.client.oauth2;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.InternalLogger;
import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

public class ClientCredentialsTokenSupplier extends AutoCloseableService implements TokenSupplier {

    private final InternalLogger logger = InternalLogger.getLogger(LOGGER_AUTH);
    private final VrapHttpClient vrapHttpClient;
    private final ApiHttpRequest apiHttpRequest;

    public ClientCredentialsTokenSupplier(final String clientId, final String clientSecret, final String scope,
            final String tokenEndpoint, final VrapHttpClient vrapHttpClient) {
        this.vrapHttpClient = vrapHttpClient;
        this.apiHttpRequest = constructApiHttpRequest(clientId, clientSecret, scope, tokenEndpoint);

    }

    @Override
    public CompletableFuture<AuthenticationToken> getToken() {
        return vrapHttpClient.execute(apiHttpRequest).whenComplete((response, throwable) -> {
            if (throwable != null) {
                logger.error(() -> response, throwable);
            }
            else {
                logger.debug(() -> response);
            }
        }).thenApply(apiHttpResponse -> {
            if (apiHttpResponse.getStatusCode() < 200 || apiHttpResponse.getStatusCode() > 299) {
                if (apiHttpResponse.getStatusCode() == 405) {
                    throw new CompletionException(new AuthException(apiHttpResponse.getStatusCode(),
                        new String(apiHttpResponse.getBody()), apiHttpRequest.getHeaders(),
                        apiHttpResponse.getMessage()
                                + " : auth token URI may be incorrect e.g. https://auth.europe-west1.gcp.commercetools.com/oauth/token",
                        apiHttpResponse));
                }
                throw new CompletionException(
                    new AuthException(apiHttpResponse.getStatusCode(), new String(apiHttpResponse.getBody()),
                        apiHttpRequest.getHeaders(), apiHttpResponse.getMessage(), apiHttpResponse));
            }
            return apiHttpResponse;
        })
                .thenApply(Utils.wrapToCompletionException((ApiHttpResponse<byte[]> response) -> JsonUtils
                        .fromJsonByteArray(response.getBody(), AuthenticationToken.class)));
    }

    private static ApiHttpRequest constructApiHttpRequest(final String clientId, final String clientSecret,
            final String scope, final String tokenEndpoint) {
        String auth = Base64.getEncoder()
                .encodeToString((clientId + ":" + clientSecret).getBytes(StandardCharsets.UTF_8));

        final ApiHttpHeaders headers = new ApiHttpHeaders().withHeader(ApiHttpHeaders.AUTHORIZATION, "Basic " + auth)
                .withHeader(ApiHttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");

        String body = "";
        if (scope == null || scope.isEmpty()) {
            body = "grant_type=client_credentials";

        }
        else {
            try {
                body = "grant_type=client_credentials&scope="
                        + URLEncoder.encode(scope, StandardCharsets.UTF_8.toString());
            }
            catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(tokenEndpoint), headers,
            body.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    protected void internalClose() {
        if (vrapHttpClient instanceof AutoCloseable)
            closeQuietly((AutoCloseable) vrapHttpClient);
    }
}
